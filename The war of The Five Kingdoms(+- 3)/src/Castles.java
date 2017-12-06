
public class Castles {

	private Castle[] Castles;
	private int counter;
	
	public Castles(int nCastles) {
		Castles = new Castle[nCastles];
		counter = 0;
	}
	
	public void addCastles(int x, int y, int money, String castleName) {
		Castles[counter++] = new Castle(x,y,money,castleName);
	}
	
	public void conquerCastle(String kingdomName,String castleName) {
		getCastle(castleName).conquerCastle(kingdomName);
	}
	
	public Castle getCastle(String castleName) {
		Castle c = null;
		
		for(int i = 0; i < counter && c == null; i++) {
			if(Castles[i].getCastleName().equals(castleName))
				c = Castles[i];
		}
		
		return c;
	}
	
	public Castle getCastle(int i) {
		return Castles[i];
	}
	
	public int getCastleMoney(int i) {
		return Castles[i].getMoney();
	}
	
	public void deleteCastle(int i) {
		for(int k = i; k < counter; k++)
			Castles[k]=Castles[k+1];
		
		counter--;
	}
	
}
