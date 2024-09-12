public class Main {

   
    static class Animal1 {
        String color = "white";
    }

    static class Dog1 extends Animal1 {
        String color = "black";

        void printColor() {
            System.out.println(color);       
            System.out.println(super.color);  
        }
    }

        static class Animal2 {
        void eat() {
            System.out.println("eating...");
        }
    }

    static class Dog2 extends Animal2 {
        void eat() {
            System.out.println("eating bread...");
        }

        void bark() {
            System.out.println("barking...");
        }

        void work() {
            super.eat();  
            bark();      
        }
    }


    static class Animal3 {
        Animal3() {
            System.out.println("animal is created");
        }
    }

    static class Dog3 extends Animal3 {
        Dog3() {
            super(); 
            System.out.println("dog is created");
        }
    }

   
    public static void main(String[] args) {
       
        Dog1 d1 = new Dog1();
        d1.printColor();

       
        Dog2 d2 = new Dog2();
        d2.work();

       
        Dog3 d3 = new Dog3();

       
        final int x = 10;
   
        System.out.println("Value of final x: " + x);
    }
}

/*
Output:
black
white
eating...
barking...
animal is created
dog is created
Value of final x: 10
  */
