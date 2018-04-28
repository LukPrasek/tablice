package ak.tablice;

public class BubleTry {
    public static void main(String[] args) {
        BubleTry bubleTry = new BubleTry();
        bubleTry.sortNumbers(new int[]{9, 5, 3, 7, 8});
    }

    private void sortNumbers(int[] ints) {
        int temp;
        int flag = 1;
        while (flag > 0) {
            flag = 0;

            for (int i = 0; i < ints.length-1; i++) {

                if (ints[i] > ints[i + 1]) {
                    temp = ints[i + 1];
                    ints[i + 1] = ints[i];
                    ints[i] = temp;
                    flag++;
                }
            }
        }
        for (int i = 0; i <ints.length ; i++) {
            System.out.println(ints[i]);

        }
    }
}
