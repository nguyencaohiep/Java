import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        SoNguyen sn=null;
        XuLyXau x=new XuLyXau();
        MaTran1 a=new MaTran1();
        while(true){
            System.out.println("------MENU-------");
            System.out.println("1. Nhap n");
            System.out.println("2. Cac so nguyen to nho hon n");
            System.out.println("3. Cac so nguyen to co n chu so");
            
            System.out.println("4. nhap xau");
            System.out.println("5. email");
            System.out.println("6. lay chu");
            
            System.out.println("7. Nhap ma tran");
            System.out.println("8. Viet ra");
            System.out.println("9. tong");
            
            System.out.println("0. Thoat");
            System.out.println("-----------------");
            System.out.print("Ban chon (0->4):");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 0:System.out.println("BYE!!!");
                       System.exit(0);//safe exit
                case 1:sn = new SoNguyen();
                       break;
                case 2:sn.soNguyenToNhoHonN();
                       break;
                case 3:sn.soNguyenToCoNChuSo();
                       break;
                case 4:x.nhap();
                       break;
                case 5:x.email();
                       break;
                case 6:x.layChu();
                       break;  
                case 7:a.nhapKT();
                       a.nhap();
                       break;  
                case 8:a.viet();
                       break;  
                case 9:
                       MaTran1 b=new MaTran1(a.getHang(),a.getCot());
                       b.nhap();
                       MaTran1 t=a.tong(b.getMaTran());
                       
                       System.out.println("A");
                       a.viet();
                       System.out.println("B");
                       b.viet();
                       System.out.println("Tong");
                       t.viet();
                       break;         
                default:System.out.println("chi chon 0->4");
                      break; 
            }
        }
        
    }
    
}
