package pers.mtx.decorator;

public class Milk extends Decorator {
    public Milk(Drink obj) {
        super(obj);
        setDex("牛奶");
        setPrice(2.0f);
    }
}
