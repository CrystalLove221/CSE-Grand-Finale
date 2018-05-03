import java.util.ArrayList;

import student.TestCase;

/**
 * @author Tyler Hogue
 * @version 5.2.2018
 *
 */
public class StreetNodesTest extends TestCase {
    
    private StreetNodes street;
    private ArrayList<Node<Point>> nodes1;
    
    public void setUp() {
        street = new StreetNodes("Fouh");
        
        nodes1 = new ArrayList<Node<Point>>();
        
        Point pt = new Point(3, 2);
        ArrayList<String> places = new ArrayList<String>();
        places.add("place");
        places.add("fouh");
        Node<Point> node1 = new Node(pt, places);
        nodes1.add(node1);
        
        pt = new Point(2, 2);
        places = new ArrayList<String>();
        places.add("lala");
        places.add("fafa");
        node1 = new Node(pt, places);
        nodes1.add(node1);
        
    }
    
    public void testGetName() {
        assertEquals("Fouh", street.getName());
    }
    
    public void testSetName() {
        String name = "Jke";
        street.setName(name);
        assertEquals("Jake", street.getName());
    }
    
    public void testGetLocations() {
        ArrayList<Node<Point>> nodes = 
                new ArrayList<Node<Point>>();
        
        Point pt = new Point(3, 2);
        ArrayList<String> places = new ArrayList<String>();
        places.add("place");
        places.add("fouh");
        Node<Point> node1 = new Node(pt, places);
        nodes.add(node1);
        
        street.setLocations(nodes);
        
        assertEquals(nodes, street.getLocations());
    }
    
    public void testSetLocations() {
        
        
        street.setLocations(nodes1);
        
        assertEquals(nodes1, street.getLocations());
        
    }
    
    public void testCompareTo() {
        
    }
}
