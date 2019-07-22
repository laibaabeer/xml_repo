package com.zensar.xml.sax.parsers;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MovieXmlHandler extends DefaultHandler {

	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		for(int i=start;i<start+length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println();
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Starting...");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		
		System.out.println("Start Element: "+qName);
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("End Element: "+qName);
	}

	

	

}
