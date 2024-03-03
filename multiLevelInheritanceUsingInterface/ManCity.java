package multiLevelInheritanceUsingInterface;

public class ManCity implements BrazilUnder19Team{
	
	public void playersInClubWise()
	{
		System.out.println("Normal method in Man city");
	}
	
	public void under23PlayersListClubWise()
	{
	    System.out.println("unde23 playersList method is calling");	
	}
	public void under19PlayersListClubWise()
	{
		System.out.println("Under19 playersList method is calling");
	}
	@Override
	public void playersInClubWsie() {
		System.out.println("Override BrazilFootballTeam method is calling");
	}

	}
	
    

