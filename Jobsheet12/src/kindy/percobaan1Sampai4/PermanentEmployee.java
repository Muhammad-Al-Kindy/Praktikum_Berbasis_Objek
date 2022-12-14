package kindy.percobaan1Sampai4;
public class PermanentEmployee extends Employee implements Payable{
    private int salary;

    public PermanentEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public int getPaymentAmount(){
        return (int)(salary+0.05*salary);
    }
    @Override
    public String getEmployeeeInfo(){
        String info = super.getEmployeeeInfo()+"\n";
        info += "Registered as permanent employee for "+salary+" month/s\n";
        return info;
    }
}
