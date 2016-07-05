package domain;

import accessRolesManager.EraserRole;
import accessRolesManager.RoleMethodsIndex;

public class PlayerManager extends Player
{

	private EraserRole manager;
	
	public PlayerManager(){
		manager = new RoleMethodsIndex();
	}

	public synchronized EraserRole getManager()
	{
		return manager;
	}

	public synchronized void setManager(EraserRole manager)
	{
		this.manager = manager;
	}
	
	
	
}
