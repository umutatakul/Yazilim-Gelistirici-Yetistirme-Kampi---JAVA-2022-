public class Main {
    public static void main(String[] args) {
        char harf = 'i';

        harf = Character.toUpperCase(harf);


        //Benim çözümümüm;
        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(harf + " harfi kalın ünlüdür ");
                break;
            case 'E':
            case 'İ':
            case 'Ö':
            case 'Ü':
                System.out.println(harf + " harfi ince ünlüdür ");
                break;
        }

        //Hocanın Çözümü

        switch (harf){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın Sesli harf");
                break;
            default:
                System.out.println(("İnce sesli harf"));
        }
    }
}