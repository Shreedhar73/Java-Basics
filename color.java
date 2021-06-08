class Animal {
    
    public void color() {
        System.out.println("color");
    }

    public void sound() {
        System.out.println("sound");
    }
}
class Dog extends Animal {
    public void color() {
        System.out.println("color");
    }

    public void germanShepherd() {
        System.out.println("germanShepherd");

    }

    public void sound() {
        System.out.println("sound");
    }

    public static void main(String[] args) {
        System.out.println("testing");
        Dog dog = new Dog();
        TypesOfDog type = new TypesOfDog();
        dog.color();
        type.germanShepherd();
    }
}
class TypesOfDog extends Dog {

    public void germanSherped() {
        System.out.println(" Bredd is german");
    }
}