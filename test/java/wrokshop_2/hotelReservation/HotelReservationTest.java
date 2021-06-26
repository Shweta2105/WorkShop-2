package wrokshop_2.hotelReservation;

/*
 * @author shweta
 */

import org.junit.Test;

import junit.framework.Assert;

public class HotelReservationTest {
	@Test
	public void toAddHotelInHotelReservationSystem() { //UC1
		HotelMain hotel = new HotelMain();
		hotel.welcome();
		HotelDetails lakewood = new HotelDetails("Lakewood", "3Star","weekday rate=110","weekend rate = 90");
		HotelDetails Bridgewood = new HotelDetails("Bridgewood", "4Star","weekday rate=160","weekend rate = 100");
		HotelDetails Ridgewood = new HotelDetails("Ridgewood", "3Star","weekday rate=110","weekend rate = 90");
		hotel.addHotel(lakewood);
		hotel.addHotel(Bridgewood);
		hotel.addHotel(Ridgewood);
		hotel.gethotels();
		
		 
	}

	
	
}
