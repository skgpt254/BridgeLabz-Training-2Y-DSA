import java.util.Scanner;
public class arCirc {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double c = 3.14;
        int radius = s.nextInt();
        double ar = c * radius * radius;
        System.out.println(ar);
    }
}
