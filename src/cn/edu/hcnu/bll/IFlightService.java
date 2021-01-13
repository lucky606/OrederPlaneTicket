package cn.edu.hcnu.bll;

import cn.edu.hcnu.bean.Flight;
import java.sql.SQLException;
import java.util.Set;

public interface IFlightService {

    void insertFlight(Flight flight) throws SQLException;
    Set<Flight> getAllFlight()throws SQLException;
    Flight getFlightByDepartureTime(String  departureTime);
    Flight getFlightByDestinationAirport(String destinationAirPort);
    Flight getFlightByDepartureAirPort(String departureAirport);
    void updateFlight(Flight flight);
}
