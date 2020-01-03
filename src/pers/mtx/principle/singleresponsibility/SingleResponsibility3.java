package pers.mtx.principle.singleresponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.runWater("轮船");
        vehicle.run("汽车");
        vehicle.runAir("飞机");

    }
}

//没有对类做大的修改
//没有在类的级别上遵守单一职责,但是方法级别上遵守
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行....");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水面上运行....");
    }

}
