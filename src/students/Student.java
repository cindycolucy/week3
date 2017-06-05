package students;

public class Student {
	public String id;
	public String name;
	


	public Student (){
	}
	
	public Student (String id, String nameParam){
		this.id = id; //referencing the instance variable
		name = nameParam;
	}
	@Override
	public String toString(){
		return "Student with id: " + id + ", name: " + name;
	}

}
