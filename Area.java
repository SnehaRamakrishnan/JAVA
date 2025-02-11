class Area {
    public static int area(int length,int width){
        return length*width;
    }
    public static double arearect(double length,double width){
        return length*width;
    }
    public static int area(int side){
        return side*side;
    }
    public static double areasquare(double side){
        return side*side;
    }
    public static double area(double radius ){
        return Math.PI *radius*radius;
    }
    public static double area(double base,double height){
        return 0.5*base*height;
    }
    public static void main(String[] args){
        System.out.println("Area of rectangle(int,int):"+area(5,7));
        System.out.println("Area of rectangle(double,double):"+area(3.2,4.3));
        System.out.println("Area of square(int):"+area(6));
        System.out.println("Area of square(double):"+area(6.3));
        System.out.println("Area of circle(double):"+area(5.0));
        System.out.println("Area of triangle(double,double):"+area(3.0,4));
    }
    



    
}