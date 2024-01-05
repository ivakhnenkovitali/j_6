public class Person {

    private String name;
    private int age;


    public Person() {
        this("", -1);  ////вызов пустой строки

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("Person - имя: " + name + " , возраст: " + age);

    }
 ////для метода final -означает что такой метод не возможно прееопределить
    public final void  greeting(){
        System.out.println("hi");

    }


}










