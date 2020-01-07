package Classes;

import javax.swing.JOptionPane;

public class MealPlan implements mainData{
    
    private int MealType;
    private String MealName;
    private float Price;

    public MealPlan(){
        
    }
    public MealPlan(int MealType,String MealName,float Price){
        this.MealType = MealType;
        this.MealName = MealName;
        this.Price = Price;
    
    }
    public int getMealType() {
        return MealType;
    }

    public void setMealType(int MealType) {
        this.MealType = MealType;
    }

    public String getMealName() {
        return MealName;
    }

    public void setMealName(String MealName) {
        this.MealName = MealName;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }


    @Override
    public void add() {
        String strAdd = "insert into MealPlan values (" 
                + MealType +","
                + "'"+ MealName +"',"
                + Price + ")";
                boolean isAdd = Database.Tools.runNonQuery(strAdd);
        if(isAdd){
            JOptionPane.showMessageDialog(null, "Added");
    }
    }

    @Override
    public void update() {
      String strUpdate = "update mealplan set "
                + "MEALPLANNAME='" + MealName + "',"
                + "PRICE=" + Price 
                + " where MealType=" + MealType;
        boolean isUpdate = Database.Tools.runNonQuery(strUpdate);
        if(isUpdate){
            JOptionPane.showMessageDialog(null, "updated");
        }  
    }

    @Override
    public void delete() {
         String StrDelete = "delete From MealPlan Where MealType="+ MealType; 
             boolean isDeleted = Database.Tools.runNonQuery(StrDelete);
        if(isDeleted){
            JOptionPane.showMessageDialog(null, "deleted");
        }
    }
    
    
}