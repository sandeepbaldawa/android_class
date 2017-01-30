package com.example.user.myfirstapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleDisplayActivity extends AppCompatActivity {

    //EditText field
    private EditText etWords;

    //TextView field
    private TextView tvLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Creates the layout in memory
        setContentView(R.layout.activity_simple_display); //associates the java with the xml
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // Get reference to Edit Text
        etWords = (EditText) findViewById(R.id.etWords);

        // Get reference to TextView
        tvLabel = (TextView) findViewById(R.id.tvLabel);

        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple_display, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // Fired when button is clicked
    public void onSubmit(View view){
        //Show a Hello World message
        // a Toast == "simple alert"
        //Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show();

        // Get value from Text field
        String fieldValue = etWords.getText().toString();

        // Set the value in the TextView
        tvLabel.setText(fieldValue);

        // Display the value
        Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();

    }
}
