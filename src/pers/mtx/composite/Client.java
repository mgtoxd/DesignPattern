package pers.mtx.composite;

public class Client {
    public static void main(String[] args) {
        //从大到小创建对象
        OrganizationComponet university = new University("qsinghua", "best");
        OrganizationComponet cscollege = new College("jsj","jsj");
        OrganizationComponet iscollege = new College("信息工程","xx");
        cscollege.add(new Department("软件工程","软件工程"));
        cscollege.add(new Department("网络","网络"));
        cscollege.add(new Department("计算机","计算机"));
        iscollege.add(new Department("通信","通信"));
        iscollege.add(new Department("信息","信息"));
        university.add(cscollege);
        university.add(iscollege);

        cscollege.print();

    }
}
