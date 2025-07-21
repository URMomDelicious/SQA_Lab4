package main;

public class Ranking {

	public static String calculateRank(int purchase, int visit, int points) {
        if (purchase >= 100000 && visit >= 6 && points >= 1000) return "Platinum";
        if (purchase >= 50000 && purchase < 100000 && visit >= 3 && visit <= 5 && points >= 500 && points <= 1000) return "Gold";
        if (purchase >= 10000 && purchase < 50000 && visit >= 1 && visit <= 2 && points >= 100 && points <= 500) return "Silver";
        return "Standard";
    }		
	
}
