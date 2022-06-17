package in.cg.DI1;

public class Student1 {
	
	//Dependancy Injection In Terms Of Objects
	MathCheat m;
	
	public void setM(MathCheat m) {
		this.m = m;
	}

	public void cheating()
	{
		m.mathcheat();
	}

}
