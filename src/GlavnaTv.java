import java.util.Scanner;

public class GlavnaTv {
    public static void main(String[] args) {

        Televizor tv = new Televizor();
        System.out.print("Pritisnite . da ukljucite tv");
        Scanner scan = new Scanner(System.in);
        String string = scan.next();
        if(string.equals("."))
        {
            System.out.println("Televizor se uključuje");
            System.out.println();
            tv.ukljuci();
        }
        System.out.println("Informacije o tv-u: ");

        while(true)
        {
            tv.pojacajTon();
            tv.pojacajTon();
            tv.pojacajTon();
            tv.pojacajTon();
            break;
        }
        tv.pojacajTon();
        tv.smanjiTon();
        tv.TvOpis();
        System.out.println();
        System.out.print("Pritisnite 1 da iskljucite tv");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if(s.equals("1"))
        {
            System.out.println("TV je ugasen");
            tv.iskljuci();
        }



    }
}
