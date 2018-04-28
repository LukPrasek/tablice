package ak.tablice;

public class Zad16 {

    public static void main(String[] args) {
        Zad16 zad16 = new Zad16();
        boolean[] table = {true, false, true, true};
        System.out.println(zad16.howManyBoolean(table));
    }

    private boolean[] howManyBoolean(boolean[] table) {
        int counter = 0;
        for (int i = 0; i < table.length - 1; i++) {
            if (table[i]==true) {
                counter++;
            }
        }
        boolean[] result = new boolean[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = true;

        }
        for (boolean b : result) {
            System.out.println(b);
        }
        {

        }
        return null;
    }
}







