import java.sql.Date;

class Manager implements ManagerInterface{
    private String ManagerID;
    private String ManagerPassword;
    private String ManagerFirstName;
    private String ManagerLastName;
    private int age;
    private char gender;
    private Date DateOfBirth; //placeholder datatype

    public Manager(String ManagerID, String managerPassword, String managerFirstName, String managerLastName, int age, char gender, int year, int month, int day){
        this.ManagerID = ManagerID;
        this.ManagerPassword = managerPassword;
        this.ManagerFirstName = managerFirstName;
        this.ManagerLastName = managerLastName;
        this.age = age;
        this.gender = gender;
        setDateOfBirth(year, month, day);
    }

    public void setDateOfBirth(int year, int month, int day){
	Date dob = new Date(year, month, day);
	this.DateOfBirth = dob;
	}

	@Override
    public void addEmployee(){}

    @Override
    public void removeEmployee(){}

    @Override
    public void listEmployees(){}

    @Override
    public void searchEmployees(){}

    @Override
    public void addContainer(){}

    @Override
    public void editContainerInfo(){}

    @Override
    public void removeContainer(){}

    @Override
    public void listContainer(){}

    @Override
    public void searchContainers(){}

    @Override
    public void searchOrders(){}

    @Override
    public void listOrders(){}
}