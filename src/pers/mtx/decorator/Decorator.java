package pers.mtx.decorator;

public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDex() {

        return super.getDex()+" "+super.getPrice()+"&&"+obj.getDex();
    }

}
