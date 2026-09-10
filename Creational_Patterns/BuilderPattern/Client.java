package BuilderPattern;

public class Client {
    public static void main(String[] args) {
        Employee emp = new EmployeeBuilder().setEmpid(1).setAddress("123 Main St").build();
        System.out.println(emp);
    }
}
