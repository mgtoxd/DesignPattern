package pers.mtx.singleton.type2;

public class Singleton02 {
    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }


}

//饿汉式(静态变量)
class Singleton{
    //构造器私有化,外部不能new
    private Singleton(){

    }
    //本类内部创建实例
    private static Singleton instance;

    static {//静态代码块中,创建单例对象
        instance = new Singleton();
    }
    //提供一个公有的静态方法,返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}

/*
1) 这种方式和上面的方式其实类似，只不过将类实例化的过程放在了静态代码块中，也是在类装载的时候，就执
行静态代码块中的代码，初始化类的实例。优缺点和上面是一样的。
2) 结论：这种单例模式可用，但是可能造成内存浪费
 */