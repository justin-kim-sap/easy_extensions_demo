import org.apache.log4j.Logger;

LOG = Logger.getLogger("easy_helloworld");

void registerBeans() {
    LOG.info('Register beans');

    def reader = new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
        greeterService(GreeterService)
        easyTestBeanService(MyEasyTestBeanService) {
        }
    }
}

LOG.info("Initializing...");
registerBeans();