package Entity;

import company_sql.tools;
import javax.swing.JTable;


public class Project implements mainData{
    private int ProjectNo;
    private String ProjectName;
    private String Location;
    private int DeptNo;

    public int getProjectNo() {
        return ProjectNo;
    }

    public void setProjectNo(int ProjectNo) {
        this.ProjectNo = ProjectNo;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getDeptNo() {
        return DeptNo;
    }

    public void setDeptNo(int DeptNo) {
        this.DeptNo = DeptNo;
    }

    @Override
    public void add() {
        String strInsert = "insert into project values("
                + ProjectNo 
                + " ,' " + ProjectName + " ', "
                + "'" + Location + "' ,"
                + DeptNo + ")";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            tools.msg("Project is added");
        }
    }

    @Override
    public void update() {
        String strUpdate = "update project set "
                +" projectname='" + ProjectName + "',"
                +" location='" + Location + "',"
                +" deptno=" + DeptNo 
                + " where projectno=" + ProjectNo;
        boolean isUpdate = db.go.runNonQuery(strUpdate);
        if(isUpdate){
            tools.msg("project is updated");
        }
        
    }

    @Override
    public void delete() {
        String strDelete = "delete from project"
                + " where projectno=" + ProjectNo;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            tools.msg("project is deleted");
        }
    }

    @Override
    public String getAutoNumber() {
        return db.go.getAutoNumber("Project", "ProjectNo");
    }

    @Override
    public void getAllRows(JTable table) {
        db.go.fillToJTable("project_data", table);
    }

    @Override
    public void getOneRow(JTable table) {
        String strSelect = "select * from project_data"
                + " where project_no=" + ProjectNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        db.go.fillToJTable(statement, table);
    }

    @Override
    public String getValueByName(String name) {
        String strSelect = "select projectno from project"
                + " where projectname=' " + name +" '";
        String strVal = db.go.getTableData(strSelect).item[0][0].toString();
        return strVal;
    }

    @Override
    public String getNameByValue(String value) {
        String steSelect = "select projectname from project"
                + " where projectno=" + value ;
        String strName = db.go.getTableData(steSelect).item[0][0].toString();
        return  strName;
    }
    
    
}
