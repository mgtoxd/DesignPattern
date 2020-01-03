package pers.mtx.principle.singleresponsibility;

public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");


    }
}

//交通工具类
//遵守单一职责原则
//但是改动很大,将类分解并且修改客户端
//改进:直接改Vehicle
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上运行....");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空上运行....");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在水面上运行....");
    }
}
