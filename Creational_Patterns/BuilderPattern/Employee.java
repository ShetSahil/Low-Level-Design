package BuilderPattern;

public class Employee {
    public int empid;
    public String name;
    public String address;
    public boolean isFTE;

    Employee(int empid, String name, String address, boolean isFTE) {
        this.empid = empid;
        this.name = name;
        this.address = address;
        this.isFTE = isFTE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", isFTE=" + isFTE +
                '}';
    }
}
