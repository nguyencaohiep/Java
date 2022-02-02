public class GiangVien {
    private String id;
    private String name;
    private double soGio;

    public GiangVien(String id, String name) {
        this.id = id;
        this.name = name;
        this.soGio = 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void tinhSoGio(double t){
        this.soGio += t;
    }


    public String toString(){
        return name + String.format("%.2f", soGio);
    }
}
