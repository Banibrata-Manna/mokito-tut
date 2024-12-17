package com.manna.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {
	
	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;

	@Test
	void findtheGreatestFromAllData_basicScenario() {
		
		
		when(dataServiceMock.retrieveAllData())
		.thenReturn(new int [] {25,15,5});
		assertEquals(25, businessImpl.findtheGreatestFromAllData());
	}
	
	@Test
	void findtheGreatestFromAllData_OneValue() {
		
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData())
		.thenReturn(new int [] {25});
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		assertEquals(25, businessImpl.findtheGreatestFromAllData());
	}

}
