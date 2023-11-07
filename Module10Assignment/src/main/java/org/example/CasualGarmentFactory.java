package org.example;

/*
This is the CasualGarmentFactory class. This class implements GarmentFactory
which has a Top, Pants, and Shoes and methods to create them.
All three ProfessionalGarmentFactory, CasualGarmentFactory, and PartyGarmentFactory need to implement GarmentFactory because
they are families of it
 */

public class CasualGarmentFactory implements GarmentFactory {
    /*
    We are overriding the methods from the interface GarmentFactory
     */

    @Override
    public Top createTop(){
        return new casualTop();
    }

    @Override
    public Pants createPants(){
        return new casualPants();
    }

    @Override
    public Shoes createShoes(){
        return new casualShoes();
    }


}
