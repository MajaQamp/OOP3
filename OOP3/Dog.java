package OOP.Inheritance;

public class Dog extends Animal {
private String colour;

public Dog (String breed, String sex, double age, boolean neutered, String colour){
        this.setBreed(breed);
        this.setSex(sex);
        this.setAge(age);
        this.setNeutered(neutered);
        this.colour = colour;
        }

public String getColour() {
        return colour;
        }

public void setColour(String colour) {
        this.colour = colour;
        }



public void isPuppy() {
        if (this.getAge()<1){
        System.out.println("This dog is a puppy.");
        }
        }

public void isBlack() {
        setColour("black");
        System.out.println("This dog is black.");
        }




}
