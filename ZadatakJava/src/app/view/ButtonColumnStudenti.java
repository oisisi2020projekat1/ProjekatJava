package app.view;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.AbstractCellEditor;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ButtonColumnStudenti extends AbstractCellEditor
implements TableCellRenderer, TableCellEditor, MouseListener {

	private static final long serialVersionUID = 1343768131059619058L;

	// dugme koje se iscrtava
	//private JButton renderButton;
	// dugme koje obradjuje akciju
	//private JButton editorButton;
	// referenca na tabelu
	private JTable table;
	// da li je aktivno editovanje celije tabele
	// (da li se obradjuju dogadjaji pritiska misa)
	//private boolean isEditorActive = false;

	public ButtonColumnStudenti(JTable table, int column) {
		// povezivanje sa tabelom
		this.table = table;
		// nacin iscrtavanje celije
		//this.table.getColumnModel().getColumn(column).setCellRenderer(this);
		// nacin editovanja celije
		//this.table.getColumnModel().getColumn(column).setCellEditor(this);
		this.table.addMouseListener(this);

		// dugme koje ce biti iscrtavanp
		//this.renderButton = new JButton("...");
		//this.editorButton = new JButton("...");

		//this.editorButton.addActionListener(new ActionListener() {
		// mozemo odavde pozvati nas kontroler da se nesto smisleno odradi
		//@Override
		//public void actionPerformed(ActionEvent e) {
		//	fireEditingStopped();
		//	JOptionPane.showMessageDialog(table, "Selektovan je igrac u redu: " + table.getSelectedRow());
	}


	//this.isEditorActive = false;


	//@Override
	//public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
	//	int row, int column) {
	// U ovom primeru, sva dugmad ce imati isti ispis,
	// za promenu ispisa mozemo koristi vrednost parametra value
	//return new IgraciTablePanel(this.renderButton, 50, 50);
	//}

	//@Override
	//public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
	// Drugom dugmetu se prosledjuje klik misa
	//return new IgraciTablePanel(this.editorButton, 50, 50);
	//}

	//@Override
	//public Object getCellEditorValue() {
	// u sustini ne radimo nikakvu izmenu, pa nam ova vrednosti nije preterano bitna
	//return null;
	//}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	//@Override
	//public void mousePressed(MouseEvent e) {
	//if (table.isEditing() && table.getCellEditor() == this) {
	//this.isEditorActive = true;
	//}
	//}

	//@Override
	//public void mouseReleased(MouseEvent e) {
	// ekplicitno navodimo da je editovanje celije je zavrseno
	//if (isEditorActive && table.isEditing()) {
	//table.getCellEditor().stopCellEditing();
	//}
	//isEditorActive = false;
	//}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}


	//@Override
	//public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
	//	int row, int column) {
	// TODO Auto-generated method stub
	//return null;
	//}


	@Override
	public Component getTableCellEditorComponent(JTable arg0, Object arg1, boolean arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Object getCellEditorValue() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}


	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// TODO Auto-generated method stub
		return null;
	}

}
