package java8practice.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

/* Solve below problems using java 8
 * 1.Get student with exact match name "jayesh"
 * 2.Get student with matching address "1235"
 * 3.Get all student having mobile numbers 3333.
 * 4.Get all student having mobile number 1233 and 1234
 * 5.Create a List<Student> from the List<TempStudent>
 * 6.Convert List<Student> to List<String> of student name
 * 7.Convert List<students> to String
 * 8.Change the case of List<String>
 * 9.Sort List<String>
 * 10.Conditionally apply Filter condition, say if flag is enabled then
 */
public class Solution {

	public static void main(String args[]) {
	    Student student1 = new Student(
	            "Jayesh",
	            20,
	            new Address("1234"),
	            Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
	 
	        Student student2 = new Student(
	            "Khyati",
	            20,
	            new Address("1235"),
	            Arrays.asList(new MobileNumber("1111"), new MobileNumber("3333"), new MobileNumber("1233")));
	 
	        Student student3 = new Student(
	            "Jason",
	            20,
	            new Address("1236"),
	            Arrays.asList(new MobileNumber("3333"), new MobileNumber("4444")));
	 
	        List<Student> students = Arrays.asList(student1, student2, student3);
		
	        students.forEach(s -> System.out.println(s.toString()));
	        
	        System.out.println("-----------Solutions Start-----------");
	        
	        System.out.println("-----------Solution 1 Start-----------");
	        //Solution 1
	        Optional<Student> stujayesh = students.stream().filter(student -> student.getName().equals("Jayesh")).findFirst();
	        
	        System.out.println(stujayesh.isPresent() ? stujayesh:"not found ");
	        System.out.println("-----------Solution 1 End-----------");
	        
	        System.out.println("-----------Solution 2 Start-----------");
	        //Solution 2
	        Optional<Student> stuaddr = students.stream().filter(student -> student.getAddress().getZipcode().equals("1235"))
	        		                    .findFirst();
	        System.out.println(stuaddr.isPresent() ? stuaddr:"not found ");
	        System.out.println("-----------Solution 2 End-----------");
	        
	        
	        System.out.println("-----------Solution 3 Start-----------");
	        //Solution 3
	        List<Student> stud2 = students.stream()
	                .filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "3333")))
	                .collect(Collectors.toList());
	     
	              String result1 = stud2.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
	              System.out.println(result1);
	        System.out.println("-----------Solution 3 End-----------");
	        
	        
	        System.out.println("-----------Solution 4 Start-----------");
	        //Solution 4
	        List<Student> stud23 = students.stream()
	                .filter(student111 -> student111.getMobileNumbers().stream().anyMatch(x -> Objects.equals(x.getNumber(), "1234")
	                		||  Objects.equals(x.getNumber(), "1234")))
	                .collect(Collectors.toList());
	     
	              String result2 = stud23.stream().map(std -> std.getName()).collect(Collectors.joining(",", "[", "]"));
	              System.out.println(result1);
	        System.out.println("-----------Solution 4 End-----------");
	        
	        
	        System.out.println("-----------Solution 5 Start-----------");
	        //Solution 5
	        /*****************************************************
	         Create a List<Student> from the List<TempStudent>
	        *****************************************************/
	        TempStudent tmpStud1 = new TempStudent(
	            "Jayesh1",
	            201,
	            new Address("12341"),
	            Arrays.asList(new MobileNumber("12331"), new MobileNumber("12341")));
	 
	        TempStudent tmpStud2 = new TempStudent(
	            "Khyati1",
	            202,
	            new Address("12351"),
	            Arrays.asList(new MobileNumber("11111"), new MobileNumber("33331"), new MobileNumber("12331")));
	 
	        List<TempStudent> tmpStudents = Arrays.asList(tmpStud1, tmpStud2);
	        
	        List<Student> stutemp = tmpStudents.stream()
	        		.map(tempStu -> new Student(tempStu.name ,tempStu .age, tempStu.address, tempStu.mobileNumbers))
	        		.collect(Collectors.toList());
	        System.out.println(stutemp);
	        System.out.println("-----------Solution 5 End-----------");
	        
	        
	        
	        System.out.println("-----------Solution 6 Start-----------");
	        //Solution 6
	        List<String> lstname = students.stream()
	        		.map(stu -> stu.getName()).collect(Collectors.toList());
	        System.out.println(lstname);
	        System.out.println("-----------Solution 6 End-----------");
	        
	        
	        
	        System.out.println("-----------Solution 7 Start-----------");
	        //Solution 7
	        String name = students.stream()
	                .map(Student::getName)
	                .collect(Collectors.joining(",", "[", "]"));
	            System.out.println(name);
	        System.out.println("-----------Solution 7 End-----------");
	        
	        
	        System.out.println("-----------Solution 8 Start-----------");
	        //Solution 8
	        List<String> nameList =
	                Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
	     
	            nameList.stream()
	                .map(String::toUpperCase)
	                .forEach(System.out::println);
	        System.out.println("-----------Solution 8 End-----------");
	        
	        
	        System.out.println("-----------Solution 9 Start-----------");
	        //Solution 9
	        List<String> namesList =
	                Arrays.asList("Jayesh", "Dany", "Khyati", "Hello", "Mango");
	     
	            namesList.stream()
	                .sorted()
	                .forEach(System.out::println);
	        System.out.println("-----------Solution 9 End-----------");
	        
	        
	        System.out.println("-----------Solution 10 Start-----------");
	        //Solution 10
	        boolean sortConditionFlag = true;
	        
	        Stream<Student> conditionalFilterResult = students.stream()
	            .filter(std -> std.getName().startsWith("J"));
	 
	        if(sortConditionFlag){
	            conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));
	        }
	 
	        System.out.println("Before sorting :");
	        students.forEach(s -> System.out.println(s.getName()));
	 
	        List<Student> list = conditionalFilterResult.collect(Collectors.toList());
	        System.out.println("After filter and conditional sorting :");
	        list.forEach(s -> System.out.println(s.getName()));
	        System.out.println("-----------Solution 10 End-----------");
	        

	}
	
	
}
