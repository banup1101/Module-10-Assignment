package org.example;

//Abstract Factory Design Pattern
//Every kind of clothes (Professional, Casual, Party needs their own Factory
public interface GarmentFactory {
    Top createTop();
    Pants createPants();
    Shoes createShoes();
}
