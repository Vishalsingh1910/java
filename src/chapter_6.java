public class chapter_6 {
    public static void main(String[] args) {
/*
        int [] marks;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 65;
        marks[2] = 50;
        marks[3] = 10;
        marks[4] = 40;
        System.out.println(marks[3]);


        int [] marks= new int[5];
        marks[0] = 100;
        marks[1] = 65;
        marks[2] = 50;
        marks[3] = 10;
        marks[4] = 40;
        System.out.println(marks[2]);


        int[] marks2 = {65,25,47,85,65};
        System.out.println(marks.length);
        System.out.println(marks2[2]);

//using for loop
        System.out.println("using for loop");
        for (int i=0; i<marks.length;i++) {
            System.out.println(marks[i]);
        }
//using for loop for reverse order
        System.out.println("using for loop");
        for (int i=marks.length -1; i>=0;--i) {
            System.out.println(marks[i]);
        }
//using while loop
//        int i=0;
//        while(i<marks.length){
//            System.out.println(marks[i]);
//            for (int i=0; i<marks.length -1; --i) {
//            }
*/

        int []marks2;
        int [][] flats;
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        System.out.println("using multidimentional array");
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
}
