public class Schleifen {
    public static void main(String[] args) {
        int n=0;
        int w=0;
int x=0;




        System.out.println("\n");

        while(x<=4){

            int links=x;
            int rechts=x*2;

            System.out.println(links+" "+rechts);

            x++;
        }


        System.out.println("\n");
        int y=0;
        do {
            int links = y;
            int rechts = 2 * y;
            System.out.println(links + " " + rechts);
            y++;
        }
        while(y<=4);

        System.out.println("\n");

        for(int z=0; z<=4;){

            int links=z;
            int rechts=z*2;
            System.out.println(links+" "+rechts);
            z++;}
        }
    }

