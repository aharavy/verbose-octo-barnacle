package homework3;

public class MetodaEx12 {
    public static void main(String[] args) {
        /*Найдите сумму первых n целых чисел, которые делятся на 3.*/
        int k=0;
        int n=20; // указываем сколько числел делящихся на 3 нужно найти
        int sum=0;
        for (int i = 1; k<=n; i++) {
            if (i%3==0){
                k++;
                sum+=i;
            }
        }
        System.out.println("Сумма первых " + n + " чисел которые делятеся на 3 = " + sum);
    }
}
