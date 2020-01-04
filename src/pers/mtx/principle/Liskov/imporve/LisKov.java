package pers.mtx.principle.Liskov.imporve;

public class LisKov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("-----------------------");
        B b = new B();
        System.out.println("11-3=" + b.func3(11, 3));//这里本意是求出11-3
        System.out.println("1-8=" + b.func3(1, 8));// 1-8
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}
//创建一个更加基础的基类
class base{

}

class A extends base {
    //返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//继承A
//新增一个功能:完成两个数相加,然后和9求和
class B extends base {
    //如果B需要使用A类的方法,使用组合的关系,降低耦合度
    private A a = new A();
    //重写了,可能是无意的
    public int func1(int a, int b) {
        return a + b;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //我们仍然想使用A的方法
    public int func3(int a, int b){
        return this.a.func1(a, b);
    }
}
