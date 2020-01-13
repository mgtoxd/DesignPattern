package pers.mtx.decorator;

public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new LongBlack();


        //加入牛奶
        order = new Milk(order);

        //加入巧克力
        order = new Chocolate(order);
        System.out.println("费用="+ order.cost());
        System.out.println("描述="+ order.getDex());

    }
}
