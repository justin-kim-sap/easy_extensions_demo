class FlexibleSearchDemoService {

    def spring;

    int getProductTotalCount() {
        def query = "SELECT {pk} FROM {Product}";
        def searchResult = flexibleSearchService.search(query);
        println("Total number of products: " + searchResult.getTotalCount());

        searchResult.getTotalCount();
    }
    
}