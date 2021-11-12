package table;

public class Table {
		private int number;
		private int seating;
		
		public Table(int number, int seating)
		{
			this.number = number;
			this.seating = seating;
		}

		public int numberSeats()
		{
			return seating;
		}
		
		public int getTableNo()
		{
			return number;
		}
}
