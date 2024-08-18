package OOPS;

public class OOPS {
    public static <Dog> void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "SDV";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

// Queen q = new Queen();
// q.moves();

// Rook r = new Rook();
// r.moves();

// King k = new King();
// k.moves();

// }
// }

// interface ChessPlayer{
// void moves();
// }

// class Queen implements ChessPlayer{
// public void moves(){
// System.out.println("up, down , right,left,diagonal (in a 4 direction)");
// }
// }

// class Rook implements ChessPlayer{
// public void moves(){
// System.out.println("up, down , right,left");
// }
// }

// class King implements ChessPlayer{
// public void moves(){
// System.out.println("up, down , right,left(diagonal by 1 step)");
// }
// }

// Horse h = new Horse();
// h.eat();
// h.walk();

// Chicken c = new Chicken ();
// c.eat();
// c.walk();

// }
// }

// abstract class Animal{
// void eat(){
// System.out.println("animal eats");
// }

// abstract void walk();
// }

// class Horse extends Animal{
// void walk(){
// System.out.println("walk on 4 legs");
// }
// }

// class Chicken extends Animal{
// void walk(){
// System.out.println("walks on 2 legs");
// }
// }

// Dear d = new Dear();
// d.eat();
// // Calculator calc = new Calculator();
// // System.out.println(calc.sum(1,2));
// // System.out.println(calc.sum((float)1.5,(float)2.6));
// // System.out.println(calc.sum(1,2,3));
// }
// }

// class Animal{
// void eat(){
// System.out.println("eats anythings");
// }
// }

// class Dear extends Animal{
// void eat(){
// System.out.println("eats grass");
// }
// }

// class Calculator{
// int sum(int a, int b){
// return a + b;
// }

// float sum(float a , float b){
// return a + b;
// }

// int sum(int a , int b, int c){
// return a + b+c;
// }
// }

// Dog dobby = new Dog();
// dobby.eat();
// dobby.legs = 4; // Now the Dog class will have the legs property.
// System.out.println(dobby.legs);
// }
// }

// Base class
// class Animal {
// String color;

// void eat() {
// System.out.println("eats");
// }

// void breathe() {
// System.out.println("breathes");
// }
// }

// // Mammal class inherits from Animal and adds the legs property
// class Mammal extends Animal {
// int legs;
// }

// // Dog class now inherits from Mammal instead of Animal
// class Dog extends Mammal {
// String breed;
// }

// Student s1 = new Student();
// s1.name = "Saurav";
// s1.roll = 132;
// s1.password = "abcd";
// s1.marks[0] = 100;
// s1.marks[1] = 90;
// s1.marks[2] = 80;

// Student s2 = new Student(s1);
// s2.password = "xyz";

// for (int i = 0; i < 3; i++) {
// System.out.println(s2.marks[i]);
// }
// }
// }

// class Student {
// String name;
// int roll;
// String password;
// int marks[];

// // Copy constructor
// Student(Student s1) {
// marks = new int[3];
// this.name = s1.name;
// this.roll = s1.roll;
// this.marks = s1.marks;
// }

// Student() {
// marks = new int[3];
// }

// Student(String name) {
// marks = new int[3];
// this.name = name;
// }

// Student(int roll) {
// marks = new int[3];
// this.roll = roll;
// }
// }
