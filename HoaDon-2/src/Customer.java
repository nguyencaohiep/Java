public class Customer {
    private String id;
    private String name;
    private String gender;
    private String dob;
    private String address;

    public Customer(String id, String name, String gender, String dob, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }
}
