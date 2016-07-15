package ro.ea.ja.teambook.domain;

import ro.ea.ja.teambook.RoleAccessManager.ReaderRole;
import ro.ea.ja.teambook.controller.*;

public class PlayerEmployee extends Player
{

	private ReaderRole readerRole;

	public PlayerEmployee()
	{
		readerRole = new Controller();
	}

	public synchronized ReaderRole getReaderRole()
	{
		return readerRole;
	}

	public synchronized void setReaderRole(ReaderRole employee)
	{
		this.readerRole = employee;
	}

}
