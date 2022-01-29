package Controller;
import model.*;
import service.*;
import javax.swing.*;

import org.jfree.data.category.DefaultCategoryDataset;

import java.util.*;
public class QuanLyThongKeController {

    private ThongKeService thongKeService = null;

    public QuanLyThongKeController() {
        this.thongKeService = new ThongKeServiceImpl();
        
}
    private void setDateToChart1(JPanel pnItem) {
    	List<Muon>listItem= thongKeService.getListByMuon();
    	
    		DefaultCategoryDataset  dataset = new DefaultCategoryDataset();
    		if(listItem!=null) {
    			for(Muon item:listItem) {
    				dataset.addValue(0, null, null);
    			}
    	}
    }
    
}
