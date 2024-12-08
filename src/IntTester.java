public class IntTester {
    public static void main(String[] args) {


        System.out.print("Was ist ihr Wert für a ? \nBitte hier eingeben: ");
        int a = new java.util.Scanner(System.in).nextInt();
        System.out.print("Was ist ihr Wert für b ? \nBitte hier eingeben: ");
        int b = new java.util.Scanner(System.in).nextInt();


        int addition= a+b;
        int subtraktion= a-b;
        int mulltiplikation= a*b;
        int division= a/b;
        int modulo= a%b;

        System.out.println("Ergebnisse:\n"+"Addition: "+addition+ "\nSubtraktion: "+subtraktion+"\nMultiplikation: "+mulltiplikation+"\nDivision:"+division+"\nModulo: "+modulo);
    }
}
