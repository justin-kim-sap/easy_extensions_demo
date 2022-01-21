import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

registerBeans() {
    LOG.info('Register beans');

    def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
        greeterService(GreeterService)
        easyTestBeanService(MyEasyTestBeanService)
    }
}

registerEasyServices() {
    def easyContext = [:]
    easyContext.helloWorldService = HelloWorldService
}

LOG = LoggerFactory.getLogger("easy_helloworld");
LOG.info("Initializing...");
registerBeans();
registerEasyServices();