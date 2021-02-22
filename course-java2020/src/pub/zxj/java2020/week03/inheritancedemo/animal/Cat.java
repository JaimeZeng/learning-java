package pub.zxj.java2020.week03.inheritancedemo.animal;

/**
 * 小猫类 Cat
 *
 * @author Jaime
 * @project_name learning-java
 */
public class Cat extends Animal {
    /**
     * 体重 weight
     */
    private double weight;

    public Cat() {
    }

    public Cat(String name, int month, String species, double weight) {
        super(name, month, species);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getSpecies() + " species " + this.getName() + " is running~");
    }
}
