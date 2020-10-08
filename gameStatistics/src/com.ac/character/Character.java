package com.ac.character;

public class Character {
    private static String name;

    public Character(){

    }

    public Character(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }
}
