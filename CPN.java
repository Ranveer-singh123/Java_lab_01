import java.util.*;

class CPN {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a metric marks: ");
        int num1= reader.nextInt();

        System.out.print("Enter a Intermediate marks: "); 
        int num2= reader.nextInt();

        System.out.print("Enter a Test Result: "); 
        int num3= reader.nextInt();

        double cpn = num1 * 0.1 + num2 * 0.3 + num3 * 0.6;

        System.out.print("CPN = " + cpn); 
    }
}