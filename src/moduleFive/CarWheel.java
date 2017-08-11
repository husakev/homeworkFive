package moduleFive;
/**
 * Created by Евгений on 22.07.2017.
 */
/* На прямую к переменным этого класса никто не может, только через методы
--------------------
Хранит:
Состояние целостности шины (дробное число от 0-стерта до 1-новая)
Констррктор
--------------------
Аналогичный принцип как в классе CarDoor
Методы
--------------------
Сменить шину на новую
Стереть шину на X%
Получить состояние (return)
Вывести в консоль данные об объекте */
public class CarWheel {
    private double tire;

    public CarWheel() {
        tire = 1;
    }

    public CarWheel(double tire) {
        this.tire = tire;
    }

    public double getTire() {
        return tire;
    }

    public void changeTire(){
        System.out.println("состояние шины - " + (tire = 1));
    }

    public void eraseTire() {        // тебе перед стиранием шины нужно проверить ее
        if (tire > 0) {              // нынешнее состояние
            double erase = Math.random() * 1;
            tire -= erase;
            if (tire >= 0) {
                System.out.println("состояние шины " + tire);
            }
            else { // если перетерта то умножаю чтоб узнать на сколько перетерта
                int eraseT = (int) (-tire * 100);
                System.out.println("шина перестерта на " + eraseT + "%");
                tire = 0;
            }//екран выведи меседж шина перестерта на 5%, и в результате присвоишь
        }// шине 0, а не минус пять
    }

    public void tire(){
        System.out.println("Состояние шины " + tire);
    }

    public static void main(String[] args) {
        CarWheel carWheel = new CarWheel();
        carWheel.changeTire();
        carWheel.eraseTire();
        carWheel.tire();
    }
}