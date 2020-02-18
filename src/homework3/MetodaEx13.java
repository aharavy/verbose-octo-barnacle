package homework3;

public class MetodaEx13 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //заполнение массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] =(int) (Math.random()*10);
        }
        //Сортировка массива по возростанию
        for (int start= 0; start <arr.length-1 ; start++) {
            for (int index = 0; index <arr.length-1 ; index++) {
                if(arr[index]>arr[index+1]){
                    int temp;
                    temp=arr[index];
                    arr[index]=arr[index+1];
                    arr[index+1]=temp;
                }
            }
        }
        //вывод массива в консоль
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ "| ");
        };
        System.out.println("\nНаибольшее число в вашем массиве:"+arr[9]);
    }
}
