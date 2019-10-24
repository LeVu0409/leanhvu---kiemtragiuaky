package KTGiuaKy;

public class Fan extends ElectricalDevice {

    protected int speed;
    protected boolean swing;

    Fan(String lg, int i, String string, boolean b, int i0, boolean b0) {
   
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isSwing() {
        return swing;
    }

    public void setSwing(boolean swing) {
        this.swing = swing;
    }

    public void incSpeed(int speed) {
        System.out.println("Fan is running " + speed);
    }

    public void accelarate() {
        speed += 3;
    }

    public void upDate(){
        
    }
}
