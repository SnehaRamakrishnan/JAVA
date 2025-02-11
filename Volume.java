class Volume {
    public static double volume(double side){
        return side*side*side;
    }
    public static double volume(double l,double b,double h){
        return l*b*h;
    }
    public static double volumesphere(double r){
        return (4/3)*Math.PI*r*r*r;
    }
    public static double volume(double r,double h){
        return Math.PI*r*r*h;
    }
    public static double volumecone(double r,double h){
        return (1.0/3)*Math.PI*r*r*h;
    }
    public static void main(String[] args){
        System.out.println("Volume of cube(double):"+volume(5));
        System.out.println("Volume of cuboid(double,double,double):"+volume(3.2,4.3,2.3));
        System.out.println("volume of sphere(double):"+volume(5));
        System.out.println("volume of cylinder(double,double):"+volume(3.2,4.3));
        System.out.println("volume of cone(double,double):"+volume(3.2,4.3));
    
}
 }
