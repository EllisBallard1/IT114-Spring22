package com.example.stringlistlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RemoveItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remove_item);
    }

    //remove the item from the list

    public void removeItem(View view)
    {
        EditText et1;
        int pos;

        //get the position of the item to remove

        et1 = (EditText) findViewById(R.id.enter_position);
        pos = Integer.parseInt(et1.getText().toString());

        //try to delete the item from the list


    }
}