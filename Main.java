class SuperDepartment{
	
	String departmentName() {
		return "Super Department";
	}
	
	String getTodaysWork() {
		return "No Work as of now";
	}
	
	String  getWorkDeadline() {
		return "Nil";
	}
	
	String isTodayAHoliday() {
		return "Today is not a holiday";
	}
	
	
}

class AdminDepartment extends SuperDepartment{
	String departmentName() {
		return "Admin Department";
	}
	String  getTodaysWork() {
		return "Complete your documents Submission";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
}

class HrDepartment extends AdminDepartment{
	String departmentName() {
		return "Hr Department ";
	}
	String  getTodaysWork() {
		return "Fill today’s worksheet and mark your attendance";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	String doActivity() {
		return "team Lunch";
	}

}

class TechDepartment extends HrDepartment{
	String departmentName() {
		return "Tech Department  ";
	}
	String  getTodaysWork() {
		return "Complete coding of module 1";
	}
	String getWorkDeadline() {
		return "Complete by EOD";
	}
	String  getTechStackInformation() {
		return "core Java";
	}
	
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/// Admin Department
		AdminDepartment AD = new AdminDepartment();
		System.out.println("Welcome to "+ AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		System.out.println();
		System.out.println();		
		HrDepartment HD = new HrDepartment();
		/// Head Department
		System.out.println("Welcome to "+ HD.departmentName());
		System.out.println(HD.doActivity());
		System.out.println(HD.getTodaysWork());
		System.out.println(HD.getWorkDeadline());
		System.out.println(HD.isTodayAHoliday());
		System.out.println();
		System.out.println();
		/// Tech Department
		TechDepartment TD = new TechDepartment();
		System.out.println("Welcome to "+ TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(TD.isTodayAHoliday());
		
		 
	}
	
}
