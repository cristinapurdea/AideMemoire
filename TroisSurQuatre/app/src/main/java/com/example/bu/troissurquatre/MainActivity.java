package com.example.bu.troissurquatre;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class MainActivity extends Activity {

    Toast mToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToast = Toast.makeText( this  , "" , Toast.LENGTH_SHORT );
        addButtonListener();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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





    public void addButtonListener() {


        final Button button_maison = (Button) findViewById(R.id.button_maison);
        button_maison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "MAISON", Toast.LENGTH_SHORT).show();
                //mToast.setText( "MAISON" );
                //mToast.show();

                Intent intent = new Intent(getApplicationContext(), MaisonActivity.class);
                startActivity(intent);
            }
        });

        final Button button_saisons = (Button) findViewById(R.id.button_saisons);
        button_saisons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "4 SAISONS", Toast.LENGTH_SHORT).show();
                mToast.setText( "4 SAISONS" );
                mToast.show();
            }
        });

        final Button button_shopping = (Button) findViewById(R.id.button_shopping);
        button_shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "SHOPPING", Toast.LENGTH_SHORT).show();
                mToast.setText( "SHOPPING" );
                mToast.show();
            }
        });

        final Button button_promenade = (Button) findViewById(R.id.button_promenade);
        button_promenade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "PROMENADE", Toast.LENGTH_SHORT).show();
                mToast.setText( "PROMENADE" );
                mToast.show();
            }
        });

        final Button button_aleatoire = (Button) findViewById(R.id.button_aleatoire);
        button_aleatoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "ALEATOIRE", Toast.LENGTH_SHORT).show();
                mToast.setText( "ALEATOIRE" );
                mToast.show();
            }
        });
    }
}