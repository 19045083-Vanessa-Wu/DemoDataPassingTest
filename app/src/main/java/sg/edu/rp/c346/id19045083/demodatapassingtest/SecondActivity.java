package sg.edu.rp.c346.id19045083.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvDisplay = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        int valueSelected = intentReceived.getIntExtra("value", 0);
        tvDisplay.setText(String.format("Integer value received is: %d", valueSelected));
    }
}