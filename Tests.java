class FirstYear
{
	void branch()
	{
		System.out.println("CSE");
	}
	void subjects()
	{
		System.out.println("C PYTHON MATHS PHYSICS");
	}
	void backlogs()
	{
		System.out.println("PHYSICS");
	}
}
class SecondYear
{
	void subjects()
	{
		FirstYear f1=new FirstYear();
		f1.branch();
		f1.backlogs();
		System.out.println("JAVA DS DBMS");
	}
}
class Tests
{
	public static void main(String args[])
	{
		SecondYear S1=new SecondYear();
		S1.subjects();
    }
}

	