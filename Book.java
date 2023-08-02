public class Book extends Product{
private String author;

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double gitDiscount() {
        int discount=15;
        double finalprice= getPrice()*discount/100;
        finalprice=getPrice()-finalprice;
        System.out.println("the Book price after discount:"+finalprice);
        return finalprice;
    }
}
