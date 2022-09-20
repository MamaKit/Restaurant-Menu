package Restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private float price;
    private String description;
    private String category;  //("appetizer", "main course", "dessert")//
    private Date dateAdded;

    public MenuItem(String name, float price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
    }

    public void setName(String aName) {
        name = aName;
    }
    public String getName() {
        return name;
    }

    public void setPrice(float aPrice) {
        price = aPrice;
    }
    public float getPrice() {
        return price;
    }

    public void setDescription(String aDescription) {
        description = aDescription;
    }
    public String getDescription() {
        return description;
    }

    public void setCategory(String aCategory) {
        if (aCategory != "appetizer" || aCategory != "main course" || aCategory != "dessert") {
            category = "hidden";
        } else {
            category = aCategory;
        }
    }
    public String getCategory() {
        return category;
    }

    public void setDateAdded(Date aDate) {
        dateAdded = aDate;
    }
    public Date getDateAdded() {
        return dateAdded;
    }

//    public static void main(String[] args) {
//        MenuItem test = new MenuItem("Grilled Cheese", (float) 8.99, "White bread sandwich with Colby Jack cheese, grilled to perfection", "main course");
//        System.out.println(test.price);
//    }
}
