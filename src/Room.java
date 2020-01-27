public class Room {
    public static void main(String[] args){
        Book[] books = new Book[2];
        books[0] = new Book(
                "Paragraf 22",
                "Joseph Heller",
                "Detective story",
                "Albatros",
                (short)480,
                29.99F,
                7.9F);
        books[1] = new Book(
                "Raptory",
                "Jakub K. Dębski",
                "Comics",
                "Demland",
                (short)120,
                19.99F,
                7.4F);

        for(int i = 0; i<2; i++) {
            System.out.println("Book - " + (i+1) + "\n");
            books[i].printInfo();
        }

    }
}
