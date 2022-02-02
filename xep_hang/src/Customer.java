public class Customer implements Comparable<Customer> {
    private long startTime;
    private long excutionTime;

    public Customer(long startTime, long excutionTime) {
        this.startTime = startTime;
        this.excutionTime = excutionTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getExcutionTime() {
        return excutionTime;
    }

    @Override
    public int compareTo(Customer o) {
        return Long.compare(this.getStartTime(), o.getStartTime());
    }
}
