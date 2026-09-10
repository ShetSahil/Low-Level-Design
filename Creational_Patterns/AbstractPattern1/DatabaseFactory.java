package AbstractPattern1;

public class DatabaseFactory implements DataSourceAbstract {
    @Override
    public Response createResponse() {
        return new DatabaseResponse();
    }

    @Override
    public Service createService() {
        return new DatabaseService();
    }
    
}
