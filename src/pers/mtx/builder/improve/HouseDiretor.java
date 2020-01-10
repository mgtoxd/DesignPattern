package pers.mtx.builder.improve;

public class HouseDiretor {
    HouseBuilder houseBuilder = null;

    //构造器传入

    public HouseDiretor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //setter传入

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程,交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
