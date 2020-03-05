package com.fdmgroup.mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.anyString;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class SimpleMockitoTest {

	@Mock
	MyDatabase databaseMock;
	
	@Test
	public void mockTestThatUniQueIdReturnAValue() {
		// Create mock
		MyDatabase database = mock(MyDatabase.class);
		
		// Define the return value from the method
		when(database.getUniqueId()).thenReturn(43);
		
		assertEquals(43, database.getUniqueId());
	}
	
	@Test 
	public void testTheReturnValuesFromComparable() {
		Comparable<String> mockedComparable = mock(Comparable.class);
		when(mockedComparable.compareTo("Mockito")).thenReturn(1);
		when(mockedComparable.compareTo("Junit")).thenReturn(0);
		
		assertEquals(mockedComparable.compareTo("Mockito"), 1);
		assertEquals(mockedComparable.compareTo("Junit"), 0);
		
		when(mockedComparable.compareTo(anyString())).thenReturn(-1);
		assertEquals(mockedComparable.compareTo("XYZ"), -1);
	}
}
