package xxentity;

import java.util.Comparator;

public class ComparatorDepartmentName implements Comparator<Department>{

	@Override
	public int compare(Department de1, Department de2) {
		// TODO Auto-generated method stub
		if(de1 == null) {
			return -1;
		}
		if(de2 == null) {
			return 1;
		}			
		return de1.compareTo(de2);
	}

}
