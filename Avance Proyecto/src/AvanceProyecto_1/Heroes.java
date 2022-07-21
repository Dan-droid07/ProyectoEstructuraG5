/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AvanceProyecto_1;

/**
 *
 * @author mayor
 */
public class Heroes {

    private String heroName;
    private int heroId;

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public Heroes(String heroName, int heroId) {
        this.heroName = heroName;
        this.heroId = heroId;
    }
    
}
