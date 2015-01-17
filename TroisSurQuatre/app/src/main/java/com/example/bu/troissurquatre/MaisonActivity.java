package com.example.bu.troissurquatre;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by Cristina Purdea on 17/01/15.
 */
public class MaisonActivity extends Activity {

    private int correctFinds = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maison);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_information, menu);
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

    public void buttonClick(View v)
    {
        Button clickedButton = (Button)findViewById(v.getId());

        if(clickedButton.getId() == R.id.cheval_button)
            clickedButton.setText("Réessayez");
        else
            clickedButton.setText("Bravo ! \n Il reste encore "+ --correctFinds +" réponses");

        clickedButton.setBackgroundColor(Color.LTGRAY);
    }
}
