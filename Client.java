import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client
{
    public static void main(String args[]) throws RemoteException
    {
        Client c = new Client();
        c.connectServer();
    }
    private void connectServer()
    {
        try
        {
            Registry reg = LocateRegistry.getRegistry("localhost",1011);
            Adder a = (Adder) reg.lookup("server");
            System.out.println("Addition is "+a.add(10,20));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}