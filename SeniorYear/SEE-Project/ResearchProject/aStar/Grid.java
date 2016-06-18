package aStar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;

/** Class to represent the grid panel in the program.
 * 
 * @author Georgi Christov ( aka masterofpuppets )
 * @version 1.0
 * @since 30.04.2010
 *
 */
public class Grid extends JPanel implements MouseMotionListener, MouseListener, ActionListener {
	private static final long serialVersionUID = 1L;
	
	private Image img;
	private Graphics dbi;
	private ArrayList<Square> grid, path;
	private int mouseX, mouseY, singleStepCounter;
	private JPopupMenu popup;
	private JMenuItem passableMenu, markStartMenu, markEndMenu, clearAll;
	private JSeparator jSeparator1, jSeparator2;
	private boolean start, end, showRoute, singleStep;
	private Square startSq, endSq;
	private AStarAlgorithm alg;
	private AStarUI parent;
	
	public Grid( AStarUI parent ) {
		this.parent = parent;
		setBackground( Color.WHITE );
		addMouseListener( this );
		addMouseMotionListener( this );
		grid = generateSquareGrid();
		path = new ArrayList<Square>();
		start = false;
		end = false;
		showRoute = false;
		singleStep = false;
		singleStepCounter = -1;
		initMenu();
	}
	
	/** Clears all squares and also the start and end point. */
	public void clearAll() {
		for ( Square s : grid ) {
			s.setEnd( false );
			s.setStart( false );
			s.setPassable( true );
		}
		start = false; end = false;
		path.clear();
		alg = null;
		showRoute = false; singleStep = false;
		singleStepCounter = -1;
		markStartMenu.setText( "Mark as 'starting point'" );
		markEndMenu.setText( "Mark as 'end point'" );
		parent.updatePerformanceField( 0.0 );
	}
	
	/** Applies the A* algorithm to find the route based on the squares left as passable. */
	public void findRoute() {
		if ( !start || !end ) {
			JOptionPane.showMessageDialog( this, "Start or end point is not set yet." );
		}
		else {
			ArrayList<Square> passableGrid = new ArrayList<Square>();
			for ( Square s : grid ) {
				if ( s.isPassable() )
					passableGrid.add( s );
			}
			alg = new AStarAlgorithm( passableGrid, startSq, endSq, this, parent.eightDirections() );
			alg.findPath();
			parent.updatePerformanceField( alg.getRunTime() );
			path = alg.showPath();
		}
	}
	
	/** Display the whole route. */
	public void showRoute() {
		showRoute = true;
	}
	
	/** Draw just a single step of the route. */
	public void step() {
		singleStep = true;
		if ( singleStepCounter + 1 < path.size() )
			singleStepCounter++;
	}
	
	// Double buffering.
	public void paint( Graphics g ) {
		img = createImage( getWidth(), getHeight() );
		dbi = img.getGraphics();
		// Clear screen in the background.
		dbi.setColor( getBackground() ); 
		dbi.fillRect( 0, 0, this.getSize().width, this.getSize().height ); 
		
		dbi.setColor( getForeground() ); 
		paintComponent( dbi );
		g.drawImage( img, 0, 0, this );
		repaint();
	}
	
	public void paintComponent( Graphics g ) {
		super.paintComponent( g );
		
		drawGrid( g );
		drawPath( g );
		drawSingleStep( g );
		updateCurrentSquare( g );
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		for ( Square s : grid ) {
			if ( arg0.getX() > s.getX() && arg0.getX() < s.getX() + s.getWidth()
				&& arg0.getY() > s.getY() && arg0.getY() < s.getY() + s.getHeight() ) {
				if ( s.isPassable() ) 
					s.setPassable( false );
			}
		}
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		mouseX = arg0.getX();
		mouseY = arg0.getY();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if ( arg0.getButton() == 1 ) {
			markPassable( arg0.getX(), arg0.getY(), true, false, false );
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {}
	@Override
	public void mouseExited(MouseEvent arg0) {}
	@Override
	public void mousePressed(MouseEvent arg0) {}
	@Override
	public void mouseReleased(MouseEvent arg0) {}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if ( arg0.getSource() == passableMenu )
			markPassable( mouseX, mouseY, true, false, false );
		else if ( arg0.getSource() == markStartMenu )
			markPassable( mouseX, mouseY, false, true, false );
		else if ( arg0.getSource() == markEndMenu )
			markPassable( mouseX, mouseY, false, false, true );
		else if ( arg0.getSource() == clearAll ) {
			clearAll();
		}
	}
	
/*************************************private methods************************************/
	
	/** Initializes the popup menu. */
	private void initMenu() {
		popup = new JPopupMenu();
		passableMenu = new JMenuItem( "Toggle passability                " );
		passableMenu.addActionListener( this );
		popup.add( passableMenu );
		{
			jSeparator1 = new JSeparator();
			popup.add(jSeparator1);
		}
		markStartMenu = new JMenuItem( "Mark as 'starting point'" );
		markStartMenu.addActionListener( this );
		popup.add( markStartMenu );
		markEndMenu = new JMenuItem( "Mark as 'end point'" );
		markEndMenu.addActionListener( this );
		popup.add( markEndMenu );
		{
			jSeparator2 = new JSeparator();
			popup.add(jSeparator2);
		}
		clearAll = new JMenuItem( "Clear all squares" );
		clearAll.addActionListener( this );
		popup.add( clearAll );
		MouseListener popupListener = new PopupListener();
		addMouseListener( popupListener );
	}
	
	/** Marks a square either as passable, or starting point or end point depending on the
	 * values of the boolean variables. */
	private void markPassable( int x, int y, boolean pass, boolean start, boolean end ) {
		for ( Square s : grid ) {
			if ( x > s.getX() && x < s.getX() + s.getWidth() && y > s.getY() && y < s.getY() + s.getHeight() ) {
				if ( pass && !start && !end ) {
					if ( s.isPassable() )  {
						if ( s.isEnd() || s.isStart() )
							JOptionPane.showMessageDialog( this, "Square already marked as start or end point." );
						else
							s.setPassable( false );
					}
					else if ( !s.isPassable() ) {
						s.setPassable( true );
					}
				}
				else if ( !pass && start && !end ) {
					if ( s.isStart() ) {
						s.setStart( false );
						this.start = false;
						startSq = null;
						markStartMenu.setText( "Mark as 'starting point'" );
					}
					else if ( !s.isStart() && !this.start ) {
						if ( s.isPassable() ) {
							s.setStart( true );
							this.start = true;
							startSq = new Square( s );
							markStartMenu.setText( "Unmark 'starting point'" );
						}
						else 
							JOptionPane.showMessageDialog( this, "Square is not passable." );
					}
				}
				else if ( !pass && !start && end ) {
					if ( s.isEnd() ) {
						s.setEnd( false );
						this.end = false;
						endSq = null;
						markEndMenu.setText( "Mark as 'end point'" );
					}
					else if ( !s.isEnd() && !this.end ) {
						if ( s.isPassable() ) {
							s.setEnd( true );
							this.end = true;
							endSq = new Square( s );
							markEndMenu.setText( "Unmark 'end point'" );
						}
						else
							JOptionPane.showMessageDialog( this, "Square is not passable." );
					}
				}
			}
		}
	}
	
	/** Generates the square grid. */
	private ArrayList<Square> generateSquareGrid() {
		int x = 0, y = 0, size = 21;
		ArrayList<Square> tmp = new ArrayList<Square>();
		for ( int i = 0; i < 26; i++ ) {
			for ( int j = 0; j < 24; j++ ) {
				Square s = new Square( x, y, size, size, true, false, false );
				tmp.add( s );
				x += size;
			}
			x = 0; y += size;
		}
		return new ArrayList<Square>( tmp );
	}
	
	/** Draws the square grid. */
	private void drawGrid( Graphics g ) {
		for ( Square s : grid ) {
			if ( !s.isPassable() ) {
				drawSquare( g, s.getX(), s.getY(), s.getWidth(), s.getHeight(), parent.getWallColor(), Color.BLACK );
			}
			else if ( s.isStart() ) {
				drawSquare( g, s.getX(), s.getY(), s.getWidth(), s.getHeight(), parent.getStartColor(), Color.BLACK );
				g.drawString( "S", s.getX() + 7, s.getY() + 15 );
			}
			else if ( s.isEnd() ) {
				drawSquare( g, s.getX(), s.getY(), s.getWidth(), s.getHeight(), parent.getEndColor(), Color.BLACK );
				g.drawString( "E", s.getX() + 7, s.getY() + 15 );
			}
			else
				drawSquare( g, s.getX(), s.getY(), s.getWidth(), s.getHeight(), Color.WHITE, Color.BLACK );
		}
	}
	
	/** Draw a single square with coordinates ( x, y ) and size ( width, height ). Also 
	 * fill and outline specify the colors for the fill and the boundary respectively.*/
	private void drawSquare( Graphics g, int x, int y, int width, int height, Color fill, Color outline ) {
		g.setColor( fill );
		g.fillRect( x, y, width, height );
		g.setColor( outline );
		g.drawRect( x, y, width, height );
	}
	
	/** Draws the whole route. */
	private void drawPath( Graphics g ) {
		if ( path.size() > 0 && showRoute ) {
			for ( Square s : path ) {
				drawSquare( g, s.getX(), s.getY(), s.getWidth(), s.getHeight(), parent.getPathColor(), Color.BLACK );
			}
		}
	}
	/** Draws a single step of the route. */
	private void drawSingleStep( Graphics g ) {
		if ( path.size() > 0 && singleStep ) {
			drawSquare( g, path.get( singleStepCounter ).getX(), path.get( singleStepCounter ).getY(), path.get( singleStepCounter ).getWidth(), path.get( singleStepCounter ).getHeight(), parent.getPathColor(), Color.BLACK );
		}
	}
	
	/** Updates the position of the current yellow square. */
	private void updateCurrentSquare( Graphics g ) {
		for ( Square s : grid ) {
			if ( mouseX > s.getX() && mouseX < s.getX() + s.getWidth()
				&& mouseY > s.getY() && mouseY < s.getY() + s.getHeight() ) {
				g.setColor( Color.YELLOW );
				g.drawRect( s.getX(), s.getY(), s.getWidth(), s.getHeight() );
				parent.updateInfo( s.getX(), s.getY(), s.getWidth(), s.getHeight(), s.isPassable(), s.isStart(), s.isEnd() );
			}
		}
	}
	
	/** Inner class to handle the popup menu. */
	private class PopupListener extends MouseAdapter {
	    public void mousePressed( MouseEvent e ) {
	        maybeShowPopup( e );
	    }
	    public void mouseReleased( MouseEvent e ) {
	        maybeShowPopup( e );
	    }
	    private void maybeShowPopup( MouseEvent e ) {
	        if ( e.isPopupTrigger() ) {
	            popup.show( e.getComponent(), e.getX(), e.getY() );
	        }
	    }
	}
}
