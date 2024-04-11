import java.util.Scanner;
import java.io.*;

public class PolicyDemo 
{   
   public static void main(String[] args) throws IOException
   {
      //open file
      File file = new File("PolicyInformation.txt");
      
      
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      int smokers = 0;
      int nonsmokers = 0;
      String smokingStatus;
      double height = 0;
      double weight = 0;
      String blank1;
      String blank2;
      
      Scanner filedata = new Scanner(file);
   
      while (filedata.hasNext()) {
         policyNumber = filedata.nextLine(); //adds a ? at the start? I have no clue why and it seems to only happen to first loop
         //System.out.println(policyNumber);
         
         providerName = filedata.nextLine();
         //System.out.println(providerName);
         
         firstName = filedata.nextLine();
         //System.out.println(firstName);
         
         lastName = filedata.nextLine();
         //System.out.println(lastName);
         
         age = filedata.nextInt();
         filedata.nextLine(); // clear the line after the int
         //System.out.println(age);
         
         //it seems to break here where it seem to can't read the data type?
         //Exception in thread "main" java.util.InputMismatchException 
         //I have it to print out the variables once they get assigned but it doesn't seem to help
         smokingStatus = filedata.nextLine();

 
         if (smokingStatus.equalsIgnoreCase("smoker")) {
            smokers += 1;
         } else {
            nonsmokers += 1;
         }
         
         //System.out.println(smokingStatus);
         
         height = filedata.nextDouble();
         //System.out.println(height);
         
         weight = filedata.nextDouble();
         //System.out.println(weight);
         
         //skip blanks
         if(filedata.hasNext())
            blank1 = filedata.nextLine();
         if(filedata.hasNext())
            blank2 = filedata.nextLine();
         
         //create a Policy object
         Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
         
         //put a blank line before the output
         System.out.println();
         
         //display information about the Policy
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getLastName());
         System.out.println("Policyholder's Age: " + policy.getAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
         System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
         System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
         System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
      }
      filedata.close();

      System.out.println("The number of policies with a smoker is: " + smokers);
      System.out.println("The number of policies with a non-smoker is: " + nonsmokers );

   }
}