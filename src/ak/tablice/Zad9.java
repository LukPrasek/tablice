package ak.tablice;

public class Zad9 {
    public static void main(String[] args) {
        Zad9 zad9 = new Zad9();
        System.out.println(zad9.maxElement((new int[]{1, 2, 3, 4, 5, 6})));
    }

    private int[] maxElement(int[] tab) {
        int[] reverseTab = new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            reverseTab[(tab.length - i) - 1] = tab[i];

        }
        for (int x : reverseTab) {
            System.out.println(x);
        }
        return reverseTab;
    }

}
