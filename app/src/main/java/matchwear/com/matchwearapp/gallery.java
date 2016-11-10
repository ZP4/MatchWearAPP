package matchwear.com.matchwearapp;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class gallery extends Fragment {

    // Required empty public constructor
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_gallery, container, false);




        return view;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView myTextView;
        public ImageView imageView;
        public MyViewHolder(View itemView){
            super(itemView);

            myTextView = (TextView) itemView.findViewById(R.id.label);
            imageView = (ImageView) itemView.findViewById(R.id.Imageview);





        }



    }


}