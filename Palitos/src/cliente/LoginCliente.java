package cliente;

import java.rmi.Naming;

import servidor.IServicoLogin;
import utils.Constantes;

public class LoginCliente {
	
	public static boolean login(String user, String senha)
	{
		System.setSecurityManager(new SecurityManager());
		try {
			IServicoLogin obj = (IServicoLogin) Naming.lookup("//localhost/login");
			String result = obj.login(user, senha);
			if(result.equals(Constantes.SUCCES))
			{
				return true;
			}
			
		}
		
		catch ( Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}
