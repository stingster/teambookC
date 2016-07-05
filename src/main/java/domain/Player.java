package domain;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Player
{

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private GregorianCalendar birthday;
	private int age;
	private String departament;
	private String gender;
	private List<Category> categories;

	public synchronized String getFirstName()
	{
		return firstName;
	}

	public synchronized void setFirstName(String firstName) throws InvalidRegexExpressionException
	{
		Pattern p = Pattern.compile("[a-zA-Z]{3, 15}");
		Matcher m = p.matcher(firstName);
		if (m.matches())
		{
			this.firstName = firstName;
		}
		else
		{
			throw new InvalidRegexExpressionException();
		}
	}

	public synchronized String getLastName()
	{
		return lastName;
	}

	public synchronized void setLastName(String lastName) throws InvalidRegexExpressionException
	{
		Pattern p = Pattern.compile("[a-zA-Z]{3, 15}");
		Matcher m = p.matcher(lastName);
		if (m.matches())
		{
			this.lastName = lastName;
		}
		else
		{
			throw new InvalidRegexExpressionException();
		}
	}

	public synchronized String getEmail()
	{
		return email;
	}

	public synchronized void setEmail(String email) throws InvalidRegexExpressionException
	{
		Pattern p = Pattern.compile("([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})");
		Matcher m = p.matcher(email);
		if (m.matches())
		{
			this.email = email;
		}
		else
		{
			throw new InvalidRegexExpressionException();
		}
	}

	public synchronized String getPassword()
	{
		return password;
	}

	public synchronized void setPassword(String password) throws InvalidRegexExpressionException
	{
		Pattern p = Pattern.compile("([a-zA-Z0-9@*#]{8,15})");
		Matcher m = p.matcher(email);
		if (m.matches())
		{
			this.password = password;
		}
		else
		{
			throw new InvalidRegexExpressionException();
		}
	}

	public synchronized GregorianCalendar getBirthday()
	{
		return birthday;
	}

	public synchronized void setBirthday(GregorianCalendar birthday)
	{
		this.birthday = birthday;
		setAge(birthday);
	}

	public synchronized int getAge()
	{
		return age;
	}

	private synchronized void setAge(GregorianCalendar birthday)
	{
		if (birthday != null)
		{
			long birthdayToMillis = birthday.getTimeInMillis();
			long epoch = new Date().getTime();
			long ageInMillis = epoch - birthdayToMillis;
			this.age = (int) (((ageInMillis / 1000) / 3600) / 24) / 365;
		}
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
