package com.manna.mockito.mockito_demo.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplStubTest {

	@Test
	void findtheGreatestFromAllData_basicScenario() {
		DataService dataServiceStub = new DataServiceStub();
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceStub);
		assertEquals(25, businessImpl.findtheGreatestFromAllData());
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int [] {25,15,5};
	}
	
}