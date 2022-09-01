import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi=input.nextInt();
        int total =0;
        for (int i = 1; i<sayi; i++){
            if (sayi%i==0){
             total+=i;
            }

        }
        if (sayi==total){
            System.out.println("mükemmel sayıdır.");
        }
        else
            System.out.println("mükemmel sayi değildir");
    }
}
