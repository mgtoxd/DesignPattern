package pers.mtx.singleton.type6;

public class Singleton06 {
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

class Singleton{
    public static volatile Singleton instance;

    private Singleton(){}

    //提供一个静态的公有方法,加入双重检查代码,解决线程安全问题,同时解决懒加载问题,还保证了效率
    //推荐使用
    public static  Singleton getInstance(){
        if (instance == null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
/*
1) 解决了线程安全问题
2) 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行
一次实例化代码就够了，后面的想获得该类实例，直接return 就行了。方法进行同步效率太低
3) 结论：在实际开发中，不推荐使用这种方式
 */
