public class Ep {
    private Employee e;
    private Department dep;

    public Ep(Employee e, Department dep) {
        this.e = e;
        this.dep = dep;
    }

    public Employee getE() {
        return e;
    }

    @Override
    public String toString() {
        return e.toString();
    }

    public Department getDep() {
        return dep;
    }

}
