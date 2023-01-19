package com.masai.beans;

public class Courses {
	
	private int cid;
	private String cname;
	private int fee;
	
	public Courses() {
		super();
	}

	public Courses(int cid, String cname, int fee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.fee = fee;
	}

	public int getCourseId() {
		return cid;
	}

	public void setCourseId(int cid) {
		this.cid = cid;
	}

	public String getCourseName() {
		return cname;
	}

	public void setCourseName(String cname) {
		this.cname = cname;
	}

	public int getcourseFees() {
		return fee;
	}

	public void setcourseFees(int fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + cid + ", courseName=" + cname + ", courseFees=" + fee + "]";
	}
	
	
	

}
