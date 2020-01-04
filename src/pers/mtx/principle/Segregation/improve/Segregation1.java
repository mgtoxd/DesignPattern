package pers.mtx.principle.Segregation.improve;

public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());//A类通过接口去依赖B类
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        c.depend1(new D());//C类通过接口去依赖D类
        c.depend4(new D());
        c.depend5(new D());
    }

}

interface Interface1 {
    void operration1();




}
interface Interface2{
    void operration2();

    void operration3();
}
interface  Interface3{
    void operration4();

    void operration5();
}

class B implements Interface1,Interface2 {

    @Override
    public void operration1() {
        System.out.println("B 中实现了operration1");
    }

    @Override
    public void operration2() {
        System.out.println("B 中实现了operration2");
    }

    @Override
    public void operration3() {
        System.out.println("B 中实现了operration3");

    }
}


class D implements Interface1,Interface3 {

    @Override
    public void operration1() {
        System.out.println("D 中实现了operration1");
    }

    @Override
    public void operration4() {
        System.out.println("D 中实现了operration4");

    }

    @Override
    public void operration5() {
        System.out.println("D 中实现了operration5");

    }
}

class A {//A通过接口Interface1 依赖B类 但是只会用到1,2,3方法

    public void depend1(Interface1 i) {
        i.operration1();
    }

    public void depend2(Interface2 i) {
        i.operration2();
    }

    public void depend3(Interface2 i) {
        i.operration3();
    }
}

class C {//A通过接口Interface1 依赖B类 但是只会用到1,2,3方法

    public void depend1(Interface1 i) {
        i.operration1();
    }

    public void depend4(Interface3 i) {
        i.operration4();
    }

    public void depend5(Interface3 i) {
        i.operration5();
    }
}