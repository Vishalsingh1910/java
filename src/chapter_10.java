/*
class base{

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("i am a constructor");
    }
}
class derived extends base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
    public class chapter_10 {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());
    }
}

class animal{
    float bite;
}

class dog extends animal{
    float bark;

    public float getBark() {
        return bark;
    }

    public void setBark(float bark) {
        this.bark = bark;
    }
}
public class chapter_10 {
    public static void main(String[] args) {
        dog a = new dog();
        a.setBark(1);
        System.out.println(a.getBark());
    }
}


//constructor inheritance
class base1{
    base1(){
        System.out.println("i am a constructor");
    }
    base1(int a){
        System.out.println("i am an overloaded constructor as:" + a);
    }
}

class derived1 extends base1 {
    derived1() {
//        super(0);
        System.out.println("i am a derived clASS constuructor");
    }

    derived1(int a, int b) {
        super(a);
        System.out.println("i am an overloaded derived calss constructor y as:" + b);
    }
}
    class childofderived extends derived1{
        childofderived(){
            System.out.println("i am a child of derived constructor");
        }

        childofderived(int a,int b,int c){
            super(a,b);
            System.out.println("i am a overloaded child of derived c" + c);
    }
}

public class chapter_10 {
    public static void main(String[] args) {
        base1 b = new base1();
        derived1 d = new derived1();
        derived1 d = new derived1(3,5);
        childofderived cd = new childofderived(2,5,6);
        b.setX();
        System.out.println(b.getX());
    }
}


//this and super keyword
//this is used as a referance
class vishal1{
    private float v;
    public float getV() {
        return v;
    }
    vishal1(float a){
        this.v = a;
    }
    public int returnone(){
        return 1;
    }
}
public class chapter_10 {
    public static void main(String[] args) {
    vishal1 v = new vishal1(34);
        System.out.println(v.getV());
    }
}
*/

//method overriding
class a{
    public int vis(){
        return 5;
    }
}
public class chapter_10 {
    public static void main(String[] args) {
        a a=new a();
        System.out.println();
        System.out.println("a");
    }
}