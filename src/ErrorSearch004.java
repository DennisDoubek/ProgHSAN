public class ErrorSearch004 {
    public static void main(String[] args) {
        int[] x={1,2,3,4,5,6,7,8,9,10};
        double s =0.0;

        for(int i:x){
            s+=i;

        }
        double r= s/ x.length;

        System.out.println(r);



        byte b1=3;
        byte b2=4;
        int i1= 5;
        int i2= 1;
        double d1= 2;
        String s1= "1";
        short s2 =2;

        byte b3= (byte) (b1+b2);
        int i3= (i1-i2)/b2;
        String d2= d1+s1;
        float f1= (float)d1;
        float f2= 1/s2;
        String s3= s2+s1;


        System.out.println(b3);
        System.out.println(i3);
        System.out.println(d2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(s3);

    }
}
