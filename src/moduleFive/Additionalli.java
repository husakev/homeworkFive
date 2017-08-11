package moduleFive;
import java.util.Scanner;
/**
 * Created by Евгений on 30.07.2017.
 */
/* Создать консольный пользовательский интерфейс. В котором пользователя программа
будет спрашивать какое действие выполнить и с какими параметрами. Кол-во различных
действий = кол-ву функций в ДЗ. */
public class Additionalli {
    
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        CarDoor carWindow = new CarDoor();
        CarWheel carWheel = new CarWheel();
        Car car = new Car();
        Scanner s = new Scanner(System.in);
        System.out.println("Приветствую, сейчас вы сможете выбрать функцию для " +
                "просмотра данных об автомобиле  'БИЧ'(Безумие или чудо)");
        System.out.println();
        System.out.println("все данные будут заполняться рандомно в разумных " +
                "пределах");
        System.out.println();
        System.out.println("укажитте номер операции");
        System.out.println();
        System.out.println(" открыть дверь - нажмите 1, закрыть дверь - 2, " +
                "изменить положение двери - 3, открыть окно - 4, " +
                "закрыть окно - 5, изменить положение окна - 6, " +
                "сменить шину на новую - 7, \n стереть шину на X% - 8, " +
                "получить состояние шины - 9, изменить текущую скорость - 10, " +
                "Посадить 1 пассажира в машину - 11, высадить 1 пассажира - 12," +
                "\n высадить всех пассажиров - 13, " +
                "получить дверь по индексу - 14, получить колесо по индексу - 15, " +
                "снять все колеса с машины - 16, " +
                "установить на машину X новых колесу - 17, " +
                "\n Вычислить текущую возможную максимальную скорость - 18");
        System.out.println();
        System.out.println("Ведите нужный номер");
        int num = s.nextInt();
        switch (num) {
            case 1:
                carDoor.openDoor();
                break;
            case 2:
                carDoor.closeDoor();
                break;
            case 3:
                carDoor.openСloseDoor();
                break;
            case 4:
                carDoor.carWindow.openWindow();
                break;
            case 5:
                carDoor.carWindow.closeWindow();
                break;
            case 6:
                carDoor.carWindow.openСloseWindow();
                break;
            case 7:
                carWheel.changeTire();
                break;
            case 8:
                carWheel.eraseTire();
                break;
            case 9:
                carWheel.tire();
                break;
            case 10:
                car.currentSpeed();
                break;
            case 11:
                car.plusPassenger();
                break;
            case 12:
                car.minusPassenger();
                break;
            case 13:
                car.ollPassenger();
                break;
            case 14:
                car.numDoors();
                break;
            case 15:
                car.numWheels();
                break;
            case 16:
                car.removeWheels();
                break;
            case 17:
                car.plasWils();
                break;
            case 18:
                car.currentMaximumSpeed();
        }
    }
}