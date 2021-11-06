
public class TableController {
	Table[] tables;
	
	public TableController() {
		tables = new Table[10];
		for(int i = 0; i < tables.length; i++)
			tables[i] = new Table(i+1);
	}
	public void ViewTable() {
		
	}
	public void ShowRecommendTable(int noOfPax) {
		
	}
	public Table SelectTable(int tableID) {
		return tables[tableID];
	}
}
