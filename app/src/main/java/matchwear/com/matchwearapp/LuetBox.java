package matchwear.com.matchwearapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import java.lang.reflect.Array;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuetBox extends Fragment {


    public LuetBox() {
        // Required empty public constructor
    }
    String a;
    private Button LuetButton;
    //private String[] Text = getResources().getStringArray(R.array.Text);
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_luet_box, container, false);//when wrking with fragments create a view
        // Inflate the layout for this fragment

        final PopupWindow popup = new PopupWindow(getActivity());
        Button LuetButton = (Button) view.findViewById(R.id.mButton);//referencing from fragment_luet_box
        final LinearLayout mainlayout = new LinearLayout(getActivity());
        LuetButton.setOnClickListener(new View.OnClickListener() {
            boolean clicked=true;
            @Override
            public void onClick(View v) {
                if (clicked) {
                    clicked = false;
                    popup.showAtLocation(mainlayout, Gravity.CENTER, 20, 20);
                    popup.update(50, 50, 100, 100);
                    ImageView image = (ImageView) popup.getContentView().findViewById(R.id.luetPic);
                    int num = (int) Math.random() * (7 - 1) + 1;
                    int id = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic1", null, null);
                    TextView txt = (TextView) popup.getContentView().findViewById(R.id.textpop);
                    txt.setText("hello");
                    image.setImageResource(id);
                    switch (num) {

                        case 1:
                            int id1 = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic1", null, null);
                            txt.setText("hi");
                            image.setImageResource(id1);
                            break;
                        case 2:
                            int id2 = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic2", null, null);
                            txt.setText("hello");
                            image.setImageResource(id2);
                            break;
                        case 3:
                            int id3 = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic3", null, null);
                            txt.setText("hola");
                            image.setImageResource(id3);
                            break;
                        case 4:
                            int id4 = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic4", null, null);
                            txt.setText("how are you?");
                            image.setImageResource(id4);
                            break;
                        case 5:
                            int id5 = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic1", null, null);
                            txt.setText("como estas");
                            image.setImageResource(id5);
                            break;
                        case 6:
                            int id6 = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic1", null, null);
                            txt.setText("new style");
                            image.setImageResource(id6);
                            break;
                        case 7:
                            int id7 = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic1", null, null);
                            txt.setText("hi");
                            image.setImageResource(id7);
                            break;

                    }
                }
                else{
                    clicked=true;
                    popup.dismiss();
                }


            }
        });


        return view;

    }

}
