package matchwear.com.matchwearapp;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by VE on 11/2/16.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {



    private ArrayList<Item> dataset;

    public MyAdapter() {
        super();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView label;
        private ImageView imageView;
    public MyViewHolder(View itemView){
    super(itemView);
            this.label = (TextView) itemView.findViewById(R.id.label);
            this.imageView = (ImageView) itemView.findViewById(R.id.Imageview);
            }
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }


    @Override
    public void onBindViewHolder(MyAdapter.MyViewHolder holder, int position) {
        TextView label = holder.label;
        ImageView imageView = holder.imageView;
        label.setText(dataset.get(position).getItemName());

           imageView.setImageDrawable(dataset.get(position).getDrawable());


    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }
}
