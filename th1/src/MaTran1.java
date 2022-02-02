import java.util.Scanner;
public class MaTran1 {
    private int[][] a;
    private Scanner in=new Scanner(System.in);
    
    public MaTran1() {
    }

//    public MaTran(int[][] a) {
//        this.a = a;
//        this.m=a.length;
//        this.n=a[0].length;
//    }
    
    public MaTran1(int m, int n) {
        a=new int[m][n];
    }
    
    public void nhapKT(){
        System.out.print("nhap hang:");
        int m=Integer.parseInt(in.nextLine());
        System.out.print("nhap cot:");
        int n=Integer.parseInt(in.nextLine());
        a=new int[m][n];
    }
    public void nhap(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print("phan tu "+i+","+j+"= ");
                a[i][j]=Integer.parseInt(in.nextLine());
            }
        }
    }
    public void viet(){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public MaTran1 tong(int[][] b){
        int[][] t=new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[i][j]=a[i][j]+b[i][j];
            }
        }
        MaTran1 mm=new MaTran1(a.length,a[0].length);
        mm.setMaTran(t);
        return mm;
    }
    public MaTran1 hieu(int[][] b){
        int[][] t=new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                t[i][j]=a[i][j]-b[i][j];
            }
        }
        MaTran1 mm=new MaTran1(a.length,a[0].length);
        mm.setMaTran(t);
        return mm;
    }
    public int[][] getMaTran() {
        return a;
    }

    public void setMaTran(int[][] a) {
        this.a = a;
    }
    // mxn   nxp
    public int getHang() {
        return a.length;
    }

    

    public int getCot() {
        return a[0].length;
    }

    
    
}
