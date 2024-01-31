public class MethodOverloading {
    public static void add(int a, int b){
        System.out.println("Method with 2 param: " + a + " & " + b);
    }
    public static void add(int a, int b, int c){
        System.out.println("Method with 3 param: "+ a + "," + b +" & " + c);

    }
    public static void main(String[] args) {
        add(5,6);
        add(4,5,5);

    }
}
