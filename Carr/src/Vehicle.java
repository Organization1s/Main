
public class Vehicle {

    public Vehicle(int passengers, int fuelcap, int mpg) {
        this.fuelcap = fuelcap;
        this.mpg = mpg;
    }
    private int fuelcap;
    private int mpg;
    private boolean bool;
    private int range;
    private int passengers;

    public boolean getInfo(int range){
        if(getFuelcap()* getMpg()<= range){
            return false;
        }else{
            return true;
        }
    }
    
    public boolean isBool(){
        return bool;
    }
    
    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mph) {
        this.mpg = mph;
    }


    public void setBool(boolean bool) {
        this.bool = bool;
    }

    void range() {
        range = getFuelcap() * getMpg();
    }

}
