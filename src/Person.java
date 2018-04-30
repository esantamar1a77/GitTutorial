
public class Person {
	private String name;
	private int age;
	private long id;
	private String Eyecolor;

	
	public Person (String name, int age, long id, String Eyecolor) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.Eyecolor=Eyecolor;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getEyecolor() {
		return Eyecolor;
	}


	public void setEyecolor(String eyecolor) {
		Eyecolor = eyecolor;
	}
	
	
	}


