public class EnhancedSwitch {
    public static void main(String[] args) {
        int num = 48;
        String size = switch (num){
            case 28 -> "Small";
            case 32 -> "Medium";
            case 36 -> "Large";
            case 40, 44, 48 -> "Extra Large";
            default -> "Unknown";
        };
        System.out.println("Size : " + size);
    }
}
