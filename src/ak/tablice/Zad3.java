package ak.tablice;

public class Zad3 {
    public static void main(String[] args) {
Zad3 zad3=new Zad3();
        System.out.println(zad3.sumElements(new int[] {1,2}));
    }


    public int sumElements (int[] tab) {
        if (tab.length==2) {
            return tab[0]+tab[1];
        }
        return -1;
    }
}
