
public class Kingdoms {

	private Kingdom[] Kingdoms;
	private int counter;
	
	public Kingdoms(int nKingdoms, int xmap, int ymap) {
		Kingdoms =  new Kingdom[nKingdoms];
		counter = 0;
	}
	public void addKindom(String teamName, int nCastles, int xmap, int ymap) {
		Kingdoms[counter++] =  new Kingdom(teamName,nCastles,xmap,ymap);
	}
	
	public String teamName(int i) {
		return Kingdoms[i].getTeamName();
	}
}
