package artikyilhesapla;

import java.util.Scanner;

public class ArtikYilHesapla {

    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Artık Yıl Hesaplama Uygulamasına Hoşgeldiniz... ");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Hesaplamak İstediğiniz Yılı Girin : ");
        int yil = scanner.nextInt();
        
        if(yil % 4 == 0){
            
            if(yil % 100 == 0){
                
                if(yil % 400 == 0){
                    System.out.println(yil + " Yılı Artık Yıldır.");
                    System.exit(0);
                }
            }
            
            System.out.println(yil + " Yılı Artık Yıldır.");       
        }
        
        else{
            System.out.println(yil + " Yılı Artık Yıl Değildir.");
        }
        
        
    }
    
}
