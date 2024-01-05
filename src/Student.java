

// клас student наследует у класса person
//Person - суперклас
//Student -подкласс
// каждый объет класса Student будет состоять из 4 полей
//кождый объет подкласса состоит из совокупности его полей и полей всех его суперкласоов

public class Student extends Person {
    private String university;
    private int course;

    ///none 17 GSTU 1
    public Student() {
        //можно вызвать конструктор по умолчанию супперкласса
        this("none", 17, "GSTU", 1);
        /// super(); если не осуществить вызов конструктора суперкласса сомостоятельно
        ///то автоматически при создании объета student будет вызван конструктор по умолчанию суперкласс

    }


    public Student(String name, int age, String university, int course) {
        super(name, age); ///вызов конструктора суперкласса

        //конструкция super для вызова конструктора  суперкласса может быть описана  на 1й позиции конструктора
        this.university = university;
        this.course = course;
    }

    public int getCourse() {
        return course;

    }

    public void setCourse(int course) {
        this.course = course;
    }

    /// переопределение метода - создание в подклассе метода с таким же именем типом и
    ///списком пораметров как и у метода суперклассаю переопределине метода для этого класса
    ////перекривает метод суперкласса


    @Override    //// == онатация сообщающее о том что этот метод переопределяет метод суперкласса===////////

    public void info() {
        ///можно вызвать версию которую переопледелили
        ///super.info(); ///способ вызова новый способ
        System.out.println("Student -имя:" + getName()
                + ", возраст: " + getAge() +
                ", уневер: " + university +
                ", курс: " + course);


    }

    ///  @Override  //// == онатация сообщающее о том что этот метод переопределяет метод суперкласса===////////
   /// public void greeting() {
     ///   System.out.println("hi student");

   // }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + getAge() +
                ", course=" + course +
                ", name='" + getName() + '\'' +
                ", university='" + university + '\'' +
                '}';
    }
}






