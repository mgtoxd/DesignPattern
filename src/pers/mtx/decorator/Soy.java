package pers.mtx.decorator;

public class Soy extends Decorator {
    public Soy(Drink obj) {
        super(obj);
        setDex("豆浆");
        setPrice(1.5f);
    }
}
