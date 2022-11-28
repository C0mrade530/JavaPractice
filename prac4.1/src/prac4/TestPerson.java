package prac4;
//Создать класс Person, который содержит: a) поля fullName, age. б)
//методы move() и talk(), в которых просто вывести на консоль сообщение -"Такойто Person говорит". в) Добавьте два конструктора - Person() и Person(fullName,
//age). Создайте два объекта этого класса. Один объект инициализируется
//конструктором Person(), другой - Person(fullName, age).
public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person(20, "Ivan");
        Person person2 = new Person(18,"Leonid");
        person1.PersonTalk();
        person2.PersonTalk();
        person1.PersonMove();
        person2.PersonMove();

    }
}
