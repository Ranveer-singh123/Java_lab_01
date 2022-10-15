class Operators {
  public static void main(String[] args) {
    
    int a = 12, b = 5;

    System.out.println("a + b = " + (a + b));

    System.out.println("a - b = " + (a - b));

    System.out.println("a * b = " + (a * b));

    System.out.println("a / b = " + (a / b));

    System.out.println("a % b = " + (a % b));

    int var;

    var = a;
    System.out.println("var using =: " + var);

    var += a;
    System.out.println("var using +=: " + var);

    var *= a;
    System.out.println("var using *=: " + var);


    System.out.println("a is " + a + " and b is " + b);

    System.out.println(a == b);

    System.out.println(a != b);

    System.out.println(a > b); 

    System.out.println(a < b); 

    System.out.println(a >= b); 

    System.out.println(a <= b);

    System.out.println((5 > 3) && (8 > 5)); 
    System.out.println((5 > 3) && (8 < 5)); 

    System.out.println((5 < 3) || (8 > 5)); 
    System.out.println((5 > 3) || (8 < 5));  
    System.out.println((5 < 3) || (8 < 5));  

    System.out.println(!(5 == 3));  
    System.out.println(!(5 > 3));  
  }
}