package domain;

import accessRolesManager.ReaderRole;
import accessRolesManager.RoleMethodsIndex;

public class PlayerEmployee extends Player
{

	private ReaderRole employee;

	public PlayerEmployee()
	{
		employee = new RoleMethodsIndex();
	}

	public synchronized ReaderRole getEmployee()
	{
		return employee;
	}

	public synchronized void setEmployee(ReaderRole employee)
	{
		this.employee = employee;
	}

}
