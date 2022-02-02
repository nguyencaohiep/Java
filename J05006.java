import java.util.*;

class Staff {
    private int id;
    private String fullName;
    private String gender;
    private String dateOfBirth;
    private String address;
    private long taxCode;
    private String dateSign;

    public Staff(int id, String fullName, String gender, String dateOfBirth, String address, long taxCode,
            String dateSign) {
        this.id = id;
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.taxCode = taxCode;
        this.dateSign = dateSign;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public long getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(long taxCode) {
        this.taxCode = taxCode;
    }

    public String getDateSign() {
        return dateSign;
    }

    public void setDateSign(String dateSign) {
        this.dateSign = dateSign;
    }

    public void display() {
        if (id < 10)
            System.out.print("0000");
        else
            System.out.print("000");
        System.out.println(id + " " + fullName + " " + gender + " " + dateOfBirth + " " + address + " " + taxCode + " "
                + dateSign);
    }
}

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Staff sta[] = new Staff[t + 1];
        for (int i = 1; i <= t; i++) {
            int id = i;
            String fullName = sc.nextLine();
            String gender = sc.nextLine();
            String dateOfBirth = sc.nextLine();
            String address = sc.nextLine();
            long taxCode = Long.parseLong(sc.nextLine());
            String dateSign = sc.nextLine();
            sta[i] = new Staff(id, fullName, gender, dateOfBirth, address, taxCode, dateSign);
        }
        for (int i = 1; i <= t; i++) {
            sta[i].display();
        }
        sc.close();
    }
}
