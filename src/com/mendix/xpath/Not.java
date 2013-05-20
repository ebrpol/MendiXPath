package com.mendix.xpath;

public class Not implements Expression {
	private StringBuilder builder;
	
	public Not(Expression expression) {
		builder = new StringBuilder(4);
		builder.append(NOT);
		builder.append(GROUP_OPEN);
		builder.append(expression.getStringBuilder());
		builder.append(GROUP_CLOSE);
	}
	
	public static Not create(Expression expression) {
		return new Not(expression);
	}
	
	@Override
	public StringBuilder getStringBuilder() {
		return builder;
	}
	
	@Override
	public String toString() {
		return getStringBuilder().toString();
	}

}
