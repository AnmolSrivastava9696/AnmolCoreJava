package ExcelFunctionality;

import java.util.ArrayList;

public class Student 
{

private int sid;
private String name;
private int java;
private int selenium;
private double average;
private int greatest;
public void CalculateAverage()
{
	double avg=(this.java)+(this.selenium)/2;
	this.average=avg;
}
public void calculateGreatest()
{
	if(this.java>this.selenium)
	{
		this.greatest=this.java;
	}
	else
	{
		this.greatest=this.selenium;
	}
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getJava() {
	return java;
}
public void setJava(int java) {
	this.java = java;
}
public int getSelenium() {
	return selenium;
}
public void setSelenium(int selenium) {
	this.selenium = selenium;
}
public double getAverage() {
	return average;
}
public void setAverage(double average) {
	this.average = average;
}
public void setGreatest(int greatest) {
	this.greatest = greatest;
}

	
}
