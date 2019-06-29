
public class Student implements Comparable<Student>{
	
	int id;
	
	Student(int id){
		
		this.id=id;
	}

	@Override
	public int compareTo(Student o) {
		
			if(id==o.id) {
				
				return 0;
			}
			else if (id<o.id) {
				return -1;
			}
			else {
				return 1;
			}
	}

	
	
}
