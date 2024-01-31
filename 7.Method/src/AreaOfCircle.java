public class AreaOfCircle {
    public static void main(String[] args) {
        circleArea(4,3.14);
        double area = circleArea(4, 3.14);
        System.out.println("Area of the circle is " + area);
    }

    public static double circleArea(double rad, double pi){

    double result = pi * rad * rad;
        return result;
}
}
