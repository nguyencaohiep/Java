public class Bill {
    private String id;
    private Customer customer;
    private Product product;
    private Integer cnt;
    private long money;

    public Bill(int id, Customer customer, Product product, Integer cnt) {
        this.id = String.format("HD%03d",id);
        this.customer = customer;
        this.product = product;
        this.cnt = cnt;
        this.money =  product.getPrice() * cnt;
    }

    public String toString(){
        return this.id + " " + customer.getName() + " " + customer.getAddress() + " " + product.getName()
                + " " + product.getUnit() + " " +  product.getPurchasePrice() + " " + product.getPrice()
 + " " + this.cnt  + " " +  this.money;  }
}
