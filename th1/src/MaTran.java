import java.util.Scanner;
public class MaTran {
    private int[][] a;
    private int m,n;//m hang, n cot
    private Scanner in=new Scanner(System.in);
    
    public MaTran() {
    }

//    public MaTran(int[][] a) {
//        this.a = a;
//        this.m=a.length;
//        this.n=a[0].length;
//    }

    public MaTran(int m, int n) {
        this.m = m;
        this.n = n;
        a=new int[m][n];
    }
    
    public void nhapKT(){
        System.out.print("nhap hang:");
        m=Integer.parseInt(in.nextLine());
        System.out.print("nhap cot:");
        n=Integer.parseInt(in.nextLine());
        a=new int[m][n];
    }
    public void nhap(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("phan tu "+i+","+j+"= ");
                a[i][j]=Integer.parseInt(in.nextLine());
            }
        }
    }
    public void viet(){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public MaTran tong(int[][] b) {
        
        int[][] t=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j]=a[i][j]+b[i][j];
            }
        }
        MaTran mm=new MaTran(m,n);
        mm.setMaTran(t);
        return mm;
    }
    public int[][] getMaTran() {
        return a;
    }

    public void setMaTran(int[][] a) {
        this.a = a;
    }

    public int getHang() {
        return m;
    }

    public void setHang(int m) {
        this.m = m;
    }

    public int getCot() {
        return n;
    }

    public void setCot(int n) {
        this.n = n;
    }

    
    
    
}
