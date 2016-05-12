package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServicoLogin extends UnicastRemoteObject implements IServicoLogin{

	protected ServicoLogin() throws RemoteException {
		super();
		
	}

	private static final long serialVersionUID = 6378034504789806452L;

	@Override
	public String login(String username, String password) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
