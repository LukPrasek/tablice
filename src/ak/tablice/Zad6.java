package ak.tablice;

public class Zad6 {
    public static void main(String[] args) {
        Zad6 zad6 = new Zad6();
        System.out.println(zad6.concatTable((new int[]{1, 2, 3, 4, 5, 6}),new int[]{7, 8, 9}));
    }

    private int[] concatTable(int[] firstTab, int[] secondTab) {
        int[] tab3 = new int[firstTab.length + secondTab.length];
        for (int i = 0; i < firstTab.length; i++) {
            tab3[i] = firstTab[i];
        }

        for (int j = 0; j < secondTab.length; j++) {
            tab3[(firstTab.length)+j] = secondTab[j];
        }
        for (int x: tab3) {
            System.out.println(x);

        }

        return null;
    }

    public int sumTableElements(int[] ints) {
        int result=0;

        for (int i = 0; i < ints.length; i++) {
            result=+ints[i];

        }

        return result;
    }
}
