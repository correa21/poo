package com.ac.view;

import com.ac.player.*;
import com.ac.character.*;

public class Game{
    public static void main(String[] args) {
    Player p1 = new Player("Armando","gradak");
    p1.setBestScore(1234567890);
    System.out.println(p1.getName());
    System.out.println(p1.getNickName());
    System.out.println(p1.getBestScore());
    }
}
