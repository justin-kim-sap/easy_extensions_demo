package controller;

import de.hybris.platform.product.impl.PriceService;
import com.sap.cx.boosters.easyrest.controller.EasyServiceController;
import java.util.Map;

class PriceController implements EasyServiceController {

    PriceService priceService;
    def catalogVersionService;
    def productService;

    Map execute(Map ctx) {
        def response = [:];
        log = org.slf4j.LoggerFactory.getLogger('easyrest');

        catVersion = catalogVersionService.getCatalogVersion('Default', 'Staged');
        catalogVersionService.setSessionCatalogVersions(Collections.singleton(catVersion));

        product = productService.getProductForCode(ctx.parameters.code);
        prices = priceService.getPriceInformationsForProduct(product);
        log.info('Prices :' + prices);

        response.'responseCode' = 200;

        sBody = '[\n';
        prices.each{price -> 
        def priceValue = price.getPrice();
        def currency = priceValue.getCurrencyIso();
        def value = priceValue.getValue();
        sBody += '\t{\n\t\t""value"": ' + value + ',\n\t\t""currency"": ""' + currency + '""\n\t}\n';
        }
        sBody += ']'

        return response
    }

}