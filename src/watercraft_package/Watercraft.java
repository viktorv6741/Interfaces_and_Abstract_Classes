package watercraft_package;

 abstract public class Watercraft {

    /*Создать супер класс "Лодка". От заданного супер класса создать двух прямых потомков "Корабль" и "Плот" .
Потомки должны реализовывать все методы, какие нереализованные в абстрактном классе.
Данные методы должны выводить на экран информацию о транспорте.
*/

  public abstract void showClassification();
  public abstract void startMovement();
  public abstract void generalInformation();
}
