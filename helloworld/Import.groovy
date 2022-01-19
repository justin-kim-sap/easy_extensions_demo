import org.apache.log4j.Logger;
import de.hybris.platform.core.model.user.CustomerModel
import de.hybris.platform.core.model.user.UserGroupModel
import de.hybris.platform.servicelayer.ServicelayerBaseTest

class DataImport {

    def spring;

    void importCustomers() {
        println "Import customers...";

        def modelService = spring.getBean("modelService");

        CustomerModel cust = [uid: 'yannick', name: 'Yannick Robin'];
        if (modelService.get(cust, "Customer") == null)
            modelService.save(cust);
    }
}

dataImport = new DataImport();
dataImport.spring = spring;
dataImport.importCustomers()