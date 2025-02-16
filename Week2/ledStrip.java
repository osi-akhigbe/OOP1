public class LedStrip {
    private int red;
    private int green;
    private int blue;
    private int dimmer; // 0-255

    // Constructor (default: white light at full brightness)
    public LedStrip() {
        this.red = 255;
        this.green = 255;
        this.blue = 255;
        this.dimmer = 255;
    }

    // Set color using text input
    public boolean setColor(String color) {
        switch (color.toLowerCase()) {
            case "red":
                red = 255; green = 0; blue = 0;
                break;
            case "green":
                red = 0; green = 255; blue = 0;
                break;
            case "blue":
                red = 0; green = 0; blue = 255;
                break;
            case "purple":
                red = 255; green = 0; blue = 255;
                break;
            case "orange":
                red = 255; green = 165; blue = 0;
                break;
            case "sun":
                red = 201; green = 141; blue = 38;
                break;
            default:
                return false; // Invalid color
        }
        return true;
    }

    // Get color as text based on RGB values
    public String getColorName() {
        if (red == 255 && green == 0 && blue == 0) return "Red";
        if (red == 0 && green == 255 && blue == 0) return "Green";
        if (red == 0 && green == 0 && blue == 255) return "Blue";
        if (red == 255 && green == 0 && blue == 255) return "Purple";
        if (red == 255 && green == 165 && blue == 0) return "Orange";
        if (red == 201 && green == 141 && blue == 38) return "Sun";
        return "Custom Color"; // If the color doesn't match the predefined ones
    }

    // Set dimmer level (0-100%)
    public void setDimmer(int percentage) {
        if (percentage < 0) percentage = 0;
        if (percentage > 100) percentage = 100;
        this.dimmer = (int) (255 * (percentage / 100.0));
    }

    // Get dimmer as percentage
    public int getDimmerPercentage() {
        return (int) ((dimmer / 255.0) * 100);
    }

    // Display LED status
    public void displayStatus() {
        System.out.println("LED Color: " + getColorName());
        System.out.println("RGB Values: (" + red + ", " + green + ", " + blue + ")");
        System.out.println("Dimmer: " + getDimmerPercentage() + "%");
    }
}
