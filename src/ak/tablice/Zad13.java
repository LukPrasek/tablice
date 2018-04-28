package ak.tablice;

public class Zad13 {
    public static void main(String[] args) {
        Zad13 zad13 = new Zad13();
        String[] tsble = {"Jolka", "Lukasz", "Babka"};
        zad13.fiveLetters(tsble);
    }

    public String[] fiveLetters(String[] tab) {
        int counter = 0;
        String[] resultTable = new String[tab.length];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() == 5) {
                resultTable[counter] = tab[i];
                counter++;

            }

        }
        for (String n : resultTable) {
            System.out.println(n);
        }
        return resultTable;
    }
}
