import org.slf4j.LoggerFactory
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader

LOG = LoggerFactory.getLogger("easy_helloworld");
LOG.debug('Register Spring beans');

    void registerBeans() {
        def reader = new GroovyBeanDefinitionReader(spring.getBeanFactory())

        reader.beans {
            greeterService(GreeterService) {
                spring = spring
            }
            easyTestBeanService(MyEasyTestBeanService)
            priceService(EasyPriceService) {
                spring = spring
            }
        }
    }
