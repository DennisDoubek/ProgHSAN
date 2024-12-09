public class Bedingungskosntrukte {
public static void main(String[] args) {


    //IF Bedingung: Die if-Anweisung ist die einfachste Bedingungsstruktur und führt einen Codeblock nur dann aus, wenn eine bestimmte Bedingung wahr ist.

    if (Bedingung) {
        // Codeblock, der ausgeführt wird, wenn die Bedingung wahr ist
    }


    //Bsp
    int zahl = 10;
if (zahl > 5) {
    System.out.println("Zahl ist größer als 5");
}

//If-Else-Anweisung (if-else) Die if-else-Anweisung ermöglicht es, einen alternativen Codeblock auszuführen, wenn die Bedingung nicht erfüllt ist (d.h., die Bedingung ist falsch).

if (Bedingung) {
    // Codeblock, der ausgeführt wird, wenn die Bedingung wahr ist
} else {
    // Codeblock, der ausgeführt wird, wenn die Bedingung falsch ist
}

//Bsp
int zahl = 3;
if (zahl > 5) {
    System.out.println("Zahl ist größer als 5");
} else {
    System.out.println("Zahl ist nicht größer als 5");
}


//If-Else-If-Anweisung (if-else-if) Die if-else-if-Struktur erlaubt es, mehrere Bedingungen zu überprüfen und unterschiedliche Codeblöcke auszuführen, je nachdem, welche Bedingung zutrifft. Es kann beliebig viele else-if-Bedingungen geben.
if (Bedingung1) {
    // Codeblock, der ausgeführt wird, wenn Bedingung1 wahr ist
} else if (Bedingung2) {
    // Codeblock, der ausgeführt wird, wenn Bedingung2 wahr ist
} else {
    // Codeblock, der ausgeführt wird, wenn keine der Bedingungen wahr ist
}

//Bsp
int zahl = 7;
if (zahl > 10) {
    System.out.println("Zahl ist größer als 10");
} else if (zahl > 5) {
    System.out.println("Zahl ist größer als 5, aber kleiner oder gleich 10");
} else {
    System.out.println("Zahl ist kleiner oder gleich 5");
}

//Switch-Anweisung (switch)
//Die switch-Anweisung wird verwendet, wenn mehrere mögliche Werte für eine Variable geprüft werden sollen. Im Gegensatz zu mehreren if-else-if-Bedingungen, die auf Bedingungen mit Vergleichen basieren, wird switch normalerweise für exakte Wertvergleiche verwendet.
switch (Variable) {
    case Wert1:
        // Codeblock, der ausgeführt wird, wenn Variable == Wert1
        break;
    case Wert2:
        // Codeblock, der ausgeführt wird, wenn Variable == Wert2
        break;
    // Weitere Fälle (falls erforderlich)
    default:
        // Codeblock, der ausgeführt wird, wenn keine der oben genannten Bedingungen zutrifft
}

//Bsp
int tag = 3;
switch (tag) {
    case 1:
        System.out.println("Montag");
        break;
    case 2:
        System.out.println("Dienstag");
        break;
    case 3:
        System.out.println("Mittwoch");
        break;
    case 4:
        System.out.println("Donnerstag");
        break;
    case 5:
        System.out.println("Freitag");
        break;
    case 6:
        System.out.println("Samstag");
        break;
    case 7:
        System.out.println("Sonntag");
        break;
    default:
        System.out.println("Ungültiger Tag");
}


//Ternäre Bedingung (ternary operator)
//Der ternäre Operator ist eine verkürzte Form der if-else-Anweisung. Er wird in einer einzigen Zeile verwendet, um basierend auf einer Bedingung zwei Werte auszuwählen.
Bedingung ? Ausdruck1 : Ausdruck2;

//Bedingung: Eine Bedingung, die entweder wahr oder falsch ist.
//Ausdruck1: Wird ausgeführt, wenn die Bedingung wahr ist.
//Ausdruck2: Wird ausgeführt, wenn die Bedingung falsch ist.

//Bsp
int zahll = 5;
String ergebnis = (zahll > 3) ? "Zahl ist größer als 3" : "Zahl ist kleiner oder gleich 3";
System.out.println(ergebnis);








}
}
