# Hello World

## Overview
This demo is a simple example of Easy extension.

## Demo with hello world
Execute the following script in HAC:

```groovy
easyExtensionService.reloadEasyBeans();
println greeterService.sayHello('Yannick');
println greeterService.sayHelloFromSpring("Yannick");
```

In this example, [GreeterService.groovy](/helloworld/src/main/groovy/GreeterService.groovy) is a bean loaded from _helloworld_ extension.

## Demo with price service
Execute the following script in HAC:

```groovy
easyExtensionService.reloadEasyBeans();

catVersion = catalogVersionService.getCatalogVersion("Default", "Staged");
product = productService.getProductForCode(catVersion, "Product1");
println priceService.getPriceInformationsForProduct(product);
```

In this example, _DefaultPriceService_ is overrided by [EasyPriceService.groovy](/helloworld/src/main/groovy/EasyPriceService.groovy).
