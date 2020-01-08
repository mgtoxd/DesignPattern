package pers.mtx.factory.simplefactory.pizzastore.order;

import pers.mtx.factory.simplefactory.pizzastore.pizza.CheesePizzza;
import pers.mtx.factory.simplefactory.pizzastore.pizza.GreekPizza;
import pers.mtx.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TransferQueue;

public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do {
            orderType = gettype();
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
            else {
                break;
            }
            //输出pz制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);



    }


    //可以获取客户希望订购的pz种类
    private String gettype(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
