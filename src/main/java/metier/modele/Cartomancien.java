/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier.modele;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Alexis
 */
@Entity
public class Cartomancien extends Medium implements Serializable {

    public Cartomancien() {
    }

    public Cartomancien(String denomination, String presentation, String genre) {
        super(denomination, presentation, genre);
    }

    @Override
    public String toString() {
        return super.toString()+"Cartomancien{" + '}';
    }

    

       
    
}
