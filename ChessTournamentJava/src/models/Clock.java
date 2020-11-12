/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author George.Pasparakis
 */
public class Clock extends Naming {

    private int timer = 600;

    public int time(Game game) {

        timer -= 15;

        return (timer);
    }
}
