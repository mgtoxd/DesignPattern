package pers.mtx.builder.improve;

public class Client {
    public static void main(String[] args) {
        //盖普通房子
        CommonHouse commonHouse = new CommonHouse();
        //准备指挥者
        HouseDiretor houseDiretor = new HouseDiretor(commonHouse);

        //完成盖房子,返回产品(房子)
        House house = houseDiretor.constructHouse();

        //盖高楼
        HighBuilding highBuilding = new HighBuilding();
        //重置建造者
        houseDiretor.setHouseBuilder(highBuilding);
        //产品
        houseDiretor.constructHouse();
    }
}
