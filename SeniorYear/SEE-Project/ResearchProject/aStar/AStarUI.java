package aStar;

import java.awt.Color;
import java.awt.Component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;

import uiUtilities.AboutDialog;
import uiUtilities.ColorChooser;
import uiUtilities.SourceViewer;

/** Main class for the GUI part of the program.
 * 
 * @author Georgi Christov ( aka masterofpuppets )
 * @version 1.0
 * @since 30.04.2010
 *
 */
public class AStarUI extends javax.swing.JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JMenuBar menuBar;
	private JLabel jLabel4;
	private JLabel jLabel3;
	private JLabel jLabel2;
	private JLabel jLabel1;
	private JLabel currSqLabel;
	private JPanel additionalPanel;
	private JMenuItem sourceMenu;
	private JMenu jMenu2;
	private JMenuItem aboutAStar;
	private JMenu about;
	private JMenuItem singleStepMenu;
	private JMenuItem showPathMenu;
	private JMenuItem findPathMenu;
	private JSeparator jSeparator3;
	private JLabel jLabel13;
	private JButton passableColorButton;
	private JLabel jLabel12;
	private JLabel jLabel11;
	private JLabel jLabel10;
	private JButton pathColorButton;
	private JButton endColorButton;
	private JButton startColorButton;
	private JComboBox directionsBox;
	private JLabel jLabel9;
	private JTextField performanceField;
	private JLabel jLabel8;
	private JLabel jLabel7;
	private JLabel jLabel6;
	private JLabel jLabel5;
	private JPanel settingsPanel;
	private JButton resetButton;
	private JButton singleStepButton;
	private JButton showPathButton;
	private JButton findRouteButton;
	private JPanel controlPanel;
	private JMenuItem clearAll;
	private JMenu optionsMenu;
	private JMenuItem exitMenu;
	private JSeparator jSeparator1;
	private JMenuItem newGridMenu;
	private Grid grid;
	private JMenu jMenu1;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				AStarUI inst = new AStarUI();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public AStarUI() {
		super("A* Pathfinder");
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			{
				grid = new Grid( this );
			}
			{
				additionalPanel = new JPanel();
				GroupLayout additionalPanelLayout = new GroupLayout((JComponent)additionalPanel);
				additionalPanel.setLayout(additionalPanelLayout);
				additionalPanel.setBorder(BorderFactory.createTitledBorder("Info"));
				{
					currSqLabel = new JLabel();
					currSqLabel.setText("Current Square:");
				}
				{
					jLabel1 = new JLabel();
					jLabel1.setText("x:");
				}
				{
					performanceField = new JTextField();
					performanceField.setEditable( false );
					performanceField.setBackground( Color.WHITE );
					performanceField.setHorizontalAlignment( JTextField.CENTER );
					performanceField.setText("0.0 sec.");
				}
				{
					jLabel8 = new JLabel();
					jLabel8.setText("Performance:");
				}
				{
					jLabel2 = new JLabel();
					jLabel2.setText("y:");
				}
				{
					jLabel6 = new JLabel();
					jLabel6.setText("start:");
				}
				{
					jLabel7 = new JLabel();
					jLabel7.setText("goal:");
				}
				{
					jLabel5 = new JLabel();
					jLabel5.setText("passable:");
				}
				{
					jLabel3 = new JLabel();
					jLabel3.setText("width:");
				}
				{
					jLabel4 = new JLabel();
					jLabel4.setText("height:");
				}
				additionalPanelLayout.setHorizontalGroup(additionalPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(additionalPanelLayout.createParallelGroup()
					    .addComponent(performanceField, GroupLayout.Alignment.LEADING, 0, 122, Short.MAX_VALUE)
					    .addGroup(additionalPanelLayout.createSequentialGroup()
					        .addPreferredGap(performanceField, jLabel2, LayoutStyle.ComponentPlacement.INDENT)
					        .addGroup(additionalPanelLayout.createParallelGroup()
					            .addGroup(additionalPanelLayout.createSequentialGroup()
					                .addGroup(additionalPanelLayout.createParallelGroup()
					                    .addComponent(jLabel2, GroupLayout.Alignment.LEADING, 0, 35, Short.MAX_VALUE)
					                    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, 0, 35, Short.MAX_VALUE))
					                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					                .addGroup(additionalPanelLayout.createParallelGroup()
					                    .addComponent(jLabel3, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
					                    .addComponent(jLabel4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)))
					            .addGroup(additionalPanelLayout.createSequentialGroup()
					                .addGap(7)
					                .addGroup(additionalPanelLayout.createParallelGroup()
					                    .addGroup(GroupLayout.Alignment.LEADING, additionalPanelLayout.createSequentialGroup()
					                        .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					                        .addGap(0, 6, Short.MAX_VALUE))
					                    .addGroup(GroupLayout.Alignment.LEADING, additionalPanelLayout.createSequentialGroup()
					                        .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					                        .addGap(0, 6, Short.MAX_VALUE))
					                    .addGroup(GroupLayout.Alignment.LEADING, additionalPanelLayout.createSequentialGroup()
					                        .addComponent(jLabel5, 0, 97, Short.MAX_VALUE)
					                        .addGap(6))
					                    .addComponent(currSqLabel, GroupLayout.Alignment.LEADING, 0, 103, Short.MAX_VALUE)
					                    .addGroup(GroupLayout.Alignment.LEADING, additionalPanelLayout.createSequentialGroup()
					                        .addGap(8)
					                        .addComponent(jLabel8, 0, 95, Short.MAX_VALUE)))))))
					.addContainerGap());
				additionalPanelLayout.setVerticalGroup(additionalPanelLayout.createSequentialGroup()
					.addComponent(currSqLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(additionalPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel3, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(additionalPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel4, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel2, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(performanceField, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(26, Short.MAX_VALUE));
			}
			{
				settingsPanel = new JPanel();
				GroupLayout settingsPanelLayout = new GroupLayout((JComponent)settingsPanel);
				settingsPanel.setLayout(settingsPanelLayout);
				settingsPanel.setBorder(BorderFactory.createTitledBorder("Settings"));
				{
					jLabel9 = new JLabel();
					jLabel9.setText("Directions:");
				}
				{
					ComboBoxModel directionsBoxModel = 
						new DefaultComboBoxModel(
								new String[] { "4", "8" });
					directionsBox = new JComboBox();
					directionsBox.setModel(directionsBoxModel);
					directionsBox.setFocusable( false );
				}
				{
					jLabel13 = new JLabel();
					jLabel13.setText("Wall fill:");
				}
				{
					jLabel10 = new JLabel();
					jLabel10.setText("Start fill:");
				}
				{
					jLabel11 = new JLabel();
					jLabel11.setText("End fill:");
				}
				{
					jLabel12 = new JLabel();
					jLabel12.setText("Path fill:");
				}
				{
					startColorButton = new JButton();
					startColorButton.setText("Set");
					startColorButton.setFocusable( false );
					startColorButton.setForeground( Color.WHITE );
					startColorButton.setBackground( Color.GREEN );
					startColorButton.addActionListener( this );
				}
				{
					endColorButton = new JButton();
					endColorButton.setText("Set");
					endColorButton.setFocusable( false );
					endColorButton.setForeground( Color.WHITE );
					endColorButton.setBackground( Color.RED );
					endColorButton.addActionListener( this );
				}
				{
					pathColorButton = new JButton();
					pathColorButton.setText("Set");
					pathColorButton.setFocusable( false );
					pathColorButton.setForeground( Color.WHITE );
					pathColorButton.setBackground( Color.BLUE );
					pathColorButton.addActionListener( this );
				}
				{
					passableColorButton = new JButton();
					passableColorButton.setText("Set");
					passableColorButton.setFocusable( false );
					passableColorButton.setForeground( Color.WHITE );
					passableColorButton.setBackground( Color.GRAY );
					passableColorButton.addActionListener( this );
				}
				settingsPanelLayout.setHorizontalGroup(settingsPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(settingsPanelLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, settingsPanelLayout.createSequentialGroup()
					        .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					        .addComponent(directionsBox, 0, 46, Short.MAX_VALUE))
					    .addGroup(settingsPanelLayout.createSequentialGroup()
					        .addGroup(settingsPanelLayout.createParallelGroup()
					            .addComponent(jLabel13, GroupLayout.Alignment.LEADING, 0, 49, Short.MAX_VALUE)
					            .addComponent(jLabel11, GroupLayout.Alignment.LEADING, 0, 49, Short.MAX_VALUE)
					            .addComponent(jLabel12, GroupLayout.Alignment.LEADING, 0, 49, Short.MAX_VALUE)
					            .addGroup(settingsPanelLayout.createSequentialGroup()
					                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					                .addGap(0, 0, Short.MAX_VALUE)))
					        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					        .addGroup(settingsPanelLayout.createParallelGroup()
					            .addComponent(endColorButton, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					            .addComponent(startColorButton, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					            .addComponent(pathColorButton, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
					            .addComponent(passableColorButton, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap());
				settingsPanelLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {passableColorButton, pathColorButton, endColorButton, startColorButton});
				settingsPanelLayout.setVerticalGroup(settingsPanelLayout.createSequentialGroup()
					.addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(directionsBox, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel9, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(startColorButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel10, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(endColorButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel11, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(pathColorButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel12, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(settingsPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(passableColorButton, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
					    .addComponent(jLabel13, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(29, 29));
				settingsPanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {passableColorButton, pathColorButton, endColorButton, startColorButton});
			}
			{
				controlPanel = new JPanel();
				GroupLayout controlPanelLayout = new GroupLayout((JComponent)controlPanel);
				controlPanel.setLayout(controlPanelLayout);
				controlPanel.setBorder(BorderFactory.createTitledBorder("Control Panel"));
				{
					findRouteButton = new JButton();
					findRouteButton.setText("Find Path");
					findRouteButton.setFocusable( false );
					findRouteButton.addActionListener( this );
				}
				{
					showPathButton = new JButton();
					showPathButton.setText("Show Path");
					showPathButton.setFocusable( false );
					showPathButton.addActionListener( this );
				}
				{
					singleStepButton = new JButton();
					singleStepButton.setText("Single Step");
					singleStepButton.setFocusable( false );
					singleStepButton.addActionListener( this );
				}
				{
					resetButton = new JButton();
					resetButton.setText("Clear");
					resetButton.setFocusable( false );
					resetButton.addActionListener( this );
				}
				controlPanelLayout.setHorizontalGroup(controlPanelLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(controlPanelLayout.createParallelGroup()
					    .addComponent(findRouteButton, GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE)
					    .addComponent(showPathButton, GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE)
					    .addComponent(singleStepButton, GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE)
					    .addComponent(resetButton, GroupLayout.Alignment.LEADING, 0, 129, Short.MAX_VALUE))
					.addContainerGap());
				controlPanelLayout.setVerticalGroup(controlPanelLayout.createSequentialGroup()
					.addComponent(findRouteButton, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(showPathButton, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(singleStepButton, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(resetButton, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(33, Short.MAX_VALUE));
				controlPanelLayout.linkSize(SwingConstants.VERTICAL, new Component[] {resetButton, singleStepButton, showPathButton, findRouteButton});
			}
			thisLayout.setVerticalGroup(thisLayout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				    .addComponent(controlPanel, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE)
				    .addComponent(settingsPanel, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
				    .addComponent(additionalPanel, 0, 199, Short.MAX_VALUE)
				    .addGap(0, 12, GroupLayout.PREFERRED_SIZE))
				.addComponent(grid, GroupLayout.Alignment.LEADING, 0, 546, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addComponent(grid, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(controlPanel, GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)
				    .addComponent(settingsPanel, GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE)
				    .addComponent(additionalPanel, GroupLayout.Alignment.LEADING, 0, 162, Short.MAX_VALUE))
				.addContainerGap());
			{
				menuBar = new JMenuBar();
				setJMenuBar(menuBar);
				{
					jMenu1 = new JMenu();
					menuBar.add(jMenu1);
					jMenu1.setText("File");
					{
						newGridMenu = new JMenuItem();
						jMenu1.add(newGridMenu);
						newGridMenu.setText("New                              ");
						newGridMenu.addActionListener( this );
					}
					{
						jSeparator1 = new JSeparator();
						jMenu1.add(jSeparator1);
					}
					{
						exitMenu = new JMenuItem();
						jMenu1.add(exitMenu);
						exitMenu.setText("Exit");
						exitMenu.addActionListener( this );
					}
				}
				{
					optionsMenu = new JMenu();
					menuBar.add(optionsMenu);
					optionsMenu.setText("Options");
					{
						findPathMenu = new JMenuItem();
						optionsMenu.add(findPathMenu);
						findPathMenu.setText("Find Path");
						findPathMenu.addActionListener( this );
					}
					{
						showPathMenu = new JMenuItem();
						optionsMenu.add(showPathMenu);
						showPathMenu.setText("Show Path");
						showPathMenu.addActionListener( this );
					}
					{
						singleStepMenu = new JMenuItem();
						optionsMenu.add(singleStepMenu);
						singleStepMenu.setText("Single Step");
						singleStepMenu.addActionListener( this );
					}
					{
						jSeparator3 = new JSeparator();
						optionsMenu.add(jSeparator3);
					}
					{
						clearAll = new JMenuItem();
						optionsMenu.add(clearAll);
						clearAll.setText("Clear                             ");
						clearAll.addActionListener( this );
					}
				}
				{
					about = new JMenu();
					menuBar.add(about);
					about.setText("About");
					{
						aboutAStar = new JMenuItem();
						about.add(aboutAStar);
						aboutAStar.setText("About A* Pathfinder");
						aboutAStar.addActionListener( this );
					}
				}
				{
					jMenu2 = new JMenu();
					menuBar.add(jMenu2);
					jMenu2.setText("Source");
					{
						sourceMenu = new JMenuItem();
						jMenu2.add(sourceMenu);
						sourceMenu.setText("View A* Pathfinder code");
						sourceMenu.addActionListener( this );
					}
				}
			}
			pack();
			setSize(700, 605);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Color getStartColor() {
		return startColorButton.getBackground();
	}
	public Color getEndColor() {
		return endColorButton.getBackground();
	}
	public Color getPathColor() {
		return pathColorButton.getBackground();
	}
	public Color getWallColor() {
		return passableColorButton.getBackground();
	}
	
	public boolean eightDirections() {
		int item = Integer.parseInt( (String) directionsBox.getSelectedItem() );
		return ( item == 8 );
	}
	
	public void updateInfo( int x, int y, int w, int h, boolean p, boolean s, boolean e ) {
		jLabel1.setText( "x: " + Integer.toString( x ) );
		jLabel2.setText( "y: " + Integer.toString( y ) );
		jLabel3.setText( "width: " + Integer.toString( w ) );
		jLabel4.setText( "height: " + Integer.toString( h ) );
		jLabel5.setText( "passable:  " + p );
		jLabel6.setText( "start:  " + s );
		jLabel7.setText( "end:  " + e );
	}
	
	public void updatePerformanceField( double ms ) {
		performanceField.setText( Double.toString( ms ) + " sec." );
	}
	
	@Override
	public void actionPerformed( ActionEvent arg0 ) {
		if ( arg0.getSource() == clearAll || arg0.getSource() == resetButton || arg0.getSource() == newGridMenu ) {
			grid.clearAll();
		}
		else if ( arg0.getSource() == exitMenu ) {
			int ch = JOptionPane.showConfirmDialog( getContentPane(), "Are you sure you want to exit?" );
			if ( ch == 0 ) {
				System.exit( 0 );
			}
		}
		else if ( arg0.getSource() == findRouteButton || arg0.getSource() == findPathMenu ) {
			grid.findRoute();
		}
		else if ( arg0.getSource() == showPathButton || arg0.getSource() == showPathMenu ) {
			grid.showRoute();
		}
		else if ( arg0.getSource() == singleStepButton || arg0.getSource() == singleStepMenu ) {
			grid.step();
		}
		else if ( arg0.getSource() == startColorButton ) {
			ColorChooser ch = new ColorChooser( startColorButton );
			ch.setVisible( true );
		}
		else if ( arg0.getSource() == endColorButton ) {
			ColorChooser ch = new ColorChooser( endColorButton );
			ch.setVisible( true );
		}
		else if ( arg0.getSource() == pathColorButton ) {
			ColorChooser ch = new ColorChooser( pathColorButton );
			ch.setVisible( true );
		}
		else if ( arg0.getSource() == passableColorButton ) {
			ColorChooser ch = new ColorChooser( passableColorButton );
			ch.setVisible( true );
		}
		else if ( arg0.getSource() == aboutAStar ) {
			AboutDialog a = new AboutDialog( this );
			a.setVisible( true );
		}
		else if ( arg0.getSource() == sourceMenu ) {
			SourceViewer sv = new SourceViewer( this );
			sv.loadSource();
			sv.setVisible( true );
		}
	}
}
