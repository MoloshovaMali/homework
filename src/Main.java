public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("Сириус");
        dog.setBreed("Немеская овчарка ");
        dog.setColour("черно рыжий");
        dog.setWeight(32);
        System.out.println("имя собаки-> "+ dog.getName());
        System.out.println("порода собаки-> "+ dog.getBreed());
        System.out.println("цвет собаки-> "+ dog.getColour());
        System.out.println("вес собаки-> "+ dog.getWeight());
        dog.run();
        dog.protect();

        System.out.println("-----------------------------");

        Cat cat=new Cat();
        cat.setName("Murka");
        cat.setColour("белый");
        cat.setWeight(3);
        System.out.println("имя кошки-> " + cat.getName() );
        System.out.println("цвет кошки-> " + cat.getColour());
        System.out.println("вес кошки-> " + cat.getWeight());
        cat.eat();

        System.out.println("--------------------------------");

        Parrot parrot =new Parrot();
        parrot.setName("Шерри");
        parrot.setColour("зеленый,желтый");
        parrot.setBreed("Ара");
        System.out.println("имя попугая-> " + parrot.getName());
        System.out.println("свет попугая-> " + parrot.getColour());
        System.out.println("Порода попугая-> " + parrot.getBreed());
        parrot.repeat();
        parrot.fly();

        System.out.println("-----------------------------------");

        Fish fish=new Fish();
        fish.setBreed("Морская камбала");
        fish.setWeight(5);
        fish.setLength(40);
        System.out.println("порода рыбы -> " + fish.getBreed());
        System.out.println("вес рыбы-> " + fish.getWeight());
        System.out.println("длина рыбы->" + fish.getLength());
        fish.speedFish();
        fish.eat();

        System.out.println("klseufbj");
    }
}

