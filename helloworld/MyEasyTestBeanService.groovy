import com.sap.cx.boosters.easy.core.service.impl.DefaultEasyTestBeanService;

class MyEasyTestBeanService extends DefaultEasyTestBeanService {

    def spring;

    public String sayHello(String name) {
        def greet = "hello Mr " + name;
        greet
    }
}