package com.yi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yi.domain.ProjectVO;
import com.yi.persistence.ProjectDAO;

@Service
public class ProjectService {
	@Autowired
	ProjectDAO dao;
	
	public void createProject(ProjectVO vo) throws Exception {
		dao.createProject(vo);
	}
	
	public ProjectVO readByNo(int pno) throws Exception {
		return dao.readProject(pno);
	}
	
	public List<ProjectVO> list() throws Exception{
		return dao.list();
	}
	
	public void modityProject(ProjectVO vo) throws Exception {
		dao.modityProject(vo);
	}
	
	public void removeProject(int pno) throws Exception {
		dao.removeProject(pno);
	}
}
