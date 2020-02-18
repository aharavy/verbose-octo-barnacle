package homework3;

public class MetodaEx11 {
    public static void main(String[] args) {
        int number = 102;
        int n=0; //счетчик;
        for (int i = 2; i <number ; i++) {
            if(number%i==0){
                n++;
            }
        }
        if(n==0){
            System.out.println("Ваше число -простое!");
        } else {
            System.out.println("Ваше число делится еще на " + n + " чисел без остатка! =)");
        }
    }
}
