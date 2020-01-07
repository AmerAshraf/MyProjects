package Entity;

import company_sql.tools;
import javax.swing.JTable;

public class WorkOn implements mainData{

    private int EmpNo;
    private int ProjectNo;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public int getProjectNo() {
        return ProjectNo;
    }

    public void setProjectNo(int ProjectNo) {
        this.ProjectNo = ProjectNo;
    }

    
    
    @Override
    public void add() {
        String strInsert = "insert into workon values("
                + EmpNo + ","
                + ProjectNo + ")";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msg("Workon is added..");
        }
    }

    @Override
    public void update() {
        tools.msg("Update method not available in WorkOn class");
    }

    @Override
    public void delete() {
        String strDelete = "delete from WorkOn "+
                "where EmpNo= " + EmpNo
                +" and "
                +" ProjectNo= " + ProjectNo;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msg("Workon is deleted..");
        }
    }

    @Override
    public String getAutoNumber() {
        tools.msg("GetAutoNumber method not available in WorkOn class");
        return "";
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("WorkOn_Data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from WorkOn_Data where"
                + " Employee_NO=" + EmpNo
                + " and Project_NO=" + ProjectNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        tools.msg("getValueByName method not available in WorkOn class");
        return "";
    }

    @Override
    public String getNameByValue(String value) {
        tools.msg("getNameByValue method not available in WorkOn class");
        return "";
    }
    
    
    
}
