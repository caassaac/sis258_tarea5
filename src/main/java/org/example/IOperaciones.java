package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IOperaciones extends Remote {
    public String Fibonacci(int n) throws RemoteException;
    public int Summation(int n) throws RemoteException;
    public long Factorial(int n) throws RemoteException;
}
