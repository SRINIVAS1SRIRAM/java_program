import java.util.*;
class GetSet{
    private double empid, empsalary;
    private String empname;
    
    public double getEmpId(){
        return empid;
    }
    public void setEmpId(double empid){
        this.empid=(empid>0)?empid:-empid;
    }
    public double getEmpSalary(){
        return empsalary;
    }
    public void setEmpSalary(double empsalary){
        this.empsalary=(empsalary>0)?empsalary:-empsalary;
    }
    public String getEmpName(){
        return empname;
    }
    public void setEmpName(String empname){
        this.empname=empname;
    }
}
class GetSetEmp{
    public static void main(String arg[]){
        GetSet gs = new GetSet();
        gs.setEmpId(100);
        gs.setEmpName("Sri");
        gs.setEmpSalary(10000);
        System.out.println("EmpId" + gs.getEmpId());
        System.out.println("EmpName" + gs.getEmpName());
        System.out.println("EmpSalary" + gs.getEmpSalary());
        
    }
}