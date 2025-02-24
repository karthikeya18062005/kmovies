package lbrce;
public class User {
    private String uname;
    private String upass;
    public User(){};
    public void setuname(String uname){
        this.uname=uname;
    }
    public String getuname(){
        return this.uname;
    }
    
    public void setupass(String upass){
        this.upass=upass;
    }
    public String getupass(){
        return this.upass;
    }
    
}
