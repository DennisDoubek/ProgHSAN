public class Hheizung {
    public static void main(String[] args) {

        System.out.print("Welche Stellung hat der Schalter? true(ein) / false(notaus) \nBitte hier eingeben: ");
        boolean Notaus1 = new java.util.Scanner(System.in).nextBoolean();

        System.out.print("Welche Stellung hat der Schalter? true(ein) / false(notaus) \nBitte hier eingeben: ");
        boolean Notaus2 = new java.util.Scanner(System.in).nextBoolean();

        if (Notaus1^Notaus2) System.out.println("Heizung aus");
        else {
            System.out.println("Heizung ein");
        }
    }
}
