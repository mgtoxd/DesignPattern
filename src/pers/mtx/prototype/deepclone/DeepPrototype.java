package pers.mtx.prototype.deepclone;

import java.io.*;

public class DeepPrototype implements Cloneable, Serializable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
        super();
    }

    //深拷贝 - 方式1重写clone

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型的克隆
        deep = super.clone();
        //对引用类型的属性,进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deepPrototype;
    }

    //深拷贝 - 方式2通过序列化实现(推荐)
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);//当前对象以对象流的方式输出

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            DeepPrototype copyobj = (DeepPrototype)objectInputStream.readObject();

            return copyobj;

        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }finally {
            //关闭流

            try {
                byteArrayOutputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                objectInputStream.close();

            }catch (Exception e){
                System.out.println(e.getMessage());

            }
        }

    }
}
