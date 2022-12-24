import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Adder
{
    public Server() throws RemoteException
    {
        super();
    }
    public int add(int x,int y) throws RemoteException
    {
        return x+y;
    }
    public static void main(String args[]) throws RemoteException
    {
        Registry reg = LocateRegistry.createRegistry(1011);
        reg.rebind("server",new Server());
        System.out.println("server is running");
    }
}