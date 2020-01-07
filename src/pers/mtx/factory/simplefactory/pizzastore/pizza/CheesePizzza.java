package pers.mtx.factory.simplefactory.pizzastore.pizza;

public class CheesePizzza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给奶酪pz准备原材料");
    }
}
