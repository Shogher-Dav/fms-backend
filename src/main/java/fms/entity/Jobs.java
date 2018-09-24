package fms.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Jobs {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(name="number")
	    private String number;

	    @Column(name="destination")
	    private String destination;
	    
	    @Column(name="date")
	    private String date;

	    @Column(name="mawb")
	    private String mawb;
	    
	    @Column(name="origin")
	    private String origin;


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getMawb() {
			return mawb;
		}

		public void setMawb(String mawb) {
			this.mawb = mawb;
		}

		public String getOrigin() {
			return origin;
		}

		public void setOrigin(String origin) {
			this.origin = origin;
		}
		
		@Override
		public String toString() {
			return "Jobs [id=" + id + ", number=" + number + ", destination=" + destination + ", date=" + date
					+ ", mawb=" + mawb + ", origin=" + origin + "]";
		}
}
