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

    public void changeTire(){

        System.out.println("состояние шины - " + (tire = 1));
    }
    public double eraseTire(){
        tire = tire / 100 * (100 - (1 + Math.random()*100));
        return tire;
    }
    public void tire(){
        System.out.println("Состояние шины " + tire);
    }
    public static void main(String[] args) {
        CarWheel carWheel = new CarWheel();
        carWheel.changeTire();
        System.out.println("Состояние шины после затирания" + carWheel.eraseTire());
        carWheel.tire();
    }
}