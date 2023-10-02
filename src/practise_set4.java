import java.util.Scanner;

public class practise_set4 {
    public static void main(String[] args) {

        //qsn 1
/*
        int a= 1;
        if (a=1);{
            System.out.println("i am 11");
        }
        else if{
            System.out.println("i am not 11");
        }
*/
        //qsn 2
        /*
        byte a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics");
        a = sc.nextByte();
        System.out.println("enter your marks in chemistry");
        b = sc.nextByte();
        System.out.println("enter your marks in mathematics");
        c = sc.nextByte();
        int avg = (a + b + c) / 3;
        System.out.println("your overall percentage is: " + avg);
        if (avg >= 40 && a >= 33 && b >= 33 && c >= 33) {
            System.out.println("congratulations you have been promoted");
        }
        else{
            System.out.println("sorry,you have not been promoted");
        }
        */

        //qsn3
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any no. between 1-7");
        int day = sc.nextInt();
        switch(day){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wednesday");
            case 4-> System.out.println("thursday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("saturday");
            case 7-> System.out.println("sunday");
        }
         */
        int year;
        System.out.println("enter your year");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
            System.out.println("its a leap year");
        }
        else {
            System.out.println("its not a leap year");
        }
    }
}
