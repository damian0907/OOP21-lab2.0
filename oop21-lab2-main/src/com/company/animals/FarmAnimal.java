package com.company.animals;

public class FarmAnimal extends Animal implements Edible {
    public double oldweight;

    @Override
    public double eat() {
        if(this.weight > 0.0) {
            this.oldweight = this.weight;
            this.weight = 0.0;
        }
        else if (this.weight <= 0.0)
        {
            System.out.println("Animal cannot be eaten");
        }
        return this.oldweight;
    }

    public FarmAnimal(String species) {
        super(species);
    }
}




