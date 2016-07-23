/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.other;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author zword
 */
public class Gram {

    int k;
    List<String> gram;

    public Gram(int k, List<String> gram) {
//        System.out.println("Create a gram");
        this.k = k;
        this.gram = gram;
    }
    
    
    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public List<String> getGram() {
        return gram;
    }

    public void setGram(List<String> gram) {
        this.gram = gram;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gram other = (Gram) obj;
        if (this.k != other.k) {
            return false;
        }
        if (!Objects.equals(this.gram, other.gram)) {
            return false;
        }
        return true;
    }
    
    
    
}
