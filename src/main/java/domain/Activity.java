package domain;

enum Dificulty
{
	GRADE_A(5), GRADE_B(10), GRADE_C(15);

	private int grade;

	Dificulty(int grade)
	{
		this.grade = grade;
	}
	public int getGrade()
	{
		return this.grade;
	}
}

public class Activity
{
	private String description;
	private Dificulty dificulty;
	private boolean isChecked;
	
	
	
	
}
