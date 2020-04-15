package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	public Reservation(Integer roomNumer, Date checkIn, Date chekOut) {
		this.roomNumber = roomNumer;
		this.checkIn = checkIn;
		this.checkOut = chekOut;
	}


	public Integer getRoomNumer() {
		return roomNumber;
	}


	public void setRoomNumer(Integer roomNumer) {
		this.roomNumber = roomNumer;
	}


	public Date getCheckIn() {
		return checkIn;
	}


	public Date getChekOut() {
		return checkOut;
	}


	public long duration() {
		long diff = checkOut.getTime()-checkIn.getTime();
		return TimeUnit.DAYS.convert(diff,TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	
	public String toString() {
		return "Room "
				+roomNumber
				+", check-In: "
				+sdf.format(checkIn)
				+", check-Out: "
				+sdf.format(checkOut)
				+", "
				+duration()
				+" nights";
				
				
		
	}
	

}
