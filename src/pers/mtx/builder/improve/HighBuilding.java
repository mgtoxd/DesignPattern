package pers.mtx.builder.improve;

public class HighBuilding extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("高楼地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼屋顶");
    }
}
