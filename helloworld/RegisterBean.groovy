def bean = new org.springframework.beans.factory.support.GenericBeanDefinition();
bean.beanClass = MyEasyTestBeanService
 
def factory =  spring.getAutowireCapableBeanFactory()

//println('Remove definition');
//factory.removeBeanDefinition("easyTestBeanService");
//factory.destroySingleton("easyTestBeanService")

//spring.refresh()

println('Add definition');
factory.registerBeanDefinition("easyTestBeanService", bean)