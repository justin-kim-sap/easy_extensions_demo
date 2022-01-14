# demo

## Overview
This demo shows how to use Easy Modules.

## How to execute

Execute the following script in HAC (script type: javascript):
```groovy
String easyModuleDir = easyGitService.getEasyModulesDir();
def paths = [];
paths.add(easyModuleDir + "/demo/lib/src/main/groovy");
def engine = new GroovyScriptEngine(paths as String[]);

def binding = new Binding();
binding.setVariable("spring", de.hybris.platform.core.Registry.getApplicationContext());
def library = engine.run('com/sap/cx/boosters/easy/demo/LibraryScript.groovy', binding);                  
println library.someLibraryMethod();
```