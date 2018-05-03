package net.fastbank.service;

import java.util.Map;

import net.fastbank.bean.TieZi;

public interface DemoService {

	

	public void create(TieZi tieZi);

	public Map<String,Map<String,Object>> search(String keywords);

}
