import java.util.Scanner;
public class chapter_5 {
    public static void main(String[] args) {
/*
        //while loop
        System.out.println("using while loops:");
        int i = 1;
        while (i<=10) {
            System.out.println(i);
            i++;
        }

        // do while loop
        System.out.println("using do while loop");
        int b = 6;
        do {
            System.out.println(b);
            b++;
        }while(b<25);

        //for loop
        System.out.println("using for loop");
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }

        System.out.println("for odd number");
        int n = 5;
        for (int i=1; i<6; i++){
            System.out.println(2*i+1);
        }
*/
        //continue
        System.out.println("break and continue");
        for (int i=0; i<10; i++){
        if (i==2) {
            System.out.println("ending the loop");
            continue;
        }
            System.out.println(i);
            System.out.println("jB is great");
        }

        //break
        System.out.println("using break statement");
        for (int i=1; i<10; i++){
            //System.out.println(i);
            System.out.println("jaba is great" + i);
            if (i==5){
                System.out.println("ending the loop");
                break;
            }
        }
    }
}
