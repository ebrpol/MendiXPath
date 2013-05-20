package com.mendix.xpath;

public class NotEquals extends BinaryOperator {
	public NotEquals(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}
	
	public static NotEquals create(Expression expression1, Expression expression2) {
		return new NotEquals(expression1, expression2);
	}
	
	@Override
	protected void setOperator() {
		builder.append(NOT_EQUALS);		
	}
}
