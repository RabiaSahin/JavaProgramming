package day47_Polymorphism;

public class EncapsulationReview {

    private String bookTitle;
    private final String publishDate;

    public EncapsulationReview(String bookTitle, String publishDate) {
        // this.bookTitle = bookTitle; // there is just assigns whatever the data is to the book title.
        setBookTitle(bookTitle); // it has advantages. it will be able to check the condition
        this.publishDate = publishDate;
    }

    // getter is a return method.    // the way you can read this data is by returning its value
    // getter method return type has to match the private variable return type
    // getter does not need to parameter,
    // because it just needs to read the value of the variable. No additional information will be needed for that
    // instance method can access instance variable. it does not have any other additional information to read it.

    public String getBookTitle() { // it is possible to give some conditions to the getter if it is necessary.
        // eg: ya bookTitle variable ya bisey assign edilmezse null olur.
        // eger herhangi bir null instance variable call edilirse null point exeption hatasi verir.
        //
        if(bookTitle == null){ // null means there is no abject at all
            return ""; //"" empty is least an object
        }
        return bookTitle;
    }
    // setter is a void method because it uses only for setting. I don't need to return any value
    // I just need to be able to change the value of this variable.
    // Setter has the parameter,because it needs to assign a new data to the variable.
    // Therefor new data need it in order to set it.

    public void setBookTitle(String bookTitle) {
        if(bookTitle == null || bookTitle.isEmpty()){
            throw new RuntimeException("Invalid Data");
        }
        this.bookTitle = bookTitle;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
