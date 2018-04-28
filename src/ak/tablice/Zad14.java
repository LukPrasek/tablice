package ak.tablice;

public class Zad14 {

    public static void main(String[] args) {
        Zad14 zad14 = new Zad14();
        String[] tsble = {"Jolka", "Lukasz", "Babka"};
        zad14.turnToLowerCase(tsble);
    }

    private String[] turnToLowerCase(String[] table) {
        String [] resultTable=new String[table.length];
        for (int i = 0; i < table.length; i++) {
            resultTable[i]=table[i].toLowerCase();

        }
        for (String text: resultTable) {
            System.out.println(text);

        }
        return resultTable;
    }
}
