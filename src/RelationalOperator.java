public class RelationalOperator {
    public static void main(String[] args) {
        int myAge = 45;
        int yourAge = 30;
        int kishanAge = 45;

        String myName = "Anubhav";
        String yourName = "Anubhav";

        boolean compareAge = myAge > yourAge;
        System.out.println("myAge > yourAge?:" + compareAge);
        compareAge = myAge < yourAge;
        System.out.println("myAge < yourAge?:" + compareAge);
        compareAge = kishanAge == yourAge;
        System.out.println("myAge == yourAge?:" + compareAge);

        if(myAge <= 45 && yourAge >= 30)
            System.out.println("True");

        boolean doSame = myName.equals(yourName);
        System.out.println("so ages are same: " + doSame);

    }
}
