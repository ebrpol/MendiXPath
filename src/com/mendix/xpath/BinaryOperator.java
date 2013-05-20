package com.mendix.xpath;

abstract class BinaryOperator implements Operator {
	protected StringBuilder builder;
	
	public BinaryOperator(Expression expression1, Expression expression2) {
		builder = new StringBuilder(5);
		
		builder.append(expression1.getStringBuilder());
		builder.append(SPACE);
		setOperator();
		builder.append(SPACE);
		builder.append(expression2.getStringBuilder());
	}
	
	protected abstract void setOperator();

	@Override
	public StringBuilder getStringBuilder() {
		return builder;
	}
	
	@Override
	public String toString() {
		return getStringBuilder().toString();
	}


}
