public class Room {
    private String id;
    private String ten;
    private int donGia;
    private double phiPV;

    public Room(String id, String ten, int donGia, double phiPV) {
        this.id = id;
        this.ten = ten;
        this.donGia = donGia;
        this.phiPV = phiPV;
    }

    public String getId() {
        return id;
    }

    public int getDonGia() {
        return donGia;
    }

    public double getPhiPV() {
        return phiPV;
    }
}
