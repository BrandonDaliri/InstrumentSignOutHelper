/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author 070029319
 */
public class Instrument {

    private int barcode;//barcode of instrument
    private String name;//name of instrument
    private int quantity;//number of x instrument being signed out
    public Instrument(String ID, String na){
        barcode = Integer.parseInt(ID);
        name = na;
    }
    

    /**
     * @return the barcode
     */
    public int getBarcode() {
        return barcode;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    public String toString(){
        return name + ", " + barcode + ", " + quantity;
    }

    /**
     * @param barcode the barcode to set
     */
    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
