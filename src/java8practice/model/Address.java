package java8practice.model;

class Address{
    private String zipcode;
 
    public Address(String zipcode) {
        this.zipcode = zipcode;
    }
 
    public String getZipcode() {
        return zipcode;
    }
 
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

	@Override
	public String toString() {
		return "Address [zipcode=" + zipcode + "]";
	}
    
}