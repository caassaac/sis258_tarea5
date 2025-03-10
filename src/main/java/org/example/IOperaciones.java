package org.example;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IOperaciones extends Remote {
    String Fibonacci(int n) throws RemoteException;
    int Summation(int n) throws RemoteException;
    long Factorial(int n) throws RemoteException;
}
