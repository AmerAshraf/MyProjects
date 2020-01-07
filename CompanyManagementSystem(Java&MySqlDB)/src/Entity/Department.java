package Entity;

import company_sql.tools;
import javax.swing.JTable;

public class Department implements mainData{
    private int DeptNO;
    private String DeptName;
    private String Location;

    public int getDeptNO() {
        return DeptNO;
    }

    public void setDeptNO(int DeptNO) {
        this.DeptNO = DeptNO;
    }

    public String getDeptName() {
        return DeptName;
    }

    public void setDeptName(String DeptName) {
        this.DeptName = DeptName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    @Override
    public void add() {
        String strInsert = "insert into department values("
                + DeptNO + ","
                + "'" + DeptName + "' ,"
                + "'" + Location + "')" ;
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msg("department is added");
        }
    }

    @Override
    public void update() {
        String strUpdate = "update department set "
                + "DeptName='" + DeptName + "' , "
                + "Location='" + Location + "' " 
                + "where DeptNo=" + DeptNO;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
            tools.msg("department is updated");
        }
    }

    @Override
    public void delete() {
        String strDelete = "delete from department where DeptNo = "
                + DeptNO;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msg("department is deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("department", "DeptNO");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("department_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from department_data where department_no= "
                + DeptNO;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select deptno from department where deptname='"
                + name + "'";
        String strVal = (String)db.go.getTableData(strSelect).item[0][0];
        return  strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String strSelect = "select deptname from department where deptno="
                + value ;  
        String strName = (String) db.go.getTableData(strSelect).item[0][0];
        return strName;
    }
    
    
}
