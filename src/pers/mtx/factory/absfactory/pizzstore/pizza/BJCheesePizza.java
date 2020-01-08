package pers.mtx.factory.absfactory.pizzstore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJcheesePizza");
        System.out.println("bj奶酪pz 准备原材料");
    }
}
