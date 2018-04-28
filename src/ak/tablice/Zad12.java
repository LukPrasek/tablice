package ak.tablice;

public class Zad12 {

    public static void main(String[] args) {
        Zad12 zad12 = new Zad12();
        System.out.println(zad12.middleTable((new int[]{4, 1, 8, 7, 6, 2})));

    }

    private int[] middleTable(int[] tab) {

        if (tab.length%2==0) {
            int[] result={tab.length/2, tab.length/2+1};
            System.out.println(result);
            return result;
        }

     return null;
    }
}
