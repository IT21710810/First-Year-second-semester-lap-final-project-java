package Controllers;
import Models.Bicycle;
import DatabaseAccessLayer.BicycleAccessLogic;
public class BicycleController {
    Bicycle ObjBike;
     BicycleAccessLogic bal;
     
     public BicycleController() {
        bal = new BicycleAccessLogic();
    }
     
    public Bicycle addBicycle(int Gear, float Speed) {
        ObjBike = new Bicycle(Speed, Gear);
        return ObjBike;
    }
    
    
    public boolean insertBikeToDB(Bicycle bike) {
        boolean result = bal.addBicycleTODB(bike);
        return result;
    }
}
