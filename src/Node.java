import java.util.ArrayList;

/**
 * @author Evan Hruskar 33%
 * @author Cam 33%
 * @author Tyler Hogue 33%
 * @version 2018.04.20
 * @param <E> a generic, in this case will be Point
 */
public class Node<E> implements Comparable<Node<E>> {
    private E data;
    private ArrayList<String> list;
    private ArrayList<String> streets;
    private double distance;
    
    /**
     * O(1)
     * @param data the information describing the location (coordinate)
     * @param list the list of places that can be explored at the 
     * specified location
     */
    public Node(E data, ArrayList<String> list) {
        this.data = data;
        this.list = list;
        this.setDistance(0);
        this.setStreets(new ArrayList<String>());
    }

    /*
     * (non-Javadoc)
     * @see iNode#getPlaces()
     * O(1)
     */
    public ArrayList<String> getPlaces() {
        return list;
    }
    
    /*
     * (non-Javadoc)
     * @see iNode#setPlaces(java.util.ArrayList)
     * O(1)
     */
    public void setPlaces(ArrayList<String> places) {
        list = places;
    }

    /*
     * (non-Javadoc)
     * @see iNode#getPoint()
     * O(1)
     */
    public E getPoint() {
        return data;
    }

    /*
     * (non-Javadoc)
     * @see iNode#setPoint(java.lang.Object)
     * O(1)
     */
    public void setPoint(E point) {
        data = point;
    }
    
    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     * O(n)
     */
    @Override
    public String toString() {
        
        if(list.isEmpty()) {
            return "No places @ " + data.toString();
        }
        
        if (data == null) {
            return "A location has not been set";
        }
        
        return list.toString() + " @ " + data.toString();
    }

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public ArrayList<String> getStreets() {
		return streets;
	}

	public void setStreets(ArrayList<String> streets) {
		this.streets = streets;
	}

	@Override
	public int compareTo(Node<T> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}