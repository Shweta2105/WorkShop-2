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
		Assert.assertTrue(hotel.addHotel(lakewood));
		 
	}

	
	/*public void toFindCheapestHotelForGivenDate() {
		HotelMain hotel new HotelMain();
		hotel.cheapestrate();
		
	}*/
}
