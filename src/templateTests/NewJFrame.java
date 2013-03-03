/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package templateTests;

/**
 *
 * @author David
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLeft = new javax.swing.JPanel();
        jPanelLeftTop = new javax.swing.JPanel();
        jLabelLine1 = new javax.swing.JLabel();
        jLabelLine2 = new javax.swing.JLabel();
        jLabelLine3 = new javax.swing.JLabel();
        jLabelLine4 = new javax.swing.JLabel();
        jLabelPark = new javax.swing.JLabel();
        jPanelLeftBottom = new javax.swing.JPanel();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jPanelRight = new javax.swing.JPanel();
        jPanelRightTop = new javax.swing.JScrollPane();
        jPanelInsideScrollPane = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButtonFloating = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanelTimeline = new javax.swing.JPanel();
        jButtonTimeline = new javax.swing.JButton();
        jPanelCanvas = new javax.swing.JPanel();
        jButtonInsideCanvas = new javax.swing.JButton();
        jPanelRightBottom = new javax.swing.JPanel();
        jButtonTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setPreferredSize(new java.awt.Dimension(900, 600));

        jPanelLeft.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanelLeft.setPreferredSize(new java.awt.Dimension(100, 577));
        jPanelLeft.setLayout(new java.awt.GridLayout(0, 1));

        jPanelLeftTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLine1.setText("Line1");
        jPanelLeftTop.add(jLabelLine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabelLine2.setText("Line2");
        jPanelLeftTop.add(jLabelLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabelLine3.setText("Line3");
        jPanelLeftTop.add(jLabelLine3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabelLine4.setText("Line4");
        jPanelLeftTop.add(jLabelLine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabelPark.setText("Park");
        jPanelLeftTop.add(jLabelPark, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jPanelLeft.add(jPanelLeftTop);

        jPanelLeftBottom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAdd.setText("Add");
        jPanelLeftBottom.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jButtonRemove.setText("Remove");
        jPanelLeftBottom.add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, -1));

        jPanelLeft.add(jPanelLeftBottom);

        getContentPane().add(jPanelLeft, java.awt.BorderLayout.WEST);

        jPanelRight.setLayout(new java.awt.GridLayout(0, 1));

        jPanelRightTop.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanelInsideScrollPane.setMinimumSize(new java.awt.Dimension(760, 210));
        jPanelInsideScrollPane.setPreferredSize(new java.awt.Dimension(760, 210));

        jLayeredPane1.setMinimumSize(new java.awt.Dimension(881, 100));

        jButtonFloating.setText("Activity number 1 (here you see the application of the layeredPanel)");
        jButtonFloating.setBounds(100, 130, 361, 23);
        jLayeredPane1.add(jButtonFloating, javax.swing.JLayeredPane.DRAG_LAYER);

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanelTimeline.setPreferredSize(new java.awt.Dimension(430, 50));

        jButtonTimeline.setText("jButton7");

        javax.swing.GroupLayout jPanelTimelineLayout = new javax.swing.GroupLayout(jPanelTimeline);
        jPanelTimeline.setLayout(jPanelTimelineLayout);
        jPanelTimelineLayout.setHorizontalGroup(
            jPanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTimelineLayout.createSequentialGroup()
                .addComponent(jButtonTimeline, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTimelineLayout.setVerticalGroup(
            jPanelTimelineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonTimeline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel5.add(jPanelTimeline, java.awt.BorderLayout.NORTH);

        jPanelCanvas.setPreferredSize(new java.awt.Dimension(430, 160));

        jButtonInsideCanvas.setText("jButton8");

        javax.swing.GroupLayout jPanelCanvasLayout = new javax.swing.GroupLayout(jPanelCanvas);
        jPanelCanvas.setLayout(jPanelCanvasLayout);
        jPanelCanvasLayout.setHorizontalGroup(
            jPanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCanvasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInsideCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanelCanvasLayout.setVerticalGroup(
            jPanelCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCanvasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonInsideCanvas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel5.add(jPanelCanvas, java.awt.BorderLayout.CENTER);

        jPanel5.setBounds(0, 0, 760, 210);
        jLayeredPane1.add(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanelInsideScrollPaneLayout = new javax.swing.GroupLayout(jPanelInsideScrollPane);
        jPanelInsideScrollPane.setLayout(jPanelInsideScrollPaneLayout);
        jPanelInsideScrollPaneLayout.setHorizontalGroup(
            jPanelInsideScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInsideScrollPaneLayout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelInsideScrollPaneLayout.setVerticalGroup(
            jPanelInsideScrollPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanelRightTop.setViewportView(jPanelInsideScrollPane);

        jPanelRight.add(jPanelRightTop);

        jButtonTable.setText("jButton2");

        javax.swing.GroupLayout jPanelRightBottomLayout = new javax.swing.GroupLayout(jPanelRightBottom);
        jPanelRightBottom.setLayout(jPanelRightBottomLayout);
        jPanelRightBottomLayout.setHorizontalGroup(
            jPanelRightBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
        );
        jPanelRightBottomLayout.setVerticalGroup(
            jPanelRightBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
        );

        jPanelRight.add(jPanelRightBottom);

        getContentPane().add(jPanelRight, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonFloating;
    private javax.swing.JButton jButtonInsideCanvas;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonTable;
    private javax.swing.JButton jButtonTimeline;
    private javax.swing.JLabel jLabelLine1;
    private javax.swing.JLabel jLabelLine2;
    private javax.swing.JLabel jLabelLine3;
    private javax.swing.JLabel jLabelLine4;
    private javax.swing.JLabel jLabelPark;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCanvas;
    private javax.swing.JPanel jPanelInsideScrollPane;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelLeftBottom;
    private javax.swing.JPanel jPanelLeftTop;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JPanel jPanelRightBottom;
    private javax.swing.JScrollPane jPanelRightTop;
    private javax.swing.JPanel jPanelTimeline;
    // End of variables declaration//GEN-END:variables
}