package OOP.Inheritance;

public class Cat extends Animal {
    protected String meow;
    protected boolean scratch;

    protected Cat (String breed, String sex, double age, boolean neutered, String meow, boolean scratch){
        this.setBreed(breed);
        this.setSex(sex);
        this.setAge(age);
        this.setNeutered(neutered);
        this.meow = meow;
        this.scratch = scratch;
    }

    protected String getMeow() {
        return meow;
    }

    protected void setMeow(String meow) {
        this.meow = meow;
    }

    public boolean isScratch() {
        return scratch;
    }

    public void setScratch(boolean scratch) {
        this.scratch = scratch;
    }

    void saysMeow(){
    System.out.println("When hungry, this cat says " + meow);
}


}
