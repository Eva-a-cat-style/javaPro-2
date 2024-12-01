public class Dog extends Animals {

    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " run " + distance + "m");
        } else {
            System.out.println(name + " can't ran " + distance + "m" +
                    " all because of his paws :(");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10) {
            System.out.println(name + " swam " + distance + "m");
            System.out.println("-------------------");
        } else {
            System.out.println(name + " can't swam " + distance + "m " +
                    "Just remember about his paws!");
            System.out.println("-------------------");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}