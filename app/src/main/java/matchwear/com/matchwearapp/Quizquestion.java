package matchwear.com.matchwearapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.HashMap;


public class Quizquestion extends Fragment {


    public Quizquestion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=  inflater.inflate(R.layout.fragment_quizquestion, container, false);
        Button next = (Button) view.findViewById(R.id.next);
        final int num= 0;
        RadioButton c1 = (RadioButton) view.findViewById(R.id.chioce1);
        RadioButton c2 = (RadioButton) view.findViewById(R.id.chioce2);
        RadioButton c3 = (RadioButton) view.findViewById(R.id.chioce3);
        RadioButton c4 = (RadioButton) view.findViewById(R.id.chioce4);
        RadioButton c5 = (RadioButton) view.findViewById(R.id.chioce5);
        RadioButton c6 = (RadioButton) view.findViewById(R.id.chioce6);
        TextView question = (TextView) view.findViewById(R.id.question);

        switch (num){
            case 1:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 2:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 3:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 4:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 5:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 6:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 7:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 8:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 9:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
            case 10:
                question.setText("");
                c1.setText("");
                c2.setText("");
                c3.setText("");
                c4.setText("");
                c5.setText("");
                c6.setText("");
                break;
        }
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    return view;
    }

}
