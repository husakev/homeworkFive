package moduleFive;
import java.util.ArrayList;
/**
 * Created by Евгений on 22.07.2017.
 */
/* На прямую к переменным этого класса никто не может, только через методы
--------------------
Хранит:
дата производства (не изменна после создания объекта)
тип двигателя
максимальная скорость машины (если она новая)
время разгона до 100км/ч
пассажировместимость
кол-во пасажиров внутри в данный момент
текущая скорость
массив колес
массив дверей
Конструктор
--------------------
Нет пустого конструктора.
Так как есть поля в классе, которые нельзя изменять после создания объекта.
Например дата производства.
Конструктор с датой производства.
Конструктор со всеми полями, кроме массива колес и массива дверей.
Методы
--------------------
Изменить текущую скорость
Посадить 1 пассажира в машину
Высадить 1 пассажира
Высадить всех пассажиров
Получить дверь по индексу
Получить колесо по индексу
Снять все колеса с машины
Установить на машину X новых колесу (в добаков к имеющимся, то есть если было 4
колеса, после вызова метода с Х аргументом равным трем, колес будет 4+3=7)
Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так.
Максимальная скорость новой машины множиться на самое стертое колесо в машине.
Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому
ее вести)
Вывести в консоль данные об объекте (все поля и вычисленную максимальную
скорость в зависимости от целостности колес и наличия водителя) */
public class Car {
    final String date;                 // дата производства
    private String engine;             // тип двигателя
    private int topSpeed;              // максимальная скорость
    private int acceleration;          // время разгона
    private int passengerCapacity;     // пассажировместимость
    private int numberPassengers;      // кол-во пасажиров
    private int currentSpeed;          // текущая скорость
     ArrayList<CarWheel> wheels; // массив колес
     int[] doors;// массив дверей

    public Car() {
        date = "25.07.2018";
        engine = "Electric";
        topSpeed = 200;
        acceleration = 10;
        passengerCapacity = 5;
        numberPassengers = (int) (Math.random() * 6);
        currentSpeed = (int) (Math.random() * topSpeed);
        wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new CarWheel());
        }
        doors = new int[5];
        for (int i = 0; i < doors.length; i++)
            doors[i] = i+1;
    }

    public Car(String date, String engine, int topSpeed, int acceleration,
               int passengerCapacity, int numberPassengers, int currentSpeed,
               ArrayList wheels, int[] doors) {
        this.date = date;
        this.engine = engine;
        this.topSpeed = topSpeed;
        this.acceleration = acceleration;
        this.passengerCapacity = passengerCapacity;
        this.numberPassengers = numberPassengers;
        this.currentSpeed = currentSpeed;
    }

    public  void currentSpeed(){
        System.out.println("Измененная текущая скорость " +  (currentSpeed = (int)
                (Math.random() * topSpeed)));
    }

    public void plusPassenger() {
        numberPassengers++;// хоть мест и пять но исходя из опыта это не помеха для
        // 6,7 или 8  илb еще более человек)
        System.out.println("Посадить 1 пассажира в машину " + numberPassengers);
    }

    public void minusPassenger() {
        if (numberPassengers > 0) {
            System.out.println("Высадить 1 пассажира " + --numberPassengers);
        }
        else
        System.out.println("Нет пассажиров");
    }

    public void ollPassenger(){

        System.out.println("Высадить всех пассажиров " + (numberPassengers = 0));
    }

    public void numDoors(){
        int numD = doors[(int) (Math.random() * 5)];
        System.out.println("Получаем дверь по индексу " + numD);
    }

    public void numWheels(){
        Object numW = wheels.get((int) (Math.random() * wheels.size()));
        System.out.println("Получаем колесо по индексу " + numW);
    }

    public void removeWheels(){
        wheels.clear();
        System.out.println("Снимаем все колеса с машины " + wheels.size());
    }

    public void plasWils(){
        int w = wheels.size() + (int) (Math.random() * 6);
        for (int i = 0; i < w; i ++){
            wheels.add(new CarWheel());
        }
        System.out.println("Устанавливаем на машину X новых колес " +
                wheels.size());
    }

    public void currentMaximumSpeed(){
        Car car = new Car();
        CarWheel carWheel = new CarWheel();
        if (this.numberPassengers > 0 && carWheel.getTire() > 0) {
            double speed = topSpeed * (wheels.get(0).getTire());
            System.out.println("Текущую возможная максимальная скорость " + speed);
        }
        else
            System.out.println("Пассажиров нет");
    }

    public void console() {
        System.out.println("Дата производства - " + date);
        System.out.println("Тип двигателя - " + engine);
        System.out.println("Максимальная скорость машины - " + topSpeed);
        System.out.println("Время разгона до 100км/ч - " + acceleration + "c");
        System.out.println("пассажировместимость - " + passengerCapacity);
        System.out.println("кол-во пасажиров внутри в данный момент - " +
                numberPassengers);
        System.out.println("текущая скорость - " + currentSpeed);
        currentSpeed();
        plusPassenger();
        minusPassenger();
        ollPassenger();
        numDoors();
        numWheels();
        removeWheels();
        plasWils();
        currentMaximumSpeed();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.console();
    }
}