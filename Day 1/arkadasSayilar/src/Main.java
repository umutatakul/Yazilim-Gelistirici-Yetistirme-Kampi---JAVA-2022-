public class Main {
    public static void main(String[] args) {
        //Bilinen en küçük arkadaş sayı 220 ve 284'tür.
        //Kendileri hariç pozitif tam sayıları toplamı birbirine eşit olan sayılara arkadaş sayılar denir


        //Hocanın Çözümü
        int sayi1=222;
        int sayi2 =284;
        int toplam1=0;
        int toplam2=0;


        for(int i=1;i<sayi1;i++){
            if(sayi1%i==0){
                toplam1=toplam1+i;
            }
        }

        for(int i=1;i<sayi2;i++){
            if(sayi2%i==0){
                toplam2=toplam2+i;
            }
        }
        //Bunun daha temiz çözümü altta
        /*if(sayi1==toplam2){
            if(sayi2==toplam1){

            }
        }*/

        if(sayi1==toplam2 && sayi2==toplam1){
            System.out.println("Bu iki sayı arkadaştır");
        }else {
            System.out.println("Bu iki sayı arkadaş değildir");
        }

    }
}