import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("İşlem seçin: ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();

        System.out.println("İki sayı girin: ");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        double sonuc = 0;
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;e
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: sıfıra bölme!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz seçim!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
