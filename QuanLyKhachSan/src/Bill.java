public class Bill implements Comparable<Bill>{
    private Customer cus;
    private Room r;

    public Bill(Customer cus, Room r) {
        this.cus = cus;
        this.r = r;
    }

    public Long tinhSoNgay(){
        long time = cus.getNgayDi().getTime() - cus.getNgayDen().getTime();
        return (time / (1000*60*60*24));
    }

    public double tinhTien(){
        long day = tinhSoNgay();
        double percent;
        if ( day < 1)
            day = 1;
        if (day < 10) {
            percent = 100/100.0;
        }
        else if( day < 20){
            percent = 98/100.0;
        }
        else if( day < 30){
            percent = 96/100.0;
        }
        else {
            percent = 94/100.0;
        }
        double tmp = (double) (day * this.r.getDonGia() *(1 + this.r.getPhiPV()) * percent);
        return tmp;
    }

    public String toString(){
        return cus + " " + tinhSoNgay() + " " + String.format("%.2f", tinhTien());
    }

    @Override
    public int compareTo(Bill o) {
        return -1 * this.tinhSoNgay().compareTo(o.tinhSoNgay());
    }
}
