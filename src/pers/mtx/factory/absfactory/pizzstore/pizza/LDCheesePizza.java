package pers.mtx.factory.absfactory.pizzstore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LdcheesePizza");
        System.out.println("Ld奶酪pz 准备原材料");
    }
}
