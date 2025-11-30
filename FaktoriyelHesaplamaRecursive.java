import java.util.Scanner;
public class FaktoriyelHesaplamaRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");
        int n = input.nextInt();

        long sonuc = faktoriyel(n);
        System.out.println("Sonuc : " + sonuc);
    }
    public static long faktoriyel(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * faktoriyel( n - 1);
    }
}
