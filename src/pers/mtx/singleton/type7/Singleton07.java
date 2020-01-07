package pers.mtx.singleton.type7;

public class Singleton07 {
    public static void main(String[] args) {
        //测试
        System.out.println("懒汉式1,线程安全");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
    }
}


//静态内部类完成
class Singleton{
    public static volatile Singleton instance;

    private Singleton(){}

    //写一个静态内部类,该类中有一个静态属性Singleton,在Singleton被装载时不会被装载
    private static class SingletonInstance{
        //使用了jvm提供的底层类的装载机制,这个机制是线程安全的(静态属性只会在第一次加载类的时候初始化)
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){

        return SingletonInstance.INSTANCE;
    }
}

