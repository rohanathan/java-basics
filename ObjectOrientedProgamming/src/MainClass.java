public class MainClass {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(555);
        emp.setEmpName("Rohan");
        emp.setEmpDesignation("Cloud Engineer");
        emp.setEmpCompany("CNDOG");
        System.out.println(emp.makeString());
    }
}
