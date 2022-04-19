public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = false;

        boolean combined = isRaining && isWarm;
        System.out.println("Is it raining outside: "+ combined );

        combined = isRaining || isWarm;

        System.out.println("Is not raining out side: " + combined);
    }
}
