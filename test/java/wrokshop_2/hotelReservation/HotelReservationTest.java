package wrokshop_2.hotelReservation;

/*
 * @author shweta
 */

import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void toAddHotelInHotelReservationSystem() { //UC1
		HotelMain hotel = new HotelMain();
		hotel.welcome();
		 hotel.addHotel("Lakewood", "3Star","weekday rate=110","weekend rate = 90");
		 
	}

}
