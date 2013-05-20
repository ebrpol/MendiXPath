package com.mendix.xpath;

public class Constraint implements Expression {
	private StringBuilder builder;
	
	public Constraint(Expression expression) {
		builder = new StringBuilder(3);
		
		builder.append(CONSTRAINT_OPEN);
		builder.append(expression.getStringBuilder());
		builder.append(CONSTRAINT_CLOSE);
	}
	
	public static Constraint create(Expression expression) {
		return new Constraint(expression);
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
