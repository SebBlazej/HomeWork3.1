public class Room {
    public static void main(String[] args){
        Book[] books = new Book[2];
        for(int i = 0; i<2; i++){
            books[i] = new Book();
        }

        books[0].name = "Paragraf 22";
        books[0].author = "Joseph Heller";
        books[0].genre = "Detective story";
        books[0].publisher = "Albatros";
        books[0].price = 29.99F;
        books[0].pages = 480;
        books[0].rating = 7.9F;

        books[1].name = "Raptory";
        books[1].author = "Jakub K. Dębski";
        books[1].genre = "Comics";
        books[1].publisher = "Demland";
        books[1].price = 19.99F;
        books[1].pages = 120;
        books[1].rating = 7.4F;

        for(int i = 0; i<2; i++) {
            System.out.println("Book - " + (i+1) + "\n");
            System.out.println("Name - " + books[i].name);
            System.out.println("Author - " + books[i].author);
            System.out.println("Genre - " + books[i].genre);
            System.out.println("Publisher - " + books[i].publisher);
            System.out.println("Price - " + books[i].price + "zł");
            System.out.println("Pages - " + books[i].pages);
            System.out.println("Rating - " + books[i].rating + "/10\n");
        }

    }
}
