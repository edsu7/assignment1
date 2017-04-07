/*
 *Written by Edmund Su on 2017-02-10
 *BIF812
 *Student #: 104699160
 *For Assignment 1 : Part A #6 - Testing MiniGenBankSeq
 *

 
I declare that the attached assignment is my own work in accordance with Seneca Academic
Policy. No part of this assignment has been copied manually or electronically from any other
source (including web sites) or distributed to other students.
Edmund Su 104699160 
 */
public class UseMiniGeneBankSeq {

    public static void main(String[] args) {
        
        /* 
         * Makes 3 instances using no argument version,2 argument version and full argument version
         */
        MiniGenBankSeq sequence1= new MiniGenBankSeq();
        MiniGenBankSeq sequence2= new MiniGenBankSeq("AY725868 2123 bp DNA linear PLN 26-JUL-2016","AY725868");
        MiniGenBankSeq sequence3= new MiniGenBankSeq("AY725869 2115 bp DNA linear PLN 26-JUL-2016","AY725869","chloroplast Aucuba japonica","Aucuba japonica NADH dehydrogenase subunit F (ndhF) gene, partialcds; chloroplast");
        
        //Prints current status of sequence1 
        System.out.println("Sequence 1 : No arguement");
        System.out.println(sequence1.toString());
        System.out.println();
      
        /*Using setter methods,initializes variables
         * To Demonstrate getter methods inability to accept null arguments an example is shown.
         */
        sequence1.setLocus("null");
        sequence1.setAccession("");
        sequence1.setSource(null);
        sequence1.setDefinition("Hydrangea sp. JS-2005 NADH dehydrogenase subunit F (ndhF) gene,partial cds; chloroplast.");
        
        //Prints re-initialized variables of sequence1 
        System.out.println("Sequence 1 : Arguements added");
        System.out.println(sequence1.toString());
        System.out.println();
        
        //Prints current status of sequence2
        System.out.println("Sequence 2 : Locus & Accession");
        System.out.println(sequence2.toString());
        System.out.println();
        
        //Sets the two missing variables of sequence2
        sequence2.setSource("chloroplast Cornus sericea");
        sequence2.setDefinition("Cornus sericea NADH dehydrogenase subunit F (ndhF) gene, partial cds; chloroplast.");
        
        //Prints updated version of sequence2
        System.out.println("Sequence 2 : Arguements added");
        System.out.println(sequence2.toString());
        System.out.println();
        
        //Demonstrates current status of sequence3
        System.out.println("Sequence 3 : Everything");
        System.out.println(sequence3.toString());
        System.out.println();
       
    }

}
