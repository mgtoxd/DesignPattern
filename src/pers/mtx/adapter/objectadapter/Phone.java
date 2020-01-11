package pers.mtx.adapter.objectadapter;

public class Phone {
    //充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V()==5){
            System.out.println("电压等于5V,ke");
        }else if (voltage5V.output5V()!=5){
            System.out.println("电压不等于5V,buke");
        }
    }
}
