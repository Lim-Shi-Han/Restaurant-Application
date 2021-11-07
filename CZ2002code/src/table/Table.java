package table;

public class Table {
	private int number;
	private int seating;
	private boolean reserved;
	private boolean occupied ;
        private int nump;
	
	public Table(int number, int seating, boolean reserved, boolean occupied)
	{
		this.number = number;
		this.seating = seating;
		this.reserved = reserved;
		this.occupied = occupied;
	}
	
	public void makeReservation(boolean res)
	{
		reserved = res;
	}
	public void addppl(int noperson)
	{
		nump = noperson;
	}
	
	public void setOccupied(boolean occupied)
	{
		this.occupied= occupied;
	}
	
	public boolean isReserved()
	{
		return reserved;
	}
	
	public boolean isOccupied()
	{
		return occupied;
	}
	
	public int getTableNo()
	{
		return number;
	}
	

}
