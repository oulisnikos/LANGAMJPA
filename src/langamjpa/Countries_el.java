/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package langamjpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author oulis
 */
@Entity
public class Countries_el implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String alpha_2;
    private String alpha_3;

    public Countries_el() {
        this.id = 0;
        this.name = null;
        this.alpha_2 = null;
        this.alpha_3 = null;
    }

    public Countries_el(int id, String name, String alpha_2, String alpha_3) {
        super();
        this.id = id;
        this.name = name;
        this.alpha_2 = alpha_2;
        this.alpha_3 = alpha_3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlpha_2() {
        return alpha_2;
    }

    public void setAlpha_2(String alpha_2) {
        this.alpha_2 = alpha_2;
    }

    public String getAlpha_3() {
        return alpha_3;
    }

    public void setAlpha_3(String alpha_3) {
        this.alpha_3 = alpha_3;
    }
    
}
