public class MainClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Rohan");
        person.setLastName("the cloud native guy");
        person.setAge(27);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.isTeen());
        System.out.println(person.getFullName());
    }
}
