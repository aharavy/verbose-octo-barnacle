package homework3;

public class DopEx5 {
    /*Напишите программу печати таблицы перевода расстояний из дюймов
    в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
     */
    public static void main(String[] args) {
        double sm=1;
        double duim=0.0;

        for (sm = 1; sm < 21; sm++) {
            duim = sm*2.54;
            System.out.println("| "+ sm + " sm = " + duim + " dm |");
        }
    }
}
