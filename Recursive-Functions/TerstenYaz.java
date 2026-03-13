package proje6;

public class TerstenYaz {

    public static void Reverse(char[] dizi, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(dizi[index]);
        
        Reverse(dizi, index - 1);
    }
    
    public static void main(String[] args) {
        String yeni = "Dünya";
        char[] charArray = yeni.toCharArray(); 

        System.out.print("Ters yazılışı: ");
        Reverse(charArray, charArray.length - 1); 
        System.out.println(); 
    }
}
