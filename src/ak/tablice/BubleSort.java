package ak.tablice;

public class BubleSort {
    public static void main(String[] args) {
        BubleSort zad10 = new BubleSort();
        System.out.println(zad10.correctOrder((new int[]{4, 1, 8, 7, 6, 2})));
    }

    private int[] correctOrder(int[] tab) {
        int temp;
        int zm = 1;

        while (zm > 0) {
            zm = 0;
            for (int i = 0; i < tab.length - 1; i++) {

                if ((tab[i]) > tab[i + 1]) {

                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    zm++;
                }
            }
        }
        for (int i = 0; i <tab.length ; i++) {
            System.out.println(tab[i]);
        }

        return null;
    }
}

//
//    int[] resultTable = new int[table.length];
//
//        for (int i = 0; i < table.length; i++) {
//        int temp;
//        for (int j = 0; j < table.length; j++) {
//        if (table[i] > table[j]) {
//        temp = table[i];
//        resultTable[i] = temp;
//
//        }
//
//        }
//
//        }
//        for (int x : resultTable) {
//        System.out.println(x);
//        }
//        {
//
//        }
//        return resultTable;
//        }
