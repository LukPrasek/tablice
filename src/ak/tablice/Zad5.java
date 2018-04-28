package ak.tablice;

public class Zad5 {
    public static void main(String[] args) {
        Zad5 zad5=new Zad5();
        System.out.println(zad5.middleElement(new int[] {1,2,3,4,5,6}));
    }

    private int middleElement(int[] ints) {
        return ints[(ints.length-1)/2];
    }

}
