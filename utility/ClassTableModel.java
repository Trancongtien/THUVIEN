package utility;
import java.util.*;
import javax.swing.table.DefaultTableModel;

import model.*;
public class ClassTableModel {
public DefaultTableModel setTableSach(List<Sach> listitem,String[] listColumn) {
	int columns = listColumn.length;
	DefaultTableModel dtm = new DefaultTableModel() {
		@Override
		public boolean isCellEditable(int rowIndex,int colIdenx) {
			return false;
		}
		
		
	};
	dtm.setColumnIdentifiers(listColumn);
	Object[] obj = null;
	int num = listitem.size();
	Sach s=null;
	for (int i = 0; i <num; i++) {
		s= listitem.get(i);
		obj[0]=s.getMASACH();
		obj[1]=(i+1);
		obj[2]= s.getTENSACH();
		obj[3]= s.getTOMTAT();
		obj[4]=s.getSOTRANG();
		obj[5]=s.getDONGIA();
		obj[6]=s.getNAMXUATBAN();
		obj[7]=s.getTACGIA();
		obj[8]=s.getMATHELOAI();
		obj[9]=s.getMANXB();
		dtm.addRow(obj);
	}
	return dtm;
}
}
