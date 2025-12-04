public class DecimalToBinary {
   public static void main(String[] args) {
       int decimal = 19; // Example input
       System.out.println("Decimal: " + decimal);
       System.out.print("Binary: ");
       convertToBinary(decimal);
   }
   public static void convertToBinary(int n) {
       long binary = 0; // To store the binary result
       long placeValue = 1; // Tracks the position (1, 10, 100, etc.)
       while (n > 0) {
           int remainder = n % 2; // Get the last binary digit
           binary += remainder * placeValue; // Add it to the result at the correct place
           System.out.println("Remainder: " + remainder + ", Binary so far: " + binary);
           n /= 2; // Divide by 2 to process the next bit
           placeValue *= 10; // Move to the next position
       }
       System.out.println(binary); // Print the final binary number
   }
}
