package form;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class QLSV extends JFrame {

	private JPanel contentPane;
	private JTextField textMaSV;
	private JTextField textHoTen;
	private JTextField textEmail;
	private JTextField textSoDT;
	private JTable table;
	DefaultTableModel model1 = new DefaultTableModel();
	DefaultTableModel model2 = new DefaultTableModel();
	private JTextField textMaSVSearch;
	private JTextField textMaSV2;
	private JTextField textGDTC;
	private JTextField textHoTen2;
	private JTextField textTiengAnh;
	private JTextField textTinHoc;
	private JTable table_1;
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	JPanel panel = new JPanel();
	JPanel panel_2 = new JPanel();
	static QLSV frame;
	static ArrayList<Students> listStudent = new ArrayList<Students>();

	/**
	 * Launch the application.
	 */
	public void mainQLSV() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new QLSV();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLSV() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 786, 22);
		contentPane.add(menuBar);

		JMenu mnHeThong = new JMenu("H\u1EC7 th\u1ED1ng");
		menuBar.add(mnHeThong);

		JMenuItem mntmDangXuat = new JMenuItem("\u0110\u0103ng xu\u1EA5t");
		mntmDangXuat.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\logout1.png"));
		mnHeThong.add(mntmDangXuat);

		JMenuItem mntmThoat = new JMenuItem("Tho\u00E1t");
		mntmThoat.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\exit.png"));
		mnHeThong.add(mntmThoat);

		JMenu mnQuanLy = new JMenu("Qu\u1EA3n l\u00FD");
		menuBar.add(mnQuanLy);

		JMenuItem mntmQLSV = new JMenuItem("Qu\u1EA3n l\u00FD sinh vi\u00EAn");
		mntmQLSV.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\student1.png"));
		mnQuanLy.add(mntmQLSV);

		JMenu mnTroGiup = new JMenu("Tr\u1EE3 gi\u00FAp");
		menuBar.add(mnTroGiup);

		JMenuItem mntmGioiThieu = new JMenuItem("Gi\u1EDBi thi\u1EC7u");
		mntmGioiThieu.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\hoi1.png"));
		mnTroGiup.add(mntmGioiThieu);

		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 23, 786, 51);
		contentPane.add(toolBar);

		JButton btnDangXuat = new JButton("  ");
		btnDangXuat.setHorizontalAlignment(SwingConstants.LEADING);
		btnDangXuat.setToolTipText("");
		btnDangXuat.setContentAreaFilled(false);
		btnDangXuat.setBorder(null);
		btnDangXuat.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\logout.png"));
		toolBar.add(btnDangXuat);

		JButton btnStudent = new JButton("  ");
		btnStudent.setContentAreaFilled(false);
		btnStudent.setBorder(null);
		btnStudent.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\student.png"));
		toolBar.add(btnStudent);

		JButton btnDiem = new JButton("  ");
		btnDiem.setContentAreaFilled(false);
		btnDiem.setBorder(null);
		btnDiem.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\diem.png"));
		toolBar.add(btnDiem);

		JButton btnGioiThieu = new JButton("");
		btnGioiThieu.setContentAreaFilled(false);
		btnGioiThieu.setBorder(null);
		btnGioiThieu.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\hoi.png"));
		toolBar.add(btnGioiThieu);

		tabbedPane.setBounds(10, 85, 763, 500);
		contentPane.add(tabbedPane);

		panel.setLayout(null);

		JLabel lblQLSV = new JLabel("Quản lý sinh viên");
		lblQLSV.setForeground(Color.BLUE);
		lblQLSV.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQLSV.setBounds(10, 11, 292, 24);
		panel.add(lblQLSV);

		JLabel lblMaSV = new JLabel("Mã sinh viên");
		lblMaSV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaSV.setBounds(70, 49, 74, 19);
		panel.add(lblMaSV);

		JLabel lblDiaChi = new JLabel("Địa chỉ");
		lblDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDiaChi.setBounds(102, 215, 42, 19);
		panel.add(lblDiaChi);

		textMaSV = new JTextField();
		textMaSV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textMaSV.setColumns(10);
		textMaSV.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textMaSV.setBounds(165, 46, 230, 23);
		panel.add(textMaSV);

		textHoTen = new JTextField();
		textHoTen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textHoTen.setColumns(10);
		textHoTen.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textHoTen.setBounds(165, 80, 230, 23);
		panel.add(textHoTen);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textEmail.setColumns(10);
		textEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textEmail.setBounds(165, 114, 230, 23);
		panel.add(textEmail);

		textSoDT = new JTextField();
		textSoDT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textSoDT.setColumns(10);
		textSoDT.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textSoDT.setBounds(165, 148, 230, 23);
		panel.add(textSoDT);

		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Login.vaiTro.equals("Cán bộ đào tạo")) {
					JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập vào mục này!", "Cảnh báo",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		btnDiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!Login.vaiTro.equals("Giảng viên")) {
					JOptionPane.showMessageDialog(null, "Bạn không có quyền truy cập vào mục này!", "Cảnh báo",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});

		JRadioButton rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNam.setBounds(175, 180, 60, 23);
		panel.add(rdbtnNam);

		JRadioButton rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNu.setBounds(235, 180, 111, 23);
		panel.add(rdbtnNu);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(165, 216, 230, 69);
		panel.add(scrollPane);

		JTextArea textDiaChi = new JTextArea();
		textDiaChi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textDiaChi.setBorder(new BevelBorder(BevelBorder.LOWERED));
		scrollPane.setViewportView(textDiaChi);

		JLabel lblHoTen = new JLabel("Họ tên");
		lblHoTen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHoTen.setBounds(104, 83, 40, 19);
		panel.add(lblHoTen);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEmail.setBounds(111, 117, 33, 19);
		panel.add(lblEmail);

		JLabel lblSoDT = new JLabel("Số điện thoại");
		lblSoDT.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSoDT.setBounds(66, 151, 78, 19);
		panel.add(lblSoDT);

		JLabel lblGioiTinh = new JLabel("Giới tính");
		lblGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGioiTinh.setBounds(95, 183, 49, 19);
		panel.add(lblGioiTinh);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(481, 45, 128, 158);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblAvatar = new JLabel("New label");
		lblAvatar.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\user.jpg"));
		lblAvatar.setBounds(6, 6, 115, 147);
		panel_1.add(lblAvatar);

		JButton btnNew = new JButton("New   ");
		btnNew.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\clear.png"));
		btnNew.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnNew.setBounds(453, 224, 89, 23);
		panel.add(btnNew);

		JButton btnSave = new JButton("Save    ");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\luu.png"));
		btnSave.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnSave.setBounds(552, 224, 89, 23);
		panel.add(btnSave);

		JButton btnDelete = new JButton("Delete");
		btnDelete.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\delete.png"));
		btnDelete.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnDelete.setBounds(453, 252, 89, 23);
		panel.add(btnDelete);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\update.png"));
		btnUpdate.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnUpdate.setBounds(552, 252, 89, 23);
		panel.add(btnUpdate);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 303, 738, 158);
		panel.add(scrollPane_1);

		table = new JTable();
		scrollPane_1.setViewportView(table);
		table();
		ButtonGroup gr = new ButtonGroup();
		gr.add(rdbtnNam);
		gr.add(rdbtnNu);

		panel_2.setLayout(null);

		JLabel lblQunLim = new JLabel("Quản lý điểm");
		lblQunLim.setForeground(Color.BLUE);
		lblQunLim.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQunLim.setBounds(10, 11, 292, 24);
		panel_2.add(lblQunLim);

		textMaSV2 = new JTextField();
		textMaSV2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textMaSV2.setColumns(10);
		textMaSV2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textMaSV2.setBounds(143, 131, 230, 23);
		panel_2.add(textMaSV2);

		textGDTC = new JTextField();
		textGDTC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textGDTC.setColumns(10);
		textGDTC.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textGDTC.setBounds(143, 267, 230, 23);
		panel_2.add(textGDTC);

		textHoTen2 = new JTextField();
		textHoTen2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textHoTen2.setColumns(10);
		textHoTen2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textHoTen2.setBounds(143, 165, 230, 23);
		panel_2.add(textHoTen2);

		textTiengAnh = new JTextField();
		textTiengAnh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textTiengAnh.setColumns(10);
		textTiengAnh.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textTiengAnh.setBounds(143, 199, 230, 23);
		panel_2.add(textTiengAnh);

		textTinHoc = new JTextField();
		textTinHoc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textTinHoc.setColumns(10);
		textTinHoc.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textTinHoc.setBounds(143, 233, 230, 23);
		panel_2.add(textTinHoc);

		JLabel lblMaSV_1_1 = new JLabel("Mã sinh viên");
		lblMaSV_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaSV_1_1.setBounds(50, 133, 74, 19);
		panel_2.add(lblMaSV_1_1);

		JLabel lblHoTen_1 = new JLabel("Họ tên");
		lblHoTen_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHoTen_1.setBounds(84, 167, 40, 19);
		panel_2.add(lblHoTen_1);

		JLabel lblTingAnh = new JLabel("Tiếng anh");
		lblTingAnh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTingAnh.setBounds(65, 201, 59, 19);
		panel_2.add(lblTingAnh);

		JLabel lblTinHc = new JLabel("Tin học");
		lblTinHc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTinHc.setBounds(79, 235, 49, 19);
		panel_2.add(lblTinHc);

		JLabel lblGdtc = new JLabel("GDTC");
		lblGdtc.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGdtc.setBounds(89, 269, 39, 19);
		panel_2.add(lblGdtc);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(
				new TitledBorder(null, "T\u00ECm ki\u1EBFm", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(65, 46, 633, 58);
		panel_2.add(panel_3);
		panel_3.setLayout(null);

		textMaSVSearch = new JTextField();
		textMaSVSearch.setBounds(161, 24, 284, 23);
		panel_3.add(textMaSVSearch);
		textMaSVSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textMaSVSearch.setColumns(10);
		textMaSVSearch.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));

		JLabel lblMaSV_1 = new JLabel("Mã sinh viên");
		lblMaSV_1.setBounds(62, 26, 74, 19);
		panel_3.add(lblMaSV_1);
		lblMaSV_1.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JButton btnSearch = new JButton("Search");
		btnSearch.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\find.png"));
		btnSearch.setBounds(477, 25, 89, 23);
		panel_3.add(btnSearch);
		btnSearch.setBorder(new BevelBorder(BevelBorder.RAISED));

		JButton btnNew_2 = new JButton("New   ");
		btnNew_2.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\clear.png"));
		btnNew_2.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnNew_2.setBounds(557, 132, 89, 23);
		panel_2.add(btnNew_2);

		JButton btnSave_1 = new JButton("Save   ");
		btnSave_1.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\luu.png"));
		btnSave_1.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnSave_1.setBounds(557, 166, 89, 23);
		panel_2.add(btnSave_1);

		JButton btnDelete_1 = new JButton("Delete");
		btnDelete_1.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\delete.png"));
		btnDelete_1.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnDelete_1.setBounds(557, 200, 89, 23);
		panel_2.add(btnDelete_1);

		JButton btnUpdate_1 = new JButton("Update");
		btnUpdate_1.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\update.png"));
		btnUpdate_1.setBorder(new BevelBorder(BevelBorder.RAISED));
		btnUpdate_1.setBounds(557, 234, 89, 23);
		panel_2.add(btnUpdate_1);

		JLabel lblMaSV_1_1_1 = new JLabel("Điểm trung bình");
		lblMaSV_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblMaSV_1_1_1.setBounds(417, 167, 108, 19);
		panel_2.add(lblMaSV_1_1_1);

		JLabel lblDiemTB = new JLabel("9.0");
		lblDiemTB.setForeground(Color.BLUE);
		lblDiemTB.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiemTB.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblDiemTB.setBounds(400, 179, 94, 73);
		panel_2.add(lblDiemTB);

		JButton btnFirst = new JButton("");
		btnFirst.setContentAreaFilled(false);
		btnFirst.setBorder(null);
		btnFirst.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\previous.png"));
		btnFirst.setBounds(143, 310, 49, 34);
		panel_2.add(btnFirst);

		JButton btnPrevious = new JButton("");
		btnPrevious.setContentAreaFilled(false);
		btnPrevious.setBorder(null);
		btnPrevious.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\previous1.png"));
		btnPrevious.setBounds(202, 310, 49, 34);
		panel_2.add(btnPrevious);

		JButton btnNext = new JButton("");
		btnNext.setContentAreaFilled(false);
		btnNext.setBorder(null);
		btnNext.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\next.png"));
		btnNext.setBounds(261, 310, 49, 34);
		panel_2.add(btnNext);

		JButton btnLast = new JButton("");
		btnLast.setContentAreaFilled(false);
		btnLast.setBorder(null);
		btnLast.setIcon(
				new ImageIcon("C:\\Users\\ADMIN\\eclipse-workspace\\Assignment_Java3_PH12794\\src\\Image\\Last.png"));
		btnLast.setBounds(320, 310, 49, 34);
		panel_2.add(btnLast);

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 373, 738, 88);
		panel_2.add(scrollPane_2);

		table_1 = new JTable();
		scrollPane_2.setViewportView(table_1);

		JLabel lblNewLabel = new JLabel("3 sinh viên có điểm trung bình cao nhất");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 355, 359, 14);
		panel_2.add(lblNewLabel);
		table2();
		login();
		btnDangXuat.addActionListener(logout);
		mntmDangXuat.addActionListener(logout);
		rdbtnNam.setSelected(true);
	}
	
	ActionListener add = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			StringBuilder error = new StringBuilder();

		}
	};

	ActionListener logout = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			int comfirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn đăng xuất?");
			if(comfirm == 0) {
				frame.setVisible(false);
				Login.frame.setVisible(true);
			}
		}
	};

	public void login() {
		if (Login.vaiTro.equals("Giảng viên")) {
			tabbedPane.addTab("Quản lý điểm", null, panel_2, null);
		} else if (Login.vaiTro.equals("Cán bộ đào tạo")) {
			tabbedPane.addTab("Quản lý sinh viên", new ImageIcon("Qu\u1EA3n l\u00FD sinh vi\u00EAn"), panel, null);
		}
	}

	public void table2() {
		model2.addColumn("Mã SV");
		model2.addColumn("Họ tên");
		model2.addColumn("Tiếng anh");
		model2.addColumn("Tin học");
		model2.addColumn("GDTC");
		model2.addColumn("Điểm TB");
		table_1.setModel(model2);
	}

	public void table() {
		model1.addColumn("Mã SV");
		model1.addColumn("Họ tên");
		model1.addColumn("Email");
		model1.addColumn("Số ĐT");
		model1.addColumn("Giới tính");
		model1.addColumn("Địa chỉ");
		model1.addColumn("Hình");
		table.setModel(model1);
	}
}
