package ak.tablice;

public class Zad15 {

    public static void main(String[] args) {
        Zad15 zad15 = new Zad15();
        String [] table = {"Poniedzialek", "Wtorek", "Sroda"};
        System.out.println(zad15.returnMaxLength(table));
    }

    private int returnMaxLength(String[] table) {
        int maxValue=0;
        for (int i = 0; i <table.length ; i++) {
            if (table[i].length()>maxValue){
                maxValue=table[i].length();
            }

        }
        return maxValue;
    }
}
