package com.yi.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class ProjectVO {
	private int pno;
	private String pname;
	private String pcontent;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date pstartdate;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date penddate;
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

	public Date getPenddate() {
		return penddate;
	}

	public void setPenddate(Date pendate) {
		this.penddate = pendate;
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
				pname, pcontent, pstartdate, penddate, pcdt);
	}

}
