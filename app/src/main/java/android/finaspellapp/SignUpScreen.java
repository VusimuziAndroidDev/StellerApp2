package android.finaspellapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpScreen extends AppCompatActivity {

    EditText etName; // The declaring the edit text variable for holding the name from the xml layout design
    EditText etSurname; // The declaring the edit text variable for holding the Surname from the xml layout design
    EditText etUsername; // The declaring the edit text variable for holding the Username from the xml layout design
    EditText etPassword; // The declaring the edit text variable for holding the password from the xml layout design
    EditText etConfirmPassword; // The declaring the edit text variable for holding the confirmation password from the xml layout design

    Button bRegistration; // Declaring the button for registering the new user on the app
    SharedPreferences pref; // Declaring the variable for the shared preferences
    SharedPreferences.Editor editor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        etName =(EditText) findViewById(R.id.etName);  // Binding the name from the text view to the one declared above
        etSurname = (EditText) findViewById(R.id.etSurname); // Binding the surname from the text view to the etSurname declared
        etUsername = (EditText) findViewById(R.id.etUsername); //Binding the username from the text view to the etUsername
        etPassword = (EditText) findViewById(R.id.etPassword);  //Binding the password from the text view to the etPasswordwww1
        etConfirmPassword=(EditText) findViewById(R.id.etConfirmPassword); //Binding the password from the text view to the etPasswordwww1

       // pref = getSharedPreferences("UsersPref",SignUpScreen.MODE_PRIVATE);



     /*   editor = pref.edit();

        editor.p*/

    }

    public void onClick(View view){

        String name= etName.getText().toString();
        String surname = etSurname.getText().toString();
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();
        String confirmpassword = etConfirmPassword.getText().toString();

    }

    //The method for adding the new user to the sqlite database
    public void addNewUser(String name,String surname,String username,String password,String confirmpassword){



        pref = getSharedPreferences("UsersPref",SignUpScreen.MODE_PRIVATE);
        if(name.equals("")){
            etName.setError("Please supply your name");
        }
        else if(surname.equals("")){
            etSurname.setError("Please supply your surname");
        }
        else if(username.equals("")){
           etUsername.setError("Please supply your username");
        }
        else if(password.equals("")){
           etPassword.setError("Please supply your password");
        }
        else if(confirmpassword.equals(""))
        {
            etConfirmPassword.setError("Please supply your confirmation password");
        }
        else {



            editor.putString("Name",name);
            editor.putString("Surname",surname);
            editor.putString("Username",username);
            editor.putString("Password",password);
            editor.putString("Confirm Password",confirmpassword);

            editor.commit();



        }


    }



}



