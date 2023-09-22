public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bringer of Destruction", 2, 3.2);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat(":3", 7, 3.33);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
