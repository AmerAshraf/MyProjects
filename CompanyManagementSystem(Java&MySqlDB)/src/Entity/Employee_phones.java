package Entity;

import company_sql.tools;
import javax.swing.JTable;

public class Employee_phones implements mainData{
    private int EmpNo;
    private String Phone;

    public int getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(int EmpNo) {
        this.EmpNo = EmpNo;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    
    @Override
    public void add() {
        String strInsert = "insert into employee_phones values("
                + EmpNo + ","
                +"'" + Phone + "')";
        boolean isAdd = db.go.runNonQuery(strInsert);
        if(isAdd){
            //tools.msg("Phone is added");
        }
    }

    @Override
    public void update() { // not need to the tow field is primary key
        tools.msg("Update method in employee_phones class not working !");
    }

    @Override
    public void delete() {
        String strDelete = "delete from employee_phones"
                + " where "
                + " empno=" + EmpNo
                + " and phone='" + Phone + "'";
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            //tools.msg("phone is deleted");
        }
    }
    
    
    public void deleteByEmp(){
        String strDelete = "delete from employee_phones"
                + " where empNo=" + EmpNo;
        boolean isDelete = db.go.runNonQuery(strDelete);
        if(isDelete){
            //tools.msg("All phone is deleted");
        }
    }
    
    
    @Override
    public String getAutoNumber() {
        tools.msg("getAutoNumber method in employee_phones class not working !");
        return"";
    }

    @Override
    public void getAllRows(JTable table) {
        String strSelect = "select phone from employee_phones"
                + " where empnO=" + EmpNo;
        db.go.fillToJTable(strSelect, table);
    }

    @Override
    public void getOneRow(JTable table) {
        tools.msg("getOneRow method in employee_phones class not working !");
    }

    @Override
    public void getCustomRows(String statement, JTable table) {
        tools.msg("getCustoRow method in employee_phones class not working !");
    }

    @Override
    public String getValueByName(String name) {
        tools.msg("getValueByName method in employee_phones class not working !");
        return "";
    }

    @Override
    public String getNameByValue(String value) {
        tools.msg("getNameByValue method in employee_phones class not working !");
        return "";
    }
    
    public  String getEmpNoByPhone (String requestPhone){
        String strSelect = "select empno from employee_phones"
                + " where phone='" + requestPhone + "'";
        Object row[][] = db.go.getTableData(strSelect).item;
        String strEmpNO = "";
        if(row.length > 0){
            strEmpNO = row[0][0].toString();
        }
        else{
            strEmpNO = "0";
        }
        return strEmpNO;
    }
    
}
