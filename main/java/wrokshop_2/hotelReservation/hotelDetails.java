package wrokshop_2.hotelReservation;



public class HotelDetails {
	private String hotelname;
	private String rating;
	private String weekrates;
	private String weekenrates;
	public HotelDetails(String hotelname2, String rating2, String weekrates2, String weekendrates) {
		this.hotelname = hotelname;
		this.rating = rating;
		this.weekrates = weekrates;
		this.weekenrates = weekenrates;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getWeekrates() {
		return weekrates;
	}
	public void setWeekrates(String weekrates) {
		this.weekrates = weekrates;
	}
	public String getWeekenrates() {
		return weekenrates;
	}
	public void setWeekenrates(String weekenrates) {
		this.weekenrates = weekenrates;
	}
	

}
