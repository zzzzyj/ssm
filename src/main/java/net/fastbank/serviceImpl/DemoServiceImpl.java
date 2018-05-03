/*package net.fastbank.serviceImpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import net.fastbank.bean.TieZi;
import net.fastbank.mapper.TieziMapper;
import net.fastbank.service.DemoService;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	TieziMapper mapper;
	@Autowired
	SolrServer solrServer;
	public void create(TieZi tieZi) {
		// TODO Auto-generated method stub
		mapper.insert(tieZi);
		SolrInputDocument document = new SolrInputDocument();
		document.addField("id", tieZi.getId());
		document.addField("tiezi_name", tieZi.getTieziTitle());
		document.addField("tiezi_author", tieZi.getTieziAuthor());
		document.addField("tiezi_content", tieZi.getTieziContent());
		try {
			solrServer.add(document);
			solrServer.add(document);
			solrServer.commit();
		} catch (SolrServerException | IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
		
	}


	@Override
	public Map<String, Map<String, Object>> search(String keywords) {
	
		Map<String ,Map<String, Object>> finalMap = new HashMap<String, Map<String,Object>>();
		SolrQuery solrQuery = new SolrQuery();
		//设置查询关键字及查询的字�?
		solrQuery.setQuery(keywords);
		solrQuery.set("df", "key_words");
		//设置高亮
		solrQuery.setHighlight(true);
		solrQuery.addHighlightField("tiezi_name");
		solrQuery.addHighlightField("tiezi_author");
		solrQuery.setHighlightSimplePre("<span style=\"color:red\">");
		solrQuery.setHighlightSimplePost("</span>");
		try {
			
			//查询并处理数据，封装到map�?
			QueryResponse query = solrServer.query(solrQuery);
			SolrDocumentList results = query.getResults();
			
			Set<String> fieldNames = null;
			for (SolrDocument solrDocument : results) {
				String id = (String) solrDocument.getFieldValue("id");
				Map<String, Object> docMap = new HashMap<>();
				fieldNames = solrDocument.keySet();
				
				for (String key : fieldNames) {
					if(key.equals("_version_")||key.equals("id")) {
						continue;
					}
					docMap.put(key,solrDocument.getFieldValue(key));
				}	
				finalMap.put(id, docMap);
				System.out.println(finalMap);
			}
			
			//获取高亮文档并替代已封装进map的文档字�?
			Map<String, Map<String, List<String>>> highlighting = query.getHighlighting();
			
			Set<String> idSet = highlighting.keySet();
			for (String id : idSet) {				
				Map<String, List<String>> highLightDocMap = highlighting.get(id);
				Map<String, Object> nonHighLightDocMap = finalMap.get(id);
				for (String fieldName : fieldNames) {
					if(fieldName.equals("_version_")||fieldName.equals("id")) {
						continue;
					}
					List<String> list = highLightDocMap.get(fieldName);
					if(list!=null && list.size()>0) {
						nonHighLightDocMap.put(fieldName, list.get(0));
					}
				}
			}
			System.out.println(finalMap);
			return finalMap;
			
			
		} catch (SolrServerException e) {
			e.printStackTrace();
			throw new RuntimeException(e.getMessage());
		}
	}
	
}
*/