package xxentity;

public class Department implements Comparable<Department> {
	int departmentID;
	String departmentName;
	
	Department(){
		
	}
	
	Department(String departmentName){
		this.departmentID = 0;
	}
		
	@Override
	public String toString() {
		String result = "";
		
		result += departmentID +"\n";
		result += departmentName;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null){
			return false;
		}
		Department other = (Department) obj;
		if(departmentName.equals(other.departmentName)) {
			return true;
		}
		
		return false;
	}

	@Override
	public int compareTo(Department other) {
		// TODO Auto-generated method stub
		if(other == null) {
			return -1;
		}
		String[] thisDe = departmentName.split(" ");
		String[] otherDe = other.departmentName.split(" ");
		char de1Char = 'a';
		if(thisDe[thisDe.length-1].charAt(0) > 90) {
			de1Char =(char) (thisDe[thisDe.length -1].charAt(0) -32);
		}else {
			de1Char = thisDe[thisDe.length -1].charAt(0);
		}
		char de2Char ='a';
		if(otherDe[otherDe.length-1].charAt(0) > 90) {
			de2Char =(char) (otherDe[otherDe.length -1].charAt(0) -32);
		}else {
			de2Char = otherDe[otherDe.length -1].charAt(0);}

		if(de1Char > de2Char) {
			return 1;
		}else if(de1Char < de2Char) {
			return -1;
		}
		
//		if(departmentName.charAt(0) > other.departmentName.charAt(0)) {
//			return 1;
//		}else if(departmentName.charAt(0) < other.departmentName.charAt(0)) {
//			return -1;
//		}
		
		return 0;
	}
	
}
