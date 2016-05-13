package persistencia;

import utils.Constantes;

public class UserDAOMock implements IUserDAO {

	@Override
	public String login(String username, String password) {
		if (username.equals("user") && password.equals("pass"))
		{
		return Constantes.SUCCES;
		}
		else
		{
			return Constantes.FAIL;
		}
	}

}
