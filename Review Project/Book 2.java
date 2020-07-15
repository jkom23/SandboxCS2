public class Book{
    private String title;
    private String author;
    private int numCopies;

    public Book(String title, String author, int numCopies) {
        this.title = title;
        this.author= author;
        this.numCopies = numCopies;
    }

    public String toString() {
        return title + " by " + author + ": " + numCopies;
    }

    public String getTitle() {
        return title;
        // if a member wants to find a book title in a library
    }

    public String getAuthor() {
        return author;
        // if a member wants to find an author's books in a library
    }

    public int getNumCopies() {
        return numCopies;
        // if a member wants to find out how many copies of a book they can take out in
        // a library
    }

    public void setNumcopies(int numCopies) {
        this.numCopies=numCopies;
        //if a member checks our 5 copies of one book, the librarian needs to change how many copies are left
        //for title and author name, this is not neccesary as a book title and author name will never change
    }


    public boolean borrow(){
        if (numCopies>=1){
            numCopies--;
            return true;
        }else{
            return false;
        }
    }

    public void returnToLibrary(){
        numCopies++;
    }

    public boolean hasSameAuthor(Book other){
        return other.getAuthor().equals(other.author);
    }

    
}


