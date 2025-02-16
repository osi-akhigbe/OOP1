 public class Book
 {
	private String name;
	private String author;
	private Double price;
	private int numberOfPages;
	private int timesRead;
	private boolean isHardcover;

	public Book(String name, String author,  boolean isHardcover, double price, int numberOfPage)
	{
		this.name = name;
		this.author = author;
		this.price = price;
		this.numberofpages = numberOfPages;
		this.timesread = timesRead;
		this.isHardcover = isHardcover;
	}
	
	public int getAVGtimesread()
	{
		return this.timesread;
	}
	
	    public void setName(String name)
	{
        this.name = name;
    }

    public void setAuthor(String author) 
	{
        this.author = author;
    }

    public void setHardcover(boolean isHardcover) 
	{
        this.isHardcover = isHardcover;
    }

    public void setPrice(double price) 
	{
        this.price = price;
    }

    public void setNumberOfPages(int numberOfPages) 
	{
        this.numberOfPages = numberOfPages;
    }
	
	 public void readBook() {
        this.timesRead++;
    }

    
    public double getReadTime() {
        return numberOfPages / 0.8;
    }


    public String getReadingRecommendation() {
        double readTime = getReadTime();
        if (readTime < 61) {
            return "You can read this";
        } else if (readTime >= 60 && readTime <= 240) {
            return "Are you sure you want to read this now?";
        } else {
            return "You should not start reading this right now";
        }
    }