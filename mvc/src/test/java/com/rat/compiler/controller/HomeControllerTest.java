package com.rat.compiler.controller;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;

public class HomeControllerTest {

	@Test
	public void test() {
		HomeController homeController = new HomeController();

		assertNotNull(homeController);
	}

}
