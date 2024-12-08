public class Summieren {
    public static void main(String[] args) {

        {
            int länge = 8;
            int sum = 0;
            for (int i = 1; i <= länge; i++) {
                sum += i;
            }
            if (sum > 40) {
                System.out.println("Der Wert ist gößer als 40");
            } else {
                System.out.println(sum);
            }
        }

        int länge = 2;
        int sum = 0;
        int i = 0;
        while (i < länge) {
            i++;
            sum += i;


        }

        if (sum > 40) {
            System.out.println("Der Wert ist gößer als 40");
        } else {
            System.out.println(sum);
        }


        {
            int l = 3;
            int s = 0;
            int x = 0;

            do {
                x++;
                s += x;
            }
            while (x < l);

            if (s > 40) {
                System.out.println("Der Wert ist gößer als 40");
            } else {
                System.out.println(s);
            }
        }

        {
            for(int a=0,b=0;a<=4&&b<=8;a++,b+=2){
                System.out.println(a+" "+b);
            }
        }
        {
            int a=-1;
            int b=-2;
            while (a<4&&b<8){
                a++;
                b+=2;
                System.out.println(a+" "+b);
            }
        }
        {
            int a=-1;
            int b=-2;
            do{a++;b+=2;System.out.println(a+" "+b);}
            while(a<4&&b<8);
        }

    }
}
