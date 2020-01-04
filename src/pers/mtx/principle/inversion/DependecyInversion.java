package pers.mtx.principle.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        Email email = new Email();
        person.receive(email);
    }
}
//完成Person接收消息
class Email{
    public String getinfo(){
        return "电子邮件信息:hello world!";
    }
}
//方式1
//简单，容易实现
//如果获取的短信。微信，则新增类同时person增加新的方法
//思路：引入一个抽象接口，表示接收者，Person与接口发生依赖
// email，微信属于接收的范围，各自实现接口就ok，符合依赖倒转原则
class Person{
    public void receive(Email email){
        System.out.println(email.getinfo());
    }
}

