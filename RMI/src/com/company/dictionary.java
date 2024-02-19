package com.company;

import java.rmi.*;
import java.util.Dictionary;

interface dictionary extends Remote{
    public boolean insert(String x,String y) throws RemoteException;
    public int count()throws RemoteException;
    public boolean delete(String x)throws RemoteException;
    public String search(String x)throws RemoteException;
    public Dictionary<String,String> showContent()throws RemoteException;
}