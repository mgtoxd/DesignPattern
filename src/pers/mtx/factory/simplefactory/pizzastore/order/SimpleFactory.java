package pers.mtx.factory.simplefactory.pizzastore.order;


import pers.mtx.factory.simplefactory.pizzastore.pizza.CheesePizzza;
import pers.mtx.factory.simplefactory.pizzastore.pizza.GreekPizza;
import pers.mtx.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {
    //根据ordertype 返回Pizza对象
    public Pizza createPizza(String orderType){

        Pizza pizza = null;
        System.out.println("使用简单工厂");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizzza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("pepper")){
            pizza = new CheesePizzza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
