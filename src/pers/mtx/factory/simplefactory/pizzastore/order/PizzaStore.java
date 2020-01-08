package pers.mtx.factory.simplefactory.pizzastore.order;


//客户端
public class PizzaStore {
    public static void main(String[] args) {
//        OrderPizza orderPizza = new OrderPizza();
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }

}
