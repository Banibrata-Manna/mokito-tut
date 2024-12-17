package com.manna.mockito.mockito_demo.business;

public class SomeBusinessImpl {
	private DataService dataService;
	
	
	public SomeBusinessImpl(DataService dataService) {
		this.dataService = dataService;
	}

	public int findtheGreatestFromAllData() {
		int max = Integer.MIN_VALUE;
		for (int i : dataService.retrieveAllData()) {
			max = Math.max(max, i);
		}
		return max;
	}
}

interface DataService {
	int[] retrieveAllData();
}
