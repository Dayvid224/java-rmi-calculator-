public interface Calculator
extends java.rmi.Remote {
public float add(float a, float b)
throws java.rmi.RemoteException;
public float sub(float a, float b)
throws java.rmi.RemoteException;
public float mul(float a, float b)
throws java.rmi.RemoteException;
public float div(float a, float b)
throws java.rmi.RemoteException;
}
