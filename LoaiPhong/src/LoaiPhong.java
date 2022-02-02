public class LoaiPhong implements Comparable<LoaiPhong> {
    private String id;
    private String name;
    private String price;
    private String fee;

    public LoaiPhong(String str) {
        String[] line = str.trim().split("\\s+");
        this.id = line[0];
        this.name = line[1];
        this.price = line[2];
        this.fee = line[3];
    }

    public String getName() {
        return name;
    }

    public int compareTo(LoaiPhong o){
        return this.getName().compareTo(o.getName());
    }

    public String toString(){
        return id + " " + name + " " + price + " " + fee;
    }

}
