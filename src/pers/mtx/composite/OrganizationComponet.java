package pers.mtx.composite;

public abstract class OrganizationComponet {
    private String name;
    private String des;

    protected void add(OrganizationComponet organizationComponet){
        //默认实现
        throw new UnsupportedOperationException();
    }
    protected void remove(OrganizationComponet organizationComponet){
        //默认实现
        throw new UnsupportedOperationException();
    }

    public OrganizationComponet(String name, String des) {
        this.name = name;
        this.des = des;
    }
    //print方法
    protected abstract void print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
