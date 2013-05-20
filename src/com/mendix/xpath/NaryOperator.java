package com.mendix.xpath;

interface NaryOperator extends Operator {
	public void setExpressions(Expression... expressions);
}
