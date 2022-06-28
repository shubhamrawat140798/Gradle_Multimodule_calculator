package com.knoldus.Operation;

public class OperationCalculator{
    public void  add(final int x,final int y){
        System.out.println(x+" + "+y+" = "+(x+y));
    }
    public void  sub(final int x,final int y){
        System.out.println(x+" - "+y+" = "+(x-y));
    }
    public void  div(final int x,final int y){
        try{
            System.out.println(x+" / "+y+" = "+(x/y));
        }
        catch (Exception e){
            System.out.println("Exception occur: "+e);
        }
    }
    public void  mul(final int x,final int y){
        System.out.println(x+" X "+y+" = "+(x*y));
    }
}
