import java.util.ArrayList;

/**
 * @author Tyler Hogue
 * @version 5.2.2018
 *
 */
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
     * Adds a node that the street goes through
     * @param node the location the street will traverse through
     * @return whether or not node was added
     */
    public boolean addPoint(Node<Point> node) {
        if (node == null) {
            return false;
        }
        
        locations.add(node);
        return true;
    }
    
    /**
     * Prints the name of the street, 
     * followed by the list of locations on the street
     * @return string representation of street data
     */
    public String toString() {
        String nodeStr = "";
        
        for(int i = 0; i < locations.size(); i++) {
            nodeStr += locations.get(i).getPoint().toString() + " ";
        }
        
        return name + ": " + nodeStr;
    }
}
