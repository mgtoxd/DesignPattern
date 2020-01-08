package pers.mtx.factory.factorymethod.pizzastore.order;

import pers.mtx.factory.factorymethod.pizzastore.pizza.*;


public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String ordertype) {
        Pizza pizza = null;
        if (ordertype.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (ordertype.equals("pepper")){
            pizza = new LdPepperPizza();
        }
        return pizza;
    }
}
