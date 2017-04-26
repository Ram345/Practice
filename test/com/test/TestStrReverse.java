package com.test;

import org.junit.Test;

import com.java.StrReverse;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestStrReverse {

	@Test
	public void testSuccess(){
		StrReverse strReverse = new StrReverse();
		assertThat("olleH", is("olleH"));
	}
}
