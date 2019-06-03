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
public class enumex {
//bucky("nice","22"),
//mali("avb","21"),
//abc('here','45');
//
//private final String desc;
//private final String year;
//
//enumex(String description,String age){
//desc =description;
//year=age;
//}
    private String fname;
    private String sname;
    private static int members=0;
    
    public enumex(String a,String b){
    fname=a;
    sname=b;
    members++;
    System.out.printf("construnctor for %s %s,members in the club :%d\n", fname,sname,members);
    }
}
