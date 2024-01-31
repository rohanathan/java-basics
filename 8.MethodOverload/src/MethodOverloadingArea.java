public class MethodOverloadingArea {
    public static double recArea (double len, double wid){
        return len * wid;
    }
    public static double sqArea (double side){
        return side * side;
    }
    public static double triArea (double base, double height){
        return 0.5 * base * height;
    }
    public static double circleArea (double rad){
        return 3.14 * rad * rad;
    }
    public static void main(String[] args) {
        System.out.println("Area of Rectangle : " + recArea(45,56));
        System.out.println("Area of Square : " + sqArea(5));
        System.out.println("Area of Triangle : " + triArea(45,56));
        System.out.println("Area of Circle : " + circleArea(7));
    }
}
