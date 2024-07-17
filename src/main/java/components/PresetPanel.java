/**
 * Copyright (C) 2013, 2014 Johannes Taelman
 *
 * This file is part of Axoloti.
 *
 * Axoloti is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Axoloti is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Axoloti. If not, see <http://www.gnu.org/licenses/>.
 */
package components;

import axoloti.Patch;

/**
 *
 * @author Johannes Taelman
 */
public class PresetPanel extends javax.swing.JPanel {

    Patch p;

    /**
     * Creates new form PresetPanel
     *
     * @param p patch to recall preset
     */
    public PresetPanel(Patch p) {
        this.p = p;
        initComponents();
    }

    public void ShowLive(boolean live) {
        jButtonRI.setEnabled(live);
        jButtonR1.setEnabled(live);
        jButtonR2.setEnabled(live);
        jButtonR3.setEnabled(live);
        jButtonR4.setEnabled(live);
        jButtonR5.setEnabled(live);
        jButtonR6.setEnabled(live);
        jButtonR7.setEnabled(live);
        jButtonR8.setEnabled(live);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonRI = new javax.swing.JButton();
        jButtonR1 = new javax.swing.JButton();
        jButtonR2 = new javax.swing.JButton();
        jButtonR3 = new javax.swing.JButton();
        jButtonR4 = new javax.swing.JButton();
        jButtonR5 = new javax.swing.JButton();
        jButtonR6 = new javax.swing.JButton();
        jButtonR7 = new javax.swing.JButton();
        jButtonR8 = new javax.swing.JButton();
        jToggleButtonEI = new javax.swing.JToggleButton();
        jToggleButtonE1 = new javax.swing.JToggleButton();
        jToggleButtonE2 = new javax.swing.JToggleButton();
        jToggleButtonE3 = new javax.swing.JToggleButton();
        jToggleButtonE4 = new javax.swing.JToggleButton();
        jToggleButtonE5 = new javax.swing.JToggleButton();
        jToggleButtonE6 = new javax.swing.JToggleButton();
        jToggleButtonE7 = new javax.swing.JToggleButton();
        jToggleButtonE8 = new javax.swing.JToggleButton();

        setAlignmentX(0.0F);
        setMaximumSize(new java.awt.Dimension(400, 40));
        setMinimumSize(new java.awt.Dimension(400, 40));
        setPreferredSize(new java.awt.Dimension(400, 40));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setText("Preset");
        add(jLabel3);

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Recall ");
        jPanel1.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Edit ");
        jPanel1.add(jLabel2);

        add(jPanel1);

        jPanel2.setMinimumSize(new java.awt.Dimension(275, 38));
        jPanel2.setPreferredSize(new java.awt.Dimension(275, 38));
        jPanel2.setLayout(new java.awt.GridLayout(2, 9));

        jButtonRI.setText("i");
        jButtonRI.setBorderPainted(false);
        jButtonRI.setDefaultCapable(false);
        jButtonRI.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRIActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonRI);

        jButtonR1.setText("1");
        jButtonR1.setDefaultCapable(false);
        jButtonR1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR1);

        jButtonR2.setText("2");
        jButtonR2.setDefaultCapable(false);
        jButtonR2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR2);

        jButtonR3.setText("3");
        jButtonR3.setDefaultCapable(false);
        jButtonR3.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR3);

        jButtonR4.setText("4");
        jButtonR4.setDefaultCapable(false);
        jButtonR4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR4);

        jButtonR5.setText("5");
        jButtonR5.setDefaultCapable(false);
        jButtonR5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR5);

        jButtonR6.setText("6");
        jButtonR6.setDefaultCapable(false);
        jButtonR6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR6);

        jButtonR7.setText("7");
        jButtonR7.setDefaultCapable(false);
        jButtonR7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR7);

        jButtonR8.setText("8");
        jButtonR8.setDefaultCapable(false);
        jButtonR8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        jButtonR8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonR8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonR8);

        jToggleButtonEI.setText("i");
        jToggleButtonEI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonEIActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonEI);

        jToggleButtonE1.setText("1");
        jToggleButtonE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE1);

        jToggleButtonE2.setText("2");
        jToggleButtonE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE2ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE2);

        jToggleButtonE3.setText("3");
        jToggleButtonE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE3ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE3);

        jToggleButtonE4.setText("4");
        jToggleButtonE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE4ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE4);

        jToggleButtonE5.setText("5");
        jToggleButtonE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE5ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE5);

        jToggleButtonE6.setText("6");
        jToggleButtonE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE6ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE6);

        jToggleButtonE7.setText("7");
        jToggleButtonE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE7ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE7);

        jToggleButtonE8.setText("8");
        jToggleButtonE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonE8ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButtonE8);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRIActionPerformed
        p.RecallPreset(0);
    }//GEN-LAST:event_jButtonRIActionPerformed

    private void jButtonR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR1ActionPerformed
        p.RecallPreset(1);
    }//GEN-LAST:event_jButtonR1ActionPerformed

    private void jButtonR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR2ActionPerformed
        p.RecallPreset(2);
    }//GEN-LAST:event_jButtonR2ActionPerformed

    private void jButtonR3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR3ActionPerformed
        p.RecallPreset(3);
    }//GEN-LAST:event_jButtonR3ActionPerformed

    private void jButtonR4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR4ActionPerformed
        p.RecallPreset(4);
    }//GEN-LAST:event_jButtonR4ActionPerformed

    private void jButtonR5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR5ActionPerformed
        p.RecallPreset(5);
    }//GEN-LAST:event_jButtonR5ActionPerformed

    private void jButtonR6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR6ActionPerformed
        p.RecallPreset(6);
    }//GEN-LAST:event_jButtonR6ActionPerformed

    private void jButtonR7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR7ActionPerformed
        p.RecallPreset(7);
    }//GEN-LAST:event_jButtonR7ActionPerformed

    private void jButtonR8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonR8ActionPerformed
        p.RecallPreset(8);
    }//GEN-LAST:event_jButtonR8ActionPerformed

    private void jToggleButtonEIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonEIActionPerformed
        jToggleButtonEI.setSelected(true);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(0);
    }//GEN-LAST:event_jToggleButtonEIActionPerformed

    private void jToggleButtonE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE1ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(true);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(1);
    }//GEN-LAST:event_jToggleButtonE1ActionPerformed

    private void jToggleButtonE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE2ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(true);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(2);
    }//GEN-LAST:event_jToggleButtonE2ActionPerformed

    private void jToggleButtonE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE3ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(true);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(3);
    }//GEN-LAST:event_jToggleButtonE3ActionPerformed

    private void jToggleButtonE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE4ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(true);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(4);
    }//GEN-LAST:event_jToggleButtonE4ActionPerformed

    private void jToggleButtonE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE5ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(true);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(5);
    }//GEN-LAST:event_jToggleButtonE5ActionPerformed

    private void jToggleButtonE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE6ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(true);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(6);
    }//GEN-LAST:event_jToggleButtonE6ActionPerformed

    private void jToggleButtonE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE7ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(true);
        jToggleButtonE8.setSelected(false);
        p.ShowPreset(7);
    }//GEN-LAST:event_jToggleButtonE7ActionPerformed

    private void jToggleButtonE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonE8ActionPerformed
        jToggleButtonEI.setSelected(false);
        jToggleButtonE1.setSelected(false);
        jToggleButtonE2.setSelected(false);
        jToggleButtonE3.setSelected(false);
        jToggleButtonE4.setSelected(false);
        jToggleButtonE5.setSelected(false);
        jToggleButtonE6.setSelected(false);
        jToggleButtonE7.setSelected(false);
        jToggleButtonE8.setSelected(true);
        p.ShowPreset(8);
    }//GEN-LAST:event_jToggleButtonE8ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonR1;
    private javax.swing.JButton jButtonR2;
    private javax.swing.JButton jButtonR3;
    private javax.swing.JButton jButtonR4;
    private javax.swing.JButton jButtonR5;
    private javax.swing.JButton jButtonR6;
    private javax.swing.JButton jButtonR7;
    private javax.swing.JButton jButtonR8;
    private javax.swing.JButton jButtonRI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButtonE1;
    private javax.swing.JToggleButton jToggleButtonE2;
    private javax.swing.JToggleButton jToggleButtonE3;
    private javax.swing.JToggleButton jToggleButtonE4;
    private javax.swing.JToggleButton jToggleButtonE5;
    private javax.swing.JToggleButton jToggleButtonE6;
    private javax.swing.JToggleButton jToggleButtonE7;
    private javax.swing.JToggleButton jToggleButtonE8;
    private javax.swing.JToggleButton jToggleButtonEI;
    // End of variables declaration//GEN-END:variables
}
