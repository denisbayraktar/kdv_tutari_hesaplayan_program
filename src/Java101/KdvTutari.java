package Java101;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args){
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();
        kdvOran = (tutar > 0 && tutar < 1000) ? 0.18 : 0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Fiyat= " + tutar);
        System.out.println("KDV Oranı= " + kdvOran);
        System.out.println("KDV'li Fiyat= " + kdvliTutar);
        System.out.println("KDV Tutarı= " + kdvTutar);
    }
}
