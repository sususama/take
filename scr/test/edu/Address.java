package test.edu;

public class Address {
    private String homeAddress;
    private  String busiAddress;

    public Address(String homeAddress, String busiAddress, String phone) {
        this.homeAddress = homeAddress;
        this.busiAddress = busiAddress;
        this.phone = phone;
    }

    private String phone;

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getBusiAddress() {
        return busiAddress;
    }

    public void setBusiAddress(String busiAddress) {
        this.busiAddress = busiAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
