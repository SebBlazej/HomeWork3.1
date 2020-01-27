class Book {
    private final String NAME;
    private final String AUTHOR;
    private final String GENRE;
    private final String PUBLISHER;
    private final short PAGES;
    private final float RATING;
    private final float PRICE;

    Book(String name, String author, String genre, String publisher, short pages, float price, float rating){
        NAME = name;
        AUTHOR = author;
        GENRE = genre;
        PUBLISHER = publisher;
        PAGES = pages;
        PRICE = price;
        RATING = rating;
    }

    void printInfo(){
        System.out.println("Name - " + NAME);
        System.out.println("Author - " + AUTHOR);
        System.out.println("Genre - " + GENRE);
        System.out.println("Publisher - " + PUBLISHER);
        System.out.println("Pages - " + PAGES);
        System.out.println("Price - " + PRICE + "zł");
        System.out.println("Rating - " + RATING + "/10\n");
    }

}
