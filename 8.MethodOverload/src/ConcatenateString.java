public class ConcatenateString {
    public static String concatenate(String s1, String s2){
        return s1 + s2;
    }
    public static String concatenateSeperator(String s1, String sep,String s2){
        return s1 + sep + s2;
    }

    public static void main(String[] args) {
        System.out.println("Concatenated String is : " + concatenate("Rohan","thecndog"));
        System.out.println("Concatenated Stirng with Seperator is : " + concatenateSeperator("thecndog",":","the cloud native devops guy"));
    }
}
