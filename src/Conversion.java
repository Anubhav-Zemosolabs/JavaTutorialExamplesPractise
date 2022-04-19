public class Conversion {
    public static void main(String[] args) {

        double pi = 3.14;
        float fpi = 3.14f; //narrowing
        double dpi = fpi;

        System.out.println("narrowing value:" + fpi);
        System.out.println("narrowing value:" + dpi);
    }
}
