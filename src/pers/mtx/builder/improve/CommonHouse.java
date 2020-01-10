package pers.mtx.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("普通地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通10m墙");

    }

    @Override
    public void roofed() {
        System.out.println("普通屋顶");

    }
}
