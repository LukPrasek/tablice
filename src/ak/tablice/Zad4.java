package ak.tablice;

public class Zad4 {
    public static void main(String[] args) {
        Zad4 zad4=new Zad4();
        System.out.println(zad4.sumElements(new int[] {1,2,3,4,5}));
    }

    private int sumElements(int[] ints) {
        return ints[0]+ints[ints.length-1];
    }

}
