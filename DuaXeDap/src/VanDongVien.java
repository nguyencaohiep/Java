import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VanDongVien implements Comparable<VanDongVien>{
    private String hoVaTen;
    private String donVi;
    private Date tgianDenDich;
    private Date tgianBatDau;

    public VanDongVien(String hoVaTen, String donVi, String tgianDenDich) throws ParseException {
        this.hoVaTen = hoVaTen;
        this.donVi = donVi;
        this.tgianDenDich = new SimpleDateFormat("H:mm").parse(tgianDenDich);
        this.tgianBatDau = new SimpleDateFormat("H:mm").parse("6:00");
    }

    public String ma(){
        String res = "";
        String[] t1 = donVi.split("\\s+");
        for(int i = 0; i < t1.length; i++){
            res += (t1[i].charAt(0) + "");
        }
        String[] t2 = hoVaTen.split("\\s+");
        for (int i = 0; i < t2.length; i++) {
            res += (t2[i].charAt(0) + "");
        }
        return res;
    }

    public String tinhVanToc() {
        long soPhut = (tgianDenDich.getTime() - this.tgianBatDau.getTime()) / (1000 * 60);
        double soGio = soPhut / 60.0;
        return 120/soGio + "";
    }

    public String toString(){
        return ma() + " " + hoVaTen + " " + donVi + " " + Math.round(Double.parseDouble(tinhVanToc())) + " Km/h";
    }

    public int compareTo(VanDongVien o){
        return -1 * this.tinhVanToc().compareTo(o.tinhVanToc());
    }

}

