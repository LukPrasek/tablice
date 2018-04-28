package ak.tablice;

public class Buble {
    public static void main(String[] args) {

        Buble buble = new Buble();
        int[] table = new int[]{3, 2, 4, 9, 8, 67};
        buble.sortTable(table);

    }

    private void sortTable(int[] table) {
        int flag = 1;
        while (flag > 0) {
            flag = 0;
            int current;
            for (int i = 0; i < table.length - 1; i++) {
                if (table[i] > table[i + 1]) {
                    current = table[i + 1];
                    table[i+1] = table[i];
                    table[i] = current;
                    flag++;
                }
//                if ((tab[i]) > tab[i + 1]) {
//
//                    temp = tab[i + 1];
//                    tab[i + 1] = tab[i];
//                    tab[i] = temp;

            }

        }
        for (int i = 0; i <table.length ; i++) {
            System.out.println(table[i]);

        }
        {

        }
    }
}

