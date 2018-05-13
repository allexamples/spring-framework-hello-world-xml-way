package org.allexamples.springframework.helloworld.xmlway;

public class SmartPhone {

	final private NetworkService networkService;

	public SmartPhone(NetworkService networkService) {
		this.networkService = networkService;
	}

	public void makeCall() {
		String network = networkService.getNetwork();
		System.out.println("Making call using " + network);
	}

}
