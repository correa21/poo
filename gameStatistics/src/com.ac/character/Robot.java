package com.ac.character;

public class Robot extends Character{
    private String serialId;

    public Robot(String newSerialId){
        super();
        this.serialId = newSerialId;
    }

    public Robot(String newName,String newSerialId){
        super(newName);
        this.serialId = newSerialId;
    }

    public String getSerialId() {
        return this.serialId;
    }
}
