package pers.mtx.composite;

public class Department extends OrganizationComponet {

    public Department(String name, String des) {
        super(name, des);
    }
//add,remove 就不需要再写了

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}
