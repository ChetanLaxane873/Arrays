
public class Student
{
	
	int rno;
	String name;
	int mrks;
	
	public Student(int rno, String name, int mrks) {
		super();
		this.rno = rno;
		this.name = name;
		this.mrks = mrks;
	}
	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMrks() {
		return mrks;
	}

	public void setMrks(int mrks) {
		this.mrks = mrks;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", mrks=" + mrks + "]";
	}
	
	
}
