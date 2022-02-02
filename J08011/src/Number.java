public class Number {
    private Long value;
    private int cou;
    private int ind;

    public Number(Long value, int cou, int ind) {
        this.value = value;
        this.cou = cou;
        this.ind = ind;
    }

    public int getCou() {
        return cou;
    }

    public int getInd() {
        return ind;
    }

    public String toString() {
        return value + " " + cou;
    }
}
