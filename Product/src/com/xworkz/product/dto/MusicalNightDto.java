package com.xworkz.product.dto;

public class MusicalNightDto {

	private String eventName;
	private String venue;
	private String date;
	private int durationInHours;
	private String performers;
	private String guest;
	private double ticketPrice;
	private boolean isSoldOut;
	private int maxAttendees;
	private String sponsor;
	private boolean hasAfterParty;
	private String sponser;
	private String website;
	private String agerestriction;
	private int maxAttendence;
	private String organizer;

	
	
	
	
	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getDurationInHours() {
		return durationInHours;
	}

	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}

	public String getPerformers() {
		return performers;
	}

	public void setPerformers(String performers) {
		this.performers = performers;
	}

	public String getGuest() {
		return guest;
	}

	public void setGuest(String guest) {
		this.guest = guest;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public boolean isSoldOut() {
		return isSoldOut;
	}

	public void setSoldOut(boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

	public int getMaxAttendees() {
		return maxAttendees;
	}

	public void setMaxAttendees(int maxAttendees) {
		this.maxAttendees = maxAttendees;
	}

	public String getSponsor() {
		return sponsor;
	}

	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}

	public boolean isHasAfterParty() {
		return hasAfterParty;
	}

	public void setHasAfterParty(boolean hasAfterParty) {
		this.hasAfterParty = hasAfterParty;
	}

	public String getSponser() {
		return sponser;
	}

	public void setSponser(String sponser) {
		this.sponser = sponser;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getAgerestriction() {
		return agerestriction;
	}

	public void setAgerestriction(String agerestriction) {
		this.agerestriction = agerestriction;
	}

	public int getMaxAttendence() {
		return maxAttendence;
	}

	public void setMaxAttendence(int maxAttendence) {
		this.maxAttendence = maxAttendence;
	}

	public String getOrganizer() {
		return organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public  MusicalNightDto() {
		System.out.println("default constructor");
	}

	public MusicalNightDto(String eventName, String venue, String date, int durationInHours, String performers,
			String guest, double ticketPrice, boolean isSoldOut, int maxAttendees, String sponsor,
			boolean hasAfterParty, String sponser, String website, String agerestriction, int maxAttendence,
			String organizer) {
		super();
		this.eventName = eventName;
		this.venue = venue;
		this.date = date;
		this.durationInHours = durationInHours;
		this.performers = performers;
		this.guest = guest;
		this.ticketPrice = ticketPrice;
		this.isSoldOut = isSoldOut;
		this.maxAttendees = maxAttendees;
		this.sponsor = sponsor;
		this.hasAfterParty = hasAfterParty;
		// this.sponser = sponser;
		this.website = website;
		this.agerestriction = agerestriction;
		// this.maxAttendence = minAttendence;
		this.organizer = organizer;
	}
@Override
	public String toString() {

		return "MusicalNightDto [eventName=" + eventName + ", venue=" + venue + ", date =" + date + ",durationInHours ="
				+ durationInHours + ", performers=" + performers + ", guest=" + guest + ", ticketPrice=" + ticketPrice
				+ ",isSoldOut=" + isSoldOut + ", maxAttendees=" + maxAttendees + ", sponsor=" + sponsor
				+ ", hasAfterParty=" + hasAfterParty + ", website=" + website + ",  agerestriction=" + agerestriction
				+ ",organizer=" + organizer + "  ]";

	}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((agerestriction == null) ? 0 : agerestriction.hashCode());
	result = prime * result + ((date == null) ? 0 : date.hashCode());
	result = prime * result + durationInHours;
	result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
	result = prime * result + ((guest == null) ? 0 : guest.hashCode());
	result = prime * result + (hasAfterParty ? 1231 : 1237);
	result = prime * result + (isSoldOut ? 1231 : 1237);
	result = prime * result + maxAttendees;
	result = prime * result + maxAttendence;
	result = prime * result + ((organizer == null) ? 0 : organizer.hashCode());
	result = prime * result + ((performers == null) ? 0 : performers.hashCode());
	result = prime * result + ((sponser == null) ? 0 : sponser.hashCode());
	result = prime * result + ((sponsor == null) ? 0 : sponsor.hashCode());
	long temp;
	temp = Double.doubleToLongBits(ticketPrice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((venue == null) ? 0 : venue.hashCode());
	result = prime * result + ((website == null) ? 0 : website.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MusicalNightDto other = (MusicalNightDto) obj;
	if (agerestriction == null) {
		if (other.agerestriction != null)
			return false;
	} else if (!agerestriction.equals(other.agerestriction))
		return false;
	if (date == null) {
		if (other.date != null)
			return false;
	} else if (!date.equals(other.date))
		return false;
	if (durationInHours != other.durationInHours)
		return false;
	if (eventName == null) {
		if (other.eventName != null)
			return false;
	} else if (!eventName.equals(other.eventName))
		return false;
	if (guest == null) {
		if (other.guest != null)
			return false;
	} else if (!guest.equals(other.guest))
		return false;
	if (hasAfterParty != other.hasAfterParty)
		return false;
	if (isSoldOut != other.isSoldOut)
		return false;
	if (maxAttendees != other.maxAttendees)
		return false;
	if (maxAttendence != other.maxAttendence)
		return false;
	if (organizer == null) {
		if (other.organizer != null)
			return false;
	} else if (!organizer.equals(other.organizer))
		return false;
	if (performers == null) {
		if (other.performers != null)
			return false;
	} else if (!performers.equals(other.performers))
		return false;
	if (sponser == null) {
		if (other.sponser != null)
			return false;
	} else if (!sponser.equals(other.sponser))
		return false;
	if (sponsor == null) {
		if (other.sponsor != null)
			return false;
	} else if (!sponsor.equals(other.sponsor))
		return false;
	if (Double.doubleToLongBits(ticketPrice) != Double.doubleToLongBits(other.ticketPrice))
		return false;
	if (venue == null) {
		if (other.venue != null)
			return false;
	} else if (!venue.equals(other.venue))
		return false;
	if (website == null) {
		if (other.website != null)
			return false;
	} else if (!website.equals(other.website))
		return false;
	return true;
}


}
