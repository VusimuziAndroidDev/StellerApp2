package android.finaspellapp;

/**
 * Created by Vusimuzi on 2016/06/12.
 */
public class User {

    String name;
    String surname;
    String username;
    String password;
    String confirmpassword;

    public User(String name,String surname,String username,String password,String confirmpassword){

        this.name=name;
        this.surname=surname;
        this.username=username;
        this.password=password;
        this.confirmpassword=confirmpassword;

    }

    public String getName(){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }
    public String getConfirmpassword(){
        return this.confirmpassword;
    }

}
