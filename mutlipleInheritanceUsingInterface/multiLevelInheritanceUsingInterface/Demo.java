package multiLevelInheritanceUsingInterface;

public class Demo {

	public static void main(String[] args) {
		
		BrazilFootballTeam b=new ManCity();
		
		b.playersInClubWsie();//invoke Overridden method in ManCity class
		
		ManCity m=new ManCity();
		
		m.playersInClubWise();//invoke normal method in ManCity class
		
		BrazilUnder19Team b1=new ManCity();
		
		b1.playersInClubWsie();
		
		b1.under19PlayersListClubWise();
		
		b1.under23PlayersListClubWise();
		
		BrazilUnder23Team b2=new ManCity();
		
		b2.playersInClubWsie();
		
		b2.under23PlayersListClubWise();
		
		/*
		 * b2 object is not access under19PlayersInClubWise method but b1 object access Under23 method because 
           child Interface have rights to access parent Interface method but Parent Interface Doesn't have Rights to access child Interface method
               */
		 
	}
}


