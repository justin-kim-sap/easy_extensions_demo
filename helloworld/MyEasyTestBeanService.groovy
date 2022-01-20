import com.sap.cx.boosters.easy.core.service.impl.DefaultEasyTestBeanService;

class MyEasyTestBeanService extends DefaultEasyTestBeanService {

    def spring;

    String sayHello(String name) {
        "hello " + name;
    }
}