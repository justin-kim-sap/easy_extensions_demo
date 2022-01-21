import org.slf4j.LoggerFactory

void registerBeans() {
    LOG.info('Register beans');

    def reader = new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
        FlexibleSearchDemoService(flexibleSearchDemoService) {
            "spring" : spring
        }
    }
}

LOG = LoggerFactory.getLogger("easy_flexiblesearch");
LOG.info("Initializing...");
registerBeans();