public class Bill {
    private String id;
    private String name;
    private Integer oldValue;
    private Integer newValue;

    public Bill(int id, String name, Integer oldValue, Integer newValue) {
        this.id = String.format("KH%02d", id);
        this.name = name;
        this.oldValue = oldValue;
        this.newValue = newValue;
    }

    public Long getMoney() {
        long tmp = this.newValue - this.oldValue;
        if (tmp < 51)
            tmp = (long) (Math.round(tmp * 100 * 102 / 100.0));
        else if (tmp < 101)
            tmp = (long) (Math.round((50 * 100 + (tmp - 50) * 150) * 103 / 100.0));
        else
            tmp = (long) (Math.round((50 * 100 + 50 * 150 + (tmp - 100) * 200) * 105 / 100.0));
        return tmp;
    }

    public String toString() {
        return id + " " + name + " " + getMoney();
    }
}
