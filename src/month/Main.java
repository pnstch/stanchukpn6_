package month;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int choose;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите месяц(13 - конец показа месяцов)");
        choose = scanner.nextInt();
        while (choose != 13) {
            switch (choose) {
                case 1:
                    System.out.println(Months.JANUARY);
                    break;
                case 2:
                    System.out.println(Months.FEBRUARY);
                    break;
                case 3:
                    System.out.println(Months.MARCH);
                    break;
                case 4:
                    System.out.println(Months.APRIL);
                    break;
                case 5:
                    System.out.println(Months.MAY);
                    break;
                case 6:
                    System.out.println(Months.JUNE);
                    break;
                case 7:
                    System.out.println(Months.JULY);
                    break;
                case 8:
                    System.out.println(Months.AUGUST);
                    break;
                case 9:
                    System.out.println(Months.SEPTEMBER);
                    break;
                case 10:
                    System.out.println(Months.OCTOBER);
                    break;
                case 11:
                    System.out.println(Months.NOVEMBER);
                    break;
                case 12:
                    System.out.println(Months.DECEMBER);
                    break;
                default:
                    System.out.println("Введите номер месяца еще раз");
            }
            choose = scanner.nextInt();
        }
    }


}
