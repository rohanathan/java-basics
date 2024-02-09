public class Pen {
    private String manufacturer = "Reynolds";
    private String color = "Blue";
    private String type = "Gel";
    public void describePen(){
        System.out.println(manufacturer + " Manufacturer "+ color + " "
        + type + " ");
    }
    public String getManufacturer(){
        return manufacturer;

    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
        if(manufacturer == null) manufacturer = "Unknown";
        String lowercaseManufacturer = manufacturer.toLowerCase();
        switch (manufacturer) {
            case "Franklin", "Schon", "Noodler" ->this.manufacturer = manufacturer;
            default ->  {
                this.manufacturer = "Unsupported";
            }
        }
}

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }
}


