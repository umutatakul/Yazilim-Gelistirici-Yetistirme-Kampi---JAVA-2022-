public class Main {
    //reusability
    public static void main(String[] args) {
        //camelCasing
        int ogrenciSayisi = 12;
        String mesaj = "Öğrenci sayısı : ";
        //Böyle yazarak bellekten de tasarruf sağlanıyor. Tek bir değişkeni defahen kullanmış oluyoruz.
        //case sensitive bir dildir. "system" şeklinde yazınca çalışmayacaktır.
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println(mesaj + ogrenciSayisi);
        System.out.println("Öğrenci sayım: "+ogrenciSayisi);
        System.out.println("Öğrenci sayım: "+ogrenciSayisi);
        System.out.println("Öğrenci sayım: "+ogrenciSayisi);

        //println biri str biri int olsa bile metinsel bir toplama yapabiliyor.



    }
}