package servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServicoLogin extends Remote {
	
		String login(String username, String password) throws RemoteException;
}
