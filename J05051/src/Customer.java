public class Customer {
    private String id;
    private long oldValue;
    private long newValue;
    private long tmp; // hệ số
    private long surcharge;
    private long money;
    private long tmpMoney;

    public Customer(int id, String type, long oldValue, long newValue) {
        this.id = String.format("KH%02d", id);
        if (type.equals("KD"))
            tmp = 3L;
        else if (type.equals("NN"))
            tmp = 5L;
        else if (type.equals("TT"))
            tmp = 4L;
        else
            tmp = 2L;
        this.oldValue = oldValue;
        this.newValue = newValue;
        long t = newValue - oldValue;
        this.tmpMoney = t * tmp * 550;
        if (t < 50)
            this.surcharge = 0L;
        else if (t > 100)
            this.surcharge = tmpMoney;
        else
            this.surcharge = (long) (Math.round(tmpMoney * 35 / 100.0));
        this.money = tmpMoney + surcharge;
    }

    public long getMoney() {
        return money;
    }

    public String toString() {
        return id + " " + tmp + " " + tmpMoney + " " + surcharge + " " + money;
    }
}