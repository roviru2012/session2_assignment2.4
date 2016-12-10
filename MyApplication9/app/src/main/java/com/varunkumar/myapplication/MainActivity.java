package com.varunkumar.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button click;
    Boolean aBoolean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= (TextView) findViewById(R.id.textView2);
        click= (Button) findViewById(R.id.button);
        aBoolean=true;

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(aBoolean==true){
                    textView.setVisibility(textView.INVISIBLE);
                    click.setText("Show");
                    aBoolean=false;

                }
                else{
                    textView.setVisibility(textView.VISIBLE);
                    click.setText("Hide");
                    aBoolean=true;
                }

            }
        });
    }
}
