package company.matdesign.recyclerproject;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.List;

public class Trip_Adapter extends RecyclerView.Adapter<Trip_View_Holder> {

    private List<Trip> list_trips;
/*
    private AdapterView.OnItemClickListener trip_listener;
    public interface onItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(AdapterView.OnItemClickListener Trip_Listener){
        trip_listener = Trip_Listener;
    }
*/
    public Trip_Adapter(List<Trip> list_trips) {
        this.list_trips = list_trips;
    }

    @NonNull
    @Override                                   //(parent, viewtype)
    public Trip_View_Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false);
        return new Trip_View_Holder(view); //, trip_listener
    }

    @Override
    public void onBindViewHolder(@NonNull Trip_View_Holder trip_view_holder, int i) {
        trip_view_holder.display(list_trips.get(i));
    }

    @Override
    public int getItemCount() {
        return list_trips.size();
    }

}
