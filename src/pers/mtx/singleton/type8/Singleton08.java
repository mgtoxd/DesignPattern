package pers.mtx.singleton.type8;

public class Singleton08 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance==instance2);
    }
}

enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("ok");
    }
}
