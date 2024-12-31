public class Student {
    private String studName;
    private String studDept;
    private int studYear;
    private String studClass;

    //constructors
    public Student() { }
    public Student(String studName, String studDept, int studYear, String studClass) {
        this.studName = studName;
        this.studDept = studDept;
        this.studYear = studYear;
        this.studClass = studClass;
    }

    //getters and setters
    public String getStudName(){
        return studName;
    }
    public void setStudName(String studName){
        this.studName= studName;
    }
    public String getStudDept(){
        return studDept;

    }
    public void setStudDept(String studDept){
        this.studDept= studDept;
    }
    public int getStudYear(){
        return studYear;

    }
    public void setStudYear(int studYear){
        this.studYear= studYear;

    }
    public String getStudClass(){
        return studClass;
    }

    public void setStudClass(String studClass){
        this.studClass= studClass;
    }

    //methods
    public void register(){
        System.out.println("Student Name: " + studName +"registered successfully");
    }
    public  void getBook(String bookName){
        System.out.println("book:"+bookName+"borrowed successfully by"+studName);
    }
    public void returnBOOK(String bookName){
        System.out.println("book:"+bookName+"returned successfully by"+studName);

    }
    public void reserveBook(String bookName){
        System.out.println("book:"+bookName+"reserved successfully by"+studName);
    }

    public void returnBook(String returnedBookName) {

    }
}