package Creational_Patterns.AbstractPattern1;

public class Client {
    Service service;
    Response response;
    public Client(DataSourceAbstract dataSource) {
        this.service = dataSource.createService();
        this.response = dataSource.createResponse();
    }

    public void communicate() {
        System.out.println(service.runService());
        System.out.println(response.getResponse());
    }
}
