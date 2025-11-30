import java.util.Scanner;
public class FaktoriyelHesaplamaIterative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz : ");
        int n = input.nextInt();

        long sonuc = 1;
        int i = 1;

        if (n>=0) {
            while (i <= n) {
                sonuc *= i;
                i++;
            }
            System.out.println("Sonuc : " + sonuc);
        }

        else{
            System.out.println("Lütfen pozitif bir sayı girin");
        }
    }
}
