import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

LOG = LoggerFactory.getLogger("demo");
LOG.info('Register Spring beans');

def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())
    
reader.beans {
}