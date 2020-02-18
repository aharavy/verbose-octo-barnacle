package homework3;

public class MetodaEx14 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int minMain;
        int maxMain;
        int min = 0;
        int max = 0;
        int indexMin = 0;
        int indexMax = 0;
        int sum = 0;


        //заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        minMain = arr[0];
        maxMain = arr[0];


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[0] < arr[i + 1]) {
                max = arr[i + 1];
            } else {
                min = arr[i + 1];
            }
            if (minMain > min) {
                minMain = min;
                indexMin = i + 1;
            }
            if (maxMain < max) {
                maxMain = max;
                indexMax = i + 1;
            }
        }
        //выводим массив на экран
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "| ");
        }

        System.out.println("\nВаш минимальный элемент:"+minMain + " |его индекс в массиве:"+ indexMin);
        System.out.println("Ваш максимальный элемент:"+maxMain + " |eго индекс в массиве:"+ indexMax);
    }
}
