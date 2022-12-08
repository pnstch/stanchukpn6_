package Cars;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Cars[] cars;
        cars = fillAndSortCars();
        printCars(cars);
    }

    private static void printCars(Cars[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите бюджет на покупку авто");
        int amountMoney = scanner.nextInt();
        for (int i = 0; i < 5; i++) {
            if (cars[i].getCost() <= amountMoney) {
                System.out.println(cars[i]);
            }
        }
    }

    private static Cars[] fillAndSortCars(){
        Cars[] cars = new Cars[5];
        cars[0] = Cars.HYUNDAI;
        cars[1] = Cars.KIA;
        cars[2] = Cars.LADA;
        cars[3] = Cars.SUBARU;
        cars[4] = Cars.TOYOTA;
        Cars carTemp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {;
                if (cars[j].getMaxSpeed() < cars[j + 1].getMaxSpeed()) {
                    carTemp = cars[j + 1];
                    cars[j + 1] = cars[j];
                    cars[j] = carTemp;
                }
            }
        }
        return cars;
    }
}