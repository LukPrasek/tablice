package ak.tablice;

public class Zad1 {
    public static void main(String[] args) {
        Zad1 zad=new Zad1();
        System.out.println(zad.first(new int[]{7,5,4,8,9}));
    }

    private int first(int[] ints) {
        return ints[ints.length-1];
    }
}
