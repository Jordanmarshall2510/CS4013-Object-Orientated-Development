public class TestResult {
    private double R1,R2,R3,total; 
    int size;
    double scores[];
    public TestResult() { 
        size = 3;
        scores = new double[size];
    }
    public TestResult(int j) {
        size = j;
        scores = new double[size];
    }
    public void setScore(int i, double value) {
        scores[i]= value;
        
    }
    public double getScore(int i) {
        /*if(i==1) {
            return R1;
        }
        if(i==2) {
            return R2;
        }
        if(i==3) {
            return R3;
        }
        else{
            return 0;
        }*/
        return scores[i];
    }
    public double getAverage() {
        /*double x = R1+R2+R3;
        x=x/3;
        return x;*/
        double x=0;
        for(int i=0;i<size;i++) {
            x=x+scores[i];
        }
        total =x/size;
        return x/size;
    }
    public double getTotal() {
        /*double x = R1+R2+R3;
        total = x;
        return x;*/
        double x=0;
        for(int i=0;i<size;i++) {
            x=x+scores[i];
        }
        
        return x;
    }
    public String getGrade() {
        if(total>=80) {
            return "A1";
        }
        if(total>=72) {
            return "A2";
        }
        if(total>=64) {
            return "B1";
        }
        if(total>=60) {
            return "B2";
        }
        if(total>=56) {
            return "B3";
        }
        if(total>=52) {
            return "C1";
        }
        if(total>=48){
            return "C2";
        }
        if(total>=40) {
            return "C3";
        }
        if(total>=35) {
            return "D1";
        }
        if(total>=30) {
            return "D2";
        }
        if(total>=1) {
            return "F";
        }
        if(total<=1) {
            return "NG";
        }
        return null;
    }
    
        
}
