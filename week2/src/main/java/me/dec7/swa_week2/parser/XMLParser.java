package me.dec7.swa_week2.parser;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="SortStrategy")
public class XMLParser {
	
	@Element
	private String sortType;

	public String getSortType() {
		return sortType;
	}
	
}
