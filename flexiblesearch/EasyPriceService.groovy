import de.hybris.platform.product.impl.DefaultPriceService;
import de.hybris.platform.core.model.product.ProductModel;
import java.util.List;
import de.hybris.platform.jalo.order.price.PriceInformation;

class EasyPriceService extends DefaultPriceService {

    def spring;

    List<PriceInformation> getPriceInformationsForProduct(ProductModel product) {
        return null;
    }
      
}