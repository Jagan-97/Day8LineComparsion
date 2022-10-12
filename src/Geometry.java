public class Geometry {
    public static void CalculateLength(){
        int x1,x2,y1,y2;
        double length;
        x1=1;y1=1;x2=4;y2=4;
        length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+")="+length);
    }

    public static void Equals(Integer x1, Integer y1 , Integer x2, Integer y2) {
        boolean result = x1.equals(y1);
        System.out.println("Line is " + result);
        boolean result1 = x2.equals(y2);
        System.out.println("Line is " +result1);
    }

    public static void Compare(Integer x1, Integer y1 , Integer x2, Integer y2) {
        int result = x1.compareTo(y1);
        System.out.println("Line is " + result);
        int result1 = x2.compareTo(y2);
        System.out.println("Line is " +result1);
    }
}
