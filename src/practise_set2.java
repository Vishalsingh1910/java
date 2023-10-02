import java.util.Scanner;

public class practise_set2 {
    public static void main(String[] args) {
        /*
        float c = 7/4.0f * 9/2.0f;
        System.out.println(c);

        // encrypting the grade
        char grade ='b';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //given no. is greater or not
        System.out.println("please enter your no:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>6);
        */

        // write the following expression
        System.out.println("enter your value:-");
        Scanner sc = new Scanner(System.in);
        System.out.print("v:-");
        int v = sc.nextInt();
        System.out.print("u:-");
        int u = sc.nextInt();
        System.out.print("d:-");
        int d = sc.nextInt();
        System.out.print("s:-");
        int s = sc.nextInt();
        System.out.print("your answer is:- ");
        float k = (v*v - u*u/2*d*s);
        System.out.println(k);

    }
}
