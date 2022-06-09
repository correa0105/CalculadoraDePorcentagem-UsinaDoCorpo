package financecalculation;
public class CalculationResume {
    
    private double value1;
    private double value2;
    private double total;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void aumentouOuDiminuiu(double value1, double value2){
        this.setValue1(value1);
        this.setValue2(value2);
        
        this.setTotal((this.getValue2() / this.getValue1() - 1) * 100);
    }
    
        public void equivaleHa(double value1, double value2){
        this.setValue1(value1);
        this.setValue2(value2);
        
        this.setTotal((this.getValue1() / this.getValue2()) * 100);
    }

        public void quantoE(double value1, double value2){
        this.setValue1(value1);
        this.setValue2(value2);
        
        this.setTotal((this.getValue1() / 100) * this.getValue2());
    }
   /* public void aumentou(double value1, double value2, double total){
        this.setValue1(value1);
        this.setValue2(value2);
        this.setTotal(total); 
       
    }*/
   
    
}
