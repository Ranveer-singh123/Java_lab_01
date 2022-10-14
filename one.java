import java.util.Scanner;
//Ranveer Singh
//2k22/cse/82

public class one {

public static void main(String[] args) {

Scanner reader = new Scanner(System.in);

System.out.print("Enter a number: "); int num= reader.nextInt();

if (num % 2 == 0)

System.out.println(num + " is even");

else

System.out.println(num + " is odd");

}

}