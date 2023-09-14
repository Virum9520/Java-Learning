public class Library {
    public static void main(String[] args) {
        Lib L = new Lib();
        L.add_book("Monk-e");
        L.add_book("Java");
        L.add_book("Turing Machine");
        L.issue_book("Java");
        L.issue_book("Python");

    }
}

class Lib {

    String[] avail,issued;
    int no_of_books;
    Lib(){
        avail = new String[25];
        issued = new String[25];
        no_of_books = 0;
    }
    public void add_book(String a){
        this.avail[no_of_books] = a;
        no_of_books ++;
        System.out.println("A book has been added");
    }
    public void issue_book(String a){
        for(int i=0;i<avail.length;i++){
            if(avail[i]==a) {
                avail[i] = null;
                System.out.println("Book issued");
                return;
            }
        }
        System.out.println("Book not available");
    }
}


