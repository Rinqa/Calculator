/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatori;

/**
 *
 * @author Rinqaa
 */
public class calculatorii extends javax.swing.JFrame {

    double vlera1 = 0;
    double vlera2 = 0;
    double rez;
    String operacionet = "";
    String Gjithsej = "";
    boolean inputi = false;

    public calculatorii() {
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

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ekrani = new javax.swing.JTextField();
        butoniNr1 = new javax.swing.JButton();
        butoniNr2 = new javax.swing.JButton();
        butoniNr3 = new javax.swing.JButton();
        mbledhja = new javax.swing.JButton();
        barazimi = new javax.swing.JButton();
        zbritja = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        butoniNr5 = new javax.swing.JButton();
        butoniNr6 = new javax.swing.JButton();
        butoniNr4 = new javax.swing.JButton();
        butoniNr7 = new javax.swing.JButton();
        butoniNr8 = new javax.swing.JButton();
        butoniNr9 = new javax.swing.JButton();
        shumezimi = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fuqizimi = new javax.swing.JButton();
        fuqizimi1 = new javax.swing.JButton();
        ndarja = new javax.swing.JButton();
        ndarja1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton5.setText("jButton5");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(0, 255, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setType(java.awt.Window.Type.UTILITY);

        ekrani.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ekrani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ekrani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekraniActionPerformed(evt);
            }
        });

        butoniNr1.setText("1");
        butoniNr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr1ActionPerformed(evt);
            }
        });

        butoniNr2.setText("2");
        butoniNr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr2ActionPerformed(evt);
            }
        });

        butoniNr3.setText("3");
        butoniNr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr3ActionPerformed(evt);
            }
        });

        mbledhja.setText("+");
        mbledhja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbledhjaActionPerformed(evt);
            }
        });

        barazimi.setText("=");
        barazimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barazimiActionPerformed(evt);
            }
        });

        zbritja.setText("-");
        zbritja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zbritjaActionPerformed(evt);
            }
        });

        jButton1.setText("0");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        butoniNr5.setText("5");
        butoniNr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr5ActionPerformed(evt);
            }
        });

        butoniNr6.setText("6");
        butoniNr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr6ActionPerformed(evt);
            }
        });

        butoniNr4.setText("4");
        butoniNr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr4ActionPerformed(evt);
            }
        });

        butoniNr7.setText("7");
        butoniNr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr7ActionPerformed(evt);
            }
        });

        butoniNr8.setText("8");
        butoniNr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr8ActionPerformed(evt);
            }
        });

        butoniNr9.setText("9");
        butoniNr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butoniNr9ActionPerformed(evt);
            }
        });

        shumezimi.setText("*");
        shumezimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shumezimiActionPerformed(evt);
            }
        });

        jButton7.setText("/");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("C");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("???");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText(".");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        fuqizimi.setBackground(new java.awt.Color(255, 153, 153));
        fuqizimi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fuqizimi.setText("x??");
        fuqizimi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuqizimiActionPerformed(evt);
            }
        });

        fuqizimi1.setBackground(new java.awt.Color(255, 153, 153));
        fuqizimi1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        fuqizimi1.setText("??");
        fuqizimi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuqizimi1ActionPerformed(evt);
            }
        });

        ndarja.setBackground(new java.awt.Color(255, 153, 153));
        ndarja.setText("1/x");
        ndarja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ndarjaActionPerformed(evt);
            }
        });

        ndarja1.setBackground(new java.awt.Color(255, 153, 153));
        ndarja1.setText("2/x");
        ndarja1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ndarja1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setText("123");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shumezimi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ndarja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butoniNr7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butoniNr8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butoniNr9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mbledhja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ndarja1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butoniNr4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butoniNr5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butoniNr6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zbritja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(butoniNr1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butoniNr2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(butoniNr3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barazimi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuqizimi1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuqizimi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ekrani))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ekrani, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shumezimi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ndarja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butoniNr7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoniNr8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoniNr9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mbledhja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ndarja1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butoniNr4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoniNr5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butoniNr6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zbritja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(butoniNr1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butoniNr3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(butoniNr2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(barazimi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(fuqizimi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(fuqizimi1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ekraniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekraniActionPerformed

    }//GEN-LAST:event_ekraniActionPerformed

    private void butoniNr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr1ActionPerformed
        // TODO add your handling code here:
        if (inputi == false) {
            String r = butoniNr1.getText();
            ekrani.setText(ekrani.getText() + r);
        } else {
            ekrani.setText("");
            String btn1 = butoniNr1.getText();
            ekrani.setText(btn1);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr1ActionPerformed

    private void butoniNr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr3ActionPerformed
        if (inputi == false) {
            String btn3 = butoniNr3.getText();
            ekrani.setText(ekrani.getText() + btn3);
        } else {
            ekrani.setText("");
            String btn3 = butoniNr3.getText();
            ekrani.setText(btn3);
            inputi = false;
        }

// TODO add your handling code here:
    }//GEN-LAST:event_butoniNr3ActionPerformed

    private void mbledhjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbledhjaActionPerformed
        // TODO add your handling code here:
        //inputi = true;
        String qwerty = ekrani.getText();
        ekrani.setText("");
        operacionet = "+";
        double qwer = Double.parseDouble(qwerty);
        vlera1 = qwer;


    }//GEN-LAST:event_mbledhjaActionPerformed

    private void barazimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barazimiActionPerformed
        jButton3.setEnabled(true);
        inputi = true;
        String qwe = ekrani.getText();
        double qw = Double.parseDouble(qwe);
        vlera2 = qw;

        if (operacionet.startsWith("+")) {
            rez = (vlera1 + vlera2);
        } else if (operacionet.startsWith("-")) {
            rez = (vlera1 - vlera2);
        } else if (operacionet.startsWith("*")) {
            rez = (vlera1 * vlera2);
        } else if (operacionet.startsWith("/")) {

            rez = (vlera1 / vlera2);

        }
        String str1 = Double.toString(rez);
        ekrani.setText(str1);
        Gjithsej = (Double.toString(vlera1) + " " + operacionet + " " + Double.toString(vlera2) + " = " + str1);
        lbl1.setText(Gjithsej);
    }//GEN-LAST:event_barazimiActionPerformed

    private void zbritjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zbritjaActionPerformed
        operacionet = "-";
        String y = ekrani.getText();
        ekrani.setText("");
        int e = Integer.parseInt(y);
        vlera1 = e;

    }//GEN-LAST:event_zbritjaActionPerformed

    private void butoniNr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr5ActionPerformed
        // TODO add your handling code here:
        if (inputi == false) {
            String btn5 = butoniNr5.getText();
            ekrani.setText(ekrani.getText() + btn5);
        } else {
            ekrani.setText("");
            String btn5 = butoniNr5.getText();
            ekrani.setText(btn5);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr5ActionPerformed

    private void butoniNr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr6ActionPerformed
        // TODO add your handling code here:
        if (inputi == false) {
            String btn6 = butoniNr6.getText();
            ekrani.setText(ekrani.getText() + btn6);
        } else {
            ekrani.setText("");
            String btn6 = butoniNr6.getText();
            ekrani.setText(btn6);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr6ActionPerformed

    private void butoniNr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr4ActionPerformed
        // TODO add your handling code here:
        if (inputi == false) {
            String btn4 = butoniNr4.getText();
            ekrani.setText(ekrani.getText() + btn4);
        } else {
            ekrani.setText("");
            String btn4 = butoniNr4.getText();
            ekrani.setText(btn4);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (inputi == false) {
            String btn0 = jButton1.getText();
            ekrani.setText(ekrani.getText() + btn0);
        } else {
            ekrani.setText("");
            String btn0 = jButton1.getText();
            ekrani.setText(btn0);
            inputi = false;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        ekrani.setText("");
        vlera1 = 0;
        vlera2 = 0;
        Gjithsej = "";
        lbl1.setText("");
        operacionet = "";
    }//GEN-LAST:event_jButton8ActionPerformed

    private void butoniNr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr2ActionPerformed
        if (inputi == false) {
            String btn2 = butoniNr2.getText();
            ekrani.setText(ekrani.getText() + btn2);
        } else {
            ekrani.setText("");
            String btn2 = butoniNr2.getText();
            ekrani.setText(btn2);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr2ActionPerformed

    private void butoniNr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr7ActionPerformed

        if (inputi == false) {
            String btn7 = butoniNr7.getText();
            ekrani.setText(ekrani.getText() + btn7);
        } else {
            ekrani.setText("");
            String btn7 = butoniNr7.getText();
            ekrani.setText(btn7);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr7ActionPerformed

    private void butoniNr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr8ActionPerformed
        if (inputi == false) {
            String btn8 = butoniNr8.getText();
            ekrani.setText(ekrani.getText() + btn8);
        } else {
            ekrani.setText("");
            String btn8 = butoniNr8.getText();
            ekrani.setText(btn8);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr8ActionPerformed

    private void butoniNr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butoniNr9ActionPerformed
        if (inputi == false) {
            String btn9 = butoniNr9.getText();
            ekrani.setText(ekrani.getText() + btn9);
        } else {
            ekrani.setText("");
            String btn9 = butoniNr9.getText();
            ekrani.setText(btn9);
            inputi = false;
        }
    }//GEN-LAST:event_butoniNr9ActionPerformed

    private void shumezimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shumezimiActionPerformed

        operacionet = "*";
        String rty = ekrani.getText();
        double qer = Double.parseDouble(rty);
        ekrani.setText("");
        vlera1 = qer;

    }//GEN-LAST:event_shumezimiActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        operacionet = "/";
        String ty = ekrani.getText();
        ekrani.setText("");
        int er = Integer.parseInt(ty);
        vlera1 = er;

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String rrenja = ekrani.getText();
        Double renja = Double.parseDouble(rrenja);
        String re = Double.toString(Math.sqrt(renja));

        ekrani.setText(re);
        lbl1.setText(re);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ekrani.setText(ekrani.getText() + ".");
        jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void fuqizimiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuqizimiActionPerformed
        String fuqia = ekrani.getText();
        double renja = Double.parseDouble(fuqia);
        String e = Double.toString(Math.pow(renja, 2));

        ekrani.setText(e);
        lbl1.setText(e);
    }//GEN-LAST:event_fuqizimiActionPerformed

    private void ndarjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ndarjaActionPerformed
        String pjestome1 = ekrani.getText();
        double re = Double.parseDouble(pjestome1);
        double pjes = (1.0 / re);
        String as = Double.toString(pjes);

        ekrani.setText(as);
        lbl1.setText(as);
    }//GEN-LAST:event_ndarjaActionPerformed

    private void fuqizimi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuqizimi1ActionPerformed
        String ndrrimishenj = ekrani.getText();
        ekrani.setText("-" + ndrrimishenj);
    }//GEN-LAST:event_fuqizimi1ActionPerformed

    private void ndarja1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ndarja1ActionPerformed
        String pjestome1 = ekrani.getText();
        double re = Double.parseDouble(pjestome1);
        double pjes = (2.0 / re);
        String as = Double.toString(pjes);

        ekrani.setText(as);
        lbl1.setText(as);
    }//GEN-LAST:event_ndarja1ActionPerformed

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
            java.util.logging.Logger.getLogger(calculatorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculatorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculatorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculatorii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculatorii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton barazimi;
    private javax.swing.JButton butoniNr1;
    private javax.swing.JButton butoniNr2;
    private javax.swing.JButton butoniNr3;
    private javax.swing.JButton butoniNr4;
    private javax.swing.JButton butoniNr5;
    private javax.swing.JButton butoniNr6;
    private javax.swing.JButton butoniNr7;
    private javax.swing.JButton butoniNr8;
    private javax.swing.JButton butoniNr9;
    private javax.swing.JTextField ekrani;
    private javax.swing.JButton fuqizimi;
    private javax.swing.JButton fuqizimi1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JButton mbledhja;
    private javax.swing.JButton ndarja;
    private javax.swing.JButton ndarja1;
    private javax.swing.JButton shumezimi;
    private javax.swing.JButton zbritja;
    // End of variables declaration//GEN-END:variables
}
