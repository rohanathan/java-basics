public class MainClass {
    public static void main(String[] args) {
        Library myLibrary = new Library("Westend Library",4780,
                "23rd Avenue, 3rd Street");
        System.out.println(myLibrary.getName());
        System.out.println(myLibrary.getNumBooks());
        System.out.println(myLibrary.getAddress());

        myLibrary.setName("Downtown Library");
        myLibrary.setNumBooks(3800);
        myLibrary.setAddress("10 Downing Street");

        System.out.println(myLibrary.getName());
        System.out.println(myLibrary.getNumBooks());
        System.out.println(myLibrary.getAddress());
    }
}
