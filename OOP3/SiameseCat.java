package OOP.Inheritance;

public class SiameseCat extends Cat {
    public String hair;


    protected SiameseCat(String breed, String sex, double age, boolean neutered, String meow, boolean scratch, String hair) {
        super(breed, sex, age, neutered, meow, scratch);
        this.setBreed(breed);
        this.setSex(sex);
        this.setAge(age);
        this.setNeutered(neutered);
        this.setMeow(meow);
        this.setScratch(scratch);
        this.hair = hair;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    void scratchesAfterMoew() {
        if (this.meow == "mjau!!!") {
            this.scratch = true;
            System.out.println("Me unhappy.");
        } else {
            this.scratch = false;
        }
    }

    public void shortHair() {
        if (this.hair == "short") {
            System.out.println("Siamese cats have short hair");
        }
    }
}
