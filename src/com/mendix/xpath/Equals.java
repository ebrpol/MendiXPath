package com.mendix.xpath;

public class Equals extends BinaryOperator {
	public Equals(Expression expression1, Expression expression2) {
		super(expression1, expression2);
	}
	
	public static Equals create(Expression expression1, Expression expression2) {
		return new Equals(expression1, expression2);
	}
	
	@Override
	protected void setOperator() {
		builder.append(EQUALS);		
	}
}
