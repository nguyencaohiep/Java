public class Bill {
    private String name;
    private String code;
    private long price;
    private long number;
    private int type;
    private long discountMoney;
    private String stt;

    public Bill(String name, String code, long price, long number) {
        this.name = name;
        this.code = code;
        this.stt = code.substring(1, 4);
        this.type = Integer.parseInt(code.substring(4));
        this.price = price;
        this.number = number;
        if (type == 2)
            this.discountMoney = (long) (price * number * 30 / 100.0);
        else
            this.discountMoney = (long) (price * number * 50 / 100.0);
    }

    public String getStt() {
        return stt;
    }

    public String toString() {
        return name + " " + code + " " + stt + " " + discountMoney + " " + (price * number - discountMoney);
    }
}