package domain;

import java.util.Date;
import java.util.List;

public abstract class Player
{
	
	private String firstName;
	private String lastname;
	private String email;
	private String password;
	private Date birthday;
	private int age;
	private String departament;
	private String gender;
	private List<Category> categories;
	
	public synchronized String getFirstName()
	{
		return firstName;
	}
	public synchronized void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public synchronized String getLastname()
	{
		return lastname;
	}
	public synchronized void setLastname(String lastname)
	{
		this.lastname = lastname;
	}
	public synchronized String getEmail()
	{
		return email;
	}
	public synchronized void setEmail(String email)
	{
		this.email = email;
	}
	public synchronized String getPassword()
	{
		return password;
	}
	public synchronized void setPassword(String password)
	{
		this.password = password;
	}
	public synchronized Date getBirthday()
	{
		return birthday;
	}
	public synchronized void setBirthday(Date birthday)
	{
		this.birthday = birthday;
	}
	public synchronized int getAge()
	{
		return age;
	}
	public synchronized void setAge(int age)
	{
		this.age = age;
	}
	public synchronized String getDepartament()
	{
		return departament;
	}
	public synchronized void setDepartament(String departament)
	{
		this.departament = departament;
	}
	public synchronized String getGender()
	{
		return gender;
	}
	public synchronized void setGender(String gender)
	{
		this.gender = gender;
	}
	public synchronized List<Category> getCategories()
	{
		return categories;
	}
	public synchronized void setCategories(List<Category> categories)
	{
		this.categories = categories;
	}

	
	
}
