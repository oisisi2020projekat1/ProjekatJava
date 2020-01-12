package app.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modeli.StudentBaza;

public class AbstractTableModelStudenti extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private List<Boolean> koJeOtkacen;

	public AbstractTableModelStudenti() {
		this.koJeOtkacen = new ArrayList<>();
		for (int i = 0; i < StudentBaza.getInstance().getStudenti().size(); i++) {
			koJeOtkacen.add(false);
		}
	}

	@Override
	public int getRowCount() {
		return StudentBaza.getInstance().getStudenti().size();
	}

	@Override
	public int getColumnCount() {
		return StudentBaza.getInstance().getColumnCount();
	}

	@Override
	public String getColumnName(int column) {
		return StudentBaza.getInstance().getColumnName(column);
	}

	// da bismo mogli prikazati dugme
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
			return String.class;
		default:
			return null;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return StudentBaza.getInstance().getValueAt(rowIndex, columnIndex);

	}

	public void setValueAt(String aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);


	}
	public void igracDodat() {
		this.koJeOtkacen.add(false);
	}

	public void igracUklonjen(int rowIndex) {
		this.koJeOtkacen.remove(rowIndex);
	}



}

