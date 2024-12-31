public class User {
    private int userId;
    private String password;
    private String loginStatus;

    //getters and setters
    public int getUserId() {
        return userId;
    }
    public String getPassword(){
        return password;

    }
    public String getLoginStatus(){
        return loginStatus;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public void setPassword(String password) {
        this.password = password;

    }
    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;

    }


    //method
    public boolean verifyLoginStatus(String inputPassword){
        if(this.password.equals(inputPassword)){
            this.loginStatus="logged in";
            return true;
        }
        else{
            this.loginStatus="failed login";
            return false;
        }
    }
}
