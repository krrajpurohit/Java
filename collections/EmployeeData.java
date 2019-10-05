
import java.util.*;

public class EmployeeData {

	LinkedHashMap<String, Integer> employeeHashMap = new LinkedHashMap<String, Integer>();
	String[] SplittedArrayByNewLine;
	String[] temp;

	public void splitEmployeeData(String employeeData) {

		SplittedArrayByNewLine = employeeData.split("\n");

		for (int i = 0; i < SplittedArrayByNewLine.length; i++) {
			temp = SplittedArrayByNewLine[i].split(" ");
			employeeHashMap.put(temp[0], (Integer.valueOf(temp[1])));
		}
	}

	public void printHashMap() {

		Set Keys = employeeHashMap.keySet();
		Iterator iterator = Keys.iterator();

		while (iterator.hasNext()) {

			String name = iterator.next().toString();
			int salary = employeeHashMap.get(name);
			if(salary>=200 && salary<=300) {
				System.out.println("name= " + name + " salary= " + salary);
			}
			

		}

	}

	public static void main(String args[]) {
		EmployeeData test = new EmployeeData();
		test.splitEmployeeData("EMPLOYEE1 100\nEMPLOYEE2 200\nEMPLOYEE3 300\nEMPLOYEE4 220\nEMPLOYEE5 150\nEMPLOYEE5 270\n");
		test.printHashMap();
	}

}
