package com.yi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yi.domain.ProjectVO;
import com.yi.service.ProjectService;

@Controller
@RequestMapping("/project/*")
public class ProjectController {
	@Autowired
	ProjectService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		List<ProjectVO> list = service.list();
		model.addAttribute("list", list);
		return "/project/list";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerGet() {
		return "/project/register";
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPost(ProjectVO vo) throws Exception {
		service.createProject(vo);
		return "redirect:/project/list";
	}
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public String read(int pno, Model model) throws Exception {
		ProjectVO vo = service.readByNo(pno);
		model.addAttribute("item", vo);
		return "/project/read";
	}
	
	@RequestMapping(value = "/modity", method = RequestMethod.GET)
	public String modityGet(int pno, Model model) throws Exception {
		ProjectVO vo =service.readByNo(pno);
		model.addAttribute("item", vo);
		return "/project/modity";
	}
	
	@RequestMapping(value = "/modity", method = RequestMethod.POST)
	public String modityPost(ProjectVO vo, Model model) throws Exception {
		service.modityProject(vo);
		model.addAttribute("item", vo);
		return "redirect:/project/read?pno="+vo.getPno();
	}
	
	@RequestMapping(value = "/remove", method = RequestMethod.GET)
	public String remove(int pno) throws Exception {
		service.removeProject(pno);
		return "redirect:/project/list";
	}
}
