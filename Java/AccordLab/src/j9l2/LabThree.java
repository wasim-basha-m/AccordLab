package j9l2;

class FrequentFlyerMember {
	String memberType;

	FrequentFlyerMember(String memberType) {
		this.memberType = memberType;
	}

	void displayMembership() {
		System.out.println("Membership Type: " + memberType);
	}
}

class PlatinumMember extends FrequentFlyerMember {
	PlatinumMember() {
		super("Platinum");
	}

	void accessLounge() {
		System.out.println("Accessing lounge...");
	}

	void accessWaitingRoom() {
		System.out.println("Accessing waiting room...");
	}
}

class GoldMember extends FrequentFlyerMember {
	GoldMember() {
		super("Gold");
	}

	void accessWaitingRoom() {
		System.out.println("Accessing waiting room...");
	}
}

public class LabThree {
	public static void main(String[] args) {
		PlatinumMember platinumMember = new PlatinumMember();
		platinumMember.displayMembership();
		platinumMember.accessLounge();
		platinumMember.accessWaitingRoom();
		System.out.println();
		GoldMember goldMember = new GoldMember();
		goldMember.displayMembership();
		goldMember.accessWaitingRoom();
	}
}
