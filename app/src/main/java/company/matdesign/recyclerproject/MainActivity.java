package company.matdesign.recyclerproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView aRecyclerView;
    private List<Trip> aListTrip;
    private Trip_Adapter aAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_layout);

        aRecyclerView = findViewById(R.id.recyler_layout);
        aRecyclerView.setHasFixedSize(true);
        aListTrip = new ArrayList<>();

        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Paris", "Alger", "30/01/2020 22:00", "30/01/2020 23:55", 16));
        aListTrip.add(new Trip("Paris", "Marseille", "31/01/2020 05:00", "31/01/2020 15:00", 35.75));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Paris", "Alger", "30/01/2020 22:00", "30/01/2020 23:55", 16));
        aListTrip.add(new Trip("Paris", "Marseille", "31/01/2020 05:00", "31/01/2020 15:00", 35.75));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Paris", "Alger", "30/01/2020 22:00", "30/01/2020 23:55", 16));
        aListTrip.add(new Trip("Paris", "Marseille", "31/01/2020 05:00", "31/01/2020 15:00", 35.75));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));
        aListTrip.add(new Trip("Tours", "Paris", "30/01/2020 16:00", "30/01/2020 21:00", 15.5));

        Trip_Adapter trip_adapter = new Trip_Adapter(aListTrip);

        aRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        aRecyclerView.setAdapter(trip_adapter);
        /*
        trip_adapter.setOnItemClickListener(new Trip_Adapter.onItemClickListener()){
            void OnItemClick
        };
        */
    }
}
