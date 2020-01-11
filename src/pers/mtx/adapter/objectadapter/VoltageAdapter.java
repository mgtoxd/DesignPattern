package pers.mtx.adapter.objectadapter;

public class VoltageAdapter implements Voltage5V {
    private Voltage220V v;

    //构造器传入Voltage220V(聚合)
    public VoltageAdapter(Voltage220V v) {
        this.v = v;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null!=v){
            int src = v.output220();
            System.out.println("使用对象适配器");
            dstV=src/44;
            System.out.println("输出电压为"+dstV);
        }
        return dstV;
    }
}
