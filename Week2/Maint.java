public class Maint {
    public static void main(String[] args) {
        // Create a new television
        Television myTV = new Television("Samsung", "QLED 4K");

        // Display initial status
        myTV.displayStatus();

        // Adjust volume
        myTV.increaseVolume();
        myTV.decreaseVolume();
        System.out.println("Volume after adjustments: " + myTV.getVolume());

        // Change channels
        myTV.changeChannel(45);
        System.out.println("Channel after change: " + myTV.getChannel());

        // Set child lock
        myTV.setChildLock("1234");
        myTV.changeChannel(20); // Should be blocked

        // Try to remove child lock with incorrect code
        myTV.removeChildLock("0000"); // Should fail
        myTV.removeChildLock("1234"); // Should succeed

        // Change channel again after removing child lock
        myTV.changeChannel(20);
        System.out.println("Channel after removing child lock: " + myTV.getChannel());

        // Display final TV status
        myTV.displayStatus();
    }
}
