class vishal{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my id is " + id);
        System.out.println("and my name is " + name);
        System.out.println("my salarry is " + salary);
    }
}

/*
class employee{
    int id;
    String name;


    public int getsalary() {
        System.out.println("your salary is" + getsalary());
    }
        public void getdetails(){
            System.out.println("details" + getdetails(););
    }
}
 */
  public class chapter_8 {
      public static void main(String[] args) {

        //OOPS
        //custom class
        System.out.println("this is your custom class");
        vishal harry = new vishal();
        vishal john  = new vishal();
        john.id = 54;
        john.salary = 656;
        john.name = "trilochan";

        harry.id = 12;
        harry.salary = 6522;
        harry.name = "visa";
        harry.printdetails();
        john.printdetails();

    }
}
