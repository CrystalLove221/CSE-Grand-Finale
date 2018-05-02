import java.util.ArrayList;

public class StreetNodes implements Comparable<StreetNodes>{

    private String name;
    private ArrayList<Node<Point>> locations;
    
    public StreetNodes(String name) {
        this.name = name;
        locations = new ArrayList<Node<Point>>();
    }
    
    @Override
    public int compareTo(StreetNodes street) {
        
        if (street == null) {
            return -1;
        }
        
        if (name.compareTo(street.getName()) < 0) {
            return -1;
        }
        
        if (name.compareTo(street.getName()) > 0) {
            return 1;
        }
        
        return 0;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name= name;
    }
    
    public ArrayList<Node<Point>> getLocations() {
        return locations;
    }
    
    public void setLocations(ArrayList<Node<Point>> locations) {
        this.locations = locations;
    }
    
    /**
     * Prints the name of the street, 
     * followed by the list of locations on the street
     * @return string representation of street data
     */
    public String toString() {
        return name + ": " + locations.toString();
    }
}
