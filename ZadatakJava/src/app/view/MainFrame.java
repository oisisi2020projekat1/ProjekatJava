package app.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;

import kontroleri.PredmetController;
import kontroleri.ProfesorController;
import kontroleri.StudentController;


import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class MainFrame extends JFrame {

	private static final long serialVersionUID = 4703527718003660405L;

	private static MainFrame instance = null;

	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
		}
		return instance;
	}

	private JTable tabelaStudenata;
	private JTable tabelaProfesora;
	private JTable tabelaPredmeta;
	private JTextField textField;

	public MainFrame() {

		Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenDimension.width*3/4, screenDimension.height*3/4);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		inicijalizujAkcije();
		prikaziTabeluStudenata();
	}

	public void azurirajPrikaz(String akcija, int vrednost) {
		AbstractTableModelStudenti model = (AbstractTableModelStudenti) tabelaStudenata.getModel(); //OVDE JE KLASA ABSTABLEMODEL
		if (akcija != null) {
			if (akcija.toUpperCase().trim().equals("DODAT")) {
				model.igracDodat();
			} else if (akcija.toUpperCase().trim().equals("UKLONJEN")) {
				model.igracUklonjen(vrednost);
			}
		}
		model.fireTableDataChanged();
		validate();
	}

	public void azurirajPrikazProfesora(String akcija, int vrednost) {
		AbstractTableModelProfesori model_1 = (AbstractTableModelProfesori) tabelaProfesora.getModel(); //OVDE JE KLASA ABSTABLEMODEL
		if (akcija != null) {
			if (akcija.toUpperCase().trim().equals("DODAT")) {
				model_1.profesorDodat();
			} else if (akcija.toUpperCase().trim().equals("UKLONJEN")) {
				model_1.profesorUklonjen(vrednost);
			}
		}
		model_1.fireTableDataChanged();
		validate();
	}

	public void azurirajPrikazPredmeta(String akcija, int vrednost) {
		AbstractTableModelPredmeti model_2 = (AbstractTableModelPredmeti) tabelaPredmeta.getModel(); //OVDE JE KLASA ABSTABLEMODEL
		if (akcija != null) {
			if (akcija.toUpperCase().trim().equals("DODAT")) {
				model_2.predmetDodat();
			} else if (akcija.toUpperCase().trim().equals("UKLONJEN")) {
				model_2.predmetUklonjen(vrednost);
			}
		}
		model_2.fireTableDataChanged();
		validate();
	}

	private void inicijalizujAkcije() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mFile = new JMenu("File");
		menuBar.add(mFile);
		mFile.setMnemonic(KeyEvent.VK_F);

		JMenuItem miNew = new JMenuItem("New");
		miNew.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Dodavanje pw = new Dodavanje();

				pw.setVisible(true);
			}
		});

		miNew.setIcon(new ImageIcon("images/new.png"));
		miNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		mFile.add(miNew);

		JMenuItem miClose = new JMenuItem("Close");
		miClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		miClose.setIcon(new ImageIcon("images/close.png"));
		miClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		mFile.add(miClose);

		JMenu mEdit = new JMenu("Edit");
		mEdit.setMnemonic(KeyEvent.VK_I);
		menuBar.add(mEdit);

		JMenuItem miEdit = new JMenuItem("Edit");
		miEdit.setIcon(new ImageIcon("images/edit.png"));
		miEdit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		mEdit.add(miEdit);

		JMenuItem miDelete = new JMenuItem("Delete");
		miDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!tabelaPredmeta.getSelectionModel().isSelectionEmpty() || !tabelaStudenata.getSelectionModel().isSelectionEmpty() || !tabelaProfesora.getSelectionModel().isSelectionEmpty()) {
					PredmetController.getInstance().izbrisiPredmet(tabelaPredmeta.getSelectedRow());
					ProfesorController.getInstance().izbrisiProfesora(tabelaProfesora.getSelectedRow());
					StudentController.getInstance().izbrisiStudenta(tabelaStudenata.getSelectedRow());
				}else {
					return;
				}
			}	});
		miDelete.setIcon(new ImageIcon("images/delete.png"));
		miDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		mEdit.add(miDelete);


		JMenu mHelp = new JMenu("Help");
		mHelp.setMnemonic(KeyEvent.VK_P);
		menuBar.add(mHelp);

		JMenuItem miHelp = new JMenuItem("Help");
		miHelp.setIcon(new ImageIcon("images/help.png"));
		miHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		mHelp.add(miHelp);

		JMenuItem miAbout = new JMenuItem("About");
		miAbout.setIcon(new ImageIcon("images/about.png"));
		miAbout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		mHelp.add(miAbout);

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);

		JLabel label = new JLabel("      Studentska sluzba                                           ");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);

		JLabel label_1 = new JLabel(dateFormat.format(cal.getTime()));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(label_1);


		JToolBar toolBar = new JToolBar();
		getContentPane().add(toolBar, BorderLayout.NORTH);

		JButton btnAdd = new JButton();

		btnAdd.setToolTipText("Klikni za dodavanje studenta.");
		btnAdd.setIcon(new ImageIcon ("images/add.png"));
		btnAdd.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				AddingDialog nw = new AddingDialog();

				nw.setVisible(true);
			}
		});
		toolBar.add(btnAdd);

		JButton btnEdit = new JButton();
		btnEdit.setToolTipText("Klikni za promene u oznacenom.");
		btnEdit.setIcon(new ImageIcon ("images/write.png"));
		toolBar.add(btnEdit);

		JButton btnDelete = new JButton();
		btnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(!tabelaPredmeta.getSelectionModel().isSelectionEmpty() || !tabelaStudenata.getSelectionModel().isSelectionEmpty() || !tabelaProfesora.getSelectionModel().isSelectionEmpty()) {
					PredmetController.getInstance().izbrisiPredmet(tabelaPredmeta.getSelectedRow());
					ProfesorController.getInstance().izbrisiProfesora(tabelaProfesora.getSelectedRow());
					StudentController.getInstance().izbrisiStudenta(tabelaStudenata.getSelectedRow());
				}else {
					return;
				}
			}	});
		btnDelete.setToolTipText("Klikni za brisanje oznacenog.");
		btnDelete.setIcon(new ImageIcon ("images/trash.png"));
		toolBar.add(btnDelete);

		JButton btnAddPredmet = new JButton();
		btnAddPredmet.setToolTipText("Klikni za dodavanje predmeta.");
		btnAddPredmet.setIcon(new ImageIcon ("images/addpredmet.png"));
		btnAddPredmet.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				AddingDialogPredmet kw = new AddingDialogPredmet();

				kw.setVisible(true);
			}
		});
		toolBar.add(btnAddPredmet);

		JButton btnAddProf = new JButton();
		btnAddProf.setToolTipText("Klikni za dodavanje profesora.");
		btnAddProf.setIcon(new ImageIcon ("images/addprof.png"));
		btnAddProf.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				AddingDialogProfesor mw = new AddingDialogProfesor();

				mw.setVisible(true);
			}
		});
		toolBar.add(btnAddProf);

		JButton btnSrch = new JButton();
		btnSrch.setToolTipText("Pretrazi...");
		btnSrch.setIcon(new ImageIcon("images/search.png"));
		toolBar.add(Box.createHorizontalGlue());

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		toolBar.add(textField);
		textField.setColumns(10);

		toolBar.add(btnSrch);
	}

	private void prikaziTabeluStudenata() {
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		getContentPane().add(tabbedPane, BorderLayout.CENTER);

		tabelaStudenata = new StudentiJTable();
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout(0, 0));
		panel.add(new JScrollPane(tabelaStudenata));
		tabbedPane.addTab("Studenti", null, panel, null);

		tabelaProfesora = new ProfesoriJTable();
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new BorderLayout(0, 0));
		panel_1.add(new JScrollPane(tabelaProfesora));
		tabbedPane.addTab("Profesori", null, panel_1, null);
		getContentPane().add(tabbedPane);

		tabelaPredmeta = new PredmetiJTable();
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(new BorderLayout(0, 0));
		panel_2.add(new JScrollPane(tabelaPredmeta));
		tabbedPane.addTab("Predmeti", null, panel_2, null);
		getContentPane().add(tabbedPane);

		this.azurirajPrikaz(null, -1);

	}
}
