public class PersonalDetails {
    public static String personInfo(int age, String name, String city){
        return "Personal Information: \nName- " + name + "\nAge - " + age +" years \nCity - " + city;
    }
    public static String personInfo(String profession, String company, int experience){
        return "\nProfessional Information: \nProfession -" + profession + "\nCompany - " + company + "\nExperience -" + experience;
    }

    public static String personInfo(){
        return personInfo(27,"Rohanathan S","Chennai") + personInfo("Cloud Engineer", "Amazon", 5);
    }

    public static void main(String[] args) {
        String getInfo = personInfo();
        System.out.println(getInfo);
    }
}
