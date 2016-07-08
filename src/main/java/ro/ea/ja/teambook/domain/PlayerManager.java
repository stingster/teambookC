package ro.ea.ja.teambook.domain;

import ro.ea.ja.teambook.RoleAccessManager.EraserRole;
import ro.ea.ja.teambook.RoleAccessManager.RoleMethodsIndex;

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
