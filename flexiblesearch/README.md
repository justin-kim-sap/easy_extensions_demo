# FlexibleSearchService demo

## Overview
This demo shows that an Easy extension has access to Spring context.

## How to execute

Execute the following script in HAC:
```groovy
def engine = easyExtensionService.getGroovyScriptEngine();

def binding = new Binding();
binding.setVariable("spring", de.hybris.platform.core.Registry.getApplicationContext());
def flexibleSearch = engine.run('FlexibleSearchTest.groovy', binding);                 
println flexibleSearch.getProductTotalCount();
```
