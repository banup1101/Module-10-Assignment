package org.example;

public class Main {
    public static void main(String[] args) {
        //GarmentFactory professionalfactory = new ProfessionalGarmentFactory();
        //GarmentFactory casualfactory = new CasualGarmentFactory();
        //GarmentFactory partyfactory = new PartyGarmentFactory();
        GarmentFactory fact = new ProfessionalGarmentFactory();

        /*Generic */
        Top top = fact.createTop();
        Pants pants = fact.createPants();
        Shoes shoes = fact.createShoes();

        /*Professional Garment Factory
        Top professionaltop = professionalfactory.createTop();
        Pants professionalpants = professionalfactory.createPants();
        Shoes professionalshoes = professionalfactory.createShoes();
         */

        /*Casual Garment Factory
        Top casualtop = casualfactory.createTop();
        Pants casualpants = casualfactory.createPants();
        Shoes casualshoes = casualfactory.createShoes();
         */

        /*Party Garment Factory
        Top partytop = partyfactory.createTop();
        Pants partypants = partyfactory.createPants();
        Shoes partyshoes = partyfactory.createShoes();
         */

        /*
        Top, Pants, and Shoes all have a method called getInfo() which will return what kind of garment that is from whichever factory we are looking for
         */


        /*
        getInfo basically is a method thats basically a print statement for each kind of clothing. We have seperate classes for all of them. All these separate
        classes for each piece of clothing implements either the Top, Pants, or Shoes interfaces
         */


        System.out.println("Top: " + top.getInfo() + "\n" + "Pants: " + pants.getInfo() + "\n" + "Shoes: " + shoes.getInfo() + "\n");

        /*
        System.out.println("Professional Top: " + professionaltop.getInfo() + "\n" + "Professional Pants: " + professionalpants.getInfo() + "\n" + "Professional Shoes: " + professionalshoes.getInfo() + "\n");
        System.out.println("Casual Top: " + casualtop.getInfo() + "\n" + "Casual Pants: " + casualpants.getInfo() + "\n" + "Casual Shoes: " + casualshoes.getInfo() + "\n");
        System.out.println("Party Top: " + partytop.getInfo() + "\n" + "Party Pants: " + partypants.getInfo() + "\n" + "Party Shoes: " + partyshoes.getInfo() + "\n");
        */

    }
}