public class Movie extends Product
{
    private String Director;

    public Movie(String name, double price, String Director) {
        super(name, price);
        this.Director = Director;
    }

    public String getAuthor() {
        return Director;
    }

    public void setAuthor(String author) {
        this.Director = author;
    }

    @Override
    public double gitDiscount() {
        int discount=10;

       double finalprice= getPrice()*discount/100;
       finalprice=getPrice()-finalprice;

        System.out.println("the movie price after discount:"+finalprice);
        return finalprice;
    }
}
