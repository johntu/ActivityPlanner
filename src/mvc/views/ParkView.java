package mvc.views;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import mvc.controllers.ParkController;
import mvc.model.Activity;
import mvc.model.ActivityHolder;
import mvc.model.Model;

/**
 * The Park View shows all tasks that can be placed on the Chart View.
 * 
 * @author John
 */
public class ParkView implements Observer {

    private Dimension canvasSize;
    private JPanel parkPanel;
    private JScrollPane scrollPane;
    private PlanningView view;
    
    public ParkController parkController;

    public ParkView(Model model, PlanningView view) {
            this.view = view;
            
            model.addObserver(this);

            parkPanel = new JPanel();

            parkPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
            
            canvasSize = new Dimension(view.cellWidth, view.cellHeight);
            parkPanel.setPreferredSize(canvasSize);
            
            scrollPane = new JScrollPane(parkPanel);
            scrollPane.setBorder(null);
            scrollPane.setPreferredSize(canvasSize);
    }

    /**
     * Returns this component.
     * 
     * @return this component.
     */
    public JScrollPane getComponent() {
            return scrollPane;
    }

    /**
     * Updates the size taking into account the size of the scroll bar. 
     */
    public void updateSize() {
		if (scrollPane.getHorizontalScrollBar().isVisible()) {
			canvasSize.height = view.cellHeight
					+ scrollPane.getHorizontalScrollBar().getBounds().height;
		} else {
			canvasSize.height = view.cellHeight;
		}

		scrollPane.setMinimumSize(canvasSize);
	}

    @Override
    public void update(Observable o, Object arg)
    {
        Model model = (Model) o;
        
        Activity[] unscheduled = model.getUnscheduledActivities().getActivities();
        
        canvasSize = new Dimension(view.cellWidth * unscheduled.length, view.cellHeight);
        
        updateSize();
        
        // Remove all tasks from the panel
		Component[] tasks = parkPanel.getComponents();
		for(Component c : tasks)
			parkPanel.remove(c);
        
        Task task;
        
        for(Activity a : unscheduled) {
            task = new Task(null);
            task.setSize(view.cellWidth * 2, view.cellHeight);
            task.setActivity(a);
            task.addMouseListener(parkController);
            task.addMouseMotionListener(parkController);
            parkPanel.add(task);
        }
        
    }

}
