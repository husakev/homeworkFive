package moduleFive;
/**
 * Created by Евгений on 22.07.2017.
 */
/* Создать пакет соответствующий(название на ваш вкус, но должно быть логично связанно с именами классов)
пакет и поместить туда все последующие классы
Класс CarDoor
На прямую к переменным этого класса никто не может, только через методы
--------------------
Хранит:
состояние двери(открыта/закрыта)
состояние окна (открыто/закрыто)
Конструктор
--------------------
Требуется несколько конструкторов на различные случаи.
Один без аргументов. Он должен присвоить переменым значения на случай если данных нет.
Один конструктор принимает оба состояния, двери и окна. Присваивает эти значения переменным внутри объекта.
Методы
--------------------
открыть дверь
закрыть дверь
открыть/закрыть дверь (если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и
наоборот)
открыть окно
закрыть окно
открыть/закрыть окно(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и
наоборот)
Вывести в консоль данные об объекте */
public class CarDoor {
    private boolean door;
    private boolean window;

    public CarDoor() {
        door = true;   //открыты
        window = true; //открыто
    }
    public CarDoor(boolean door, boolean window) {
        this.door = door;
        this.window = window;
    }

    public void openDoor() {
        if (door) {
            System.out.println("дверь открыта");
        } else {
            door = true;
            System.out.println("дверь открылась");
        }
    }

    public void closeDoor() {
        if (!door) {
            System.out.println("дверь закрыта");
        } else {
            door = false;
            System.out.println("дверь закрылась");
        }
    }

    public void openСloseDoor() {
        if (door) {
            door = false;
            System.out.println("дверь закрылась");
        } else {
            door = true;
            System.out.println("дверь открылась");
        }
    }

    public void openWindow() {
        if (window) {
            System.out.println("окно открыто");
        } else {
            window = true;
            System.out.println("окно открылось");
        }
    }

    public void closeWindow() {
        if (!window) {
            System.out.println("окно закрыто");
        } else {
            window = false;
            System.out.println("окно закрылось");
        }
    }

    public void openСloseWindow() {
        if (window) {
            window = false;
            System.out.println("окно закрылось");
        } else {
            window = true;
            System.out.println("окно открылось");
        }
    }
    public void console() {
        System.out.println("Состояние двери: дверь - " + (door ? "открыта" : "закрыта"));
        System.out.println("Состояние окна: окно - " + (window? "открыта" : "закрыта"));

    }
    public static void main(String[] args) {
        CarDoor carDoor = new CarDoor();
        carDoor.console();
    } //psvm в каждом класе делаю чтоб вам удобней тестировать было
}
