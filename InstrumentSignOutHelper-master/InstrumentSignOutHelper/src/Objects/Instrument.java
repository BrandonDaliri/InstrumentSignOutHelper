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
    private String date;//date the item needs to be returned by
    public Instrument(String ID, int n, String d){
        barcode = Integer.parseInt(ID);
        quantity = n;
        date = d;
        checkName();
    }
    
    public void checkName(){
        //parameters for determining instrument name based off barcode
        name = "Guitar";
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
}
