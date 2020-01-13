package pers.mtx.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponet {
    List<OrganizationComponet> organizationComponets = new ArrayList<>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    //重写add
    @Override
    protected void add(OrganizationComponet organizationComponet) {
        organizationComponets.add(organizationComponet);
    }

    //重写remove
    @Override
    protected void remove(OrganizationComponet organizationComponet) {
        organizationComponets.remove(organizationComponet);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //就是输出学院
    @Override
    protected void print() {
        System.out.println("-------" + getName() + "---------");
        //遍历
        for (OrganizationComponet o : organizationComponets
        ) {o.print();

        }

    }
}
