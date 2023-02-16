public class AddFood {

    private String foodId;
    private String foodType;
    private String foodQuantity;
    private String foodprice;

    public AddFood(String foodId, String foodType, String foodQuantity, String foodprice) {

        this.foodId = foodId;
        this.foodType = foodType;
        this.foodQuantity = foodQuantity;
        this.foodprice = foodprice;
    }

    public AddFood() {
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(String foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public String getFoodprice() {
        return foodprice;
    }

    public void setFoodprice(String foodprice) {
        this.foodprice = foodprice;
    }
}
