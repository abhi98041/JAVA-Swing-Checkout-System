/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CJP18104
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Midterm extends javax.swing.JFrame {
    static int computer=0,monitor=0,keyboard=0,printer=0,colorprinter=0,speaker=0,office=0,ground=0,air=0,fedex=0;
    /**
     * Creates new form Midterm
     */
    public Midterm() {
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

        baseComputerCheck = new javax.swing.JCheckBox();
        monitorCheck = new javax.swing.JCheckBox();
        keyboardMouseCheck = new javax.swing.JCheckBox();
        laserPrinterCheck = new javax.swing.JCheckBox();
        colorLaserPrinterCheck = new javax.swing.JCheckBox();
        portableSpeakerCheck = new javax.swing.JCheckBox();
        microsoftOfficeCheck = new javax.swing.JCheckBox();
        groundCircleButton = new javax.swing.JRadioButton();
        airCircleButton = new javax.swing.JRadioButton();
        fedexCirlceButton = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderResults = new javax.swing.JTextPane();
        noShippingButton = new javax.swing.JButton();
        shippingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        baseComputerCheck.setText("Base Computer $500");
        baseComputerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseComputerCheckActionPerformed(evt);
            }
        });

        monitorCheck.setText("Monitor $150");
        monitorCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorCheckActionPerformed(evt);
            }
        });

        keyboardMouseCheck.setText("Keyboard & Mouse $35");
        keyboardMouseCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyboardMouseCheckActionPerformed(evt);
            }
        });


        laserPrinterCheck.setText("B&W Laser Printer $100");

        laserPrinterCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laserPrinterCheckActionPerformed(evt);
            }
        });

        colorLaserPrinterCheck.setText("Color Laser Printer $300");
        colorLaserPrinterCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorLaserPrinterCheckActionPerformed(evt);
            }
        });


        portableSpeakerCheck.setText("Portable Speaker $50");
        portableSpeakerCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorLaserPrinterCheckActionPerformed(evt);
            }
        });


        microsoftOfficeCheck.setText("Microsoft Office $150");
        microsoftOfficeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                microsoftOfficeCheckActionPerformed(evt);
            }
        });

        groundCircleButton.setText("Ground");
        airCircleButton.setText("Air");
        fedexCirlceButton.setText("Fedex");
        ButtonGroup editableGroup = new ButtonGroup();
        editableGroup.add(groundCircleButton);
        editableGroup.add(airCircleButton);
        editableGroup.add(fedexCirlceButton);

        groundCircleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ground=1;
                air=0;
                fedex=0;
            }
        });
        airCircleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                air=1;
                ground=0;
                fedex=0;
            }
        });
        fedexCirlceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fedex=1;
                ground=0;
                air=0;
            }
        });

        jScrollPane1.setViewportView(orderResults);

        noShippingButton.setText("Calculate without Shipping");
        noShippingButton.setActionCommand("NO");

        shippingButton.setText("Calculate with Shipping");
        shippingButton.setActionCommand("YES");

        noShippingButton.addActionListener(new ButtonClickListener());
        shippingButton.addActionListener(new ButtonClickListener());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(23, 23, 23)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(monitorCheck)
                                                                        .addComponent(baseComputerCheck)
                                                                        .addComponent(microsoftOfficeCheck)
                                                                        .addComponent(colorLaserPrinterCheck)
                                                                        .addComponent(keyboardMouseCheck)
                                                                        .addComponent(portableSpeakerCheck))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(laserPrinterCheck)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(shippingButton)
                                                        .addComponent(noShippingButton))
                                                .addGap(10, 10, 10)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(groundCircleButton)
                                                        .addComponent(airCircleButton)
                                                        .addComponent(fedexCirlceButton))
                                                .addGap(92, 92, 92))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(baseComputerCheck)
                                        .addComponent(groundCircleButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(monitorCheck)
                                        .addComponent(airCircleButton))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(keyboardMouseCheck)
                                        .addComponent(fedexCirlceButton))
                                .addGap(3, 3, 3)
                                .addComponent(laserPrinterCheck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(colorLaserPrinterCheck)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(portableSpeakerCheck)
                                                .addGap(3, 3, 3)
                                                .addComponent(microsoftOfficeCheck)
                                                .addGap(25, 25, 25)
                                                .addComponent(noShippingButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(shippingButton)
                                                .addContainerGap(35, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(jScrollPane1)
                                                .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laserPrinterCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserPrinterCheckActionPerformed
        boolean selected = laserPrinterCheck.getModel().isSelected();
        if (selected){
            printer=100;
        }
        else {
            printer=0;

        }

    }//GEN-LAST:event_laserPrinterCheckActionPerformed

    private void microsoftOfficeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_microsoftOfficeCheckActionPerformed
        boolean selected = microsoftOfficeCheck.getModel().isSelected();
        if (selected){
            office=150;
        }
        else {
            office=0;
        }
    }//GEN-LAST:event_microsoftOfficeCheckActionPerformed

    private void baseComputerCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_microsoftOfficeCheckActionPerformed
        boolean selected = baseComputerCheck.getModel().isSelected();
        if (selected){
            computer=500;
        }
        else {
            computer=0;
        }

    }
    private void colorLaserPrinterCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserPrinterCheckActionPerformed
        boolean selected = colorLaserPrinterCheck.getModel().isSelected();
        if (selected){
            colorprinter=300;
        }
        else {
            colorprinter=0;
        }
    }
    private void keyboardMouseCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserPrinterCheckActionPerformed
        boolean selected = keyboardMouseCheck.getModel().isSelected();
        if(selected){
            keyboard=35;
        }
        else {
            keyboard=0;
        }

    }
    private void monitorCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laserPrinterCheckActionPerformed
        boolean selected = monitorCheck.getModel().isSelected();
        if (selected){
            monitor=150;
        }
        else {
            monitor=0;
        }
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
            java.util.logging.Logger.getLogger(Midterm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Midterm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Midterm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Midterm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Midterm().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton airCircleButton;
    private javax.swing.JCheckBox baseComputerCheck;
    private javax.swing.JCheckBox colorLaserPrinterCheck;
    private javax.swing.JRadioButton fedexCirlceButton;
    private javax.swing.JRadioButton groundCircleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox keyboardMouseCheck;
    private javax.swing.JCheckBox laserPrinterCheck;
    private javax.swing.JCheckBox microsoftOfficeCheck;
    private javax.swing.JCheckBox monitorCheck;
    private javax.swing.JButton noShippingButton;
    private javax.swing.JTextPane orderResults;
    private javax.swing.JCheckBox portableSpeakerCheck;
    private javax.swing.JButton shippingButton;
    // End of variables declaration//GEN-END:variables

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("NO")) {
                orderResults.setText("");
                calculateCost(1,false);
                for (int i=100;i<=1000;i=i+100){
                    //i=i+100;
                    calculateCost(i,false);
                }
            } else if (command.equals("YES")) {
                //orderResults.setText("YES Button clicked.");
                orderResults.setText("");
                //orderResults.setText("NO Button clicked.");
                calculateCost(1,true);
                for (int i=100;i<=1000;i=i+100){
                    //i=i+100;
                    calculateCost(i,true);
                }
            }
        }
    }
    double calculateCost(){
        double cost=   computer+monitor+keyboard+printer+colorprinter+speaker+office;
        //orderResults.setText("1 \t"+cost);
        return cost;
    }
    double calculateCost(int quantity,boolean ship){
        double cost=   computer+monitor+keyboard+printer+colorprinter+speaker+office;
        double discount = getDiscountPercentage(quantity);
        double costbeforediscount= quantity*cost;
        double finalcost=(costbeforediscount)-(costbeforediscount*discount);
        if (ground==1){
            if (quantity<100) {
                finalcost = finalcost + (finalcost * 0.05);
            }
            else{
               finalcost=finalcost+0;
            }
        }
        else if (air==1){
            finalcost=finalcost+(finalcost*0.1);
        }
        else if (fedex==1){
            finalcost=finalcost+(finalcost*0.2);
        }
        else {
            finalcost=finalcost+0;
        }
        orderResults.setText(orderResults.getText()+"\n"+ quantity+"\t"+finalcost);
        return finalcost;

    }
    public double getDiscountPercentage(int quantity){
        double disc=0;
        if (quantity<200 && quantity>99){
            disc=0.01;
        }
        else if(quantity<300 && quantity>199){
            disc=0.02;
        }
        else if(quantity<400 && quantity>299){
            disc=0.03;
        }
        else if(quantity<500 && quantity>399){
            disc=0.04;
        }
        else if(quantity<600 && quantity>499){
            disc=0.05;
        }
        else if(quantity<700 && quantity>599){
            disc=0.06;
        }
        else if(quantity<800 && quantity>699){
            disc=0.07;
        }
        else if(quantity<900 && quantity>799){
            disc=0.08;
        }
        else if(quantity<1000 && quantity>899){
            disc=0.09;
        }
        else if(quantity<100 && quantity>0){
            disc=0;
        }
        return disc;
    }
}
