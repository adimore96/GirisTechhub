import java.util.*;
public class InstituteClientApplication{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Course c1[] = new Course[3];
		Enquiry e1[] = new Enquiry[4];
		Course course = new Course();
		Batch b1 = new Batch();
		boolean loopStatus = true;
		
		while(loopStatus){
			System.out.println("1:Add new course\n2:Take Enquiry\n3:Enroll for admission\n4:Allocate Batch\n5:View all courses\n6:View course wise students\n7:View batch wise students\n8:View all enquiry\n9:View all Admission\n10:View cancel enquiry\n11:Exit");
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			switch(ch){
				case 1:{
					
		
		System.out.println("============Enter Course Details===========");
		for(int i=0; i<c1.length; i++){
			c1[i] = new Course();
			System.out.print("Enter CID: ");
			c1[i].setCId(sc.nextInt());
			System.out.print("Enter COurse Name: ");
			c1[i].setName(sc.next());
			System.out.print("Enter Duration: ");
			c1[i].setDuration(sc.nextInt());
			System.out.print("Enter Fees: ");
			c1[i].setFees(sc.nextInt());
		}
		System.out.println("===========================================");
					
						break;
				}
				
				
				case 2:{
				System.out.println("========================Enter Enquiry Details========================");
		
		for(int i=0; i<e1.length; i++){
				System.out.println("-----------------------Available Course------------------------------");
			System.out.println("ID\tName\tDuration\tFees");
			for(Course c:c1){				
				System.out.println(c.getCId()+"\t"+c.getName()+"\t"+c.getDuration()+"\t\t"+c.getFees());
			}
				System.out.println("---------------------------------------------------------------------");
			System.out.println("=======Enter Student "+(i+1)+" Details================");
			e1[i] = new Enquiry();
			System.out.print("Enter Student ID: ");
			int id = sc.nextInt();
			e1[i].setId(id);
			System.out.print("Enter Name: ");
			String name = sc.next();
			e1[i].setName(name);
			System.out.print("Enter Email: ");
			String email = sc.next();
			e1[i].setEmail(email);
			System.out.print("Enter Contact: ");
			int contact = sc.nextInt();
			e1[i].setContact(contact);
			System.out.print("Enter Edu: ");
			String edu = sc.next();
			e1[i].setEdu(edu);
			System.out.print("Enter Status: ");
			boolean status = sc.nextBoolean();
			e1[i].setStatus(status);
			System.out.print("Enter Cource ID: ");
			int cid = sc.nextInt();
			int index = course.checkCourseID(cid, c1);
			if(index>=0){
				e1[i].setCourse(c1[index]);
			}else{
				System.out.print("Enter Valid course ID: ");
				 cid = sc.nextInt();
				e1[i].setCourse(c1[index]);
			}
		}
		System.out.println("==============================================");
					
						break;
				}
				
				
				
				case 3:{
					
							//Enroll for admission
		System.out.println("=============Enroll for Admission==================");
		System.out.println("---------------All Enquiry-------------");
		
		for(Enquiry e:e1){
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEdu()+"\t"+e.getStatus()+"\t"+e.getCourse());
		}
		System.out.println("---------------------------------------");
		
		System.out.print("Enter Enquiry Id: ");
		int eId = sc.nextInt();
		for(Enquiry e:e1){
			if(e.getId() == eId){
				e.setStatus(true);
				System.out.println(e.getName()+" Your Adission is Confirmed for "+(e.getCourse()).getName());
				break;
			}
		}
		System.out.println("==============================================");
					
						break;
				}
				
				case 4:{
					
							//Allocate Batch
		System.out.println("============= Allocate Batch ==================");
		
		b1.setBId(5001);
		b1.setStartDate("1 Jan 24");
		b1.setExpectedDate("6 July 24");
		b1.setBatchName("Sept JavaDev");
		System.out.println("===============Available Course===============");
		System.out.println("ID\tName\tDuration\tFees");
			for(Course c:c1){				
				System.out.println(c.getCId()+"\t"+c.getName()+"\t"+c.getDuration()+"\t\t"+c.getFees());
			}
		System.out.println("-----------------------------------------------");
		System.out.print("Enter Course ID: ");
		int cId = sc.nextInt();
		int index = course.checkCourseID(cId, c1);
		if(index>=0){
			b1.setCourse(c1[index]);
			b1.setEnquiry(e1, c1[index]);
		}else{
			System.out.print("Enter Correct Course Id: ");
			cId = sc.nextInt();
			index = course.checkCourseID(cId, c1);
			b1.setCourse(c1[index]);
			b1.setEnquiry(e1, c1[index]);
		}
		//Batch Details
		System.out.println("==============Batch Details=================");
		System.out.println("BID\tB Name\t\tStart Date\tEnd Date\tCourse");
		System.out.println(b1.getBId()+"\t"+b1.getBatchName()+"\t"+b1.getStartDate()+"\t"+b1.getExpectedDate()+"\t"+b1.getCourse().getName());
		//Students Enrolled in Batch:
		System.out.println("===========List of Students Enrolled in this Batch========");
		for (Enquiry e : b1.getAdmissions()) {
    if (e != null) {
        String courseName = (e.getCourse() != null) ? e.getCourse().getName() : "No course";
        System.out.println(e.getId() + "\t" + e.getName() + "\t" + courseName + "\t" + e.getContact() + "\t" + e.getEmail() + "\t" + e.getStatus());
    } else {
        System.out.println("Null Enquiry object found.");
    }
}
		System.out.println("==============================================");
						break;
				}
				
				case 5:{
					
							//View All Courses
		System.out.println("===============All Course===============");
			System.out.println("ID\tName\tDuration\tFees");
			for(Course c:c1){				
				System.out.println(c.getCId()+"\t"+c.getName()+"\t"+c.getDuration()+"\t\t"+c.getFees());
			}
		System.out.println("==============================================");
						break;
				}
				
				case 6:{
							//Course wise Students
		System.out.println("============Course wise Students==============");
		
		for(int i=0; i<c1.length; i++){
			System.out.println("---------"+c1[i].getName()+"------------");
			for(Enquiry e:e1){
				if(e.getStatus() == true && e.getCourse().getCId() == c1[i].getCId()){
					System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEdu()+"\t"+e.getStatus()+"\t"+e.getCourse());
				}
			}
			System.out.println("----------------------------------------");
		}
		System.out.println("==============================================");
					
						break;
				}
				
				case 7:{
							//Batch wise students
		System.out.println("===========Batch wise Students=================");
		for(Enquiry e: b1.getAdmissions()){
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getCourse().getName()+"\t"+e.getContact()+"\t"+e.getEmail()+"\t"+e.getStatus());
		}
		System.out.println("==============================================");
						break;
				}
				
				case 8:{
							//Show all enquiry
		System.out.println("===============Show all Enquiry===============");
		for(Enquiry e:e1){
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEdu()+"\t"+e.getStatus()+"\t"+e.getCourse());
		}
		System.out.println("==============================================");
					
						break;
				}
				
				case 9:{
							//View all Admission
		System.out.println("===============Show all Admission===============");
		for(Enquiry e:e1){
		if(e.getStatus() == true){
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEdu()+"\t"+e.getStatus()+"\t"+e.getCourse());
		}
		}
		System.out.println("==============================================");
						break;
				}
				
				case 10:{
							//View Cancel Admission
		System.out.println("===============Show Cancel Enquiry===============");
		for(Enquiry e:e1){
		if(e.getStatus() != true){
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getEmail()+"\t"+e.getContact()+"\t"+e.getEdu()+"\t"+e.getStatus()+"\t"+e.getCourse());
		}
		}
		System.out.println("==============================================");
						break;
				}
				
				case 11:{
					System.out.println("See you again...!");
					loopStatus = false;
					break;
				}
				
				default :{
					System.out.println("Enter valid Choice: ");
					break;
				}
			}
			
		}
		
		
		

	}
}