class Student{
	private String id;
    private String name;
    private String department;
    private float cgpa;
	Student(){
	    name =" ";
		id =" ";
		department = " ";
		cgpa = 0.0f;
	}
	Student(String name,String id,String department,float cgpa){
		this.name =name;
		this.id =id;
		this.department = department;
		this.cgpa= cgpa;
	}
	void showInfo(){
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("department: "+department);
		System.out.println("cgpa: "+cgpa);
		
	}
	void setName(String name){
        this.name =name;
    }
    void setId(String id){
        this.id =id;
    }
	void setDepartment(String department){
        this.department =department;
    }
	void setCgpa(float cgpa){
	    this.cgpa = cgpa;
	}
	String getName(){
        return name;
    }
    String getId(){
        return id;
    }
	String getDepartment(){
        return department;
    }
	float getCgpa(){
	    return cgpa;
	}
	
	public static void main(String args[]){
		Student obj1 = new Student();
		obj1.setId("14-34234-2");
		obj1.showInfo();
		
		Student obj2 = new Student("RAIYAN","14-28958-1","CSE",2.75f);
		
		obj2.showInfo();
		obj2.setId("15-28958-1");
		System.out.println(obj2.getId());
       		
	}
	
}
