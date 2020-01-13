package pers.mtx.decorator;

public abstract class Drink {
    public String dex;
    private float price = 0.0f;

    public String getDex() {
        return dex;
    }

    public void setDex(String dex) {
        this.dex = dex;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //计算费用的抽象方法
    //子类中实现
    public abstract float cost();
}
