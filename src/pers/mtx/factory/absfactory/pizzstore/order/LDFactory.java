package pers.mtx.factory.absfactory.pizzstore.order;

import pers.mtx.factory.absfactory.pizzstore.pizza.*;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("Pepper")){
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
