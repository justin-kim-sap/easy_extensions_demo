class FlexibleSearchDemoService {

    def spring;

    int getProductTotalCount() {
        def catalogVersionService = spring.getBean("catalogVersionService");
        def flexibleSearchService = spring.getBean("flexibleSearchService");

        def catVersion = catalogVersionService.getCatalogVersion("Default", "Online");
        catalogVersionService.setSessionCatalogVersions(java.util.Collections.singleton(catVersion));

        def query = "SELECT {pk} FROM {Product}";
        def searchResult = flexibleSearchService.search(query);
        print("Total number of products: " + searchResult.getTotalCount());

        searchResult.getTotalCount();
    }
    
}