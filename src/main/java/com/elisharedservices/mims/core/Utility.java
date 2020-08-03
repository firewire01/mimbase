package com.elisharedservices.mims.core;

public abstract class Utility {
	
   public static String generateRequest(String type, String data) {
		StringBuilder xml = new StringBuilder();
		xml.append("<Request>");
		xml.append("<" + type +  ">");
		xml.append(data);
		xml.append("</" + type +  ">");
		xml.append("</Request>");
		return xml.toString();
	}
   
   public static String addElement(String base, String element, String value) {
		StringBuilder xml = new StringBuilder();
		xml.append("<" + base + ">");
		xml.append("<" + element +  ">");
		xml.append(value);
		xml.append("</" + element +  ">");
		xml.append("</" + base + ">");
		return xml.toString();	   
   }
   
   public static String addAttribute(String base, String element, String attribute, String value) {
		StringBuilder xml = new StringBuilder();
		xml.append("<" + base + ">");
		xml.append("<" + element + " " + attribute + "=\"" + value +  "\"/>");
		xml.append("</" + base + ">");
		return xml.toString();	   
   }   
   
}
