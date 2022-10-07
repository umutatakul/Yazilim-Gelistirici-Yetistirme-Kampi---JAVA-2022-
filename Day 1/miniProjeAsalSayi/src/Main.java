public class Main {
    public static void main(String[] args) {


        //Asal sayı; bir ve kendinden başka pozistif tamsayı böleni olmayan sayı

        //Benim Çözümüm

        int verilenSayi = 2;
        String yanit= "Sayısı asaldir.";
        for(int i=2; i<verilenSayi;i++){
            if(verilenSayi%i!=0){

            }else{
                yanit = "Sayısı asal değildir";
                break;
            }
        }
        System.out.println(verilenSayi + " " + yanit);

        //Hocanın çözümü

        //Hataları önleyii programlamaya defensive programing deniliyor.
        int number = 1;
        int remainder = number % 2;
        System.out.println(remainder);

        if(number<1){
            System.out.println("Geçersiz sayı");
        }
        if(number==1){
            System.out.println("Sayı asal değildir");
            //return ile bağlı bulunduğu bloğu gerçeleşmesi halinde peşinen bitiriyor.
            return;
        }

        boolean isPrime = true;

        for (int i=2; i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Sayı asaldır");
        }else {
            System.out.println("Sayı asal değildir.");
        }

        //1 Bizim programımız için bug.


    }
}