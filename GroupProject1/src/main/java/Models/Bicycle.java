package Models;

public class Bicycle {
    private float Speed; 
    private int Gear;
    
    public Bicycle(float Speed, int Gear) {
        this.Speed = Speed;
        this.Gear = Gear;
    }
    
    public float getSpeed() {
        return Speed;
    }

    public int getGear() {
        return Gear;
    }
    public void applyBrake(double decrement) {
        this.Speed -= decrement;
    }
    public void speedUp(double increment) {
        this.Speed += increment;
    }
    @Override
    public String toString()
    {
        return "Speed is "+this.Speed+" Gear is "+this.Gear;
    }

}
