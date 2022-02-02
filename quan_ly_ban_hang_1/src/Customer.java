public class Customer {
    private String idCus;
    private String name;
    private String gender;
    private String dateBirth;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String gender, String dateBirth, String address) {
        this.idCus = String.format("KH%03d", id);
        this.name = name;
        this.gender = gender;
        this.dateBirth = dateBirth;
        this.address = address;
    }

    public String getIdCus() {
        return idCus;
    }

    public String toString() {
        return name + " " + address;
    }
}
