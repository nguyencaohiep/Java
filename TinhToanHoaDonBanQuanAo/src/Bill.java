public class Bill {
    private String id;
    private int cnt;
    private Product product;
    private long discount;
    private long money;

    public Bill(String id, String cnt,int number,Product product) {
        this.id = id + "-" + String.format("%03d",number);
        this.cnt = Integer.parseInt(cnt);
        this.product = product;
        setDiscountAndMoney(product);
    }

    public void setDiscountAndMoney(Product product) {
        char billId = id.charAt(2);
        int price = 0;
        if(billId == '1'){
            price = product.getPrice1();
        }
        else{
            price = product.getPrice2();
        }
        if(cnt >= 150){
            this.discount = (long)(cnt * price * 0.5);
        }else if(cnt >= 100){
            this.discount = (long)(cnt * price * 0.3);
        }
        else if(cnt >= 50){
            this.discount = (long)(cnt * price * 0.15);
        }
        else{
            this.discount = 0;
        }
        this.money = price * cnt - this.discount;
    }

    public String toString(){
        return this.id + " " + product.getName() + " " + this.discount + " " + this.money;
    }
}