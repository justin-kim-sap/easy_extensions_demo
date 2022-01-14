# Greeter

## Overview
This demo shows how to use Easy Modules.

## How to execute

Execute the following script in HAC (script type: javascript):

```groovy
def engine = easyModuleService.getGroovyScriptEngine();

def binding = new Binding();
binding.setVariable("spring", de.hybris.platform.core.Registry.getApplicationContext());
def greeter = engine.run('Greater.groovy', binding);                 
println greeter.sayHello('Yannick');
```