import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

void registerBeans() {
    LOG.info('Register Spring beans');

    def reader = new GroovyBeanDefinitionReader(spring.getParent().getBeanFactory())
    
    reader.beans {
        greeterService(GreeterService)
        easyTestBeanService(MyEasyTestBeanService)
    }
    
    //reader.loadBeanDefinitions("file:/Users/i303937/Documents/app/hybris1905/hybris/temp/hybris/easy_extensions/helloworld/EasyBeans.groovy");
}

LOG = LoggerFactory.getLogger("easy_helloworld");
LOG.info("Initializing...");
registerBeans();