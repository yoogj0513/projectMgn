package com.yi.domain;

import java.util.Date;

public class ProjectVo {
	private int pno;
	private String pname;
	private String pcontent;
	private Date pstartdate;
	private Date pendate;
	private Pcdt pcdt;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public Date getPstartdate() {
		return pstartdate;
	}

	public void setPstartdate(Date pstartdate) {
		this.pstartdate = pstartdate;
	}

	public Date getPendate() {
		return pendate;
	}

	public void setPendate(Date pendate) {
		this.pendate = pendate;
	}

	public Pcdt getPcdt() {
		return pcdt;
	}

	public void setPcdt(Pcdt pcdt) {
		this.pcdt = pcdt;
	}

	@Override
	public String toString() {
		return String.format("ProjectVo [pno=%s, pname=%s, pcontent=%s, pstartdate=%s, pendate=%s, pcdt=%s]", pno,
				pname, pcontent, pstartdate, pendate, pcdt);
	}

}
