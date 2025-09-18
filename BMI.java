import java.util.*;
public class BMI {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double w=sc.nextDouble(), h=sc.nextDouble();
    double bmi=w/(h*h);
    System.out.println("BMI: "+bmi);
  }
}
