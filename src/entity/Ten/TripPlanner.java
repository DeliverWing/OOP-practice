package entity.Ten;

import java.util.Date;

public class TripPlanner {
    private int id;
    private String tripName;
    private Date tripDate;
    MapProvider mapProvider;

    public TripPlanner(int id, String tripName, Date tripDate, MapProvider mapProvider) {
        this.id = id;
        this.tripName = tripName;
        this.tripDate = tripDate;
        this.mapProvider = mapProvider;
    }

    public void OSM_Map(){
        mapProvider.OSM();
    }
}
