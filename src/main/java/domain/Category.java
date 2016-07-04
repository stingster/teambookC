package domain;

import java.util.List;

enum Type{
	HEALTH,
	SOCIAL,
	TECH,
	SELFDEV
}

public class Category
{
	private int stars;
	private Type type;
	private List<Activity> activities;
	private int noOfActions;

	private int computeStars()
	{
		
		
		
		return 0; // implementare aici
	}

	public int getStars()
	{
		return 0; // implementare in subclasa
	}

}
