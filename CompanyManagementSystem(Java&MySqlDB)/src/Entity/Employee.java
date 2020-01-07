package Entity;

import company_sql.tools;
import javax.swing.JTable;

public class Employee implements mainData{
    
    private int EmpNo;
    private String EmpName;
    private String Address;
    private double Salary;
    private String HiringDate;
    private String BirthDate;
    private int DeptNo;

    
    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    public String getHiringDate() {
        return HiringDate;
    }

    public void setHiringDate(String HiringDate) {
        this.HiringDate = HiringDate;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    
    
    @Override
    public void add() {
        String strInsert = "insert into employee values (" 
                + EmpNo + ","
                + "'"+ EmpName +"',"
                +"'"+ Address +"',"
                + Salary 
                + ",'"+ HiringDate + "',"
                + "'" + BirthDate + "',"
                + DeptNo + ")";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msg("Employee Is Added");
        }
    }

    @Override
    public void update() {
        String strUpdate = "update employee set "
                + "EmpName='" + EmpName + "',"
                + "Address='" + Address + "',"
                + "Salary=" + Salary + ","
                + "HiringDate='" + HiringDate + "',"
                + "BirthDate='" + BirthDate + "',"
                + "DeptNO=" + DeptNo 
                + " where EmpNO=" + EmpNo;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
            tools.msg("employee is updated");
        }
    }

    @Override
    public void delete() {
        String strDelete = "delete from employee "
                + "where EmpNo=" + EmpNo ;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msg("employee is deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("employee", "EmpNO");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("employee_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from employee_data"
                + " where Number=" + EmpNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select EmpNO from employee" 
                + " where EmpName='" + name + "'";
        String strVal = db.go.getTableData(strSelect).item[0][0].toString(); // [0][0]  mean the first row and column because the first row and column is empno (select "EmpNO" from employee)
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select EmpName from employee"
                + " where EmpNO=" + value ;
        String strName = db.go.getTableData(strSelect).item[0][0].toString();
        return strName;
    }
    
    
}
