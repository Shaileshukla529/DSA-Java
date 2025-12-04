import java.util.Scanner;

public class SumToN {

     public int sum(int n){
        if (n==0){
            return 0;
        }
        return  n + sum(n-1);
       };

    public int ap_Number(int n){
     return   (n*(n+1))/2;
    }
    

    public static void main(String[] args){
      try (Scanner scanner = new Scanner(System.in)){
         SumToN obj = new SumToN();
          System.out.println("Enter the number: ");
          int n = scanner.nextInt();
          int a = obj.sum(n);
          int b = obj.ap_Number(n);
          System.out.println("Total Sum till N Number is: "+ a);
          System.out.println("Total Sum till N Number Using AP is: "+ b);

      }
    
    }
}
