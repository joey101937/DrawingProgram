//Joseph DeMeis
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingprogram;

import java.awt.Color;

/**
 *
 * @author clatulip
 */
public class DrawingWindow extends javax.swing.JFrame {

    private DrawingModel myModel;

    /**
     * Constructor that creates new JFrame form with various elements on it The
     * elements have been designed using NetBeans design view
     */
    public DrawingWindow(DrawingModel model) {
        // save the model so we can use it
        myModel = model;
        // this calls the NetBeans auto-generated code that creates the
        // window and adds all the GUI elements to it
        initComponents();
        // change the window title (you can change this whatever you want)
        this.setTitle("Joey's Basic Drawing Program");
        // pass the drawingModel to the canvas, because it needs it, too
        drawingCanvas.setModel(myModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        clearButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        UndoButton = new javax.swing.JButton();
        RedoButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 0), new java.awt.Dimension(60, 32767));
        outlineLabel = new javax.swing.JLabel();
        redLineToggle = new javax.swing.JToggleButton();
        blackLineToggle = new javax.swing.JToggleButton();
        jButton2 = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        fillLabel = new javax.swing.JLabel();
        redFillToggle = new javax.swing.JToggleButton();
        blackFillToggle = new javax.swing.JToggleButton();
        whiteFillToggle = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        drawingCanvas = new drawingprogram.DrawingCanvas();
        shapeComboBox = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        clearButton.setText("Clear");
        clearButton.setFocusable(false);
        clearButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clearButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(clearButton);

        saveButton.setText("Save");
        saveButton.setFocusable(false);
        saveButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        saveButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(saveButton);

        UndoButton.setText("Undo");
        UndoButton.setFocusable(false);
        UndoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UndoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UndoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UndoButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(UndoButton);

        RedoButton.setText("Redo");
        RedoButton.setFocusable(false);
        RedoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        RedoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        RedoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RedoButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(RedoButton);
        jToolBar1.add(filler1);

        outlineLabel.setText("Outline:");
        jToolBar1.add(outlineLabel);

        redLineToggle.setText("Red");
        redLineToggle.setFocusable(false);
        redLineToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        redLineToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        redLineToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redLineToggleActionPerformed(evt);
            }
        });
        jToolBar1.add(redLineToggle);

        blackLineToggle.setSelected(true);
        blackLineToggle.setText("Black");
        blackLineToggle.setFocusable(false);
        blackLineToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackLineToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackLineToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackLineToggleActionPerformed(evt);
            }
        });
        jToolBar1.add(blackLineToggle);

        jButton2.setText("LineColor");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);
        jToolBar1.add(filler3);

        fillLabel.setText("Fill:");
        jToolBar1.add(fillLabel);

        redFillToggle.setText("Red");
        redFillToggle.setFocusable(false);
        redFillToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        redFillToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        redFillToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redFillToggleActionPerformed(evt);
            }
        });
        jToolBar1.add(redFillToggle);

        blackFillToggle.setText("Black");
        blackFillToggle.setFocusable(false);
        blackFillToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blackFillToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blackFillToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackFillToggleActionPerformed(evt);
            }
        });
        jToolBar1.add(blackFillToggle);

        whiteFillToggle.setSelected(true);
        whiteFillToggle.setText("White");
        whiteFillToggle.setFocusable(false);
        whiteFillToggle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        whiteFillToggle.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        whiteFillToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whiteFillToggleActionPerformed(evt);
            }
        });
        jToolBar1.add(whiteFillToggle);

        jButton1.setText("FillColor");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        drawingCanvas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        drawingCanvas.setPreferredSize(new java.awt.Dimension(500, 500));
        drawingCanvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                drawingCanvasMouseDragged(evt);
            }
        });
        drawingCanvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawingCanvasMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                drawingCanvasMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout drawingCanvasLayout = new javax.swing.GroupLayout(drawingCanvas);
        drawingCanvas.setLayout(drawingCanvasLayout);
        drawingCanvasLayout.setHorizontalGroup(
            drawingCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 794, Short.MAX_VALUE)
        );
        drawingCanvasLayout.setVerticalGroup(
            drawingCanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
        );

        shapeComboBox.setModel(new javax.swing.DefaultComboBoxModel(getShapeTypeValues())
        );
        shapeComboBox.setSelectedItem(myModel.getCurrentShape());
        shapeComboBox.setToolTipText("Pick a shape to draw");
        shapeComboBox.setPreferredSize(new java.awt.Dimension(50, 27));
        shapeComboBox.setRequestFocusEnabled(false);
        shapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeComboBoxActionPerformed(evt);
            }
        });

        jButton3.setText("Background");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(drawingCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(drawingCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Clear button handler
     *
     * @param evt
     */
    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // tell the model to clear itself and then update the canvas
        myModel.clearModel();
        drawingCanvas.update();
    }//GEN-LAST:event_clearButtonActionPerformed

    /**
     * Mouse pressed handler
     *
     * @param evt gives access to x and y coords where mouse pressed down
     */
    private void drawingCanvasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingCanvasMousePressed
        // Get the x and y coords
        startX = evt.getX();
        startY = evt.getY();
        // stuff to enable interactive drawing
        myModel.setMouseDown(true);
        myModel.setStartX(startX);
        myModel.setStartY(startY);
    }//GEN-LAST:event_drawingCanvasMousePressed

    /**
     * Mouse released handler
     *
     * @param evt gives access to x and y coords where mouse was released
     */
    private void drawingCanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingCanvasMouseReleased
        // Get the x and y coords
        endX = evt.getX();
        endY = evt.getY();
        // add new shape to the model
        switch (myModel.getCurrentShape()) {
            case LINE:
                myModel.addNewShape(new Line(
                        startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor()));
                break;
            case RECT:
                myModel.addNewShape(new Rectangle(
                        startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor(),
                        myModel.getFillColor()));
                break;
            case OVAL:
                myModel.addNewShape(new Oval(startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor(),
                        myModel.getFillColor()));
                break;
                            case RoundedRect:
                myModel.addNewShape(new RoundedRect(startX,
                        startY,
                        endX,
                        endY,
                        myModel.getLineColor(),
                        myModel.getFillColor()));
                break;
        }
        myModel.setMouseDown(false);
        drawingCanvas.update();
    }//GEN-LAST:event_drawingCanvasMouseReleased

    public DrawingCanvas getCanvas(){
        return this.drawingCanvas;
    }
    /**
     * Toggle button handler for the blackLine toggle button
     *
     * @param evt
     */
    private void blackLineToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackLineToggleActionPerformed
        // set current line color in model
        myModel.setLineColor(Color.BLACK);
        // update other toggles
        redLineToggle.setSelected(false);
    }//GEN-LAST:event_blackLineToggleActionPerformed

    /**
     * Toggle button handler for the redLine toggle button
     *
     * @param evt
     */
    private void redLineToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redLineToggleActionPerformed
        // set the current line color in model
        myModel.setLineColor(Color.RED);
        // update other toggles
        blackLineToggle.setSelected(false);
    }//GEN-LAST:event_redLineToggleActionPerformed

    /**
     * Canvas mouse drag handler, gets called whenever the user is dragging
     * cursor across canvas with button pressed
     *
     * @param evt gives access to current x and y coords
     */
    private void drawingCanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawingCanvasMouseDragged
        // get x and y coords, save in model
        myModel.setCurrentX(evt.getX());
        myModel.setCurrentY(evt.getY());
        // update canvas (needed to make drawing interactive)
        drawingCanvas.update();
    }//GEN-LAST:event_drawingCanvasMouseDragged

    /**
     * Toggle button handler for the blackFill toggle button
     *
     * @param evt
     */
    private void blackFillToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackFillToggleActionPerformed
        // update fill color in model
        myModel.setFillColor(Color.BLACK);
        // update other toggles
        whiteFillToggle.setSelected(false);
        redFillToggle.setSelected(false);
    }//GEN-LAST:event_blackFillToggleActionPerformed

    /**
     * Toggle button handler for the whiteFill toggle button
     *
     * @param evt
     */
    private void whiteFillToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whiteFillToggleActionPerformed
        // update fill color in model
        myModel.setFillColor(Color.WHITE);
        // update other toggles
        redFillToggle.setSelected(false);
        blackFillToggle.setSelected(false);
    }//GEN-LAST:event_whiteFillToggleActionPerformed

    /**
     * Toggle button handler for the redFill toggle button
     *
     * @param evt
     */
    private void redFillToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redFillToggleActionPerformed
        // update fill color in model
        myModel.setFillColor(Color.RED);
        // update other toggles
        whiteFillToggle.setSelected(false);
        blackFillToggle.setSelected(false);
    }//GEN-LAST:event_redFillToggleActionPerformed

    /**
     * Handler for the shapeComboBox NB: you should not need to change this code
     *
     * @param evt
     */
    private void shapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeComboBoxActionPerformed
        // update current shape in model
        DrawingModel.ShapeType selectedShape = DrawingModel.ShapeType.values()[shapeComboBox.getSelectedIndex()];
        myModel.setCurrentShape(selectedShape);

    }//GEN-LAST:event_shapeComboBoxActionPerformed

    /**
     * Save button handler
     *
     * @param evt
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // create and show the save file dialog window
        SaveDialogWindow saveWindow = new SaveDialogWindow(drawingCanvas);
        saveWindow.setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void UndoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UndoButtonActionPerformed
        this.myModel.undo();
        this.repaint();
    }//GEN-LAST:event_UndoButtonActionPerformed

    private void RedoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RedoButtonActionPerformed
          this.myModel.redo();
        this.repaint();
    }//GEN-LAST:event_RedoButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ColorPickerWindow picker = new ColorPickerWindow(myModel,1);
        picker.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ColorPickerWindow picker = new ColorPickerWindow(myModel,2);
        picker.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ColorPickerWindow picker = new ColorPickerWindow(myModel,3);
        picker.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * This is used to populate the comboBox on the window
     *
     * @return the list of shapes in the enumerated type
     */
    private DrawingModel.ShapeType[] getShapeTypeValues() {
        return DrawingModel.ShapeType.values();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RedoButton;
    private javax.swing.JButton UndoButton;
    private javax.swing.JToggleButton blackFillToggle;
    private javax.swing.JToggleButton blackLineToggle;
    private javax.swing.JButton clearButton;
    private drawingprogram.DrawingCanvas drawingCanvas;
    private javax.swing.JLabel fillLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel outlineLabel;
    private javax.swing.JToggleButton redFillToggle;
    private javax.swing.JToggleButton redLineToggle;
    private javax.swing.JButton saveButton;
    private javax.swing.JComboBox shapeComboBox;
    private javax.swing.JToggleButton whiteFillToggle;
    // End of variables declaration//GEN-END:variables

    // local fields needed for interactive drawing
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    private int currentX;
    private int currentY;

}