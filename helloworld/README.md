# Hello World

## Overview
This demo is a simple example of extension.

## How to execute for new Spring beans
Execute the following script in HAC:

```groovy
easyExtensionService.reloadEasyBeans();
println greeterService.sayHello('Yannick');
```

## How to override existing Spring beans
Execute the following script in HAC:

```groovy
easyExtensionService.setApplicationContext(spring);
easyExtensionService.reloadEasyBeans();

println greeterService.sayHello("Yannick");
println greeterService.sayHelloFromSpring("Yannick");
```
