public class Main {
    public static void main(String[] args) {
        int sayi1 = 266;
        int sayi2 = 25;
        int sayi3 = 26;

        //Benim ilkel çözümüm

        if (sayi1 > sayi2 && sayi1 > sayi3) {
            System.out.println(sayi1);
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            System.out.println(sayi2);
        } else if (sayi3 > sayi1 && sayi3 > sayi2) {
            System.out.println(sayi3);

        }

        //Hocanın Çözümü

        int enBuyuk= sayi1;
        if(enBuyuk<sayi2){
            enBuyuk=sayi2;
        }
        if(enBuyuk<sayi3){
            enBuyuk=sayi3;
        }

        System.out.println("En büyük sayi:" + enBuyuk);
    }
}