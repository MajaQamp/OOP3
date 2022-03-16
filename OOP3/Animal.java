package OOP.Inheritance;

public abstract class Animal {
    private String breed;
    private String sex;
    private Double age;
    private boolean neutered=false;


    protected String getBreed() {
        return breed;
    }

    protected void setBreed(String breed) {
        this.breed = breed;
    }

    protected String getSex() {
        return sex;
    }

    protected void setSex(String sex) {
        this.sex = sex;
    }

    protected Double getAge() {
        return age;
    }

    protected void setAge(Double age) {
        this.age = age;
    }

    protected boolean isNeutered() {
        return neutered;
    }

    protected void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    protected void hasBeenNeutered() {
        if (this.neutered) {
            System.out.println("This animal has not been neutered.");
        }else {
            System.out.println("This animal has been neutered.");
            }
    }

    protected void theBreedIs(){
        System.out.println("The breed of this animal is" + getBreed());
    }
    }

