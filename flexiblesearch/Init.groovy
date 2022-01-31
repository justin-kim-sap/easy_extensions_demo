import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

void registerBeans() {
    LOG.info('Register Spring beans');

    def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())

    reader.beans {
        flexibleSearchDemoService(FlexibleSearchDemoService) {
            spring = spring
        }
    }
}

LOG = LoggerFactory.getLogger("easy_flexiblesearch");
LOG.info("Initializing...");
registerBeans();