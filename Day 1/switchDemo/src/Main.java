public class Main {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            /*Eğer case B ve Case C için aynı çıktıyı vermek istiyorsan Case B'nin fonksiyonunu siliyoruz
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            */
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil: Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz harf girdiniz");
        }
    }
}