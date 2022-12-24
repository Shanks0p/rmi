package rmiint;
import java.rmi.Remote;
import java.rmi.RemoteException;


/**
 *
 * @author gveda
 */
public interface RMIInterface extends Remote
{
    public int add(int x,int y) throws RemoteException;
}
