package pers.mtx.bridge;

public class Client {
    public static void main(String[] args) {
        //获取折叠式手机
        Phone phone1 = new FoldedPhone(new Xiaomi());

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("===========");
        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();

    }
}
