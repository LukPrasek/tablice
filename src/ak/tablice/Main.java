package ak.tablice;

public class Main {

    public static void main(String[] args) {
        int number=155;
        int sum=0;
        while (number>0){

            int digit=number%10;
            sum+= digit;
            number-=digit;
            System.out.println("number"+number);
            number=number/10;
            System.out.println("number po zmniejszeniu "+number);
        }

        System.out.println(sum);
        // write your code here
    }
}
