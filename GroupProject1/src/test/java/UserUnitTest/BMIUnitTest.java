package UserUnitTest;
import org.junit.jupiter.api.*;
import Models.Rider;
public class BMIUnitTest {
    
    static Rider rider;
    double actual;
    
    
    @BeforeAll
    public static void CreateBMIObj() {
        rider = new Rider();
    }

    @BeforeEach
    public void SetValues() {
        rider.Name = "Kasun";
        rider.Age = 15;
        rider.Height = 172.56f;
        rider.Weight = 75.56f;
        actual = rider.calBMI(rider.Weight, rider.Height);
    }
    @Test
    public void CheckBMI() {
        Assertions.assertEquals(0.002, actual,0.001);
    }
    @AfterEach
    public void CleanValues() {
        rider.Name = null;
        rider.Age = 0;
        rider.Height = 0.0f;
        rider.Weight = 0.0f;
        actual = 0.0;
    }
    @AfterAll
    public static void DeleteObj(){
        rider=null;
    }
    
}
