import java.awt.*;

//class cylinder {
//        private int radius;
//        private int height;
//
//        public cylinder(int radius, int height) {
//            this.radius = radius;
//            this.height = height;
//        }
//
//                public int getRadius() {
//            return radius;
//        }
//
//        public void setRadius(int radius) {
//            this.radius = radius;
//        }
//
//        public int getHeight() {
//            return height;
//        }
//
//        public void setHeight(int height) {
//            this.height = height;
//        }
//        public double surfaceArea(){
//            return 2*3.14*radius*radius+2*3.142*radius*height;
//        }
//        public double volume(){
//            return 3.14*radius*radius*height;
//        }
        class Rectangle {
            private int length;
            private int breadth;

    public Rectangle() {
        this.length = 5;
        this.breadth = 3;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

    public class practise_set9 {
            public static void main(String[] args) {
/*
        //problem 1
        cylinder mycylinder = new cylinder();
        mycylinder.setRadius(2);
        mycylinder.setHeight(11);
        int r = mycylinder.getRadius();
        int h = mycylinder.getHeight();
        System.out.println(r);
        System.out.println(h);

        // problem 2
        cylinder mycylinder = new cylinder();
        mycylinder.setRadius(2);
        mycylinder.setHeight(11);
        double s = mycylinder.surfaceArea();
        double v = mycylinder.volume();
        System.out.println(v);
        System.out.println(s);

        //problem 3
        cylinder mycylinder = new cylinder(4,9);
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.getRadius());
*/

        //problem 4
        Rectangle r= new Rectangle();
                System.out.println(r.getBreadth());
                System.out.println(r.getLength());
    }
}
