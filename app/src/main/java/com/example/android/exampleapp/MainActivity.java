package com.example.android.exampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view){

        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        Toast.makeText(this,  "OOPS!! You are in Beta Version of this App!", Toast.LENGTH_LONG).show();
        ImageView image = (ImageView) findViewById(R.id.welcome);
        image.setImageResource(R.drawable.dog);
        String name = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        String betamessage = createBeta(name);
        String passwordMessage = createPassword(password);
        displayMessage(betamessage);
        displayMessage2(passwordMessage);
    }
    private String createPassword(String password){
        String passwordMessage = "Your Secured Password is- " + password;
        return passwordMessage;

    }
    private String createBeta(String name){
        String betamessage = "Welcome "+ name ;
        return betamessage;
    }
    private void displayMessage(String message){
        TextView betaTextView =(TextView) findViewById(R.id.betaText);
        betaTextView.setText(message);
    }
    private void displayMessage2(String message){
        TextView betaTextView =(TextView) findViewById(R.id.betaText2);
        betaTextView.setText(message);
    }
//    public void updateTextView(String toThis) {
//        TextView textView = (TextView) findViewById(R.id.textView);
//        textView.setText(toThis);
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}