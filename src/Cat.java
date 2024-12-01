public class Cat extends Animals {

    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " ran " + distance + "m");
        } else {
            System.out.println(name + " can't ran " + distance + "m");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim");
        System.out.println("-------------------");
    }

    public static int getCatCount() {
        return catCount;
    }
}