package company.matdesign.recyclerproject;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class Trip_View_Holder extends RecyclerView.ViewHolder {

    private TextView start, end, time_start, time_end, price;
    //Trip t;

    Trip_View_Holder(View itemView/*, final AdapterView.OnItemClickListener Trip_Listener*/){
        super(itemView);

        start = itemView.findViewById(R.id.departure);
        end = itemView.findViewById(R.id.arrival);
        time_start = itemView.findViewById(R.id.time_departure);
        time_end = itemView.findViewById(R.id.time_arrival);
        price = itemView.findViewById(R.id.price);

        /*
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Trip_Listener !=null){
                    int position = getAdapterPosition();
                    /*
                    if (position != RecyclerView.NO_POSITION){
                        Trip_Listener.onItemClick(position);
                    }
                    */
        /*
                }
            }
        });
        */

    }

    void display(Trip tr){
        start.setText(tr.getStart());
        end.setText(tr.getEnd());
        time_start.setText(tr.getTime_start());
        time_end.setText(tr.getTime_end());
        price.setText(tr.getPrice()+" $");
    }
}