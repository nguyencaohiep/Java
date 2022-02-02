public class Bill {
    private String idBill;
    private Customer customer;
    private Product product;
    private int number;

    public Bill(int idBill, Customer customer, Product product, int number) {
        this.idBill = String.format("HD%03d", idBill);
        this.customer = customer;
        this.product = product;
        this.number = number;
    }

    public String toString() {
        return idBill + " " + customer + " " + product + " " + number + " " + number * product.getPrice();
    }
}
