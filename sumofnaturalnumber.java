import java.util.Scanner;
public class NaturalNumbersSum {
   public static void main(String[] args) {
      int my_lower_limit , my_upper_limit, sum;
      System.out.println("Required packages have been imported");
      Scanner scanner = new Scanner(System.in);
      System.out.println("A scanner object has been defined ");
      System.out.print("Enter the starting number: ");
      my_lower_limit = scanner.nextInt();
      System.out.print("Enter the max number: ");
      my_upper_limit = scanner.nextInt();
      sum = 0;
      for(int i = my_lower_limit; i <= my_upper_limit; ++i){
         sum += i;
      }
      System.out.println("The sum of natural numbers from " + my_lower_limit + " to " + my_upper_limit + " is " +sum);
   }
}
