import java.util.Arrays;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        byte b1 = 3;
        byte b2 = 4;
        int i1 = 5;
        int i2 = 1;
        double d1 = 2;
        String s1 = "1";
        short s2 = 2;

        int b3 = b1 + b2;
        int i3 = (i1 - i2) / b2;
        String d2 = d1 + s1;
        float f1 = (float) d1;
        float f2 = 1 / s2;
        String s3 = s2 + s1;

        System.out.println(b3);
        System.out.println(i3);
        System.out.println(d2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(s3);

        {
            double x = 0;
            for (int i = 3; i <= 6; i++) {
                x += Math.pow(x, i) - Math.sqrt(x + i);
            }
            System.out.println(x);
        }

        {


            for (int a = 4, b = 8; a > -1 && b > -1; a--, b -= 2) {
                System.out.println(a + " " + b);
            }

            System.out.println();
        }
        {
            int a = 5;
            int b = 10;
            while (a > 0 && b > 0) {
                a--;
                b -= 2;
                out.println(a + " " + b);
            }

            System.out.println();
        }
        {
            {
                int a = 5;
                int b = 10;
                do {
                    a--;
                    b -= 2;
                    out.println(a + " " + b);
                }
                while (a > 0 && b > 0);

            }

            {
                int[] testArray = {100,70,45,34,1, 7, 9, 4, 5, 6, 8, 2,3,10};

                Arrays.sort(testArray);
                out.println(Arrays.toString(testArray));

            }
            {
                boolean [][] trueflaseArray= {
                        {true,true,true}
                        ,{false,false,false}
                        ,{true,true,true}}   ;
                for(int x=0; x<trueflaseArray.length;++x){
                    for(int y=0; y<trueflaseArray[x].length;y++){
                        out.println(trueflaseArray[x][y]+" ");
                    }
                    out.println();
                }

                {
                    int[][] zweidfeld={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
                    for(int[]x: zweidfeld) {
                        for(int y:x) {
                            out.println(y+" \t\t");   }


                            out.println();
                        }
                }

                {
                    int[] fuenfinteger;
                    fuenfinteger=new int[5];
                    for(int i=0;i<fuenfinteger.length;i++){
                        fuenfinteger[i]=(int)(Math.random()*100);
                               out.println(fuenfinteger[i]);
                    }

                    {
                        out.println();
                    }

                    {


                        int länge=9;
                        int sum=0;

                        for(int i=1;i<=länge;i++){
                            sum+=i;

                        }
                        if(sum>40) {
                            out.println("Die Summe ist größer als 40");

                        }
                        else { out.println("Addiert man die Zahlen von 1-"+länge+", so erhält man die Summe "+sum);}
                    }


                }

                
                


            }


        }


    }
}