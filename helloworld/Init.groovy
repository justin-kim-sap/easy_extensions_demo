import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

void registerSpringBeans() {
    LOG.info('Register beans');

    def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
        greeterService(GreeterService)
        easyTestBeanService(MyEasyTestBeanService)
    }
}

def registerEasyBeans() {
    def easyBeans = [:]
    easyBeans.helloWorldService = new HelloWorldService()
    return easyBeans
}

LOG = LoggerFactory.getLogger("easy_helloworld");
LOG.info("Initializing...");
registerSpringBeans();
registerEasyBeans();