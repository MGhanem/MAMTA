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
public class Noun {

    static int numberOfDefinedAgents = 0;
    static int numberOfDefinedTasks = 0;

    public static void changeHemogenious(int HemoLevel) {
        Agent.reconfigHemo(HemoLevel);
        Task.reconfigHemo(HemoLevel);
    }
    String Name;
    static byte Hemogenious = -1; // -1:unknownYet, 0:AllHemo, 1:Groups, 2:AllHetero

    public static byte getHemogeniousValue() {
        return Hemogenious;
    }

    public static void setHemogenious(int i) {
        Hemogenious = (byte) i;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Property> getProperties() {
        return Properties;
    }

    public void setProperties(ArrayList<Property> Properties) {
        this.Properties = Properties;
    }

    public ArrayList<Verb> getActions() {
        return Actions;
    }

    public void setActions(ArrayList<Verb> Actions) {
        this.Actions = Actions;
    }

    int id; // -ve:Task, +ve:Agent.
    ArrayList<Property> Properties;
    ArrayList<Verb> Actions;
}
