package com.example.antreasmertzelos.super3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private GenerateNum generateNum;
    TextView draws;
    TextView rows10;
    TextView rows20;
    TextView rows50;
    StringBuilder sb = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        draws = (TextView) findViewById(R.id.draws);
       rows10 = (TextView)findViewById(R.id.rows10);
        rows20 = (TextView)findViewById(R.id.rows20);
        rows50 = (TextView)findViewById(R.id.rows50);
        rows10.setOnClickListener(this);
        rows20.setOnClickListener(this);
        rows50.setOnClickListener(this);
//testing push git
        // new test



    }

    public void draws(int xDraws) {
        sb.setLength(0);

        for (int j = 0; j < xDraws; j++) {
            generateNum = new GenerateNum();
            for (int i = 0; i < 3; i++) {

                int rows = generateNum.getDraws().get(i);
                sb.append(rows);
                sb.append("  ");

            }
            sb.append("\n");
        }
        draws.setText(sb.toString());

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rows10:
                draws(10);
                break;
            case R.id.rows20:
                draws(20);
                break;
            case R.id.rows50:
                draws(50);
                break;
        }

    }
}


