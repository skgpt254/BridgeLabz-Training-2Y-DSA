import java.util.*;
public class quadEqn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = ((b*b)-(4*a*c));
        double pw = (int) Math.pow(d, 0.5);
        double q1 = (-b + pw)/(2*a);
        double q2 = (-b - pw)/(2*a);
        System.out.println(q1 + " " + q2);
    }
}
