package HomeWork10;

public class Roots {

    public static void main(String[] args) {
        Roots rs = new Roots();
        rs.EquationRoots(1, 8, 15);
        rs.EquationRoots(2, 4, 2);
        rs.EquationRoots(1, -5, 6);
        rs.EquationRoots(-3, -7, -16);
        rs.EquationRoots(3, -5, -16);
        rs.EquationRoots(1, 4, 4);

        double z = 4-0.3;
        System.out.println(z);
    }

    public void EquationRoots(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        if (d > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("Два корня: " + x1 + " и " + x2);
        }
        else if (d == 0) {
            double x;
            x = (double)-b / (2 * a);
            System.out.println("Один корень: " + x);
        }
        else {
            System.out.println("Нет корней");
        }
    }
}
