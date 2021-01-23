package com.company;
import java.lang.*;
import java.util.Scanner;

public class Main{

//------------------------------------------------------------------
//-------------------------Конструкторы-----------------------------------------
//------------------------------------------------------------------
//public static void main(String[] args) {
//
//    Person bob = new Person();      // вызов первого конструктора без параметров
//    bob.displayInfo();
//
//    Person tom = new Person("Tom"); // вызов второго конструктора с одним параметром
//    tom.displayInfo();
//
//    Person sam = new Person("Sam", 25); // вызов третьего конструктора с двумя параметрами
//    sam.displayInfo();
//}
//}
//class Person{
//
//    String name;    // имя
//    int age;        // возраст
//    Person()
//    {
//        name = "Undefined";
//        age = 18;
//    }
//    Person(String n)
//    {
//        name = n;
//        age = 18;
//    }
//    Person(String n, int a)
//    {
//        name = n;
//        age = a;
//    }
//    void displayInfo(){
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }
//}

//------------------------------------------------------------------
//----------------------Инициализаторы--------------------------------------------
//------------------------------------------------------------------

//    public static void main(String[] args) {
//
//        Person undef = new Person();
//        undef.displayInfo();
//
//        Person tom = new Person("Tom");
//        tom.displayInfo();
//    }
//}
//class Person{
//
//    String name;    // имя
//    int age;        // возраст
//
//    /*начало блока инициализатора*/
//    {
//        name = "Undefined";
//        age = 18;
//    }
//    /*конец блока инициализатора*/
//    Person(){
//
//    }
//    Person(String name){
//
//        this.name = name;
//    }
//    Person(String name, int age){
//
//        this.name = name;
//        this.age = age;
//    }
//    void displayInfo(){
//        System.out.printf("Name: %s \tAge: %d\n", name, age);
//    }
//}

//------------------------------------------------------------------
//---------------------------Инкапсуляция---------------------------------------
//------------------------------------------------------------------

//
//        public static void main(String[] args) {
//
//            Person kate = new Person("Kate", 30);
//            System.out.println(kate.getAge());      // 30
//            kate.setAge(33);
//            System.out.println(kate.getAge());      // 33
//            kate.setAge(123450);
//            System.out.println(kate.getAge());      // 33
//        }
//    }
//    class Person{
//
//        private String name;
//        private int age;
//
//        public Person(String name, int age){
//            this.name = name;
//            this.age = age;
//        }
//        public String getName(){
//            return this.name;
//        }
//        public void setName(String name){
//            this.name = name;
//        }
//        public int getAge(){
//            return this.age;
//        }
//        public void setAge(int age){
//            if(age > 0 && age < 110)
//                this.age = age;
//        }
    // }

//------------------------------------------------------------------
//---------------------------Статические поля---------------------------------------
//------------------------------------------------------------------

//
//    public static void main(String[] args) {
//
//        Person tom = new Person();
//        Person bob = new Person();
//
//        tom.displayId();    // Id = 1
//        bob.displayId();    // Id = 2
//        System.out.println(Person.counter); // 3
//
//        // изменяем Person.counter
//        Person.counter = 8;
//
//        Person sam = new Person();
//        sam.displayId();    // Id = 8
//    }
//}
//    class Person{
//
//        private int id;
//        static int counter=1;
//
//        Person(){
//            id = counter++;
//        }
//        public void displayId(){
//
//            System.out.printf("Id: %d \n", id);
//        }
//    }



    //------------------------------------------------------------------
//---------------------------Статические инициализаторы---------------------------------------
//------------------------------------------------------------------
//        public static void main(String[] args) {
//
//            Person tom = new Person();
//            Person bob = new Person();
//
//            tom.displayId();    // Id = 105
//            bob.displayId();    // Id = 106
//        }
//    }
//    class Person{
//
//        private int id;
//        static int counter;
//
//        static{
//            counter = 105;
//            System.out.println("Static initializer");
//        }
//        Person(){
//            id=counter++;
//            System.out.println("Constructor");
//        }
//        public void displayId(){
//
//            System.out.printf("Id: %d \n", id);
//        }
//    }

    //------------------------------------------------------------------
//---------------------------Динамическая диспетчеризация методов---------------------------------------
//------------------------------------------------------------------
//        public static void main(String[] args) {
//
//            Person tom = new Person("Tom");
//            tom.display();
//            Person sam = new Employee("Sam", "Oracle");
//            sam.display();
//        }
//    }
//    class Person {
//
//        private String name;
//
//        public String getName() { return name; }
//
//        public Person(String name){
//
//            this.name=name;
//        }
//
//        public void display(){
//
//            System.out.printf("Person %s \n", name);
//        }
//    }
//
//    class Employee extends Person{
//
//        private String company;
//
//        public Employee(String name, String company) {
//
//            super(name);
//            this.company = company;
//        }
//        @Override
//        public void display(){
//
//            System.out.printf("Employee %s works in %s \n", super.getName(), company);
//        }
//    }
//------------------------------------------------------------------
//---------------------------Задание №2---------------------------------------
//------------------------------------------------------------------




    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle (3.1, 4.1, 5.1, "\u201c");
        System.out.println("Длина окружности = " + k1.getLength() + "см\n");

        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r = source.nextDouble();
        k1.setR(r);
        System.out.println("\nДлина окружности = " + k1.getLength() + "см");
    }
}

class Circle {
    private double x;
    private double y;
    private double r;
    private String colour;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Circle (double x, double y, double r, String colour){
        this.x = x;
        this.y = y;
        this.r = r;
        this.colour = colour;
    }

    public double getLength(){
        double c;
        c = 2 * Math.PI*r;
        return c;
    }

    @Override
    public String toString(){
        return "Circle{" + "x=" + x + ", y=" + y + ", r=" + r + ", colour='"
                + colour + '\'' + '}';
    }
}
