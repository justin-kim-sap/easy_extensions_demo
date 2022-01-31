import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

void registerBeans() {
    LOG.info('Register Spring beans');

    def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
    }
}

LOG = LoggerFactory.getLogger("easyrest");
LOG.info("Initializing...");
registerBeans();