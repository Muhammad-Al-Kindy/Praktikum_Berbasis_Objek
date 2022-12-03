package kindy.percobaan1Sampai4;

public class InternshipEmployee extends Employee{
    private int length;

    public InternshipEmployee(String name, int length){
        this.name = name;
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    @Override
    public String getEmployeeeInfo(){
        String info = super.getEmployeeeInfo()+"\n";
        info += "Registered as internship employee for "+length+" month/s\n";
        return info;
    }
}
