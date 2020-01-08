package pers.mtx.factory.factorymethod.pizzastore.pizza;

public class LdPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LdPepperPizza");
        System.out.println("LD胡椒pz 准备原材料");
    }
}
