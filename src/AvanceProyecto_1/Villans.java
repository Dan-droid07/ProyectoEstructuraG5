/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvanceProyecto_1;

/**
 *
 * @author mayor
 */
public class Villans {

    private String villanName;
    private int villanId;

    public String getVillanName() {
        return villanName;
    }

    public void setVillanName(String villanName) {
        this.villanName = villanName;
    }

    public int getVillanId() {
        return villanId;
    }

    public void setVillanId(int villanId) {
        this.villanId = villanId;
    }

    public Villans(String villanName, int villanId) {
        this.villanName = villanName;
        this.villanId = villanId;
    }

}
