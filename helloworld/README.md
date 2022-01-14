# Greeter

## Overview
This demo show how to call a Grovvy script from modules

## How to execute

Execute the following script in HAC (script type: javascript):
```groovy
String groovyDir = gitService.getJavaScriptModulesDir() + "/groovy";
def paths = [];
paths.add(groovyDir + "/helloworld");
paths.add(groovyDir + "/dependency");
def binding = new Binding();
binding.setVariable("spring", de.hybris.platform.core.Registry.getApplicationContext());
def engine = new GroovyScriptEngine(paths as String[])          

def greeter = engine.run('Greater.groovy', binding)                   
println greeter.sayHello('Yannick')
```