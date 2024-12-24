package AuthorBookAdvanceClass;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String str = "" ;
        if(authors.length>0){
            str = ",authors={" + authors[0].toString();
            for(int i=1;i<authors.length;i++){
                str = str + "," + authors[i].toString();
            }
            str = str+"}";
        }
        return "Book[name=" + name + str +",price=" + price + ",qty=" + qty + "]" ;
    }

    public String getAuthorNames(){
        String str = "" ;
        if(authors.length>0){
            str = authors[0].getName();
            for(int i=1;i<authors.length;i++){
                str = str + "," + authors[i].getName();
            }
        }
        return str;
    }
}

