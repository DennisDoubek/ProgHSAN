public class Lampe {
    public static void main(String[] args) {


        System.out.print("Welche Stellung hat der Schalter? true(ein) / false(aus) \nBitte hier eingeben: ");
        boolean Schalter1 = new java.util.Scanner(System.in).nextBoolean();

        System.out.print("Welche Stellung hat der Schalter? true(ein) / false(aus) \nBitte hier eingeben: ");
        boolean Schalter2 = new java.util.Scanner(System.in).nextBoolean();

    if (Schalter1&&!Schalter2||Schalter2&&!Schalter1)
        System.out.println("Licht");
    else {
        System.out.println("Dunkel");
    }




    }
}
