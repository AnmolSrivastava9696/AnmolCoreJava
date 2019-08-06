package Asssignments;

public class student 
{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public double getPhy() {
		return phy;
	}
	public void setPhy(double phy) {
		this.phy = phy;
	}
	public double getChem() {
		return chem;
	}
	public void setChem(double chem) {
		this.chem = chem;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	private int rollno;
	private double phy;
	private double chem;
	private double avg;
	public void calculateAverage()
	{
		avg=(phy+chem)/2;
	}

}
