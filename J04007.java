import java.util.*;

class Employee {
    private String id;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String taxCode;
    private String dateSign;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getDateSign() {
        return dateSign;
    }

    public void setDateSign(String dateSign) {
        this.dateSign = dateSign;
    }

    public Employee(String id, String name, String gender, String dateOfBirth, String address, String taxCode, String dateSign) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxCode = taxCode;
        this.dateSign = dateSign;
    }

    public String display(String id,String name, String gender, String dateOfBirth, String address, String taxCode, String dateSign){
        return String.format("%s %s %s %s %s %s %S",id, name, gender, dateOfBirth.toString(), address, taxCode, dateSign.toString());
    }
}

public class J04007 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String id = "00001";
        String name = sc.nextLine();
        String gender = sc.nextLine();
        String dateOfBirth = sc.nextLine();
        String address = sc.nextLine();
        String taxCode = sc.nextLine();
        String dateSign = sc.nextLine();
        Employee emp = new Employee(id, name, gender, dateOfBirth, address, taxCode, dateSign);
        System.out.println(emp.display(id, name, gender, dateOfBirth, address, taxCode, dateSign));
        sc.close();
    }
}
