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
public class Property {

    String Name;
    byte Type; // 0:bool, 1:int, 2:String
    Object Value;
    String meteric;

    public Property(String Name, int Type, Object Value, String meteric) {
        this.Name = Name;
        this.Type = (byte) Type;
        this.Value = Value;
        this.meteric = meteric;
    }

    private static ArrayList<Property> Properties = new ArrayList<Property>();

    public static ArrayList<Property> getProperties() {
        return Properties;
    }

    public byte getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = (byte) Type;
    }

    public Object getValue() {
        return Value;
    }

    public void setValue(Object Value) {
        this.Value = Value;
    }

    public String getMeteric() {
        return meteric;
    }

    public void setMeteric(String meteric) {
        this.meteric = meteric;
    }

    public String getName() {
        return Name;
    }
}
