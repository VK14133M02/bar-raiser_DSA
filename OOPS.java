public class OOPS {   

    public static void main(String[] args) {
        Human.blood = "Red";
        System.out.println(Human.blood);
        Human human = new Human();
        human.eyes = 2;
    }
}

class Human{
    static String blood;
    int eyes;
}



// interface Animal{
//     void walk();
// }

// interface Herbivore extends Animal{
//     void eat();
// }

// class Horse implements Herbivore{
//     public void walk(){
//         System.out.println("Walk on 4 legs");
//     }

//     public void eat(){
//         System.out.println("Horse is a herbivores animal");
//     }
// }


// abstract class Student{
//     abstract void play();

//     public Student(){
//         System.out.println("Student studied in School");
//     }

//     public void learn(){
//         System.out.println("Students are learning");
//     }

// }

// class Baby extends Student{
//     public Baby(){
//         System.out.println("Baby Going to school");
//     }

//     @Override
//     public void play(){
//         System.out.println("Students need time to play the game");
//     }
// }

// class Encapsulation{
//     private int result;

//     private void setResult(int result){
//         this.result = result;
//     }

//     public int getReult(){
//         return result;
//     }
    
//     public void getSum(int a,int b){
//         int result = a+b;  
//         setResult(result);
//     }
// }



// class Animal {
//     String name;
//     int age;

//     public Animal(String name, int age){
//         this.name = name;
//         this.age = age;
//     }

//     public void getDetails(){
//         System.out.println(name+" "+age);
//     }

//     public String getName(){
//         return name;
//     }
// }

// class Dog extends Animal{
//     public Dog(String name, int age){
//         super(name, age);
//     }

//     @Override
//     public void getDetails(){
//         System.out.println("This the dog method "+name+" "+age);
//     }
// }


