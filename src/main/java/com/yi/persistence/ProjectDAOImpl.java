package com.yi.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yi.domain.ProjectVO;

@Repository
public class ProjectDAOImpl implements ProjectDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "mappers.ProjectMapper.";
	
	@Override
	public void createProject(ProjectVO vo) throws Exception {
		sqlSession.insert(namespace + "createProject", vo);
	}

	@Override
	public ProjectVO readProject(int pno) throws Exception {
		return sqlSession.selectOne(namespace + "readProject", pno);
	}

	@Override
	public List<ProjectVO> list() throws Exception {
		return sqlSession.selectList(namespace + "list");
	}

	@Override
	public void modityProject(ProjectVO vo) throws Exception {
		sqlSession.update(namespace + "modityProject", vo);
	}

	@Override
	public void removeProject(int pno) throws Exception {
		sqlSession.delete(namespace + "removeProject", pno);
	}

}
