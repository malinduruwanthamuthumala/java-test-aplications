/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Malindu
 */
import java.util.Random;
public class freq {
public void frequency(){
Random rand=new Random();
int freq[]=new int[7];

for(int i=1;i<1000;i++){
    ++freq[1+rand.nextInt(6)];
}
System.out.println("Face\tfreequency");
for(int j=1;j<freq.length;j++){
    System.out.println(j+"\t"+freq[j]);
}
}
}
