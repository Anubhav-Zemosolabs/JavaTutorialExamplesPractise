public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        int add = a + b;
        int sub = a - b;
        float div = a/b;
        int mul = a*b;
        int mod = a%b;

        System.out.println("Addition: " + add);
        System.out.println("Substraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);

        add += 58;
        sub -= 5;

        System.out.println("Addition: " + add);
        System.out.println("Substraction: " + sub);
    }
}
