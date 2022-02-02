public class HoVaTen implements Comparable<HoVaTen> {
    private String ho;
    private String tenDem;
    private String ten;

    public HoVaTen(String hoVaTen) {
        String[] line = hoVaTen.split("\\s+");
        this.ho = line[0];
        String tenDem = "";
        for (int i = 1; i < line.length - 1 ; i++) {
            tenDem += line[i] + " ";
        }
        this.tenDem = tenDem.trim();
        this.ten = line[line.length - 1];
    }

    public String toString(){
        return ho + " " + tenDem + " " + ten;
    }

    public int compareTo(HoVaTen o){
        if(this.ten.equals(o.ten)){
            if(this.ho.equals(o.ho)){
                return this.tenDem.compareTo(o.tenDem);
            }
            return this.ho.compareTo(o.ho);
        }
        return this.ten.compareTo(o.ten);
    }
}
