package com.mendix.xpath.test;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mendix.xpath.Constraint;
import com.mendix.xpath.Equals;
import com.mendix.xpath.Value;
import com.mendix.xpath.XPathBuilder;

public class XPathBuilderBasicTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void basic() {
		XPathBuilder xpath = XPathBuilder.create("Test");
		assertEquals("//Test", xpath.toString());
	}

	@Test
	public void equalsConstraintString() {
		XPathBuilder xpath = XPathBuilder.create("Test").addConstraint(
				Constraint.create(
						Equals.create(Value.create("String1"), Value.create("String2"))
				)
		);
		
		assertEquals("//Test[\"String1\" = \"String2\"]", xpath.toString());
	}
	
	@Test
	public void equalsConstraintInt() {
		XPathBuilder xpath = XPathBuilder.create("Test").addConstraint(
				Constraint.create(
						Equals.create(new Value(123), Value.create("String2"))
				)
		);
		
		assertEquals("//Test[123 = \"String2\"]", xpath.toString());
	}
	
	@Test
	public void equalsConstraintLong() {
		XPathBuilder xpath = XPathBuilder.create("Test").addConstraint(
				Constraint.create(
						Equals.create(new Value(new Long(123)), Value.create("String2"))
				)
		);
		
		assertEquals("//Test[123 = \"String2\"]", xpath.toString());
	}
	
	@Test
	public void equalsConstraintByte() {
		XPathBuilder xpath = XPathBuilder.create("Test").addConstraint(
				Constraint.create(
						Equals.create(new Value(new Byte((byte) 123)), Value.create("String2"))
				)
		);
		
		assertEquals("//Test[123 = \"String2\"]", xpath.toString());
	}
	
	@Test
	public void equalsConstraintBool() {
		XPathBuilder xpath = XPathBuilder.create("Test").addConstraint(
				Constraint.create(
						Equals.create(new Value(true), Value.create("String2"))
				)
		);
		
		assertEquals("//Test[true() = \"String2\"]", xpath.toString());
	}
	
	@Test
	public void equalsConstraintDouble() {
		XPathBuilder xpath = XPathBuilder.create("Test").addConstraint(
				Constraint.create(
						Equals.create(new Value(2.0), Value.create("String2"))
				)
		);
		
		assertEquals("//Test[2.0 = \"String2\"]", xpath.toString());
	}
	
	@Test
	public void equalsConstraintFloat() {
		XPathBuilder xpath = XPathBuilder.create("Test").addConstraint(
				Constraint.create(
						Equals.create(new Value(2.0F), Value.create("String2"))
				)
		);
		
		assertEquals("//Test[2.0 = \"String2\"]", xpath.toString());
	}
	

}
