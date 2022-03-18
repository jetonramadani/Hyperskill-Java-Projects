
class Cat {

    // write static and instance variables
    private static int counter = 0;
    String name;
    int age;

    public Cat(String name, int age) {
        final int five = 5;
        counter++;
        this.name = name;
        this.age = age;
        if (counter > five) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }
}