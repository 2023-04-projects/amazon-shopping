package com.khadri.shopping.amazon.stock.category;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CategoryTest {

	@Test
	void testMensWear() {
		Scanner mockScanner = Mockito.mock(Scanner.class);
		Category mockCategory = Mockito.mock(Category.class);
	}

	@Test
	void testKidsWear() {
		Scanner mockScanner = Mockito.mock(Scanner.class);
		Category mockCategory = Mockito.mock(Category.class);
	}

	@Test
	void testWomensWear() {
		Scanner mockScanner = Mockito.mock(Scanner.class);
		Category mockCategory = Mockito.mock(Category.class);
	}

}
