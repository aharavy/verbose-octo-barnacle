package homework3;

import java.util.Random;

public class MetodaEx8 {
     /*Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже*/

    public static void main(String[] args) {
        int number;
        String padezh;
        Random rnd = new Random();
        number=rnd.nextInt();
        if(Math.abs(number%10)==1){
            padezh="рубль";
        }else if(Math.abs(number%10)==2 || Math.abs(number%10)==3 || Math.abs(number%10)==4){
            padezh="рубля";
        } else {
            padezh="рублей";
        }

        System.out.println("У вас на карточке " + number + " " + padezh);
    }
}
