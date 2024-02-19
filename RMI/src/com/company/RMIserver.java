package com.company;
import java.rmi.*;
import java.rmi.registry.*;
class RMIServer{
    public static void main(String args[]){
        try{
            dictionary stub=new DictionaryRemote();
            Registry rgsty = LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://localhost:5000/add",stub);
        }catch(Exception e){System.out.println(e);}
    }
}