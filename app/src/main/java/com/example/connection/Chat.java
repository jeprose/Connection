package com.example.connection;

import android.os.Bundle;
import com.example.connection.data.MessageAdapter;
import com.example.connection.data.Message;

import com.example.connection.data.model.LoggedInUser;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import android.widget.EditText;
import android.view.View;
import android.widget.ListView;

import java.lang.reflect.Member;

public class Chat extends AppCompatActivity {
    private EditText editText;
    private MessageAdapter messageAdapter;
    private ListView messagesView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_chat);
        // This is where we write the mesage
        editText = (EditText) findViewById(R.id.editText);
        messageAdapter = new MessageAdapter(this);
        messagesView = (ListView) findViewById(R.id.messages_view);
        messagesView.setAdapter(messageAdapter);
    }
    public void sendMessage(View view){
        String message = editText.getText().toString();
        onMessage(new Message(LoggedInUser.loggedin,message));
    }
    public void onMessage(final Message m) {
        messageAdapter.add(m);
        // scroll the ListView to the last added element
        messagesView.setSelection(messagesView.getCount() - 1);
    }
}
