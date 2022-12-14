package entities;

import java.sql.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	public HourContract() {
	}

	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public HourContract(java.util.Date contractDate, double valuePerHours, int hours2) {
		// TODO Auto-generated constructor stub
	}

	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Double getValuePerHour() {
		return valuePerHour;
	}


	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHour * hours;//valor total de um contrato
	}

}
