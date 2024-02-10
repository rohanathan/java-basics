public class Library {
    private String name;
    private int numBooks;
    private String address;
    public Library(String name, int numBooks, String address){
        this.name = name;
        this.numBooks = numBooks;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getNumBooks(){
        return numBooks;
    }
    public String getAddress(){
        return address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumBooks(int numBooks){
        this.numBooks = numBooks;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
