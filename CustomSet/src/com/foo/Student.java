package com.foo;

public class Student implements Comparable<Student> {
    int rollNo;
    String name;
    
    public Student() {}
    public Student(int rollNo,String name) 
    {
    	this.rollNo=rollNo;
    	this.name=name;
    }
    public String toString()
    {
           return (String)(rollNo + " "+name);
    }
    
    @Override
    public int compareTo(Student s) {
           if(this.rollNo==s.rollNo && this.name.equals(s.name))
           {
                  return 0;
           }
                  
           else if(this.rollNo<s.rollNo) {  
                  return 1;
           }
           
           else  {   
                  return -1;
           }
    }
    @Override
    public boolean equals(Object o) {
    	if (o == this) { 
            return true; 
        } 
  
        /* Check if o is an instance of Complex or not 
          "null instanceof [type]" also returns false */
        if (!(o instanceof Student)) { 
            return false; 
        } 
          
        // typecast o to Complex so that we can compare data members  
        Student c = (Student) o; 
          
        // Compare the data members and return accordingly  
        if(c.compareTo(this)==0)
        {return true;}
        return false;
    
    }
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

