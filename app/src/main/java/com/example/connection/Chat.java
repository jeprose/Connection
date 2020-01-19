package com.example.connection;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.widget.EditText;
import android.view.View;

public class Chat extends AppCompatActivity {
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_chat);
        // This is where we write the mesage
        editText = (EditText) findViewById(R.id.editText);
    }
    public void sendMessage(View view){
        String message = editText.getText().toString();

    }
}
