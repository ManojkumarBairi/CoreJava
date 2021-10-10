package java8practice.model;

import java.util.List;

class TempStudent {
    public String name;
    public int age;
    public Address address;
    public List<MobileNumber> mobileNumbers;
 
    public TempStudent(String name, int age, Address address, List<MobileNumber> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.mobileNumbers = mobileNumbers;
    }

	@Override
	public String toString() {
		return "TempStudent [name=" + name + ", age=" + age + ", address=" + address + ", mobileNumbers="
				+ mobileNumbers + "]";
	}
    
    
}