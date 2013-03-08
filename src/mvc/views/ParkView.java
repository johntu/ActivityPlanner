package mvc.views;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * The Park View shows all tasks that can be placed on the Chart View.
 * 
 * @author John
 */
public class ParkView {

	private Dimension canvasSize;
	private JPanel parkPanel;
	private JScrollPane scrollPane;
	private PlanningView view;

	public ParkView(PlanningView view) {
		this.view = view;

		parkPanel = new JPanel();

		parkPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		JButton task = new JButton("Task 4");
		task.setPreferredSize(new Dimension(view.cellWidth * 2, view.cellHeight));
		parkPanel.add(task);

		task = new JButton("Task 5");
		task.setPreferredSize(new Dimension(view.cellWidth * 2, view.cellHeight));
		parkPanel.add(task);

		canvasSize = new Dimension(view.cellWidth * 4, view.cellHeight);
		parkPanel.setPreferredSize(canvasSize);

		scrollPane = new JScrollPane(parkPanel);
		scrollPane.setBorder(null);
		scrollPane.setPreferredSize(canvasSize);
		scrollPane.setMinimumSize(canvasSize);
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

}
