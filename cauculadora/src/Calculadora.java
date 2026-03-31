public class Calculadora {

    private double num1, num2; 
   

     public void setNum1(Double num1){this.num1 = num1;}

     public void setNum2(Double num2){this.num2 = num2;}
    
     public double soma() {
       return this.num1 + this.num2;
     }
     public double sub() {
       return this.num1 - this.num2;
     }
     public double mult() {
       return this.num1 * this.num2;
     }
     public double div() {
       return this.num1 / this.num2;
     }






}
