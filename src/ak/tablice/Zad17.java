package ak.tablice;

public class Zad17 {
    public static void main(String[] args) {
        Zad17 zad17 = new Zad17();
        int[] table = {1,1,1,2,2,2,3,3,3,4,5,4,5,4};
        System.out.println(zad17.howManyOneDigit(table, 2));
    }

    private int howManyOneDigit(int[] table, int k) {
        int counter=0;
        for (int i = 0; i < table.length; i++) {
            if (k==table[i]){
                counter++;
            }

        }
        return counter;
    }
}