public class Main {
    public static void main(String[] args) {
        //Mükemmel sayı: Kendinden başka poziistif tüm pozitif tüm pozitif tam bölenlerin sayısı toplamları
        //kendine eşit olan sayı
        //örneğin 6 sayısı; 1 e 2 ye 3 e bölünür ve toplamı 6 eder
        //diğer 28; 1 2 4 7 14

        int number =6;

        //Benim çözümüm

        int toplam = 0;

        for(int i=1;i<number;i++){
            if(number%i==0){
                toplam=toplam+i;
            }


        }

        if(toplam==number){
            System.out.println(number + " mükemmel sayıdır");
        }else {
            System.out.println(number + " mükemmel sayı değildir");
        }


        // hocanın çözümü

        int total=0;

        for(int i =1;i<number;i++){
            if(number%i==0){
                total =total+i;
            }
        }
        if (total==number){
            System.out.println("Mükemmel sayıdır");
        }else {
            System.out.println("Mükemmel sayı değildir");
        }


    }
}