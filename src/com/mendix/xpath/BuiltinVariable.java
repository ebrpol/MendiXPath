package com.mendix.xpath;

public enum BuiltinVariable {
	CurrentUser("[%CurrentUser%]"),
	CurrentObject("[%CurrentObject%]"),

	CurrentDateTime("[%CurrentDateTime%]"),
	BeginOfCurrentDay("[%BeginOfCurrentDay%]"),
	EndOfCurrentDay("[%EndOfCurrentDay%]"),
	BeginOfCurrentHour("[%BeginOfCurrentHour%]"),
	EndOfCurrentHour("[%EndOfCurrentHour%]"),
	BeginOfCurrentMinute("[%BeginOfCurrentMinute%]"),
	EndOfCurrentMinute("[%EndOfCurrentMinute%]"),
	BeginOfCurrentMonth("[%BeginOfCurrentMonth%]"),
	EndOfCurrentMonth("[%EndOfCurrentMonth%]"),
	BeginOfCurrentWeek("[%BeginOfCurrentWeek%]"),
	EndOfCurrentWeek("[%EndOfCurrentWeek%]"),

	DayLength("[%DayLength%]"),
	HourLength("[%HourLength%]"),
	MinuteLength("[%MinuteLength%]"),
	SecondLength("[%SecondLength%]"),
	WeekLength("[%WeekLength%]"),
	YearLength("[%YearLength%]"),
	
	Id("id"),
	
	Empty("empty");
	
	private String stringRepresentation;

	private BuiltinVariable(String stringRepresentation) {
		this.stringRepresentation = stringRepresentation;
	}
	
	public String toString() {
		return stringRepresentation;
	}
	
}
