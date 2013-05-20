package com.mendix.xpath;

import java.util.Date;

public class Value implements Expression {
	private StringBuilder builder = new StringBuilder();
	
	public Value(String string) {
		if (string == null)
			addEmpty();
		else {
			builder.append(STRING_OPEN);
			// TODO: escape when in Mendix project (and having Apache lib)
			//builder.append(StringEscapeUtils.escapeXml(string));
			builder.append(string);
			builder.append(STRING_CLOSE);
		}
	}
	
	public Value(Byte b) {
		if (b == null)
			addEmpty();
		else
			builder.append(b);
	}
	
	public Value(Integer integer) {
		if (integer == null)
			addEmpty();
		else
			builder.append(integer);
	}
	
	public Value(Long l) {
		if (l == null)
			addEmpty();
		else
			builder.append(l);
	}
	
	public Value(Float f) {
		if (f == null)
			addEmpty();
		else
			builder.append(f);
	}
	
	public Value(Double d) {
		if (d == null)
			addEmpty();
		else
			builder.append(d);
	}
	
	public Value(Boolean bool) {
		if (bool == null)
			addEmpty();
		else {
			builder.append(bool);
			builder.append(GROUP_OPEN);
			builder.append(GROUP_CLOSE);
		}
	}
	
	public Value(Date date) {
		if (date == null)
			addEmpty();
		else
			date.getTime();
	}
	
	//TODO: implement Mendix Objects
	/*public Value(IMendixIdentifier iMendixIdentifier) {
		if (iMendixIdentifier == null)
			addEmpty();
		else
			builder.append(iMendixIdentifier.getGuid());
	}
	
	public Value(IMendixObject iMendixObject) {
		if (iMendixObject == null)
			addEmpty();
		else
			builder.append(iMendixObject.getId());
	}*/
	
	public Value(BuiltinVariable builtinVariable) {
		if (builtinVariable == null)
			addEmpty();
		else
			builder.append(builtinVariable);
	}
	
	public static Value create(String string) {
		return new Value(string);
	}
	
	private void addEmpty() {
		builder.append(BuiltinVariable.Empty);
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
