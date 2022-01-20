import org.apache.log4j.Logger;

LOG = Logger.getLogger("easy_helloworld");

registerBeans() {
    println('Register beans');

    def reader = new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader(spring.getBeanFactory())
    reader.beans {
        greeterService(GreeterService)
        easyTestBeanService(MyEasyTestBeanService) {
        }
    }
}

LOG.info("(log) Initializing...");
println "(console) Initializing..."
