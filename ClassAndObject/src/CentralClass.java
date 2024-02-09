public class CentralClass {
    public static void main(String[] args) {
        Pen pen = new Pen();
        /*pen.manufacturer = "Apsara";
        pen.color = "Black";
        pen.type = "Ballpoint"*/
        pen.setManufacturer("Pichku");
        pen.setColor("Black");
        pen.setType("Ballpoint");

        System.out.println("Manufacturer = " + pen.getManufacturer());
        System.out.println("Color = " + pen.getColor());
        System.out.println("Type = " + pen.getType());
        pen.describePen();
    }
}
