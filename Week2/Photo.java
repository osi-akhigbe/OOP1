public class Photo {
    private int width;
    private int length;
    private String description;
    private String[] people;
    private int dpi;

    // Constructor
    public Photo(int width, int length, String description, String[] people, int dpi) {
        this.width = width;
        this.length = length;
        this.description = description;
        this.people = people;
        this.dpi = dpi;
    }

    // Getter Methods
    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getDescription() {
        return description;
    }

    public String[] getPeople() {
        return people;
    }

    public int getDpi() {
        return dpi;
    }

    // Setter Methods
    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPeople(String[] people) {
        this.people = people;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    // Check if the photo can be printed
    public boolean canBePrinted() {
        return dpi >= 150 && width >= 585 && length >= 878;
    }

    // Check if the photo is a group photo
    public boolean isGroupPhoto() {
        return people.length > 2;
    }

    // Display photo details
    public void displayPhotoDetails() {
        System.out.println("Photo Description: " + description);
        System.out.println("Dimensions: " + width + " x " + length + " pixels");
        System.out.println("DPI: " + dpi);
        System.out.println("People in Photo: " + (people.length > 0 ? String.join(", ", people) : "None"));
    }
}
