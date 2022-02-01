# Hello World

## Overview
This demo is a simple example of extension.

## Demo with hello world
Execute the following script in HAC:

```groovy
easyExtensionService.reloadEasyBeans();
println greeterService.sayHello('Yannick');
println greeterService.sayHelloFromSpring("Yannick");
```

## Demo with price service
Execute the following script in HAC:

```groovy
easyExtensionService.reloadEasyBeans();

catVersion = catalogVersionService.getCatalogVersion("Default", "Staged");
product = productService.getProductForCode(catVersion, "Product1");
println priceService.getPriceInformationsForProduct(product);
```