package pers.mtx.prototype.deepclone;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name="宋江";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("大牛","大牛类");


        //方式1完成深拷贝
//        DeepPrototype deepPrototype1 = (DeepPrototype)deepPrototype.clone();
//        System.out.println("p.name="+deepPrototype.name+"p.deep.hash"+deepPrototype.deepCloneableTarget.hashCode());
//        System.out.println("p1.name="+deepPrototype1.name+"p1.deep.hash"+deepPrototype1.deepCloneableTarget.hashCode());
        //方式2完成深拷贝
        DeepPrototype deepPrototype2 = (DeepPrototype)deepPrototype.deepClone();
        System.out.println("p.name="+deepPrototype.name+"p.deep.hash"+deepPrototype.deepCloneableTarget.hashCode());
        System.out.println("p1.name="+deepPrototype2.name+"p1.deep.hash"+deepPrototype2.deepCloneableTarget.hashCode());


    }
}
