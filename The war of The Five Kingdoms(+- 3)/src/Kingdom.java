
public class Kingdom {
	
	private Army Army;
	private Castles Castles;
	private String kingdomName;
	private int nOwnedCastles;
	private int nSoldiers;
	
	public Kingdom(String teamName, int nCastles) {
		this.kingdomName = teamName;
		
		Army = new Army();
		Castles = new Castles(nCastles);
		nOwnedCastles = 0;
		nSoldiers = 0;
	}
	public String getKingdomName() {
		return kingdomName;
	}
	
	public void recruitUnit(String soldierType, Castle castle) {
		Army.recruitSoldier(soldierType, castle,kingdomName);
		nSoldiers++;
	}
	
	public void conquerCastle(Castle c) {
		Castles.addCastles(c);
		Castles.getCastle(c.getCastleName());
		nOwnedCastles++;
	}
	
	public String getConqueredCastleName(int i) {
		return Castles.getCastle(i).getCastleName();
	}
	
	public int getNOwnedCastles() {
		return nOwnedCastles;
	}
	
	public Castle getCastle(int i) {
		return Castles.getCastle(i);
	}
	
	public int getNSodiers() {
		return Army.getNSoldiers();
	}
	
	public Soldier getSoldier(int i) {
		return Army.getSoldier(i);
	}
	
	
}
