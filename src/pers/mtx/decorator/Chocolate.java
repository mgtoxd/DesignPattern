package pers.mtx.decorator;

//具体的类,这里就是调味品
public class Chocolate extends Decorator {
    public Chocolate(Drink obj) {
        super(obj);
        setDex("巧克力");
        setPrice(3.0f);//调味品价格
    }
}
