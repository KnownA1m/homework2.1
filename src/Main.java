public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int depositAmount = 1300;
        if (depositAmount > 1000) {
            balans = (depositAmount/100)+balans+depositAmount;}
        else {
            balans = depositAmount+balans;
        }
        System.out.println(balans);
    }
}