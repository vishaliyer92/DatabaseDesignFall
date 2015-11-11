/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libra;

/**
 *
 * @author Vishal
 */

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CheckInSearch extends AbstractTableModel{
    private String[] columnNames = {"Book ID", "Borrower ID", "First Name", "Last Name"};
    
    private String [][] tableData;
    public CheckInSearch(String [][] tableData)
    {
      this.tableData = tableData;   
    }
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return tableData.length;
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        return tableData[row][col];
    }
}
