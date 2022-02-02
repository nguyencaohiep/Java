import java.util.Scanner;

public class SoNguyen {
    private int n;
    private static int[] prime = new int[10000];

    public SoNguyen() {
        Scanner in=new Scanner(System.in);
        System.out.print("n=");
        n = Integer.parseInt(in.nextLine());
        prime[0] = prime[1] = 1;
        for(int i = 2;i < 10000; i++){
            if(prime[i] == 0)
                for(int j = 2 * i;j < 10000;j += i){
                    prime[j] = 1;
                }
        }
        System.out.println("");
    }


   public void soNguyenToNhoHonN(){
       for (int i = 2; i < n; i++) {
           if(prime[i] == 0)
               System.out.print(i+" ");
       }
   }
   public void soNguyenToCoNChuSo(){
       System.out.print("Nhap n : ");
       SoNguyen m = new SoNguyen();
        double tmp = (double)(m.n);
        int l =(int)Math.pow(10,tmp-1);
        int r =(int)Math.pow(10,tmp);
       for (int i = l; i < r; i++) {
           if(prime[i] == 0){
               System.out.print(i+" ");
           }
       }
       System.out.println("");
       in.close();
   }
    
}
