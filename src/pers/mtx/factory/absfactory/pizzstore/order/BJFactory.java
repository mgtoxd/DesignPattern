package pers.mtx.factory.absfactory.pizzstore.order;

import pers.mtx.factory.absfactory.pizzstore.pizza.BJCheesePizza;
import pers.mtx.factory.absfactory.pizzstore.pizza.BJPepperPizza;
import pers.mtx.factory.absfactory.pizzstore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("抽象工厂模式");
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("Pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
