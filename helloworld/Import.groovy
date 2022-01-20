import org.slf4j.LoggerFactory
import de.hybris.platform.core.model.user.CustomerModel
import de.hybris.platform.core.model.user.UserGroupModel
import de.hybris.platform.servicelayer.ServicelayerBaseTest

class DataImport {

    def spring;

    void importCustomers() {
        LOG.info("Import customers...");
        

        def modelService = spring.getBean("modelService");

        CustomerModel cust = [uid: 'yannick', name: 'Yannick Robin'];
        if (modelService.get(cust, "Customer") == null)
            modelService.save(cust);
    }
}

LOG = LoggerFactory.getLogger("easy_helloworld");
dataImport = new DataImport();
dataImport.spring = spring;
dataImport.importCustomers()