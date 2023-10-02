import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        System.out.println("student grade");
        Scanner sc = new Scanner(System.in);
        System.out.println("maths");
        float a = sc.nextFloat();
        System.out.println("english");
        float b = sc.nextFloat();
        System.out.println("science");
        float c = sc.nextFloat();
        System.out.println("social");
        float d = sc.nextFloat();
        System.out.println("hindi");
        float e = sc.nextFloat();
        float sum = a + b + c + d + e;
        System.out.println(sum);
        float Total = 100 * 5;
        float percentage = ((sum / Total) * 100);
        System.out.println(percentage);
    }
}