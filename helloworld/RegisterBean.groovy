def bean = new org.springframework.beans.factory.support.GenericBeanDefinition();
bean.beanClass = GreeterService
 
def factory =  spring.getAutowireCapableBeanFactory()

//println('Remove definition');
//factory.removeBeanDefinition("greeterService");
//factory.destroySingleton("greeterService")

println('Add definition');
factory.registerBeanDefinition("greeterService", bean)

//spring.refresh()