package org.example;

/*
This is the PartyGarmentFactory class. This class implements GarmentFactory
which has a Top, Pants, and Shoes and methods to create them.
All three ProfessionalGarmentFactory, CasualGarmentFactory, and PartyGarmentFactory need to implement GarmentFactory because
they are families of it
 */

public class PartyGarmentFactory implements GarmentFactory {
    /*
    We are overriding the methods from the interface GarmentFactory
    */

    @Override
    public Top createTop(){
        return new partyTop();
    }

    @Override
    public Pants createPants(){
        return new partyPants();
    }

    @Override
    public Shoes createShoes(){
        return new partyShoes();
    }
}
