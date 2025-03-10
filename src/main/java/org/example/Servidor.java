package org.example;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {

    public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {
        Operaciones operaciones = new Operaciones();
        LocateRegistry.createRegistry(1099);
        Naming.bind("Operaciones", operaciones);
        System.out.println("Servidor activo...");
    }
}
