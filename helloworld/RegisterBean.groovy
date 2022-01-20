import org.springframework.beans.factory.support.BeanDefinitionBuilder;


def beanGreeterService.beanClass = GreeterService
def beanEasyTestBeanService.beanClass = MyEasyTestBeanService

//def beanEasyTestBeanService = BeanDefinitionBuilder.genericBeanDefinition('MyEasyTestBeanService').getBeanDefinition()
//def bean = new org.springframework.beans.factory.support.GenericBeanDefinition('MyEasyTestBeanService');
//bean.beanClass = this.class.classLoader.loadClass('MyEasyTestBeanService', true, false)
//bean.beanClass = this.class.classLoader.loadClass('MyEasyTestBeanService')
//bean.beanClass = Class.forName('MyEasyTestBeanService').newInstance().getClass()
//bean.beanClass = MyEasyTestBeanService
//bean.setBeanClassName('MyEasyTestBeanService')

def factory =  spring.getAutowireCapableBeanFactory()

//println('Remove definition');
//factory.removeBeanDefinition("easyTestBeanService");
//factory.destroySingleton("easyTestBeanService")

//spring.refresh()

println('Add definition');
factory.registerBeanDefinition("greeterService", beanGreeterService)
factory.registerBeanDefinition("easyTestBeanService", beanEasyTestBeanService)