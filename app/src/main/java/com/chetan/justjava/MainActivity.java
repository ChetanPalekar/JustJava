package com.chetan.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        TextView price=(TextView) findViewById(R.id.total_price);
        TextView quantityTextView1 = (TextView) findViewById(R.id.quantity_text_view);
        String v=quantityTextView1.getText().toString();
        int x=Integer.parseInt(v);
        int tp=x*10;
        price.setText("Total amount is $"+ Integer.toString(tp)+".Thank You!!!");

    }
    public void decrease(View view)
    {

        TextView quantityTextView1 = (TextView) findViewById(R.id.quantity_text_view);
        String v=quantityTextView1.getText().toString();
        int x=Integer.parseInt(v);
        if(x>=1) {
            x -= 1;
            quantityTextView1.setText(Integer.toString(x));
        }
    }

    public void increase(View view){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        String v1=quantityTextView.getText().toString();
        a=Integer.parseInt(v1);
        a+=1;
        quantityTextView.setText(Integer.toString(a));

    }

    /**
     * This method displays the given quantity value on the screen.
     */

}