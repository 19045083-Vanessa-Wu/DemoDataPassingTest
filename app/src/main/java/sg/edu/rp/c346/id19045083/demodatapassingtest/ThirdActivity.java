package sg.edu.rp.c346.id19045083.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView tvShow = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        Character CharReceived = intentReceived.getCharExtra("character", 'z');
//        tvShow.setText(String.format("Character value received is: %s", CharReceived));

        Double value = intentReceived.getDoubleExtra("doubleValue", 0);

        if (CharReceived!=null && value.floatValue()==0){
            tvShow.setText(String.format("Character value received is: %s", CharReceived));
        }

        else if (CharReceived.charValue() == 'z' && value!=null){
            tvShow.setText(String.format("Double value received is: %.2f", value));
        }


    }
}