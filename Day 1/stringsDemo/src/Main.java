public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());

        System.out.println("5. eleman: " + mesaj.charAt(4));
        //concat: iki diziyi birleştirmeye yarar.
        System.out.println(mesaj.concat("Yaşasın."));
        //startsWith "B" : B ile başlıyorsa true başlamıyorsa false döndürür.
        System.out.println(mesaj.startsWith("B"));

        System.out.println(mesaj.startsWith("A"));

        //endsWith "l" : l ile başlıyorsa true başlamıyorsa false döndürür.

        System.out.println(mesaj.endsWith("."));

        System.out.println(mesaj.endsWith("L"));

        //Java case sensitive (büyük küçük harf duyarlı) olduğu için B harfi yerine b yazsaydık false döndürürdü.

        //getChars ile bişey döndürmez. 0 dan başla ve 4'te bitir ve karakterlere ata (get et).
        //dstBegin ile atıyorum charr arrayimiz 5 boyurlu değ,lde 25 boyutlu bir dizi olarak tanımlansaydı nerden
        //başlayacağını bize soruyor.
        //srcEnd i dizinin son karakterini dahil etmiyor (0 dan 4 e kadar alıyor)
        //void bir fonksiyon olduğu için getChars bunu bir değişkene atamamız gerekiyordu.

        char[] karakterler = new char[5];
        mesaj.getChars(0,5, karakterler,0);
        System.out.println(karakterler);

        //indexOf ilk buldu sol baştan elemanın indisini verir, aramayı bitirir.

        System.out.println(mesaj.indexOf('a'));

        //ya da kelime dilimi de arar

        System.out.println(mesaj.indexOf("av"));

        //lastIndexOf ile aramaya soldan değil arapça gibi sağdan başlar ama gene index nuamrasını
        // normal verir yine.

        System.out.println(mesaj.lastIndexOf('a'));

        //replace (eski karakter, yeni karakter)
        String yeniMesaj = mesaj.replace(' ','-');

        System.out.println(yeniMesaj);

        //substring

        System.out.println(mesaj.substring(2));

        //İkinci kullanjum yolunda bitişi de veriyoruz ama burada dizinin bitişindeki indisi dahil etmiyor (4 hariç)

        System.out.println(mesaj.substring(2, 4));


        //Split .split(nelerinden böleceksin). Biz bu soruda boşluğu seçtik.
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        //toLowerCase & toUpperCase
        //Kelimelerin tüm harflerini küçük harf ya da büyük harf yapar

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());

        mesaj = "           Bugün hava çok güzel.               ";

        System.out.println(mesaj);


        System.out.println(mesaj.trim());




    }
}