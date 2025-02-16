
    public void displayInfo() {
        System.out.println("Name: " + name + ", Author: " + author + ", Hardcover: " + isHardcover + ", Price: " + price + ", Pages: " + numberOfPages + ", Times Read: " + timesRead);
    }

   
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", true, 10.99, 180);
        book.displayInfo();
        System.out.println("Reading time: " + book.getReadTime() + " minutes");
        System.out.println(book.getReadingRecommendation());
        book.readBook();
        System.out.println("Times read: " + book.getTimesRead());
    }
}