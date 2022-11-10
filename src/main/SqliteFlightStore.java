
package main;

import java.util.Iterator;

public class SqliteFlightStore implements FlightStore {

    @Override
    public Iterator<Flight> iterator() {
        return createIterator();
    }

    private Iterator<Flight> createIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
