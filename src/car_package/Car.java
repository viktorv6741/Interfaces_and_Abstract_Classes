package car_package;

abstract public class Car implements Mashine {

        /*Задание 2:
Создать абстрактный класс Car, который реализует интерфейс Machine. В данном классе реализовать:
- Константу максимальной скорости
- Константу минимальной скорости
- Константу минимального количества пассажиров
- Константу максимального количества пассажиров
- Поле с названием транспорта
- Поле со скоростью передвижения транспорта в данный момент времени
- Конструктор класса Machine(String name, int speed)
- Метод вывода имени транспорта
*/

    private String name;
    private int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName(){
       return this.name;
    }
}
