import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

LOG = LoggerFactory.getLogger("helloworld");
LOG.debug('Register Spring beans');

def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())

reader.beans {
    greeterService(service.GreeterService) {
        spring = spring
    }
    priceService(service.EasyPriceService) {
        spring = spring
    }
}