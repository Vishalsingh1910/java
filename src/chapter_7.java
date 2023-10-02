import javax.management.MBeanAttributeInfo;
import java.util.Scanner;
public class chapter_7 {

/*
      //methods
      static int logic(int x, int y) {
            int z;
            if (x > y) {
                  z = x + y;
            } else {
                  z = (x + y) * 5;
            }
            return z;
      }

      public static void main(String[] args) {
            System.out.println("enter your number:- ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c;
            c = logic(a, b);
            int a1 = 2;
            int b1 = 2;
            int c1;
            c1 = logic(a1, b1);
            System.out.println(c);
            System.out.println(c1);


            //methods overloading
            static void tellJoke () {
                  System.out.println("hi iam hunny bunny");
            }

            public static void main (String[]args){
                  tellJoke();
            }


            //varargs
            static int sum ( int ...arr){
                  int result = 0;
                  for (int a : arr) {
                        result += a;
                  }
                  return result;
            }
            public static void main (String[]args){
                  System.out.println("the sum of these are:- " + sum(4, 5, 6));


                  //recursion
                  static int factorial ( int n){
                        if (n == 0 || n == 1) {
                              return 1;
                        } else {
                              return n * factorial(n - 1);
                        }
                  }
                  static int factorial_iterative ( int n){
                        if (n == 0 || n == 1) {
                              return 1;
                        } else {
                              int product = 1;
                              for (int i = 1; i <= n; i++) {
                                    product *= i;
                              }
                              return product;
                        }
                  }


               public static void main (String[]args){
                        int x = 6;
                        System.out.println("the value of factorial x is: " + factorial(x));
                        System.out.println("the value of factorial x is: " + factorial_iterative(x));
*/
                        static int n1 = 0, n2 = 2, n3 = 0;
                        static void printfibonacci ( int count){
                              if (count > 0) {
                                    n3 = n1 + n2;
                                    n1 = n2;
                                    n2 = n3;
                                    System.out.print(" " + n3);
                                    printfibonacci(count - 1);
                              }
                        }
                        public static void main (String[]args){
                              int count = 10;
                              System.out.println(n1 + " " + n2);
                              printfibonacci(count - 2);
                        }
}


