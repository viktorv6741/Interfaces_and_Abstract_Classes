package fly_package;

public interface Fly {

/*Задание 1:
Создать интерфейс Fly, для описания летающего аппарата. Интерфейс должен иметь в себе следующие методы:
- Метод вывода имени средства передвижения
- Метод получения скорости передвижения транспорта
- Метод получения массы транспорта
- Метод получения количества пасажиров
- Метод получения уровня безопасности/описание
*/

    public void showName();
    public double getSpeed();
    public double getWeight();
    public int getNumberOfPassenger();
    public String getSecurityLevel();

}
