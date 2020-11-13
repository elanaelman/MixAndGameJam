
//Class representing Positions as integer duples.
public class Position {
	public int x;
	public int y;
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean equals(Position p) {
		return x==p.x && y==p.y;
	}
	
	public boolean equals(int x2, int y2) {
		return x==x2 && y==y2;
	}
}
