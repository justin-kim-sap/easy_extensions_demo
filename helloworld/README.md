# Greeter

## Overview
This demo is an Hello World Easy extension.

## How to execute

Execute the following script in HAC:

```groovy
def engine = easyExtensionService.getGroovyScriptEngine();

def binding = new Binding();
binding.setVariable("spring", de.hybris.platform.core.Registry.getApplicationContext());
def greeterService = engine.run('HelloWorld.groovy', binding);                 
println greeterService.sayHello('Yannick');
```
