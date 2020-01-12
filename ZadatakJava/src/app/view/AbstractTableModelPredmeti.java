package app.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import modeli.PredmetBaza;


public class AbstractTableModelPredmeti extends AbstractTableModel {

	private static final long serialVersionUID = 1L;

	private List<Boolean> koJeOtkacen;

	public AbstractTableModelPredmeti() {
		this.koJeOtkacen = new ArrayList<>();
		for (int i = 0; i < PredmetBaza.getInstance().getPredmeti().size(); i++) {
			koJeOtkacen.add(false);
		}
	}

	@Override
	public int getRowCount() {
		return PredmetBaza.getInstance().getPredmeti().size();
	}

	@Override
	public int getColumnCount() {
		return PredmetBaza.getInstance().getColumnCount();
	}

	@Override
	public String getColumnName(int column) {
		return PredmetBaza.getInstance().getColumnName(column);
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
			return String.class;
		default:
			return null;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		return PredmetBaza.getInstance().getValueAt(rowIndex, columnIndex);

	}

	public void setValueAt(String aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);


	}
	public void predmetDodat() {
		this.koJeOtkacen.add(false);
	}

	public void predmetUklonjen(int rowIndex) {
		this.koJeOtkacen.remove(rowIndex);
	}



}

