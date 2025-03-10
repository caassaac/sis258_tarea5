package org.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Operaciones extends UnicastRemoteObject implements IOperaciones {

    protected Operaciones() throws RemoteException {
        super();
    }

    @Override
    public String Fibonacci(int n) throws RemoteException {
        if (n <= 0) return "";

        StringBuilder sequence = new StringBuilder();
        int a = 0, b = 1;

        sequence.append(a);
        if (n > 1) sequence.append(", ").append(b);

        for (int i = 2; i < n; i++) {
            int next = a + b;
            sequence.append(", ").append(next);
            a = b;
            b = next;
        }

        return sequence.toString();
    }

    @Override
    public int Summation(int n) throws RemoteException {
        return (n * (n + 1)) / 2;
    }

    @Override
    public long Factorial(int n) throws RemoteException {
        if (n == 0) return 1;
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
