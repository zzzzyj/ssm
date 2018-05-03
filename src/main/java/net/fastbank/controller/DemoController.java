package net.fastbank.controller;

import java.util.Map;

import net.fastbank.bean.TieZi;
import net.fastbank.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@RequestMapping("/demo")
@Controller
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	
	@ResponseBody
	@RequestMapping(value="/create",produces="text/html;charset=utf-8")
	public String creat(TieZi tieZi) {
		demoService.create(tieZi);		
		return "redirect:success.jsp";
		
	}
	
	@RequestMapping(value="/query",method=RequestMethod.POST)
	public String query(String keywords,/*RedirectAttributes map*/Map<String,Object> map) {
		Map<String, Map<String, Object>> search = demoService.search(keywords);
		map.put("results", search);
		System.out.println(search);
		return "/tiezi_query_results";
	}
	
	

}
