package john.planningchart;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * The Park View shows all tasks that can be placed
 * on the Chart View.
 * @author John
 */
public class ParkView implements Observer {

	private static final long serialVersionUID = 1L;
	
	private Dimension canvasSize;
	private JPanel parkPanel;
	private JScrollPane scrollPane;
	
	public ParkView(PlanningModel model, PlanningView view) {
		model.addObserver(this);
		
		parkPanel = new JPanel();
		
		parkPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		
		JButton task = new JButton("Task 4");
		task.setPreferredSize(new Dimension(
				view.cellWidth * 2, view.cellHeight));
		parkPanel.add(task);
		
		task = new JButton("Task 5");
		task.setPreferredSize(new Dimension(
				view.cellWidth * 2, view.cellHeight));
		parkPanel.add(task);
		
		canvasSize = new Dimension(view.cellWidth * 4, view.cellHeight + 20);
		parkPanel.setSize(canvasSize);
		
		scrollPane = new JScrollPane(parkPanel);
		scrollPane.setBorder(null);
		//parkScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(canvasSize);
		scrollPane.setMinimumSize(canvasSize);
	}

	@Override
	public void update(Observable observable, Object data) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Returns this component.
	 * @return this component.
	 */
	public JScrollPane getComponent() {
		return scrollPane;
	}

}
