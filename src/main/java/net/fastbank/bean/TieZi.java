package net.fastbank.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="t_tiezi")
public class TieZi {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="tiezi_name")
	private String tieziTitle;
	@Column(name="tiezi_author")
	private String tieziAuthor;
	@Column(name="tiezi_content")
	private String tieziContent;
	public TieZi(String title, String author, String content) {
		super();
		this.tieziTitle = title;
		this.tieziAuthor = author;
		this.tieziContent = content;
	}
	public TieZi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTieziTitle() {
		return tieziTitle;
	}
	public void setTieziTitle(String title) {
		this.tieziTitle = title;
	}
	public String getTieziAuthor() {
		return tieziAuthor;
	}
	public void setTieziAuthor(String author) {
		this.tieziAuthor = author;
	}
	public String getTieziContent() {
		return tieziContent;
	}
	public void setTieziContent(String content) {
		this.tieziContent = content;
	}
	@Override
	public String toString() {
		return "TieZi [title=" + tieziTitle + ", author=" + tieziAuthor + ", content="
				+ tieziContent + "]";
	}

}
