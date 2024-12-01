public class Animals {
    protected String name;

    protected static int animalCount = 0;

    public Animals(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        System.out.println(name + " ran " + distance + "m");
    }


    public void swim(int distance) {
        System.out.println(name + " swam " + distance + "m");
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}