package ak.tablice;

public class Zad7 {

    public static void main(String[] args) {
        Zad7 zad7 = new Zad7();
        System.out.println(zad7.sumTableElements((new int[]{1, 2, 3, 4, 5, 6})));
    }

    public int sumTableElements(int[] ints) {
        int result = 0;

        for (int i = 0; i < ints.length; i++) {
            result += ints[i];

        }

        return result;
    }
}

