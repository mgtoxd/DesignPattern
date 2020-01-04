package pers.mtx.principle.inversion.improve;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        Email email = new Email();
        person.receive(email);
        WeiXin weiXin = new WeiXin();
        person.receive(weiXin);
    }
}
//定义接口
interface IReceiver{
    public String getinfo();
}

class Email implements IReceiver{
    public String getinfo(){
        return "电子邮件信息:hello world!";
    }
}
//增加微信
class WeiXin implements IReceiver{

    @Override
    public String getinfo() {
        return "微信消息";
    }
}

//方式2
class Person{
    public void receive(IReceiver email){
        System.out.println(email.getinfo());
    }
}

