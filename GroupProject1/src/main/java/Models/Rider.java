package Models;

public class Rider {
    public String Name;
    public String Country;
    public int Age;
    public float Weight;
    public float Height;
    
    public class Record {

        private int No_Of_Olympic_Medals;
        private float TopSpeed;
        private int No_National_Level_Records;

        public Record(int No_Of_Olympic_Medals, float TopSpeed, int No_National_Level_Records) {
            this.No_Of_Olympic_Medals = No_Of_Olympic_Medals;
            this.TopSpeed = TopSpeed;
            this.No_National_Level_Records = No_National_Level_Records;
        }

        public String displayRecords() {
            return No_Of_Olympic_Medals + " " + TopSpeed + " " + No_National_Level_Records;
        }
    }
    
    public double calBMI(double weightm, double heightm) {
        class BMI {

            double WeightMetric;
            double HeightMetric;

            BMI(double WeightMetric, double HeightMetric) {
                this.HeightMetric = HeightMetric;
                this.WeightMetric = WeightMetric;
            }

            double bmiMetric() {
                double bmi = this.WeightMetric / (this.HeightMetric * this.HeightMetric);
                return bmi;
            }
        }
        BMI o = new BMI(weightm, heightm);
        return o.bmiMetric();
    }

    public Rider(String Name, String Country, int Age, float Weight, float Height) {
        this.Name = Name;
        this.Country = Country;
        this.Age = Age;
        this.Weight = Weight;
        this.Height = Height;
    }

    public String getName() {
        return Name;
    }

    public String getCountry() {
        return Country;
    }

    public int getAge() {
        return Age;
    }

    public Rider() {
    }
    
    
    
}
