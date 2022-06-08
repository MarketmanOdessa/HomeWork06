package HomeWork06;

public class Subscriber {
    private int id;
    private String Surname;
    private String Name;
    private String MiddleName;
    private String City;
    private String PhoneNumber;
    private String ContractNumber;
    private double Balance;
    private int min;
    private int intercityMin;
    private double InternetTrafficGb;

    public Subscriber(int id, String surname, String name, String middleName, String city, String phoneNumber, String contractNumber, double balance, int min, int intercityMin, double internetTrafficGb) {
        this.id = id;
        Surname = surname;
        Name = name;
        MiddleName = middleName;
        City = city;
        PhoneNumber = phoneNumber;
        ContractNumber = contractNumber;
        Balance = balance;
        this.min = min;
        this.intercityMin = intercityMin;
        InternetTrafficGb = internetTrafficGb;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setContractNumber(String contractNumber) {
        ContractNumber = contractNumber;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setIntercityMin(int intercityMin) {
        this.intercityMin = intercityMin;
    }

    public void setInternetTrafficGb(double internetTrafficGb) {
        InternetTrafficGb = internetTrafficGb;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return Surname;
    }

    public String getName() {
        return Name;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getCity() {
        return City;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getContractNumber() {
        return ContractNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public int getMin() {
        return min;
    }

    public int getIntercityMin() {
        return intercityMin;
    }

    public double getInternetTrafficGb() {
        return InternetTrafficGb;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", Surname='" + Surname + '\'' +
                ", Name='" + Name + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", City='" + City + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", ContractNumber='" + ContractNumber + '\'' +
                ", Balance=" + Balance +
                ", min=" + min +
                ", intercityMin=" + intercityMin +
                ", InternetTrafficGb=" + InternetTrafficGb +
                '}';
    }
}
