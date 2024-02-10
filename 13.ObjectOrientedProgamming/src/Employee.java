public class Employee {
    private int eId;
    private String eName;
    private String eDesignation;
    private String eCompany;


    public int getEmpId(){
        return eId;
    }

    public String getEmpName() {
        return eName;
    }

    public String getEmpDesignation() {
        return eDesignation;
    }

    public String getEmpCompany() {
        return eCompany;
    }
    public void setEmpId(int eId) {
        this.eId = eId;
    }

    public void setEmpName(String eName) {
        this.eName = eName;
    }

    public void setEmpDesignation(String eDesignation) {
        this.eDesignation = eDesignation;
    }

    public void setEmpCompany(String eCompany) {
        this.eCompany = eCompany;
    }
    public String makeString(){
        String str = "Employee: ID = " + getEmpId() + ", Name = " + getEmpName() + ", Designation = " + getEmpDesignation() + ", Company = " + getEmpCompany() + " ";
        return str;
    }
}


