import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        // Not : KDV tutarını 18% olarak alın

        Scanner input = new Scanner(System.in);
        double kdvsizFiyat, kdvOran = 0.18, kdvTutar, kdvliFiyat;

        System.out.print("Ücret Tutarını Giriniz (TL) : ");
        kdvsizFiyat = input.nextDouble();
        System.out.println("Kdv'siz Fiyat : " + kdvsizFiyat);

        kdvTutar = kdvsizFiyat * kdvOran;
        System.out.println("Kdv Tutar : " + kdvTutar);

        kdvliFiyat = kdvsizFiyat + kdvTutar;
        System.out.println("Kdv'li Fiyat : " + kdvliFiyat);

        // Ödev: Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        kdvOran = kdvsizFiyat < 1000 ? 0.18 : 0.08;
        double kdvTutar2 = kdvsizFiyat * kdvOran;
        System.out.println("KDV Tutar2 : " + kdvTutar2);
        kdvliFiyat = kdvsizFiyat + kdvTutar2;
        System.out.println("Kdv'li Fiyat : " + kdvliFiyat);
    }
}