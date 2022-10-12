import java.util.Scanner;

public class LineComparision extends Geometry {
    public static  void main(String args[]){
        CalculateLength();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values : x1,y1,x2,y2");
        Integer x1= sc.nextInt();
        Integer y1= sc.nextInt();
        Integer x2= sc.nextInt();
        Integer y2= sc.nextInt();
        Geometry.Equals(x1,y1,x2,y2);
        Geometry.Compare(x1,y1,x2,y2);
    }
}
