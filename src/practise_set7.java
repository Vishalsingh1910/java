public class practise_set7 {

    //problem 1
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    //problem 2
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //problem 3
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void pattern2(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //problem 4{
    static int fib(int n){
        if (n==1){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    //problem 5

    public static void main(String[] args) {
            multiplication(5);
            pattern1(6);
            int c = sumRec(3);
            System.out.println(c);
            pattern2(5);
            int result = fib(9);
            System.out.println(result);
    }
}
