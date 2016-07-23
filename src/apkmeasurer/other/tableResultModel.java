/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.other;

/**
 *
 * @author zulfikar
 */
public class tableResultModel {
    String nameApk1;
    String nameApk2;
    int similarity;
    
    public tableResultModel(String nameApk1 , String nameApk2 ,int similarity){
        this.nameApk1 = nameApk1;
        this.nameApk2 = nameApk2;
        this.similarity = similarity;
        
    }

    public String getNameApk1() {
        return nameApk1;
    }

    public String getNameApk2() {
        return nameApk2;
    }

    public int getSimilarity() {
        return similarity;
    }
    
    
}
