package servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;

public class ServidorMain {

	public ServidorMain() throws RemoteException
	{
		super();
	}
	
	public static void main(String[] args) {
		try
		{
			System.setSecurityManager(new SecurityManager());
			ServicoLogin sl = new ServicoLogin();
			Naming.rebind("//localhost/login", sl);
			System.out.println("Servifor iniciado");
		}
		catch (Exception e)
		{
			System.out.println("Falha ao iniciar o servidor " + e);
		}

	}

}
