import java.util.Scanner;
public class practise_set6 {
    public static void main(String[] args) {
        //qsn 1
/*
        float marks[] = {52,65.02f,84.5f,32,47};
        System.out.println(marks.length);
        float sum = 0;
        for (float element:marks){
            sum= sum + element;
        }
        System.out.println("the value of the element is:- " + sum);


        //qsn 2
        float [] marks= {54,65,32,87,98};
        float num =39;
        boolean isInarray = false;
        for(float element:marks){
            if(num==element){
                isInarray= true;
                break;
            }
        }
        if (isInarray){
            System.out.println("the value is in aray");
        }
        else{
            System.out.println("the value is not present");
        }

        //qsn 3
        float marks[] = {52,65.02f,84.5f,32,47};
        System.out.println(marks.length);
        float sum = 0;
        for (float element:marks){
            sum= sum + element;
        }
        System.out.println("the value of the element is:- " + sum/marks.length);

        //qsn 4
        int [][] mat1 = {{1,2,3},
                         {4,5,6}};
        int [][] mat2 = {{6,9,6},
                         {7,8,3}};
        int [][] result = {{0,0,0},
                          {0,0,0}};
        for (int i=0; i< mat1.length; i++){
            for (int j=0; j< mat1[i].length; j++){
                System.out.format("setting the value i=%d && j=%d\n" ,i,j);
                result[i][j] = mat1[i][j]+ mat2[i][j];
            }
        }
        for (int i=0; i< mat1.length; i++){
            for (int j=0; j< mat1[i].length; j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j]+ mat2[i][j];
            }
            System.out.println("");
        }

        //qsn5
        int[] arr= {1,5,2,3,6,5};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element: arr){
            System.out.print(element + " ");
        }


        //qsn 6
        System.out.println("enter your variable");
        Scanner sc = new Scanner(System.in);
        int arr[] = {sc.nextInt()};
        int max = 0;
        for (int e: arr){
            if ((e>max)){
                max = e;
            }
        }
        System.out.println("the max is " + max);
*/
        //min
        int []arr = {32,65,8,6,21,47};
        int max = Integer.MIN_VALUE;
        for (int e: arr){
            if (e<max){
                max = e;
            }
        }
        System.out.println("the min is " + max);
    }
}
