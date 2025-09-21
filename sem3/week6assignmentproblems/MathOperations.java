
// 🧪 HW PROBLEM 5: Math Operations Inheritance
class BasicMath {
    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a + b;
    }
}

class AdvancedMath extends BasicMath {
    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public double calculate(double a, double b, double c) {
        return a + b + c;
    }
}

class MathTest {
    public static void main(String[] args) {
        AdvancedMath am = new AdvancedMath();
        System.out.println(am.calculate(2, 3));
        System.out.println(am.calculate(2.5, 3.5));
        System.out.println(am.calculate(1, 2, 3));
        System.out.println(am.calculate(1.1, 2.2, 3.3));
    }
}
