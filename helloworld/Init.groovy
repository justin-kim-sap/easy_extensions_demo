import org.slf4j.LoggerFactory

void registerBeans() {
    LOG.info('Register beans');

    def reader = new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
        greeterService(GreeterService)
        easyTestBeanService(MyEasyTestBeanService) {
        }
    }
}

LOG = LoggerFactory.getLogger("easy_helloworld");
LOG.info("Initializing...");
registerBeans();