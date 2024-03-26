import java.util.Scanner;
//It seems like it dhould work but I am clearly missing some basic java syntax and kept getting errors, I will reread all the previous lessons and compare this code to the solution to see what I need to learn.

public class policy{
   
   public void blank() {
      public int number = 0, age = 0, height = 0, weight = 0, bmi = 0;
      public String name = "n/a", first = "n/a", last = "n/a", smoking = "n/a";
      }
   public policycreation(number, name, first, last, age, smoking, height, weight, BMI) {
      Scanner myInput = new Scanner(System.in);
      
      
      System.out.print("Enter your policy number: ");
      number = myInput.nextInt();
      System.out.print("Enter your name: ");
      name = myInput.nextLine();
      System.out.print("Enter your first name: ");
      first = myInput.nextLine();
      System.out.print("Enter your last name: ");
      last = myInput.nextLine();
      System.out.print("Enter your age: ");
      age = myInput.nextInt();
      System.out.print("Enter if you are a 'smoker' or 'non-smoker': ");
      smoking = myInput.nextLine();
      System.out.print("Enter your height (in inches): ");
      height = myInput.nextInt();
      System.out.print("Enter your weight (in pounds): ");
      weight = myInput.nextInt();   
      //BMI = (Policyholder’s Weight * 703 ) / (Policyholder’s Height2 )
      }
   }
    public static void main(String[] args) {
      blank();
      policycreation(number, name, first, last, age, smoking, height, weight, BMI);
      public int price = 600;
      if (age > 50) {
      price += 75;
      }
      if (smoking == "smoker") {
      price += 100;
      }
      if (bmi > 35) {
      price +=  ((bmi – 35 ) * 20);
      }
      System.out.print(price);
      }