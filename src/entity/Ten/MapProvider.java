package entity.Ten;

import java.util.Map;

public class MapProvider implements IMapProvider {


    @Override
    public void getMap() {
        System.out.println("Map opened");
    }

    @Override
    public void OSM() {
        System.out.println("openStreetMap ");
    }

    @Override
    public void GM() {
        System.out.println("Google Maps ");
    }
}
