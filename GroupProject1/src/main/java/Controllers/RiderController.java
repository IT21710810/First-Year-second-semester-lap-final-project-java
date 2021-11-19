package Controllers;
import Models.Rider;
import Models.Rider.Record;
public class RiderController {
    Rider riderObj;
    Rider.Record recObj;
    
    public Rider addRider(String Name,int age,String Country,float weight,float height)
    {
        riderObj=new Rider(Name,Country,age,weight,height);
        return riderObj;        
    }
    
    public Rider.Record addRecord(int No_Of_Olympic_Medals, float TopSpeed, int No_National_Level_Records)
    {
        recObj=riderObj.new Record(No_Of_Olympic_Medals,TopSpeed,No_National_Level_Records);
        return recObj;
    }
}
