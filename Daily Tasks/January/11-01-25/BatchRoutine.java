class BatchRoutine{
	private BatchRoutine(){
		System.out.print("Hello");
	}
	
	
	//get topper method
	public static void getTopper(Batch batch){
		int marks=batch.s[0].getAcademicPer(),id=0;
		for(int i=1; i<batch.s.length; i++){
			if(marks < batch.s[i].getAcademicPer()){
				marks = batch.s[i].getAcademicPer();
				id = i;
			}
		}
		
		System.out.println("Name: "+batch.s[id].getName());
		System.out.println("Academic Per: "+marks);
	}
	
	
	//get defaulter method
	public static Student[] getDebar(Batch b){
		
		int sSize=0;
		for(Student s1: b.s){
			if(s1.getAttendancePer() < 65){
				sSize++;
			}
		}
		
		Student s[] = new Student[sSize];
		for(int i=0,j=0; i<b.s.length; i++){
			if(b.s[i].getAttendancePer()<65){
				s[j] = new Student();
				s[j].setName(b.s[i].getName());
				s[j].setAttendancePer(b.s[i].getAttendancePer());
				j++;
			}
		}
		
		return s;
		
	}
	
	//get AboveAvgAttendance method
	public static Student[] getConsistentStudent(Batch b){
		
		int sSize=0;
		for(Student s1: b.s){
			if(s1.getAttendancePer() >= 65){
				sSize++;
			}
		}
		
		Student s[] = new Student[sSize];
		for(int i=0,j=0; i<b.s.length; i++){
			if(b.s[i].getAttendancePer() >= 65){
				s[j] = new Student();
				s[j].setName(b.s[i].getName());
				s[j].setAttendancePer(b.s[i].getAttendancePer());
				j++;
			}
		}
		return s;
		
	}
	
	//get getSameMarksStudents method
	public static Student[] getSameMarksStudents(Batch b){
		
		int sSize=0;
		for(int i=0; i<b.s.length-1; i++){
			if(b.s[i].getAcademicPer() == b.s[i+1].getAcademicPer()){
				sSize++;
			}
		}
		
		Student s[] = new Student[sSize];
		for(int i=0,j=0; i<b.s.length-1; i++){
			if(b.s[i].getAcademicPer() == b.s[i+1].getAcademicPer()){
				s[j] = new Student();
				s[j].setName(b.s[i].getName());
				s[j].setAcademicPer(b.s[i].getAcademicPer());
				j++;
			}
		}
		return s;
		
	}
	
}