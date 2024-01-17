package Main;
import java.util.List;

import Frame.TableToFrame;
import ShemaTableElements.ShemaTableA;
public class MainApp {

	public static void main(String[] args) {
		UserTableModel tabModel = new UserTableModel();
		List<ShemaTableA> shTables = tabModel.getTables();
		ShemaTableA premierShema = shTables.get(1);
		new TableToFrame(premierShema);

	}

}
