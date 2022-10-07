public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 6;

        //Benim çözümüm
        int konum;
        String yazdirilacak = "Bu sayı dizide bulunmamaktadır";

        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                yazdirilacak = ("Sayi mevcut ve konumu " + i + "'dir");
                break;
            }

        }

        System.out.println(yazdirilacak);

        //Hocanın çözümü
        boolean varMi= false;
        for(int sayi : sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("Sayi mevucttur");
        }else {
            System.out.println("Sayi mevcut değildir");
        }

    }
}