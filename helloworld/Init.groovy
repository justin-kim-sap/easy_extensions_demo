import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

void registerBeans() {
    LOG.info('Register beans');

    def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
        greeterService(GreeterService)
        easyTestBeanService(MyEasyTestBeanService)
    }
}

LOG = LoggerFactory.getLogger("easy_helloworld");
LOG.info("Initializing...");
registerBeans();