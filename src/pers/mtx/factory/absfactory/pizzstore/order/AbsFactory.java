package pers.mtx.factory.absfactory.pizzstore.order;


import pers.mtx.factory.absfactory.pizzstore.pizza.Pizza;

//抽象工厂模式的抽象层(接口)
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
