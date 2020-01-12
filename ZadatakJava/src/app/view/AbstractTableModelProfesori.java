package app.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modeli.ProfesorBaza;

public class AbstractTableModelProfesori extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private List<Boolean> koJeOtkacen;

	public AbstractTableModelProfesori() {
		this.koJeOtkacen = new ArrayList<>();
		for (int i = 0; i < ProfesorBaza.getInstance().getProfesori().size(); i++) {
			koJeOtkacen.add(false);
		}
	}

	@Override
	public int getRowCount() {
		return ProfesorBaza.getInstance().getProfesori().size();
	}

	@Override
	public int getColumnCount() {
		return ProfesorBaza.getInstance().getColumnCount();
	}

	@Override
	public String getColumnName(int column) {
		return ProfesorBaza.getInstance().getColumnName(column);
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
			return String.class;
		default:
			return null;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return ProfesorBaza.getInstance().getValueAt(rowIndex, columnIndex);

	}

	public void setValueAt(String aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);


	}
	public void profesorDodat() {
		this.koJeOtkacen.add(false);
	}

	public void profesorUklonjen(int rowIndex) {
		this.koJeOtkacen.remove(rowIndex);
	}



}

