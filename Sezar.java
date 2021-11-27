package NesneYonelimliProgramlamaKitap;

import java.util.Scanner;

public class Sezar {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.print("Kelime...");
        String x = tara.next();
        x.toLowerCase();//küçük harfe dönüştürüldü
        char[] k = x.toCharArray();//metni karakter dizisine dönüştürdü
        System.out.printf("\bŞifrelenmiş Kelime:");
        for (int i = 0; i<x.length();i++){
            k[i] = (char)(x.codePointAt(i)+4);//eşdeğer: k[i]=(char)(4+k[i]);
            System.out.printf("%c",k[i]);
        }
    }//main sonu
}//class sonu
