package com.company;
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

class DictionaryRemote extends UnicastRemoteObject implements dictionary{
    Dictionary<String,String> dict= new Hashtable<>();
    DictionaryRemote() throws RemoteException{
        super();
    }

    public boolean insert(String x,String y) throws RemoteException{
        dict.put(x,y);
        return true;
    }

    public int count()throws RemoteException{
         return dict.size();
    }

    public boolean delete(String x)throws RemoteException{
        return dict.remove(x) != null;
    }
    public String search(String x)throws RemoteException{
        if(dict.get(x)==null)
            return "";
        return dict.get(x);
    }
    public Dictionary<String,String> showContent()throws RemoteException{
        return dict;
    }
}