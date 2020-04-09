package cucumbercourse;

public class RestaurantMenuItem {
    public RestaurantMenuItem(String itemName, String description, int price) {
        ItemName = itemName;
        Description = description;
        this.price = price;
    }

    private String ItemName;
    private String Description;
    private int price;


    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return ItemName;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj == null)
                || (getClass() != obj.getClass())) {
            return false;
        }

        RestaurantMenuItem OtherMenuItem = (RestaurantMenuItem) obj;

        return (OtherMenuItem.getItemName()).equals(this.ItemName);

    }

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.hashCode();
    }
}
