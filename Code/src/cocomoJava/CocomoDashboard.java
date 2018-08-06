
package cocomoJava;

import static cocomoJava.Sloc.containsOnlyNumbers;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.*;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;


/**This is the main dashboard for this application.
 * All the project modules, scale factors, EAF, schedule and estimations are managed
 * The project details can be saved to .txt file and loaded back to application
 * @author preethijprabhu
 * @version 1.0.0.0
 */

public class CocomoDashboard extends javax.swing.JFrame {

    /**
     * ********Module Level Constants *********
     */
    final int MOD_INDEX  = 0;
    final int MOD_NAME   = 1;
    final static int MOD_SLOC   = 2;
    final static int MOD_LABOR  = 3;
    final static int MOD_EAF    = 4;
    final int MOD_LANG   = 5;
    final int MOD_NOMEFF = 6;
    final int MOD_ESTEFF = 7;
    final int MOD_PROD   = 8;
    final int MOD_COST   = 9;
    final int MOD_INSTCOST = 10;
    final int MOD_STAFF = 11;
    final int MOD_RISK  = 12;

    /**
     * ********Project Level Constants ********
     */
    /* These values now should be got from EquationDefault
    final double A = 2.94;
    final double B = 0.91;
    final double C = 3.67;
    final double D = 0.28;*/
    final int SCALE_FACTOR_COUNT = 5;
    final int EAF_COUNT  = 16;
    final int EAF_COUNT_EARLY  = 6;
    final int TABLE_COL_COUNT    = 13;
    final String NOMINAL = "NOM";
    final String DEFAULT_SLOC = "2000";
    
    public static double E = 0.0;
    double F = 0.0;
    double tDev = 0.0;
    
    /**
     * ********Class variable declaration******
     */
    private static DecimalFormat df2 = new DecimalFormat("#.##");
    private boolean isFile = false;
    private ArrayList<EAF> eafObjList;
    private ArrayList<EAF_EarlyDesign> eafearlyObjList;
    private ArrayList<Sloc> slocList;
    private ArrayList<Object[]> moduleList;
    private ArrayList<Double> eafModList;
    private DefaultTableModel model;
    public ArrayList<String> modName;
    public String[] scaleLevel;
    public ArrayList<String[]> eafL;
    public ArrayList<String[]> eafLearly;
    public ArrayList<String> slocL;
    public String[] scaleL;
    public String[] eafRating;
    public String[] eafRatingearly;
    public String schedRating;
    public SFactor sf;
    public Sched sched;
    public HashMap <Integer,Integer> hmap =new HashMap<Integer,Integer>();
    public ArrayList<String> arraylst = new ArrayList<String>();
    ArrayList<Object> newObj = new ArrayList<Object>();
    public int val=0;
    public int ct =0;
    public int idx = 0;
    public double[] tableData = new double[TABLE_COL_COUNT];
    public static double totalSloc = 0;
    public static double netEffort = 0;
    /* Modification 2017.2
     * Add function points parameter class
     */
    public FunctionPointsDefault fpd;
    
    public EquationDefault ed;
    Maintenance_Module model_Main;
    public boolean[] click =new boolean[10];
    public double cst,eaf_temp;
    public int cnt=0;
    public boolean modify = false;
    
// Added Edit menu classess by Rahul Ethiraj on 24/06/2018
    
        // undo and redo
        private Document editorPaneDocument;
        protected UndoHandler undoHandler = new UndoHandler();
        protected UndoManager undoManager = new UndoManager();
        private UndoAction undoAction = null;
        private RedoAction redoAction = null;

        class UndoHandler implements UndoableEditListener
        {

          /**
           * Messaged when the Document has created an edit, the edit is added to
           * <code>undoManager</code>, an instance of UndoManager.
           */
          public void undoableEditHappened(UndoableEditEvent e)
          {
            undoManager.addEdit(e.getEdit());
            undoAction.update();
            redoAction.update();
          }
        }

        class UndoAction extends AbstractAction
        {
          public UndoAction()
          {
            super("Undo");
            setEnabled(false);
          }

          public void actionPerformed(ActionEvent e)
          {
            try
            {
              undoManager.undo();
            }
            catch (CannotUndoException ex)
            {
              // TODO deal with this
              //ex.printStackTrace();
            }
            update();
            redoAction.update();
          }

          protected void update()
          {
            if (undoManager.canUndo())
            {
              setEnabled(true);
              putValue(Action.NAME, undoManager.getUndoPresentationName());
            }
            else
            {
              setEnabled(false);
              putValue(Action.NAME, "Undo");
            }
          }
        }

        class RedoAction extends AbstractAction
        {
          public RedoAction()
          {
            super("Redo");
            setEnabled(false);
          }

          public void actionPerformed(ActionEvent e)
          {
            try
            {
              undoManager.redo();
            }
            catch (CannotRedoException ex)
            {
              // TODO deal with this
              ex.printStackTrace();
            }
            update();
            undoAction.update();
          }

          protected void update()
          {
            if (undoManager.canRedo())
            {
              setEnabled(true);
              putValue(Action.NAME, undoManager.getRedoPresentationName());
            }
            else
            {
              setEnabled(false);
              putValue(Action.NAME, "Redo");
            }
          }

        }
        
    /**
     * Creates new form CocomoDashboard This class contains the primary
     * interface (dashboard) of the application. The main table contains the
     * Project information which is divided into modules Each module has its
     * individual input parameters to compute effort estimates The sum of all
     * module estimates are displayed in another table called estimate range
     *
     */
    public CocomoDashboard() {
        initComponents();
        for(int i=0;i<10;i++)
             click[i] = false;
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setTitle("COCOMO® II.2000.4.J1");
        SFDefault defaultRating = new SFDefault();
        eafL       = new ArrayList<String[]>();
        eafLearly  = new ArrayList<String[]>();
        slocL      = new ArrayList<String>();
        eafObjList = new ArrayList<EAF>();
        eafearlyObjList = new ArrayList<EAF_EarlyDesign>();
        slocList   = new ArrayList<Sloc>();
        moduleList = new ArrayList<Object[]>();
        eafModList = new ArrayList<Double>();
        scaleLevel = new String[5];
        scaleL     = new String[5];
        eafRating  = new String[EAF_COUNT];
        eafRatingearly  = new String[EAF_COUNT_EARLY];
        modName = new ArrayList<>();
        model = (DefaultTableModel) moduleTable.getModel();
        model.setRowCount(0);
        schedRating = NOMINAL;
        
        fpd = new FunctionPointsDefault();
        ed = new EquationDefault();
        
        // Added Edit menu by Rahul Ethiraj on 24/06/2018
        
        editorPaneDocument = projectNotes.getDocument();
        editorPaneDocument.addUndoableEditListener(undoHandler);
         
        KeyStroke undoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Z, Event.META_MASK);
        KeyStroke redoKeystroke = KeyStroke.getKeyStroke(KeyEvent.VK_Y, Event.META_MASK);

        undoAction = new UndoAction();
        projectNotes.getInputMap().put(undoKeystroke, "undoKeystroke");
        projectNotes.getActionMap().put("undoKeystroke", undoAction);

        redoAction = new RedoAction();
        projectNotes.getInputMap().put(redoKeystroke, "redoKeystroke");
        projectNotes.getActionMap().put("redoKeystroke", redoAction);


        // Edit menu
        JMenu editMenu = new JMenu("Edit");
        JMenuItem undoMenuItem = new JMenuItem(undoAction);
        JMenuItem redoMenuItem = new JMenuItem(redoAction);

        undoMenuItem.setAccelerator(KeyStroke.getKeyStroke('Z', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        redoMenuItem.setAccelerator(KeyStroke.getKeyStroke('Y', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));

        editMenu.addSeparator();
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        
        Action cutAction = new DefaultEditorKit.CutAction();
        cutAction.putValue(Action.NAME, "Cut          Ctrl+X");

        editMenu.add(cutAction);

        Action copyAction = new DefaultEditorKit.CopyAction();
        copyAction.putValue(Action.NAME, "Copy       Ctrl+C");
        editMenu.add(copyAction);

        Action pasteAction = new DefaultEditorKit.PasteAction();
        pasteAction.putValue(Action.NAME, "Paste      Ctrl+V");
        editMenu.add(pasteAction);
        
        editMenu.addSeparator();
        
        
        // Code added by Rahul Ethiraj on 2/606/2018
        
        JMenuItem add_mod = new JMenuItem();
        add_mod.setText("Add module");
    
        add_mod.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            addModuleBtnActionPerformed(evt);
            }
        });
        editMenu.add(add_mod);
        
        JMenuItem rem_mod = new JMenuItem();
        rem_mod.setText("Remove module");
    
        rem_mod.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeModuleBtnActionPerformed(evt);
            }
        });
        editMenu.add(rem_mod);
        
        JMenuItem calc = new JMenuItem();
        calc.setText("Calculate");
    
        calc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            calculateBtnActionPerformed(evt);
            }
        });
        editMenu.add(calc);
     
        
        
        editMenu.addSeparator();
        jMenuBar1.add(editMenu);

        // Code added by Rahul Ethiraj on 25/06/2018
        
        JMenu helpMenu = new JMenu("Help");
        JMenuItem help1 = new JMenuItem();
        help1.setText("COCOMO II Manual");
        help1.setAccelerator(KeyStroke.getKeyStroke('H', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
    
        help1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            helpBtnActionPerformed(evt);
            }
        });
        helpMenu.add(help1);
        
        
        JMenuItem about = new JMenuItem();
        about.setText("About USC CSSE COCOMO® II");
    
        about.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                
        JLabel description = new JLabel("<html><center>COCOMO® II.2000.4.J1"+"<br/>"+"Copyright 1995-2018"+"<br/>"+"University of Southern California (USC)"+"<br/>"+"Center for Systems and Software Engineering (CSSE)"+"<br/>"+"<br/>"+"Development Acknowledgments:"+"<br/>"+"Jo Ann Lane (USC CSSE, San Diego State University)"+"<br/>"+"Programmer:Preethi Prabhu (San Deigo State University)"+"<br/>"+"Maintainers: USC CSCI 590 Students"+"<br/><br/>"+"For a complete list of contributors, see the user's manual."+"<br/>"+"Based on USC COCOMO® II Model"+"<br/></center></html>" ,JLabel.CENTER);
            
        JOptionPane.showMessageDialog(null, description, "About USC COCOMO® II", JOptionPane.INFORMATION_MESSAGE);
                
        
                
            }
        });
        helpMenu.add(about);
        
        jMenuBar1.add(helpMenu);
        
        setJMenuBar(jMenuBar1);

        for (int count = 0; count < SCALE_FACTOR_COUNT; count++) {
            scaleL[count] = NOMINAL;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalSLOC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        estimateRangeTable = new javax.swing.JTable();
        totalEffort = new javax.swing.JTextField();
        scheduleBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        netScaleFactor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        netSchedule = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        moduleTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        projectNotes = new javax.swing.JTextArea();
        scaleFactorBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        addModuleBtn = new javax.swing.JButton();
        removeModuleBtn = new javax.swing.JButton();
        calculateBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        helpBtn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        newProject = new javax.swing.JMenuItem();
        openProjectFromFile = new javax.swing.JMenuItem();
        saveProjectToFile = new javax.swing.JMenuItem();
        Print = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitProject = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jDefaultSF = new javax.swing.JMenuItem();
        jDefaultSCHED = new javax.swing.JMenuItem();
        jDefaultFP = new javax.swing.JMenuItem();
        jDefaultEAF = new javax.swing.JMenuItem();
        jDefaultEquation = new javax.swing.JMenuItem();
        jDefaultEAF_EarlyDesign = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Project = new javax.swing.JMenuItem();
        module = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        totalSLOC.setEditable(false);
        totalSLOC.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalSLOC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalSLOC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("Effort(Person months)");

        estimateRangeTable.setAutoCreateRowSorter(true);
        estimateRangeTable.setBorder(new javax.swing.border.MatteBorder(null));
        estimateRangeTable.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        estimateRangeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EFFORT", "SCHED", "PROD", "COST", "INST", "STAFF", "RISK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        estimateRangeTable.setGridColor(new java.awt.Color(0, 0, 255));
        estimateRangeTable.setRowHeight(30);
        jScrollPane3.setViewportView(estimateRangeTable);

        totalEffort.setEditable(false);
        totalEffort.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        totalEffort.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalEffort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        scheduleBtn.setBackground(new java.awt.Color(102, 204, 255));
        scheduleBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        scheduleBtn.setText("Schedule");
        scheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel3.setText("Pessimistic");

        netScaleFactor.setEditable(false);
        netScaleFactor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        netScaleFactor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        netScaleFactor.setText("18.97");
        netScaleFactor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Most Likely");

        netSchedule.setEditable(false);
        netSchedule.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        netSchedule.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        netSchedule.setText("1.0");
        netSchedule.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        moduleTable.setBackground(new java.awt.Color(255, 255, 204));
        moduleTable.setBorder(new javax.swing.border.MatteBorder(null));
        moduleTable.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        moduleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Module Index", "Module Name", "Module Size", "LABOR ($/month)", "EAF", "Language", "NOM Effort DEV", "EST Effort DEV", "PROD", "COST", "INST COST", "STAFF", "RISK"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true, false, true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        moduleTable.setGridColor(new java.awt.Color(153, 153, 255));
        moduleTable.setRowHeight(32);
        moduleTable.setSelectionBackground(new java.awt.Color(255, 204, 0));
        moduleTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        moduleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moduleTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(moduleTable);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Optimistic");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Project Notes");

        projectNotes.setColumns(20);
        projectNotes.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        projectNotes.setLineWrap(true);
        projectNotes.setRows(5);
        projectNotes.setWrapStyleWord(true);
        projectNotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(projectNotes);

        scaleFactorBtn.setBackground(new java.awt.Color(102, 204, 255));
        scaleFactorBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        scaleFactorBtn.setText("Scale Factor");
        scaleFactorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scaleFactorBtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("Total Lines of Code");

        addModuleBtn.setBackground(new java.awt.Color(102, 204, 255));
        addModuleBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addModuleBtn.setText("Add Module");
        addModuleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addModuleBtnActionPerformed(evt);
            }
        });

        removeModuleBtn.setBackground(new java.awt.Color(102, 204, 255));
        removeModuleBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        removeModuleBtn.setText("Remove Module");
        removeModuleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeModuleBtnActionPerformed(evt);
            }
        });

        calculateBtn.setBackground(new java.awt.Color(102, 204, 255));
        calculateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        calculateBtn.setText("Calculate");
        calculateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateBtnMouseClicked(evt);
            }
        });
        calculateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        jLabel9.setText("ESTIMATE RANGE");

        helpBtn.setBackground(new java.awt.Color(102, 204, 255));
        helpBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        helpBtn.setText("Help");
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Early-Design", "Post-Architecture" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 0));

        editMenu.setText("File");

        newProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newProject.setText("New Project");
        newProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProjectActionPerformed(evt);
            }
        });
        editMenu.add(newProject);

        openProjectFromFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openProjectFromFile.setText("Open Project");
        openProjectFromFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openProjectFromFileActionPerformed(evt);
            }
        });
        editMenu.add(openProjectFromFile);

        saveProjectToFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveProjectToFile.setText("Save Project");
        saveProjectToFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveProjectToFileActionPerformed(evt);
            }
        });
        editMenu.add(saveProjectToFile);

        Print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Print.setText("Print Screen");
        Print.setActionCommand("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });
        editMenu.add(Print);
        Print.getAccessibleContext().setAccessibleName("Print");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Page setup");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Screenshot");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        exitProject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitProject.setText("Exit Project");
        exitProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitProjectActionPerformed(evt);
            }
        });
        editMenu.add(exitProject);

        jMenuBar1.add(editMenu);

        jMenu2.setText("Forms");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jDefaultSF.setText("ScaleFactor Default");
        jDefaultSF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaultSFActionPerformed(evt);
            }
        });
        jMenu2.add(jDefaultSF);

        jDefaultSCHED.setText("Schedule Default");
        jDefaultSCHED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaultSCHEDActionPerformed(evt);
            }
        });
        jMenu2.add(jDefaultSCHED);

        jDefaultFP.setText("Function Points");
        jDefaultFP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaultFPActionPerformed(evt);
            }
        });
        jMenu2.add(jDefaultFP);

        jDefaultEAF.setText("EAF Default");
        jDefaultEAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaultEAFActionPerformed(evt);
            }
        });
        jMenu2.add(jDefaultEAF);

        jDefaultEquation.setText("Equation");
        jDefaultEquation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaultEquationActionPerformed(evt);
            }
        });
        jMenu2.add(jDefaultEquation);

        jDefaultEAF_EarlyDesign.setText("EAFDefault_EarlyDesign");
        jDefaultEAF_EarlyDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDefaultEAF_EarlyDesignActionPerformed(evt);
            }
        });
        jMenu2.add(jDefaultEAF_EarlyDesign);

        jMenuItem3.setText("EAFDefault_Maintenance");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("Maintenance");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });

        Project.setText("Project");
        Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProjectActionPerformed(evt);
            }
        });
        jMenu1.add(Project);

        module.setText("Module");
        module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleActionPerformed(evt);
            }
        });
        jMenu1.add(module);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scaleFactorBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(netScaleFactor))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scheduleBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(netSchedule))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(totalEffort, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .addComponent(totalSLOC))
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(addModuleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removeModuleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(helpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1063, 1063, 1063))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(scaleFactorBtn)
                                    .addComponent(scheduleBtn))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(netScaleFactor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(netSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(58, 58, 58))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(totalSLOC)
                                        .addGap(45, 45, 45)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(totalEffort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(4, 6, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addModuleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(helpBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeModuleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    protected void jDefaultEAFEarlyActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
        EAFDefault_EarlyDesign eafdf1 = new EAFDefault_EarlyDesign();
        eafdf1.setVisible(true);
        eafdf1.setAlwaysOnTop(true);
        eafdf1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
    private void scaleFactorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scaleFactorBtnActionPerformed
        
        addScaleFactor();
        sf.setVisible(true);
        sf.setAlwaysOnTop(true);       
    }//GEN-LAST:event_scaleFactorBtnActionPerformed

    private void openProjectFromFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openProjectFromFileActionPerformed
        // TODO add your handling code h     try
        try {
            JFileChooser fs = new JFileChooser();
             FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            fs.setFileFilter(filter);
            fs.setDialogTitle("Open / Load Project");
            int result = fs.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                String content = projectNotes.getText();
                String[] contentArray;
                ArrayList<String> contentList;
                try {
                    isFile = true;
                    File fi = fs.getSelectedFile();
                    Scanner br = new Scanner(new FileReader(fi.getPath()));
                    while (br.hasNext()) {
                        content = br.nextLine();
                        if (content.startsWith("PSTART")) {
                            contentArray = content.split("~");
                            projectNotes.setText(contentArray[1]);
                        } else if (content.startsWith("MODULES")) {
                            int count = Integer.parseInt(content.replaceAll("[^0-9]", ""));
                            if (count > 0) {
                                DefaultTableModel model = (DefaultTableModel) moduleTable.getModel();
                                model.setRowCount(0);
                                for (int i = 0; i < count; i++) {
                                    content = br.nextLine();
                                    contentArray = content.split(":");

                                    model.addRow(new Object[]{contentArray[0], contentArray[1], contentArray[2], contentArray[3],
                                        contentArray[4], contentArray[5], contentArray[6], contentArray[7],
                                        contentArray[8], contentArray[9], contentArray[10], contentArray[11],
                                        contentArray[12]});
                                }

                            }

                        } else if (content.startsWith("EAF")) {
                            int count = Integer.parseInt(content.replaceAll("[^0-9]", ""));
                            if (count > 0) {
                                for (int i = 0; i < count; i++) {
                                    content = br.nextLine();
                                    contentArray = content.split(":");
                                    //modified by Shriraksha 
                                    if(val==2) {
                                    eafL.add(i, contentArray);
                                    eafObjList.add(new EAF(this, true, eafL.get(i)));
                                    }
                                    else{
                                        eafLearly.add(i, contentArray);
                                        eafearlyObjList.add(new EAF_EarlyDesign(this, true, eafLearly.get(i)));
                                    }
                                }
                            }

                        } else if (content.startsWith("SLOC")) {
                            int count = Integer.parseInt(content.replaceAll("[^0-9]", ""));
                            if (count > 0) {
                                content = br.nextLine();
                                contentArray = content.split(":");
                                for (int i = 0; i < count; i++) {
                                    slocL.add(i, contentArray[i]);
                                    //slocList.add(new KSloc(this, slocL.get(i)));
                                    slocList.add(new Sloc(this, true));
                                }
                            }

                        } else if (content.startsWith("SCALE")) {
                            netScaleFactor.setText(content.substring(5));
                            content = br.nextLine();
                            scaleL = content.split(":");
                            addScaleFactor();
                        } else if (content.startsWith("SCHED")) {
                            netSchedule.setText(content.substring(5));
                            content = br.nextLine();
                            schedRating = content;
                            addSchedule();

                        }
//                        modified by Shriraksha Rao
//                        calculateEstimate();
                    }

                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // TODO add your handling code here:ere:
    }//GEN-LAST:event_openProjectFromFileActionPerformed

    private void saveProjectToFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveProjectToFileActionPerformed
        try {
            JOptionPane.showMessageDialog(null, "Save project as .txt file");
            JFileChooser fs = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
            fs.setFileFilter(filter);
            fs.setDialogTitle("Save Project");
            int result = fs.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File fi = fs.getSelectedFile();
                try {
                    FileWriter fw = new FileWriter(fi.getPath());
                    BufferedWriter bw = new BufferedWriter(fw);
                    String name = projectNotes.getText();
                    int modCount = moduleTable.getRowCount();
                    if (projectNotes.getText().trim().length() != 0) {
                        bw.write("PSTART" + "~" + projectNotes.getText() + "\n");

                    }
                    if (modCount > 0) {
                        bw.write("MODULES" + modCount + "\n");
                       
                        for (int i = 0; i < modCount; i++) {
                            for (int j = 0; j < TABLE_COL_COUNT; j++) {
                                bw.write(moduleTable.getValueAt(i, j).toString() + ":");
                            }
                            bw.write("\n");
                        }

                        bw.write("EAF" + modCount + "\n");
                        for (int i = 0; i < modCount; i++) {
                            for (int j = 0; j < EAF_COUNT; j++) {
                                bw.write(eafL.get(i)[j] + ":");
                            }
                            bw.write("\n");
                        }

                        bw.write("SLOC" + modCount + "\n");
                        for (int i = 0; i < modCount; i++) {
                            bw.write(slocL.get(i) + ":");

                        }
                        bw.write("\n");

                        bw.write("SCALE" + netScaleFactor.getText() + "\n");
                        for (int i = 0; i < SCALE_FACTOR_COUNT; i++) {
                            bw.write(scaleL[i] + ":");
                        }
                        bw.write("\n");
                        
                        bw.write("SCHED" + netSchedule.getText() + "\n");
                        bw.write(schedRating + "\n");

                    }
                    bw.flush();
                    bw.close();
                    fw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_saveProjectToFileActionPerformed

    private void scheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleBtnActionPerformed
        addSchedule();
        sched.setVisible(true);
        sched.setAlwaysOnTop(true);
        
    }//GEN-LAST:event_scheduleBtnActionPerformed

    private void moduleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moduleTableMouseClicked
        int row = moduleTable.rowAtPoint(evt.getPoint());
        int col = moduleTable.columnAtPoint(evt.getPoint());
        int modIndex   = moduleTable.getSelectedRow();
        if (col == MOD_SLOC) {
            slocList.get(row).setVisible(true);
            slocList.get(row).setAlwaysOnTop(true);
        }
        if (col == MOD_EAF) {
            //modified by Shriraksha 
            if(hmap.get(modIndex+1) == 2) {
                    eafObjList.get(row).setVisible(true);
                    eafObjList.get(row).setAlwaysOnTop(true);
        	}
        	if(hmap.get(modIndex+1) == 0)
        	{
                    eafearlyObjList.get(row).setVisible(true);
                    eafearlyObjList.get(row).setAlwaysOnTop(true);
        	}
        }
    }//GEN-LAST:event_moduleTableMouseClicked

    private void jDefaultSFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaultSFActionPerformed
        SFDefault sfd = new SFDefault();
        sfd.setVisible(true);
        sfd.setAlwaysOnTop(true);
    }//GEN-LAST:event_jDefaultSFActionPerformed

    private void addModuleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addModuleBtnActionPerformed
        int modCount = moduleTable.getRowCount();
        String[] eafLevel = new String[16];
        String[] eafLevelearly = new String[6];
        String sloc = new String();
        
        eafModList.add(modCount, 1.00 * Double.valueOf(netSchedule.getText().toString()));
        if (modCount < 10) {
            Object[] newModule    = new Object[TABLE_COL_COUNT];
            newModule[MOD_INDEX]  = modCount + 1;
            hmap.put((Integer) newModule[MOD_INDEX],val);
            /* Modification 2017.2
            *  When add new moudule with duuplicate name, add ' to the new name
            */
            newModule[MOD_NAME]   = "Module" + String.valueOf(modCount + 1);
            boolean suitable = false;
            while(!suitable){
                boolean duplicate = false;
                for(String moduleName: modName) {
                    if(moduleName.equals(newModule[MOD_NAME].toString())) {
                        newModule[MOD_NAME] = newModule[MOD_NAME].toString() +"'";
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate){
                    suitable = true;
                }
            }

            modName.add(newModule[MOD_NAME].toString());
            newModule[MOD_SLOC]   = 0;
            newModule[MOD_LABOR]  = 0.00;
            newModule[MOD_EAF]    = df2.format(eafModList.get(modCount));
            newModule[MOD_LANG]   = "Non-Specified";
            newModule[MOD_NOMEFF] = 0.0;
            newModule[MOD_ESTEFF] = 0.0;
            newModule[MOD_PROD]   = 0.0;
            newModule[MOD_COST]   = 0.0;
            newModule[MOD_INSTCOST] = 0.0;
            newModule[MOD_STAFF] = 0.0;
            newModule[MOD_RISK]  = 0.0;
            //modified by Shriraksha 
            if(hmap.get((Integer) newModule[MOD_INDEX])==2) {
            for (int count = 0; count < EAF_COUNT; count++) {
                eafLevel[count] = NOMINAL;
            }
        }
        else{
            for (int count1 = 0; count1 < EAF_COUNT_EARLY; count1++) {
                eafLevelearly[count1] = NOMINAL;
            }
        }
            sloc = DEFAULT_SLOC;

            eafL.add(modCount, eafLevel);
            eafLearly.add(modCount, eafLevelearly);
            slocL.add(modCount, sloc);
            //modified by Shriraksha 
            if(hmap.get((Integer) newModule[MOD_INDEX])==2) {
                eafObjList.add(new EAF(this, true, eafL.get(modCount)));
                eafearlyObjList.add(null);
        	   }
            else {
                eafearlyObjList.add(new EAF_EarlyDesign(this, true, eafLearly.get(modCount)));
                eafObjList.add(null);
               }
            slocList.add(new Sloc(this, true));
            model.addRow(newModule);
            moduleList.add(newModule);
            newObj.add(ct,newModule); 
            ct++;
            
        } else {
            JOptionPane.showMessageDialog(null, "Number of modules for a project is 10");
        }
           
    }//GEN-LAST:event_addModuleBtnActionPerformed

    private void addScaleFactor() {
        sf = new SFactor(this, true, scaleL);
    }

    private void addSchedule() {
        if (sched == null) {
            sched = new Sched(this,true, schedRating);
        }
    }

    private void removeModuleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeModuleBtnActionPerformed
        if (moduleTable.getSelectedRow() != -1) {
            double tsloc   = 0.0;
            double teffort = 0.0;
            int modIndex   = moduleTable.getSelectedRow();
            /* Modification 2017.2
            *  When remove module in former index, make the following ones index get changed
            */
            if (modIndex < moduleTable.getRowCount()-1){
                for(int i=modIndex+1; i<moduleTable.getRowCount(); ++i){
                    moduleTable.setValueAt(i, i, 0);
                }
            }
            
            model.removeRow(modIndex);
            eafL.remove(modIndex);
            slocL.remove(modIndex);
            //modified by Shriraksha 
            if(hmap.get(modIndex+1)==2) {
                eafObjList.remove(modIndex);
            }
            else{
                eafearlyObjList.remove(modIndex);
            }
            slocList.remove(modIndex);
            modName.remove(modIndex);

            for (int count = 0; count < moduleTable.getRowCount(); count++) {
                tsloc   += Double.valueOf(moduleTable.getValueAt(count, MOD_SLOC).toString());
                teffort += Double.valueOf(moduleTable.getValueAt(count, MOD_ESTEFF).toString());
            }
            totalSLOC.setText(String.valueOf((int)tsloc));
            totalEffort.setText(String.valueOf((int)teffort));
//            modified by Shriraksha
            calculateEstimate();
        }

    }//GEN-LAST:event_removeModuleBtnActionPerformed

    private void calculateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateBtnActionPerformed
        calculateEstimate();
    }//GEN-LAST:event_calculateBtnActionPerformed


    private void exitProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitProjectActionPerformed
        int isConfirm = JOptionPane.showConfirmDialog(null, "Do you want to save current project before quitting?");
        switch (isConfirm) {
            case JOptionPane.OK_OPTION:
                saveProjectToFileActionPerformed(evt);
                System.exit(0);
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
        System.exit(0);
    }//GEN-LAST:event_exitProjectActionPerformed

    private void newProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProjectActionPerformed
        int isConfirm = JOptionPane.showConfirmDialog(null, "Do you want to save current project before loading new project?");
        switch (isConfirm) {
            case JOptionPane.OK_OPTION:
                saveProjectToFileActionPerformed(evt);
                loadNewProject();
                break;
            case JOptionPane.NO_OPTION:
                loadNewProject();
                break;
            case JOptionPane.CANCEL_OPTION:
                break;
        }
    }//GEN-LAST:event_newProjectActionPerformed
    /* 
     * Modification: 02/27/2017
     *  Add a new menu item for setting the schedule factor.
     */
    
    private void jDefaultSCHEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaultSCHEDActionPerformed

        SCHEDefault schdf = new SCHEDefault();
        schdf.setVisible(true);
        schdf.setAlwaysOnTop(true);
        schdf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
           // TODO add your handling code here:
    }//GEN-LAST:event_jDefaultSCHEDActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jDefaultFPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaultFPActionPerformed
        // TODO add your handling code here:
        fpd.setVisible(true);
    }//GEN-LAST:event_jDefaultFPActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        // TODO add your handling code here:
        //modified: Shriraksha Rao 06/17/2018
        if(Desktop.isDesktopSupported()) {
            try {
                try {
                    Desktop.getDesktop().browse(new URL("http://csse.usc.edu/csse/affiliate/private/COCOMOII_Driver+Calc_Ss/Manual-PostArch2000.pdf").toURI());
                } catch (IOException ex) {
                    Logger.getLogger(CocomoDashboard.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (URISyntaxException ex) {
                Logger.getLogger(CocomoDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         
        }
        else {
            JOptionPane.showMessageDialog(null, "Can't open pdf file");
        }
    }//GEN-LAST:event_helpBtnActionPerformed

    private void jDefaultEAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaultEAFActionPerformed
        // TODO add your handling code here:
        EAFDefault eafdf = new EAFDefault();
        eafdf.setVisible(true);
        eafdf.setAlwaysOnTop(true);
        eafdf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jDefaultEAFActionPerformed

    private void jDefaultEquationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaultEquationActionPerformed
        // TODO add your handling code here:
        ed.setValues();
        ed.setVisible(true);
    }//GEN-LAST:event_jDefaultEquationActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
                Object selected = jComboBox1.getSelectedItem();
                //modified by Shriraksha 
                if(selected.toString().equals("Post-Architecture"))
                    val=2;
                else
                    val=0;
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jDefaultEAF_EarlyDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDefaultEAF_EarlyDesignActionPerformed
        // TODO add your handling code here:
        EAFDefault_EarlyDesign eafdf1 = new EAFDefault_EarlyDesign();
        eafdf1.setVisible(true);
        eafdf1.setAlwaysOnTop(true);
        eafdf1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        
    }//GEN-LAST:event_jDefaultEAF_EarlyDesignActionPerformed

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
        // Code added by Rahul Ethiraj on 07/04/2018
        
                    PrinterJob pj = PrinterJob.getPrinterJob();
                    pj.setJobName(" Print Component ");

                    pj.setPrintable ((Graphics pg, PageFormat pf, int pageNum) -> {
                        if (pageNum > 0) return Printable.NO_SUCH_PAGE;

                        Graphics2D g2 = (Graphics2D) pg;
                       // g2.translate(pf.getImageableX(), pf.getImageableY());
                        

                        // get the bounds of the component
                            Dimension dim = this.getSize();
                            double cHeight = dim.getHeight();
                            double cWidth = dim.getWidth();

                            // get the bounds of the printable area
                            double pHeight = pf.getImageableHeight();
                            double pWidth = pf.getImageableWidth();

                            double pXStart = pf.getImageableX();
                            double pYStart = pf.getImageableY();

                            double xRatio = pWidth / cWidth;
                            double yRatio = pHeight / cHeight;


                            g2.translate(pXStart, pYStart);
                            g2.scale(xRatio, yRatio);
    
                        this.paint(g2);
                        return Printable.PAGE_EXISTS;
                    });
                    

                    if (pj.printDialog() == false) return;

                    try {
                      pj.print();
                    } catch (PrinterException ex) {
                      // handle exception
                    }
                  
        
    }//GEN-LAST:event_PrintActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
   
        // Code added by Rahul Ethiraj on 07/04/2018
        
        String infoMessage="File saved at D:/temp1.jpg";
        
                    try {
                    Robot robot = new Robot();
                    Rectangle size = new Rectangle(Toolkit.getDefaultToolkit()
                            .getScreenSize());
                    BufferedImage buf = robot.createScreenCapture(size);
                    ImageIO.write(buf, "jpg", new File("d:/temp1.jpg"));
                } catch (AWTException ae) {
                    throw new RuntimeException("something went wrong");
                }   catch (IOException ex) {
                        Logger.getLogger(CocomoDashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
          JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + "Screenshot taken", JOptionPane.INFORMATION_MESSAGE);
    
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
 // Code added by Rahul Ethiraj on 07/04/2018
                   // Code added by Rahul Ethiraj on 07/04/2018
         
           PrinterJob printJob = PrinterJob.getPrinterJob();
      
            PageFormat documentPageFormat
                                       = new PageFormat ();
                                       documentPageFormat = printJob.pageDialog (documentPageFormat);
                                      // this.append (new Document (this), documentPageFormat);    
                                       

       
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProjectActionPerformed
        // TODO add your handling code here:
        System.out.println(moduleTable.getRowCount());
        if(moduleTable.getRowCount()<=0){
            JOptionPane.showMessageDialog(null, "No modules were provided by the user for maintenence");
        }
        else{
        project_maintenance pro_main = new project_maintenance(this, true);
        pro_main.setVisible(true);
        pro_main.setAlwaysOnTop(true);
        }
        
    }//GEN-LAST:event_ProjectActionPerformed
 // modified: Shriraksha Rao
    private void moduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleActionPerformed
        // TODO add your handling code here:
        System.out.println(moduleTable.getRowCount());
        if(moduleTable.getRowCount()<=0){
            JOptionPane.showMessageDialog(null, "No modules were provided by the user for maintenence");
        }
        else{
        calculateEstimate();
        Maintenance_Module mm = new Maintenance_Module(this, true);
        mm.setVisible(true);
        mm.setAlwaysOnTop(true);
        }
    }//GEN-LAST:event_moduleActionPerformed

    private void calculateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBtnMouseClicked
        // TODO add your handling code here: 
        
    }//GEN-LAST:event_calculateBtnMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        if(val==0){
            Project.setEnabled(false);
            module.setEnabled(false);
        }
        else{
           Project.setEnabled(true);
            module.setEnabled(true); 
        }
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        EAFDefault_Maintenance eafdf2 = new EAFDefault_Maintenance();
        eafdf2.setVisible(true);
        eafdf2.setAlwaysOnTop(true);
        eafdf2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public void addtolist()
    {
        
        int ind = (int)tableData[MOD_INDEX]-1;
        while(cnt<=ind){
        if(cnt==ind)
        {
            arraylst.add(String.valueOf(Double.valueOf(moduleTable.getValueAt(ind, MOD_SLOC).toString())));
            arraylst.add(String.valueOf(eaf_temp));
            arraylst.add(String.valueOf(cst));
        }
        else{
            arraylst.add(null);
            arraylst.add(null);
            arraylst.add(null);
        }
        cnt++;
        }
        click[ind] = true;
    }
    public void setScaleFactor(String scaleFactor, String[] scaleLevel) {
        this.netScaleFactor.setText(scaleFactor);
        for (int i = 0; i < SCALE_FACTOR_COUNT; i++) {
            this.scaleL[i] = scaleLevel[i];
        }
//        modified by Shriraksha Rao
//        calculateEstimate();
    }

    public void setSchedule(String netSchedule, String schedRating) {
        this.netSchedule.setText(netSchedule);
        this.schedRating = schedRating;
//        modified by Shriraksha Rao
//        calculateEstimate();
    }

    public void updateTable(double[] tableData) {
        for (int count = 0; count < moduleTable.getColumnCount(); count++) {
            moduleTable.setValueAt(tableData[count], ERROR, count);
        }
    }

    public void setEaf(String netEaf, String[] eafRating) {
        Double schedule = Double.valueOf(netSchedule.getText());
        Double eaf      = Double.valueOf(netEaf);
        int modCount    = moduleTable.getSelectedRow();
        moduleTable.setValueAt(schedule * eaf, modCount, MOD_EAF);
        this.eafL.set(modCount, eafRating);
        this.eafModList.add(modCount, Double.valueOf(netEaf));
        //        modified by Shriraksha Rao
        //        calculateEstimate();
    }
    public ArrayList<Object> getmodulename()
    {
         return newObj;
    }
    public ArrayList<String> getmoduledata()
    {
        return arraylst;
    }
    //modified by Shriraksha 
    public void setEafearly(String netEafearly, String[] eafRatingearly) {
        Double schedule = Double.valueOf(netSchedule.getText());
        Double eafearly      = Double.valueOf(netEafearly);
        int modCount    = moduleTable.getSelectedRow();
        moduleTable.setValueAt(schedule * eafearly, modCount, MOD_EAF);
        this.eafLearly.set(modCount, eafRatingearly);
        this.eafModList.add(modCount, Double.valueOf(netEafearly));
//        calculateEstimate();
    }

    public void setSloc(String sloc) {
        moduleTable.setValueAt(sloc, moduleTable.getSelectedRow(), MOD_SLOC);
        //        modified by Shriraksha Rao
//        calculateEstimate();
    }
    
    public void getSchedEaf()
    {
        if (moduleTable.getRowCount() > 0) {
            Double schedule = Double.valueOf(netSchedule.getText());
            for (int count = 0; count < moduleTable.getRowCount(); count++) {
                Double eaf = schedule * eafModList.get(count);
                moduleTable.setValueAt(eaf, count, MOD_EAF);
            }
        }
    }

    public void setEstimateRange(double[] rangeData) {
      
        double[] pessiData = new double[7];
        double[] optimData = new double[7];
        double[] range = rangeData;
        double projectSloc = Double.valueOf(totalSLOC.getText());

        pessiData[0] = range[0] * 1.25;
        optimData[0] = range[0] * 0.8;

        pessiData[1] = this.ed.C * Math.pow(pessiData[0], F);
        optimData[1] = this.ed.C * Math.pow(optimData[0], F);

        
        pessiData[3] = range[3] * 1.25;
        optimData[3] = range[3] * 0.8;

        if(projectSloc > 0.0)
        {
            pessiData[2] = projectSloc / pessiData[0];
            optimData[2] = projectSloc / optimData[0];

            pessiData[4] = pessiData[3] / projectSloc;
            optimData[4] = optimData[3] / projectSloc;

        }
       
        if (pessiData[1] > 0.0) {
            pessiData[5] = pessiData[0] / pessiData[1];
        }
        if (optimData[1] > 0.0) {
            optimData[5] = optimData[0] / optimData[1];
        }

        for (int count = 0; count < 7; count++) {
            estimateRangeTable.setValueAt(df2.format(pessiData[count]), 0, count);
            estimateRangeTable.setValueAt(df2.format(range[count]), 1, count);
            estimateRangeTable.setValueAt(df2.format(optimData[count]), 2, count);
        }
    }

    public void resetRangeTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 7; col++) {
                estimateRangeTable.setValueAt("", row, col);
            }
        }
    }

    public void calculateEstimate() {
        if (moduleTable.getRowCount() > 0) {  
            double[] rangeData = new double[7];
            ArrayList<double[]> x = new ArrayList<double[]>();
            int moduleCount = moduleTable.getRowCount();
//            double totalSloc = 0;
//            double netEffort = 0;
            double modStaff = 0;
            String labor;
            String language = "Not Specified";

            E = this.ed.B + (0.01 * Double.valueOf(this.netScaleFactor.getText()));
            F = this.ed.D + 0.2 * (E - this.ed.B);
            totalSloc = getAggregateSloc();
            netEffort = (this.ed.A * Math.pow(totalSloc / 1000, E));
            for (int i = 0; i < moduleCount; i++) {
                tableData[MOD_SLOC] = Double.valueOf(moduleTable.getValueAt(i, MOD_SLOC).toString());
                if (tableData[MOD_SLOC] > 0.0) {
                    language = moduleTable.getValueAt(i, MOD_LANG).toString();
                    tableData[MOD_INDEX]    = i + 1;
                    labor = moduleTable.getValueAt(i, MOD_LABOR).toString();
                    if (!labor.isEmpty() && containsOnlyNumbers(labor) == true) {
                    tableData[MOD_LABOR]    = Double.valueOf(labor);}
                    else{tableData[MOD_LABOR] = 0.0;}
                    tableData[MOD_EAF]      = Double.valueOf(moduleTable.getValueAt(i, MOD_EAF).toString());
                    /* 
                     * Modification: 02/07/2017
                     *  Fixed the error in MOD_NOMEFF calculation, correct the formula to get the result.
                     */
                    
                    double SCHEDFactor = Double.valueOf(netSchedule.getText());
                    tableData[MOD_ESTEFF] = netEffort * (tableData[MOD_SLOC] / totalSloc) * tableData[MOD_EAF];
                    tableData[MOD_NOMEFF] = tableData[MOD_ESTEFF]/SCHEDFactor * 1.00;
                    
                    tableData[MOD_COST]     = tableData[MOD_LABOR] * tableData[MOD_ESTEFF];
                    tableData[MOD_INSTCOST] = tableData[MOD_COST] / tableData[MOD_SLOC];
                    
                    /* 
                     * Modification: 02/13/2017
                     *  Fixed the error in TDEV calculation, the correct result should
                     *  use the nomial effort and the percent for SCED.
                     */
                    
                    tDev = this.ed.C * Math.pow(tableData[MOD_NOMEFF], F);
                    if(sched != null){
                        tDev *= sched.getPercent(schedRating);
                    }
                    
       

                    if (tDev > 0.0) {
                        tableData[MOD_STAFF] = tDev;
                    }
                    if (tableData[MOD_ESTEFF] > 0.0) {
                        tableData[MOD_PROD] = tableData[MOD_SLOC] / tableData[MOD_ESTEFF];
                    }

                    rangeData[0] = tableData[MOD_ESTEFF];
                    rangeData[3] = tableData[MOD_COST];
                   
                    moduleTable.setValueAt(i + 1, i, MOD_INDEX);
                    for (int count = MOD_LABOR; count < moduleTable.getColumnCount(); count++) {
                        if (count == MOD_LANG) {
                            moduleTable.setValueAt(language, i, count);
                        } else {
                            moduleTable.setValueAt(df2.format(tableData[count]), i, count);
                            tableData[count] = 0.0;
                        }
                    }

                }
                
                /* 
                 * Modification: 02/13/2017
                 *  Fixed the error in rangeData, remove the redundant calculation and 
                 *  make SCHD the value of tDev.
                 */
        
                rangeData[1] = tDev;
                
                if (rangeData[0] > 0.0) {
                    rangeData[2] = totalSloc / rangeData[0];
                }
                modStaff = 0;
                for (int count = 0; count < moduleCount; count++) {
                    double staff = 0.0;
                    double effort = Double.valueOf(moduleTable.getValueAt(count, MOD_ESTEFF).toString());
                    if(effort > 0.0)
                    {
                        staff = Double.valueOf(df2.format(effort / rangeData[1]));
						if(sched != null) staff *= sched.getCoefficient(schedRating);
						staff = Math.round(staff * 100.0)/100.0;
                        moduleTable.setValueAt(staff,count,MOD_STAFF);
                    }
                    modStaff += staff;
                }
                
                if (totalSloc > 0.0) {
                    rangeData[4] = rangeData[3] / totalSloc;

                }
                rangeData[5] = modStaff;
                totalSLOC.setText(String.valueOf((int) totalSloc));
                totalEffort.setText(String.valueOf((int) rangeData[0]));

                setEstimateRange(rangeData);
                eaf_temp = (netEffort * ((Double.valueOf(moduleTable.getValueAt(i, MOD_SLOC).toString())) / totalSloc) * Double.valueOf(moduleTable.getValueAt(i, MOD_EAF).toString()));
                cst = ((Double.valueOf(moduleTable.getValueAt(i, MOD_LABOR).toString())) * eaf_temp);
                if(click[i]==false)
                {
                   addtolist();
                }
            }
        } else {
            resetRangeTable();
        }
    }
    
    public double getAggregateSloc()
    {
        double totalSloc = 0;
        int moduleCount = moduleTable.getRowCount();
        for(int count = 0; count < moduleCount; count++)
        {
            totalSloc += Double.valueOf(moduleTable.getValueAt(count, MOD_SLOC).toString());
        }
        
        return totalSloc;
    }

    public void loadNewProject() {
        projectNotes.setText("");
        totalSLOC.setText("");
        totalEffort.setText("");
        netScaleFactor.setText("18.97");
        netSchedule.setText("1.0");
        //modified by Shriraksha 
        if(val==2) {
        eafObjList.clear();
        }
        if(val==0) {
        eafearlyObjList.clear();}
        slocList.clear();
        eafL.clear();
        slocL.clear();
        eafModList.clear();
        for (int count = 0; count < SCALE_FACTOR_COUNT; count++) {
            scaleL[count] = NOMINAL;
        }
        schedRating = NOMINAL;
        sf = new SFactor(this, true, scaleL);
        sched = new Sched(this, true, schedRating);
        model.setRowCount(0);
        resetRangeTable();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CocomoDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CocomoDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CocomoDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CocomoDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CocomoDashboard().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Print;
    private javax.swing.JMenuItem Project;
    private javax.swing.JButton addModuleBtn;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JMenu editMenu;
    private javax.swing.JTable estimateRangeTable;
    private javax.swing.JMenuItem exitProject;
    private javax.swing.JButton helpBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenuItem jDefaultEAF;
    private javax.swing.JMenuItem jDefaultEAF_EarlyDesign;
    private javax.swing.JMenuItem jDefaultEquation;
    private javax.swing.JMenuItem jDefaultFP;
    private javax.swing.JMenuItem jDefaultSCHED;
    private javax.swing.JMenuItem jDefaultSF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JMenuItem module;
    public static javax.swing.JTable moduleTable;
    public javax.swing.JTextField netScaleFactor;
    private javax.swing.JTextField netSchedule;
    private javax.swing.JMenuItem newProject;
    private javax.swing.JMenuItem openProjectFromFile;
    private javax.swing.JTextArea projectNotes;
    private javax.swing.JButton removeModuleBtn;
    private javax.swing.JMenuItem saveProjectToFile;
    private javax.swing.JButton scaleFactorBtn;
    private javax.swing.JButton scheduleBtn;
    private javax.swing.JTextField totalEffort;
    private javax.swing.JTextField totalSLOC;
    // End of variables declaration//GEN-END:variables
}
