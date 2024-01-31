public class AreaPerimeter {
    public static int RectangleArea(int length, int width){
        return 2 * length * width;
    }
    public static int RectanglePerimeter(int length, int width){
        return 2 * (length + width);
    }
    public static int SqArea(int side){
        return side * side;
    }
    public static int SqPerimeter(int side){
        return 4 * side;
    }

    public static void main(String[] args) {
        int recLen = 5;
        int recWid = 4;
        int sqSide = 7;
        System.out.println("Rectangle Area is : " + RectangleArea(recLen,recWid));
        System.out.println("Rectangle Perimeter is : " + RectanglePerimeter(recLen, recWid));
        System.out.println("Square Area is : " + SqArea(sqSide));
        System.out.println("Square Perimeter is : " + SqPerimeter(sqSide));
    }
}
