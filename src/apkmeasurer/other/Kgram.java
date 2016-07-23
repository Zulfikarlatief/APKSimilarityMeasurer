/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.other;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zword
 */
public class Kgram {
    
    List<Gram> kgram = new ArrayList<Gram>();
    public ArrayOpcode arrOp;
    int k;
    int gramCount;
    
    public Kgram(Kgram kgram){
        
        
    }
    
    public Kgram(ArrayOpcode arr, int k){

        this.arrOp = arr;
        this.k = k;
        
        procces();
    }
    
    //pake 
    private void procces(){
        
        List<String> temp = new ArrayList<String>();
        int size = arrOp.getArrOpcode().size();
        for(int i=0;i<size-(k-1);i++){
            for(int j=0;j<k;j++){
                temp.add(arrOp.getArrOpcode().get(i+j));
            }
            kgram.add(new Gram(k,temp));
            temp = new ArrayList<String>();
        }
        
    }

    public List<Gram> getKgram() {
        return kgram;
    }

    
    public int getGramCount(){
        int count=0;
        for(Gram gram:this.kgram){
            count++;
        }
        return count;
    }
    
    public String getName() {
        return arrOp.getName();
    }
    
}
