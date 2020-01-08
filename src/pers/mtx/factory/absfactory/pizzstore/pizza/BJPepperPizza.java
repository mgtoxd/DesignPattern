package pers.mtx.factory.absfactory.pizzstore.pizza;

public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("bj胡椒pz 准备原材料");
    }
}
