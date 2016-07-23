/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apkmeasurer.other;

import java.util.Collections;

/**
 *
 * @author zword
 */
public class Data {
    public static String [] opcode = {
        "nop","move","move/from16","move/16","move-wide",
        "move-wide/from16","move-wide/16","move-object","move-object/from16","move-object/16",
        "move-result","move-result-wide","move-result-object","move-exception","return-void",
        "return","return-wide","return-object","const/4","const/16",
        "const","const/high","const-wide/16","const-wide/32","const-wide",
        "const-wide/high16","const-string","const-string-jumbo","const-class","monitor-enter",
        "monitor-exit","check-cast","instance-of","array-length","new-instance",
        "new-array", "filled-new-array" , "filled-new-array-range","fill-array-data","goto",
        "goto/16","goto/32", "packed-switch" , "sparse-switch" , "cmpl-float",
        "cmpg-float","cmpl-double" , "cmpg-double" , "cmp-long" , "if-eq",
        "if-ne" , "if-lt" , "if-ge" , "if-gt" , "if-le" ,
        "if-eqz" , "if-nez" , "if-ltz" , "if-gez" , "if-gtz",
        "if-lez" , "unused_3E" , "unused_3F" ,"unused_40" , "unused_41" ,
        "unused_42" , "unused_43" , "aget" ,"aget-wide" ,"aget-object",
        "aget-boolean", "aget-byte" , "aget-char" , "aget-short" , "aput",
        "aput-wide" , "aput-object" , "aput-boolean" , "aput-byte" , "aput-char",
        "aput-short", "iget" , "iget-wide" , "iget-object" , "iget-boolean",
        "iget-byte" , "iget-char" , "iget-short" , "iput", "iput-wide",
        "iput-object" , "iput-boolean" , "iput-byte" , "iput-char" , "iput-short" ,
        "sget" , "sget-wide" , "sget-object" , "sget-boolean" , "sget-byte" ,
        "sget-char" , "sget-short" , "sput" , "sput-wide" , "sput-object" ,
        "sput-boolean" , "sput-byte" , "sput-char" , "sput-short" , "invoke-virtual",
        "invoke-super" , "invoke-direct" , "invoke-static" , "invoke-interface" , "unused_73" ,
        "invoke-virtual/range" , "invoke-super/range" , "invoke-direct/range" , "invoke-static/range" , "invoke-interface-range",
        "unused_79" , "unused_7A" , "neg-int" , "not-int" , "neg-long" ,
        "not-long" , "neg-float" , "neg-double" , "int-to-long" , "int-to-float",
        "int-to-double" , "long-to-int" , "long-to-float" , "long-to-double" , "float-to-int" ,
        "float-to-long" , "float-to-double" , "double-to-int" , "double-to-long" , "double-to-float",
        "int-to-byte" , "int-to-char" , "int-to-short" , "add-int" , "sub-int",
        "mul-int" , "div-int" , "rem-int" , "and-int" , "or-int",
        "xor-int" , "shl-int" , "shr-int" , "ushr-int" , "add-long" ,
        "sub-long" , "mul-long" , "div-long" , "rem-long" , "and-long" ,
        "or-long" , "xor-long" , "shl-long" , "shr-long" , "ushr-long" ,
        "add-float" , "sub-float" , "mul-float" , "div-float" , "rem-float" ,
        "add-double" , "sub-double" , "mul-double" , "div-double" , "rem-double",
        "add-int/2addr" , "sub-int/2addr" ,"mul-int/2addr", "div-int/2addr" , "rem-int/2addr",
        "and-int/2addr" , "or-int/2addr" , "xor-int/2addr" , "shl-int/2addr" , "shr-int/2addr" ,
        "ushr-int/2addr" , "add-long/2addr" , "sub-long/2addr" , "mul-long/2addr" , "div-long/2addr" ,
        "rem-long/2addr" , "and-long/2addr" , "or-long/2addr" , "xor-long/2addr" , "shl-long/2addr" ,
        "shr-long/2addr" , "ushr-long/2addr" , "add-float/2addr" , "sub-float/2addr" , "mul-float/2addr" , 
        "div-float/2addr" , "rem-float/2addr" , "add-double/2addr" , "sub-double/2addr" , "mul-double/2addr" ,
        "div-double/2addr" , "rem-double/2addr" , "add-int/lit16" , "sub-int/lit16" , "mul-int/lit16" ,
        "div-int/lit16" , "rem-int/lit16" , "and-int/lit16" , "or-int/lit16" , "xor-int/lit16" ,
        "add-int/lit8" , "sub-int/lit8" , "mul-int/lit8" , "div-int/lit8" , "rem-int/lit8" ,
        "and-int/lit8" , "or-int/lit8" , "xor-int/lit8" , "shl-int/lit8" , "shr-int/lit8" ,
        "ushr-int/lit8" , "execute-inline" , "invoke-direct-empty" , "iget-quick" , "iget-wide-quick",
        "iget-object-quick" , "iput-quick" , "iput-wide-quick" , "iput-object-quick" , "invoke-virtual-quick",
        "invoke-virtual-quick/range" , "invoke-super-quick" , "invoke-super-quick/range"  
        
    }; 
    
    public static String [] library = {
        "android", "butterknife" , "google" , "crashlytics" , "io"
    };
    
    public static String[] Backread(String array[]){
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}