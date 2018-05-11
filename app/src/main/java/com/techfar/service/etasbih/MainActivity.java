package com.techfar.service.etasbih;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private TextView T1;
    private ImageButton ImTap,ImReset;
    private  int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        T1=(TextView) findViewById(R.id.countText);
        ImTap=(ImageButton) findViewById(R.id.tapbutton);
        ImReset=(ImageButton) findViewById(R.id.resetbutton);

        ImTap.setOnClickListener(this);
        ImReset.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.tapbutton)
        {
            count++;
            T1.setText(" " + count);
        }
        else if(view.getId()==R.id.resetbutton)
        {
            count=0;
            T1.setText(" " + count);
            Toast.makeText(MainActivity.this,"Reset... ",Toast.LENGTH_SHORT).show();
        }
    }
}
