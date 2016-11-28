package matchwear.com.matchwearapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.HashMap;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Button sub = (Button) findViewById(R.id.submit);
        final EditText user = (EditText) findViewById(R.id.name);
        final DatePicker time = (DatePicker) findViewById(R.id.datePicker);
        final EditText mail = (EditText) findViewById(R.id.email);
        final RadioButton maleb = (RadioButton) findViewById(R.id.malebubble);
        final RadioButton femaleb = (RadioButton) findViewById(R.id.femalebubble);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user.toString();
                String date = time.toString();
                String email = mail.toString();
                Boolean ismale = maleb.isChecked();
                Boolean isfemale = femaleb.isChecked();




            }
        });
    }
}
