public class Librarian {
    private String libName;
    private int libId;
    private String libDept;

    //getters and setters
    public String getLibName() {
        return libName;
    }
    public void setLibName(String libName){
        this.libName=libName;
    }
    public int getLibId(){
        return libId;

    }
    public void setLibId(int libId){
        this.libId=libId;
    }
    public String getLibDept(){
        return libDept;
    }
    public void setLibDept(String libDept){
        this.libDept=libDept;
    }

    //methods
    public void updateBook(String newBook,String newDetails){
        System.out.println("book:"+newBook+"has been updated"+newDetails);
    }
    public void removeBook(String bookName){
        System.out.println("book:"+bookName+"has been removed");
    }
    public void collectFine(int studId,double amount){
        System.out.println("studId:"+studId+"has been collected amount of"+amount);
    }
}
