public class Main {
    public static void main(String[] args) {
        LedStrip led = new LedStrip();

        // Set color to red
        if (led.setColor("red")) {
            System.out.println("Color set to Red successfully.");
        } else {
            System.out.println("Invalid color input.");
        }

        // Display LED status
        led.displayStatus();

        // Set a custom dimmer level
        led.setDimmer(75);
        System.out.println("Dimmer set to: " + led.getDimmerPercentage() + "%");

        // Get current color name
        System.out.println("Current color: " + led.getColorName());

        // Try setting an invalid color
        if (!led.setColor("yellow")) {
            System.out.println("Invalid color entered!");
        }

        // Display final LED status
        led.displayStatus();
    }
}
