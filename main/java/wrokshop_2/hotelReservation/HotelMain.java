package wrokshop_2.hotelReservation;



public class HotelMain {
	
	private hotelDetails hotelarr[];
	
	public void welcome()
	{
		System.out.println("Welcome to Hotel Resvervation System");
	}

	public void addHotel(String hotelname, String rating, String weekrates, String weekendrates) {
		
		hotelDetails hotel = new hotelDetails(hotelname,rating,weekrates,weekendrates);
		
	}

}
