import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int domates=10,salatalık=15,patlıcan=15,armut=8,muz=20,elma=12;
        System.out.println("tezgahta domates,salataık,patlıcan,armut,muz ve elma var");
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç kg dometes aldınız?");
        double domatesKg= scanner.nextDouble();

        System.out.println("kaç kg salatalık aldınız?");
        double salatalıkKg= scanner.nextDouble();

        System.out.println("kaç kg patlıcan aldınız?");
        double patlıcanKg= scanner.nextDouble();

        System.out.println("kaç kg armut aldınız?");
        double armutKg= scanner.nextDouble();

        System.out.println("kaç kg muz aldınız?");
        double muzKg= scanner.nextDouble();

        System.out.println("kaç kg elma aldınız?");
        double elmaKg= scanner.nextDouble();
        double total=0;
        total=((domates*domatesKg)+(salatalıkKg*salatalık)+(patlıcanKg*patlıcan)+(armutKg*armut)+(muzKg*muz)+(elmaKg*elma));
        System.out.println("tolam tutar" + total);
    }
}