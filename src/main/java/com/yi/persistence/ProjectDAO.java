package com.yi.persistence;

import java.util.List;

import com.yi.domain.ProjectVO;

public interface ProjectDAO {
	public void createProject(ProjectVO vo) throws Exception;
	public ProjectVO readProject(int pno) throws Exception;
	public List<ProjectVO> list() throws Exception;
	public void modityProject(ProjectVO vo) throws Exception;
	public void removeProject(int pno) throws Exception;
}
