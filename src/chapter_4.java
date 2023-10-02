import java.util.Scanner;
public class chapter_4 {
    public static void main(String[] args) {
        //conditionals

        System.out.println("plz enter your age:-");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("yes boy you can dive");
        }
        else{
            System.out.println("no, you cant drive");



        //elseif
        /*
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if (age > 56) {
            System.out.println("you are ex");
        } else if (age > 46) {
            System.out.println("you are semi ex");
        } else if (age > 36) {
            System.out.println("you are semi semi ex");
        } else {
            System.out.println("you are not ex");
        }
        if (age < 2) {
            System.out.println("you are not a baby");
        }


        //switch
        int age;
        System.out.println("please enter your age:-");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("you are going to be adult");
                break;
            case 23:
                System.out.println("you are going to be ready for job");
                break;
            case 35:
                System.out.println("you are going to be father");
                break;
            case 68:
                System.out.println("you are going to be grand-parents");
                break;
            default:
                System.out.println("enjoy your life");
        */
        }
    }
}

