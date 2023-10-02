
public class chapter_3 {
    public static void main(String[] args) {

        String name = new String("hary");
/*        String name1 = "harry";
        System.out.println(name);
        System.out.println(name1);


        int a = 5;
        float b = 65.542f;
        System.out.printf("the value of a is %d and value of b is %f",a,b);
        System.out.format("the value of a is %d and value of b is %f", a,b);

        String name2 = "harry";
        int value = name2.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedstring = "      harry     ";
        System.out.println(nonTrimmedstring);
        System.out.println(nonTrimmedstring.trim());
*/
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('h' , 'p'));
        System.out.println(name.replace("r" , "hgf"));

        System.out.println(name.startsWith("har"));
        System.out.println(name.endsWith("hg"));

        System.out.println(name.charAt(1));

        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("harry"));

        /*
        //problem 1
        String name ="harry";
        String vishal = name.toLowerCase();
        System.out.println(vishal);
        //problem 2
        String text = "vivek is my good friend";
        text = text.replace(" " , "_");
        System.out.println(text);
        //problem 3
        String letter = "dear <|vivek|>, tjank a lot";
        letter = letter.replace("<|vivek|>" , "vishal");
        System.out.println(letter);
        //problem 4
        String mystring = "this is me thank   you";
        System.out.println(mystring.indexOf(" "));
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("     "));
        //problem 5
        String VIVEK = "\nhello!\n\twelcome \t\nthis is aamazing to see you ";
        System.out.println(VIVEK);
         */
    }
}
