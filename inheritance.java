class Animal1{
    public void walk(){
        System.out.println(" can walks");
    }
    public void eat(){
        System.out.println(" Animals eat");
    }
}
class Horse extends Animal1{
    public void walk(){
    System.out.println("walks on 4 legs");
}
 
}
class Chicken extends Animal1{
    public void walk2(){
        System.out.println("Walks on 2 legs");
    }
}





public class oops {
    public static void main(String[] args) {
     Horse h1 = new Horse();
     h1.walk();
     h1.eat();

    }
}


