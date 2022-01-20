println('Register beans');

def reader = new org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader(spring.getBeanFactory())
reader.beans {
    greeterService(GreeterService)
    easyTestBeanService(MyEasyTestBeanService) {
    }
}