package calculatorcda;

public class CalculatorCDA {

    public static void main(String[] args) {
        add(5,6);
        subtract(10,5);
        multiply(2,5);
    }
    
    public static int add(int x, int y) {
        int total = x + y;
        System.out.println(total);       
        return total;
    }
    
     public static int subtract(int x, int y) {
        int total = x - y;
        System.out.println(total);       
        return total;
     }
     
      public static int multiply(int x, int y) {
        int total = x * y;
        System.out.println(total);       
        return total;
}
