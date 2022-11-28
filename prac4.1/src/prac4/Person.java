package prac4;

public class Person {
    private int age;
    private String fullName;

    public Person() { }
    public void PersonTalk(){
        System.out.println("Человек " + fullName + " говорит");
    }
    public void PersonMove(){
        System.out.println("Человек " + fullName + " сделал дз");;
    }
    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }
}
