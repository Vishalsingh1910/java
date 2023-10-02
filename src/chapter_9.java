class circle{
    private int radius;
    private int perimeter;
    private float area;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

//    public float getPerimeter(){
//        return perimeter;
//    }
//
//    public void setPerimeter(int perimeter) {
//        this.perimeter = perimeter;
//    }

    public float getArea(){
        return area = 3.14f *radius*radius;
    }

}

public class chapter_9 {
    public static void main(String[] args) {
        circle vishal = new circle();
        vishal.setRadius(3);
        System.out.println(vishal.getRadius());
//        vishal.setPerimeter(2);
//        System.out.println(vishal.getPerimeter());
        System.out.println(vishal.getArea());
    }
}
