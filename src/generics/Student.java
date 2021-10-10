package generics;

public class Student {
private String strName;
private String strMobNo;
private String strDepartment;
public String getStrName() {
	return strName;
}
Student()
{
	
}
Student( String strName,String strMobNo,String strDepartment)
{
	this.strName=strName;
	this.strMobNo=strMobNo;
	this.strDepartment=strDepartment;
	
}
public void setStrName(String strName) {
	this.strName = strName;
}
public String getStrMobNo() {
	return strMobNo;
}
public void setStrMobNo(String strMobNo) {
	this.strMobNo = strMobNo;
}
public String getStrDepartment() {
	return strDepartment;
}
public void setStrDepartment(String strDepartment) {
	this.strDepartment = strDepartment;
}

}
