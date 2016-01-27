/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modules;

import java.util.ArrayList;

/**
 *
 * @author M Ghanem
 */
public class Verb {
    static int numberOfActions;

    String Name;
    boolean Valid;
    ArrayList<RequiredProperty> RequiredProperties;
    boolean RequiredPropertiesInArrange;
    ArrayList<RequiredNoun> ActWith;
    ArrayList<RequiredNoun> ActOn;

}
