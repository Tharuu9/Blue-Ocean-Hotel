public class AddCustomer {

    private String CustName;
    private String CustId;
    private String CustAddress;
    private String ContactNumber;
    private String CustEmail;


    public AddCustomer(String CustName, String CustId, String CustAddress, String ContactNumber, String CustEmail) {
        this.CustName = CustName;
        this.CustId = CustId;
        this.CustAddress = CustAddress;
        this.ContactNumber = ContactNumber;
        this.CustEmail = CustEmail;
    }
    public AddCustomer() {
    }

    public void setCustName(String custName) {
    }

    public void setCustAddress(String custAddress) {
    }

    public void setContactNumber(String contactNumber) {
    }

    public void setCustId(String custId) {
        CustId = custId;
    }

    public void setCustEmail(String text) {
    }
    public String getCustName() {
        return CustName;
    }

    public String getCustEmail() {
        return CustEmail;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public String getCustAddress() {
        return CustAddress;
    }

    public String getCustId() {
        return CustId;
    }
}