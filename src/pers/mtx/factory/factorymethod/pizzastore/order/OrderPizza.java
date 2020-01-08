package pers.mtx.factory.factorymethod.pizzastore.order;



import pers.mtx.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public abstract class OrderPizza {

    //定义一个抽象方法 createPizza, 让各个工厂子类自己实现

    abstract Pizza createPizza(String ordertype);

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = gettype();
            pizza = createPizza(orderType);
            //输出pz制作过程
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);





    }



//    SimpleFactory simpleFactory;
//    Pizza pizza = null;
//    //构造器
//    public OrderPizza(SimpleFactory simpleFactory){
//        setFactory(simpleFactory);
//    }
//
//
//
//    public void setFactory(SimpleFactory simpleFactory) {
//        String ordertype = "";
//        this.simpleFactory = simpleFactory;
//        do {
//            ordertype = gettype();
//            pizza = simpleFactory.createPizza(ordertype);
//
//            //输出pizza
//            if (pizza != null) {
//                pizza.prepare();
//                pizza.bake();
//                pizza.cut();
//                pizza.box();
//            }else {
//                System.out.println("订购pz失败");
//                break;
//            }
//        }while (true);
//    }
//
//
//
//
    //可以获取客户希望订购的pz种类
    private String gettype() {
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
