package com.yi.persistence;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.Pcdt;
import com.yi.domain.ProjectVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ProjectDAOTest {

	@Autowired
	private ProjectDAO dao;
	
	@Test
	public void testDao() {
		System.out.println(dao);
	}
	
	@Test
	public void testCreateProject() throws Exception {
		ProjectVO vo = new ProjectVO();
		vo.setPname("관리자 프로젝트");
		vo.setPcontent("관리자들의 하는 일을 프로젝트화 하는 것이다.");
		vo.setPstartdate(new Date());
		vo.setPendate(new Date());
		vo.setPcdt(Pcdt.READY);
		dao.createProject(vo);
	}

	@Test
	public void testReadProject() throws Exception {
		dao.readProject(3);
	}

	@Test
	public void testList() throws Exception {
		dao.list();
	}

	@Test
	public void testModityProject() throws Exception {
		ProjectVO vo = new ProjectVO();
		vo.setPno(3);
		vo.setPname("인력 관리 프로그램");
		vo.setPcontent("인력관리를 효율적으로 관리하기 위한 프로젝트이다.");
		vo.setPcdt(Pcdt.ONGOING);
		dao.modityProject(vo);
	}

	@Test
	public void testRemoveProject() throws Exception {
		dao.removeProject(2);
	}

}
