import java.util.ArrayList;

import student.TestCase;

/**
 * @author Tyler Hogue
 * @version 5.2.2018
 *
 */
public class StreetNodesTest extends TestCase {
    
    private StreetNodes street1;
    private StreetNodes street2;
    private ArrayList<Node<Point>> nodes1;
    private ArrayList<Node<Point>> nodes2;
    
    public void setUp() {
        street1 = new StreetNodes("Fouh");
        street2 = new StreetNodes("SnoopDogg");
        
        nodes1 = new ArrayList<Node<Point>>();
        nodes2 = new ArrayList<Node<Point>>();
        
        Point pt = new Point(2, 2);
        ArrayList<String> places = new ArrayList<String>();
        places.add("place");
        places.add("fouh");
        Node<Point> node1 = new Node<Point>(pt, places);
        nodes1.add(node1);
        
        pt = new Point(3, 2);
        places = new ArrayList<String>();
        places.add("lala");
        places.add("fafa");
        node1 = new Node<Point>(pt, places);
        nodes1.add(node1);
        
        pt = new Point(0, 2);
        places = new ArrayList<String>();
        places.add("la");
        places.add("fa");
        node1 = new Node<Point>(pt, places);
        nodes2.add(node1);
        
        pt = new Point(0, 3);
        places = new ArrayList<String>();
        places.add("lo");
        places.add("fo");
        node1 = new Node<Point>(pt, places);
        nodes2.add(node1);
        
    }
    
    public void testGetName() {
        assertEquals("Fouh", street1.getName());
    }
    
    public void testSetName() {
        street1.setName("Jake");
        assertEquals("Jake", street1.getName());
    }
    
    public void testGetLocations() {
        
        street1.setLocations(nodes1);
        
        assertEquals(nodes1, street1.getLocations());
    }
    
    public void testSetLocations() {
        
        street1.setLocations(nodes1);
        
        assertEquals(nodes1, street1.getLocations());
        
    }
    
    public void testCompareTo() {
        assertEquals(0, street1.compareTo(street1));
        assertEquals(-1, street1.compareTo(street2));
        assertEquals(1, street2.compareTo(street1));
        assertEquals(-1, street1.compareTo(null));
    }
    
    public void testAddPoint() {
        Point pt = new Point(0, 0);
        ArrayList<String> places = new ArrayList<String>();
        places.add("Infinito's");
        Node<Point> node2 = new Node<Point>(pt, places);
        
        street1.addPoint(node2);
        
        assertEquals("Fouh: (0,0) ", street1.toString());
        
        street1.addPoint(null);
        assertEquals("Fouh: (0,0) ", street1.toString());
    }
    
    public void testToString() {
        street1.setLocations(nodes1);
        
        assertEquals("Fouh: (2,2) (3,2) ", street1.toString());
    }
}
