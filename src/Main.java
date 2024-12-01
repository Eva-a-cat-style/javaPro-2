public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kit-Cat");
        Cat cat2 = new Cat("Cleocatra");

        Dog dog1 = new Dog("Just a chill dog");
        Dog dog2 = new Dog("Dachshund");

        cat1.run(50);  //  Пробіг 50 м
        cat1.swim(0);  // Не вміє плавати
        cat2.run(20);  // Пробіг 20 м
        cat2.swim(0);  // Не вміє плавати

        dog1.run(150);  // Пробіг 150 м
        dog1.swim(8);   // Проплив 8 м
        dog2.run(550);  // Не зміг пробігти 550 м
        dog2.swim(30);  // Не зміг проплити 30 метрів


        System.out.println("Cat count: " + Cat.getCatCount());
        System.out.println("Dog count: " + Dog.getDogCount());
        System.out.println("Animals count: " + Animals.getAnimalCount());
    }
}