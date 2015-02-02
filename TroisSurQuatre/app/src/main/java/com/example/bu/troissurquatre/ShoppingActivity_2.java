package com.example.bu.troissurquatre;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Cristina Purdea on 21/01/15.
 */
public class ShoppingActivity_2 extends Activity {

    private int correctFinds = 2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maison);

        final ImageButton button = (ImageButton) findViewById(R.id.imageButton4);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HelpActivity.class);
                startActivity(intent);
            }
        });

        Button bt1 = (Button) findViewById(R.id.answer_1);
        Button bt2 = (Button) findViewById(R.id.answer_2);
        Button bt3 = (Button) findViewById(R.id.answer_3);
        Button bt4 = (Button) findViewById(R.id.answer_4);

        Drawable d1 = getResources().getDrawable(R.drawable.fromage);
        Drawable d2 = getResources().getDrawable(R.drawable.citron);
        Drawable d3 = getResources().getDrawable(R.drawable.yaourt);
        Drawable d4 = getResources().getDrawable(R.drawable.viandecru);

        bt1.setBackground(d1);
        bt2.setBackground(d2);
        bt3.setBackground(d3);
        bt4.setBackground(d4);

        tv1 = (TextView) findViewById(R.id.textView6);
        TextView tv2 = (TextView) findViewById(R.id.textView7);
        TextView tv3 = (TextView) findViewById(R.id.textView8);
        TextView tv4 = (TextView) findViewById(R.id.textView9);
        TextView tv5 = (TextView) findViewById(R.id.textView10);

        tv1.setText("Quels produits peut-on manger?");
        tv2.setText("Fromage");
        tv3.setText("Citron");
        tv4.setText("Yaourt");
        tv5.setText("Viande périmée");
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

    public void buttonClick(View v) {
        Button clickedButton = (Button) findViewById(v.getId());
        TextView textReessayez = (TextView) findViewById(R.id.reessayer);
        textReessayez.setText("");

        if(!clickedButton.getText().equals("Bravo !")) {

            if (clickedButton.getId() == R.id.answer_4){
                //clickedButton.setText("Réessayez");
                textReessayez.setText("Réessayez");
            }else {
                if (correctFinds > -1) {
                    clickedButton.setText("Bravo !");
                    clickedButton.setBackgroundColor(Color.LTGRAY);
                    correctFinds--;

                    /*if (correctFinds == 1)
                        tv1.setText("Sélectionne " + correctFinds-- + " produit qu'on peut manger");
                    else
                        tv1.setText("Sélectionne " + correctFinds-- + " produits qu'on peut manger");*/

                }
                if (correctFinds < 0) {
                    Intent intent = new Intent(getApplicationContext(), ShoppingInformationActivity_2.class);
                    startActivity(intent);
                }
            }
        }
    }
}