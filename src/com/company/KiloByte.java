package com.company;

public class KiloByte {
    private double kb = 0;

    public KiloByte (double kb) throws Exception {
        if(kb>0){
            this.kb=kb;
        }else{
            System.out.println("There can not be 0 KiloBytes or less in the conversion. Please try another amount.");
            throw new Exception();
        }
    }
    public double getKb(){
        return kb;
    }

    public void setKb (double kb) throws Exception {
        if (kb >= 0) {
            this.kb = kb;
        } else {
            System.out.println("There can not be 0 KiloBytes or less in the conversion. Please try another amount.");
            throw new Exception();
        }
    }

    public static void printMBandKB(double kb) throws Exception{

        if(kb<=0){
            System.out.println("There can not be 0 KiloBytes or less in the conversion. Please try another amount.");
            throw new Exception();
        }

        else if(kb%1024==0){
            System.out.println(kb + " KB = " + kb/1024 + "MB");
        }else{
            System.out.println(kb + " KB = " + kb/1024 + " MB " + " and " + kb%1024 + " KB ");
        }
    }
}
