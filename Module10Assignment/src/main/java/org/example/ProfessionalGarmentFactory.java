package org.example;

/*
This is the ProfessionalGarmentFactory class. This class implements GarmentFactory
which has a Top, Pants, and Shoes and methods to create them.
All three ProfessionalGarmentFactory, CasualGarmentFactory, and PartyGarmentFactory need to implement GarmentFactory because
they are families of it
 */

public class ProfessionalGarmentFactory implements GarmentFactory{
    /*
    We are overriding the methods from the interface GarmentFactory
     */

    @Override
    public Top createTop(){
        return new professionalTop();
    }

    @Override
    public Pants createPants(){
        return new professionalPants();
    }

    @Override
    public Shoes createShoes(){
        return new professionalShoes();
    }

}
