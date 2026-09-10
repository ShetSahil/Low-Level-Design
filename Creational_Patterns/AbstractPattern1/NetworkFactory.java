package AbstractPattern1;

public class NetworkFactory implements DataSourceAbstract {
    @Override
    public Response createResponse() {
        return new NetworkResponse();
    }

    @Override
    public Service createService() {
        return new NetworkService();
    }

    
}
