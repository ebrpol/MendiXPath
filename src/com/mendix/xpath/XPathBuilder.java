package com.mendix.xpath;

public class XPathBuilder implements XPathConstants {
	private StringBuilder builder;
	
	public XPathBuilder(String entityName) {
		builder = new StringBuilder();
		builder.append(XPathConstants.ALL);
		builder.append(entityName);
	}
	
	public static XPathBuilder create(String entityName) {
		return new XPathBuilder(entityName);
	}
	
	public XPathBuilder addConstraint(Constraint constraint) {
		builder.append(constraint);
		return this;
	}
	
	@Override
	public String toString() {
		return builder.toString();
	}

}
