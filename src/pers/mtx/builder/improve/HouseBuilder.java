package pers.mtx.builder.improve;
//抽象的建造者
public abstract class HouseBuilder {
    protected House house = new House();

    //建造的流程写好,抽象的方法
    public  abstract void buildBasic();
    public  abstract void buildWalls();
    public abstract void roofed();


    public House buildHouse(){
        return house;
    }

}
