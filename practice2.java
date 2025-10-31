import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost of pen");
        float pen= sc.nextFloat();
         System.out.println("enter cost of pencil");
        float pencil= sc.nextFloat();
         System.out.println("enter cost of eraser");
        float eraser= sc.nextFloat();

        float npen =  pen + (0.18f*pen);
        float npencil = pencil+(0.18f*pencil);
        float neraser = eraser+(.18f*eraser);

        System.out.println("total bill =");
        System.out.println(npen+npencil+neraser);
    }
}
