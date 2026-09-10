package BuilderPattern;

public class EmployeeBuilder {
    public int empid=-1;
    public String name="Shetty";
    public String address="Thane";
    public boolean isFTE=false;

    public EmployeeBuilder setEmpid(int empid) {
        this.empid = empid;
        return this;
    }
    public EmployeeBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public EmployeeBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public EmployeeBuilder setIsFTE(boolean isFTE) {
        this.isFTE = isFTE;
        return this;
    }

    public Employee build() {
        return new Employee(empid, name, address, isFTE);
    }
}
