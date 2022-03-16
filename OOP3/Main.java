package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {


    Dog newDog = new Dog("Labrador", "male", 0.5, true, "black");
    Cat newCat = new Cat("100 % authentic stray cat", "female", 3, true, "mjauuuuu", true);
    SiameseCat newSiameseCat = new SiameseCat("Siamese", "male", 10, false, "mjau!!!", true, "long");

newDog.isBlack();
newDog.isPuppy();
newDog.hasBeenNeutered();
        System.out.println("\n");

newCat.saysMeow();
        System.out.println("\n");

newSiameseCat.longHair();
newSiameseCat.scratchesAfterMoew();
newSiameseCat.theBreedIs();


}
}
