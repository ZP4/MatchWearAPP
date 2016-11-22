package matchwear.com.matchwearapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pools;
import android.text.format.Time;
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
import java.util.Calendar;
import java.util.Random;


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
        final Button closepop   = (Button) view.findViewById(R.id.exitpopup);

        final LinearLayout mainlayout = new LinearLayout(getActivity());
        final View popupview = inflater.inflate(R.layout.luet_popup, null, false);
        popup.setContentView(popupview);
        LuetButton.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                boolean clicked=true;
                if (clicked) {
                    clicked = false;
                    popup.showAtLocation(mainlayout, Gravity.CENTER, 20, 20);
                    popup.update(10, 10, 1000, 1000);

                   //findViewById(R.id.luetPic);

                    Calendar randomInt = Calendar.getInstance();
                    Random random = new Random();
                    random.setSeed(randomInt.get(Calendar.SECOND));

                    int num = random.nextInt(7)+1;

                    System.out.println("hippo" + num);
                    int id = getResources().getIdentifier("matchwear.com.matchwearapp:/drawable/" + "pic1", null, null);
                    TextView txt = (TextView) popup.getContentView().findViewById(R.id.textpop);

                    String uir = "@drawabl/pic1";
                    ImageView image = (ImageView) popup.getContentView().findViewById(R.id.luetPic);
                    //image.setImageResource(id);
                    switch (num) {

                        case 1:
                            int id1 = getResources().getIdentifier("drawable/" + "pic1",null, getActivity().getPackageName());
                            txt.setText("1");
                            image.setImageResource(id1);
                            break;
                        case 2:
                            int id2 = getResources().getIdentifier("drawable/" + "pic2", null,getActivity().getPackageName());
                            txt.setText("2");
                           image.setImageResource(id2);
                            break;
                        case 3:
                            int id3 = getResources().getIdentifier("drawable/" + "pic3", null,getActivity().getPackageName());
                            txt.setText("3");
                            image.setImageResource(id3);
                            break;
                        case 4:
                            int id4 = getResources().getIdentifier("drawable/" + "pic4", null, getActivity().getPackageName());
                            txt.setText("4");
                            image.setImageResource(id4);
                            break;
                        case 5:
                            int id5 = getResources().getIdentifier("drawable/" + "pic5", null,getActivity().getPackageName());
                            txt.setText("5");
                           image.setImageResource(id5);
                            break;
                        case 6:
                            int id6 = getResources().getIdentifier("drawable/" + "pic6", null,getActivity().getPackageName());
                            txt.setText("6");
                            image.setImageResource(id6);
                            break;
                        case 7:
                            int id7 = getResources().getIdentifier("drawable/" + "pic7", null, getActivity().getPackageName());
                            txt.setText("7");
                            image.setImageResource(id7);
                            break;
                    }
                    closepop.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popup.dismiss();
                        }
                    });
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
