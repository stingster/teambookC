package ro.ea.ja.teambook.domain;

import ro.ea.ja.teambook.RoleAccessManager.EraserRole;
import ro.ea.ja.teambook.controller.*;

public class PlayerManager extends Player
{

	private EraserRole eraserRole;
	
	public PlayerManager(){
		eraserRole = new Controller();
	}

	public synchronized EraserRole getManager()
	{
		return eraserRole;
	}

	public synchronized void setManager(EraserRole manager)
	{
		this.eraserRole = manager;
	}
	
	
	
}
