public class Television {
    private String brand;
    private String model;
    private int volume;
    private int channel;
    private String childLockCode;
    private boolean isChildLockSet;

    // Constants
    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;
    private static final int MIN_CHANNEL = 1;
    private static final int MAX_CHANNEL = 75;

    // Constructor
    public Television(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.volume = 50; // Default volume
        this.channel = 1; // Default channel
        this.childLockCode = null;
        this.isChildLockSet = false;
    }

    // Getter Methods
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getVolume() {
        return volume;
    }

    public int getChannel() {
        return channel;
    }

    public boolean isChildLockSet() {
        return isChildLockSet;
    }

    // Increase volume
    public void increaseVolume() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    // Decrease volume
    public void decreaseVolume() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    // Change channel (if child lock is not set)
    public void changeChannel(int newChannel) {
        if (isChildLockSet) {
            System.out.println("Channel change is blocked! Child lock is enabled.");
            return;
        }
        if (newChannel >= MIN_CHANNEL && newChannel <= MAX_CHANNEL) {
            this.channel = newChannel;
        } else {
            System.out.println("Invalid channel! Must be between " + MIN_CHANNEL + " and " + MAX_CHANNEL);
        }
    }

    // Increase channel
    public void nextChannel() {
        if (!isChildLockSet) {
            if (channel < MAX_CHANNEL) {
                channel++;
            } else {
                channel = MIN_CHANNEL; // Loop back to channel 1
            }
        } else {
            System.out.println("Channel change is blocked! Child lock is enabled.");
        }
    }

    // Decrease channel
    public void previousChannel() {
        if (!isChildLockSet) {
            if (channel > MIN_CHANNEL) {
                channel--;
            } else {
                channel = MAX_CHANNEL; // Loop back to last channel
            }
        } else {
            System.out.println("Channel change is blocked! Child lock is enabled.");
        }
    }

    // Set child lock
    public void setChildLock(String code) {
        if (code.matches("\\d{4}")) { // Ensure it's a 4-digit code
            this.childLockCode = code;
            this.isChildLockSet = true;
            System.out.println("Child lock is set.");
        } else {
            System.out.println("Invalid code! The child lock code must be 4 digits.");
        }
    }

    // Remove child lock
    public void removeChildLock(String code) {
        if (this.isChildLockSet && this.childLockCode.equals(code)) {
            this.isChildLockSet = false;
            this.childLockCode = null;
            System.out.println("Child lock has been removed.");
        } else {
            System.out.println("Incorrect code! Child lock remains active.");
        }
    }

    // Display TV status
    public void displayStatus() {
        System.out.println("TV Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Current Volume: " + volume);
        System.out.println("Current Channel: " + channel);
        System.out.println("Child Lock: " + (isChildLockSet ? "Enabled" : "Disabled"));
    }
}
