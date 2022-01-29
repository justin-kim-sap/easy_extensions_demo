# Hello World

## Overview
This demo is a simple example of extension.

## How to execute for new Spring beans
Execute the following script in HAC:

```groovy
easyExtensionService.reloadEasyBeans();
println greeterService.sayHello('Yannick');
```

## How to execute for existing Spring beans
Execute the following script in HAC:

```groovy
def engine = easyExtensionService.getGroovyScriptEngine();
def applicationContext = de.hybris.platform.core.Registry.getApplicationContext();
  
def binding = new Binding();
binding.setVariable("spring", applicationContext);
engine.run('Init.groovy', binding);

println easyTestBeanService.sayHello("Yannick");
```
