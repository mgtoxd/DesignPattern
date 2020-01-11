package pers.mtx.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        int src = output220();
        int dstV = src/40;
        return dstV;
    }
}
