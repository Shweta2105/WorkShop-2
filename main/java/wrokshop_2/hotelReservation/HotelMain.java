package wrokshop_2.hotelReservation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class HotelMain {

	private HotelDetails hotelarr[] = new HotelDetails[5];
	private List<HotelDetails> hotellist = new ArrayList<>();
	private int index = 0;
	private String hotelname;
	private String rating;
	private String weekrates;
	private String weekenrates;

	public HotelMain(String hotelname, String rating, String weekrates, String weekenrates) {
		this.hotelname = hotelname;
		this.rating = rating;
		this.weekrates = weekrates;
		this.weekenrates = weekenrates;
	}

	public HotelMain() {
		// TODO Auto-generated constructor stub
	}

	public void welcome() {
		System.out.println("Welcome to Hotel Resvervation System");
	}

	

	public boolean addHotel(HotelDetails hotel) {
		return this.hotellist.add((HotelDetails) hotel);

	}

	public void gethotels() {
		System.out.println(hotellist.toString());
		
	}

	
}
