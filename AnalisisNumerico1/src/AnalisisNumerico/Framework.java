
package AnalisisNumerico;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.table.DefaultTableModel;




public class Framework extends javax.swing.JFrame {

   HandlerTables pasa = null;
   HandlerTables pasa2 = null;
   HandlerTables pasa3 = null;
   Metodos method = null;
   Metodos method2 = null;
   
    public Framework() {
        initComponents();
        jTable1.setVisible(false);
        pasa = new HandlerTables();
        pasa2 = new HandlerTables();
        pasa3 = new HandlerTables();
        method = new Metodos();
        method2 = new Metodos();
        
        GrupoBotones.add(jRadioButton1);
        GrupoBotones.add(jRadioButton2);
        GrupoBotones.add(jRadioButton3);
        
        buttonGroup1.add(jRadioButton4);
        buttonGroup1.add(jRadioButton5);
        
        //jScrollPane1 = new JScrollPane(jTable1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoBotones = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        validaExp1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        RESULTADO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        MinimCuad1 = new javax.swing.JButton();
        Expresion2 = new javax.swing.JTextField();
        validaExp2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        n = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        a = new javax.swing.JTextField();
        b = new javax.swing.JTextField();
        h = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        Expresion3 = new javax.swing.JTextField();
        ValidaExpresion3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        ResultadoTrapecioCompuesto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Numero de columnas de tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("x");

        jLabel2.setText("f(x)");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        validaExp1.setText("Comprobar Expresion");
        validaExp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validaExp1ActionPerformed(evt);
            }
        });

        jButton3.setText("Integracion desigual");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        RESULTADO.setEditable(false);

        jLabel3.setText("Resultado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 396, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(RESULTADO))
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(validaExp1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jButton3)))
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(validaExp1)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESULTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Integracion desigual", jPanel1);

        jButton4.setText("Numero de filas de la tabla");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        MinimCuad1.setText("Minimos cuadrados");
        MinimCuad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimCuad1ActionPerformed(evt);
            }
        });

        Expresion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Expresion2ActionPerformed(evt);
            }
        });

        validaExp2.setText("Comprobar Expresion");
        validaExp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validaExp2ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Logaritmico");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Exponencial");

        jRadioButton3.setText("Aproximacion a una recta");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Expresion2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(validaExp2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(MinimCuad1)))
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Expresion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validaExp2))
                .addGap(18, 18, 18)
                .addComponent(MinimCuad1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Minimos cuadrados", jPanel2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable3);

        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        jButton2.setText("Numero de iteraciones (N)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        jLabel4.setText("a =");

        jLabel5.setText("b =");

        jLabel6.setText("h =");

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        ValidaExpresion3.setText("Comprobar Expresion");
        ValidaExpresion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidaExpresion3ActionPerformed(evt);
            }
        });

        jButton6.setText("Calcular");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jRadioButton4.setText("si");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jRadioButton5.setText("no");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Entrada de paramentros por tabla");

        ResultadoTrapecioCompuesto.setEditable(false);
        ResultadoTrapecioCompuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoTrapecioCompuestoActionPerformed(evt);
            }
        });

        jLabel11.setText("Resultado");

        jLabel12.setText("Funcion");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Expresion3, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                            .addComponent(ResultadoTrapecioCompuesto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(ValidaExpresion3)))
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Expresion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValidaExpresion3))
                        .addGap(41, 41, 41)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResultadoTrapecioCompuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addGap(62, 62, 62)))
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Trapecio Compuesto", jPanel3);

        jLabel8.setText("Autor: Alfredo Mariño");

        jLabel9.setText("Fecha: 20/06/15");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Analisis Numerico");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(8, 8, 8))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(547, 547, 547)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //542
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTable1.clearSelection();
        int cols = jTable1.getColumnCount();
        
        //double Xs[][] = new double [cols][cols];
        String funcion, Xs;
        boolean Valido;
        Jep Expresion = new Jep();
        jTextArea1.setText("");

        funcion = jTextField2.getText();
        if(!"".equals(funcion)){

            Valido = Expresion.ComprobarFuncion(funcion);
            if(Valido == true){

                jTextArea1.setText(pasa.getFx(jTable1, funcion, 1));
                if("".equals(jTextArea1.getText())){
                    Xs = pasa.getH(jTable1, RESULTADO);
                    jTextArea1.setText(Xs);
                }

            }else{
                jTextArea1.setText("ERROR DE SINTAXIS");
            }
        }else{
            jTextArea1.setText(pasa.getErrors(jTable1, 1));
            if("".equals(jTextArea1.getText())){
                Xs = pasa.getH(jTable1, RESULTADO);
                jTextArea1.setText(Xs);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void validaExp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validaExp1ActionPerformed
        String funcion;
        boolean Valido;
        jTextArea1.setText("");

        funcion = jTextField2.getText();
        Jep Expresion = new Jep();

        Valido = Expresion.ComprobarFuncion(funcion);

        jTextArea1.setText(Boolean.toString(Valido));
    }//GEN-LAST:event_validaExp1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int NumColumn;
        //int cols = jTable1.getColumnCount();
        jTextArea1.setText("");

        if(isNumeric(jTextField1.getText())){
//600
            NumColumn = Integer.parseInt(jTextField1.getText());

            if(NumColumn >= 2){

                NumColumn = Integer.parseInt(jTextField1.getText());
                pasa.numColumn(jTable1, NumColumn);
                if(NumColumn >= 16){
                    jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
                }else{

                    jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_ALL_COLUMNS);

                }
                jTable1.setVisible(true);
            }else{
                jTextArea1.setText("Error: el numero de columnas debe ser mayor o igual a dos");
            }
        }else{
            jTextArea1.setText("Error: el numero de columnas debe ser un numero entero");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int NumFils;
        
        jTextArea2.setText("");

        if(isNumeric(jTextField3.getText())){

            NumFils = Integer.parseInt(jTextField3.getText());

            if(NumFils >= 2){
                
                if(jRadioButton1.isSelected()){
                    
                    NumFils = Integer.parseInt(jTextField3.getText());
                    pasa.numFils(jTable2, NumFils, 1);

                    jTable2.setVisible(true);
                    
                }else if(jRadioButton2.isSelected()){
                    
                    NumFils = Integer.parseInt(jTextField3.getText());
                    pasa.numFils(jTable2, NumFils, 2);

                    jTable2.setVisible(true);
                    
                }else if(jRadioButton3.isSelected()){
                    
                    NumFils = Integer.parseInt(jTextField3.getText());
                    pasa.numFils(jTable2, NumFils, 3);

                    jTable2.setVisible(true); 
                    
                }else{
                    jTextArea2.setText("Error: Debe seleccionar un metodo");
                }

            }else{
                jTextArea2.setText("Error: el numero de filas debe ser mayor o igual a dos");
            }
        }else{
            jTextArea2.setText("Error: el numero de filas debe ser un numero entero");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void MinimCuad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimCuad1ActionPerformed
        jTable2.clearSelection();
        int cols = jTable2.getColumnCount();
       
        String funcion, Xs = "";
        boolean Valido;
        Jep Expresion = new Jep();
        jTextArea2.setText("");

        funcion = Expresion2.getText();
        if(!"".equals(funcion)){

            Valido = Expresion.ComprobarFuncion(funcion);
            if(Valido == true){

                jTextArea2.setText(pasa.getFx(jTable2, funcion, 2));
                if("".equals(jTextArea2.getText())){
                    if(jRadioButton1.isSelected()){
                    
                        Xs = method.minimosCuadrados(jTable2, 1);
                        jTextArea2.setText(Xs);        
                    
                    }else if(jRadioButton2.isSelected()){
                        
                        Xs = method.minimosCuadrados(jTable2, 2);
                        jTextArea2.setText(Xs); 
                        
                    }else if(jRadioButton3.isSelected()){
                                            
                        Xs = method.minimosCuadrados(jTable2, 3);
                        jTextArea2.setText(Xs); 
    
                    }else{
                        jTextArea2.setText("Error: Debe seleccionar un metodo");
                    }
                }

            }else{
                jTextArea2.setText("ERROR DE SINTAXIS");
            }
        }else{
            jTextArea2.setText(pasa.getErrors(jTable2, 2));
            if("".equals(jTextArea2.getText())){
                    if(jRadioButton1.isSelected()){
                    
                        Xs = method.minimosCuadrados(jTable2, 1);
                        jTextArea2.setText(Xs);        
                    
                    }else if(jRadioButton2.isSelected()){
                        
                        Xs = method.minimosCuadrados(jTable2, 2);
                        jTextArea2.setText(Xs); 

                    }else if(jRadioButton3.isSelected()){
                        
                        Xs = method.minimosCuadrados(jTable2, 3);
                        jTextArea2.setText(Xs); 
    
                    }else{
                        jTextArea2.setText("Error: Debe seleccionar un metodo");
                    }

            }
        }
    }//GEN-LAST:event_MinimCuad1ActionPerformed

    private void Expresion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Expresion2ActionPerformed

    }//GEN-LAST:event_Expresion2ActionPerformed

    private void validaExp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validaExp2ActionPerformed
        String funcion;
        boolean Valido;
        jTextArea2.setText("");

        funcion = Expresion2.getText();
        Jep Expresion = new Jep();

        Valido = Expresion.ComprobarFuncion(funcion);

        jTextArea2.setText(Boolean.toString(Valido));
    }//GEN-LAST:event_validaExp2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTable3.clearSelection();
        int N, filas = jTable3.getRowCount();
        double A, B, H, sum;
        String valido = "", funcion = "";
        boolean check;
        Jep Expresion = new Jep();
        
        
        jTextArea3.setText("");
        ResultadoTrapecioCompuesto.setText("");
        
        // PARAMETROS POR TABLA
        if(jRadioButton4.isSelected() || jRadioButton5.isSelected()){
        
            if(jRadioButton5.isSelected()){
                valido = parametros(a.getText(), b.getText(), h.getText(), n.getText());
                if(valido == ""){
                    N = Integer.parseInt(n.getText().toString());
                    A = Double.parseDouble(a.getText().toString());
                    B = Double.parseDouble(b.getText().toString());
                    H = Double.parseDouble(h.getText().toString());
                    
                    valido = filasGrid(N, jTable3);
                    
                    if(valido == ""){
                        jTable3.setValueAt(A, 0, 1);
                        sum = A;
                        for(int i = 1; i < N; i++){
                            sum += H;
                            jTable3.setValueAt(sum, i, 1);
                        }
                        jTable3.setValueAt(B, N, 1);
                    
                        funcion = Expresion3.getText();
                        if(!"".equals(funcion)){

                            check = Expresion.ComprobarFuncion(funcion);
//800
                            if(check == true){
                                jTextArea3.setText(pasa3.getFx(jTable3, funcion, 3));
                                
                            }else{
                                jTextArea3.setText("ERROR DE SINTAXIS");
                            }
                        }else{
                            jTextArea3.setText("ERROR: introduzca una funcion");
                        }
                    }else{
                        jTextArea3.setText(valido);
                    }
                }else{
                    jTextArea3.setText(valido);
                }

            }else{
                jTextArea3.setText(pasa3.getErrors(jTable3, 3));
                //revisa que el tamaño de paso este correcto
                jTextArea3.setText(method.checkH(jTable3)); 
            }
                if("".equals(jTextArea3.getText())){
                                    
                    ResultadoTrapecioCompuesto.setText(String.valueOf(method2.trapecioCompuesto(jTable3)));
                    A = Double.parseDouble(jTable3.getValueAt(0, 1).toString());
                    B = Double.parseDouble(jTable3.getValueAt(filas - 1, 1).toString());
                    H = Double.parseDouble(jTable3.getValueAt(1, 1).toString()) - A;
                    
                    a.setText(String.valueOf(A));
                    b.setText(String.valueOf(B));
                    h.setText(String.valueOf(H));
                    
                } 
        }else{
            jTextArea3.setText("eliga una opcion de entrada de parametros");
        }
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int Numfils;

        jTextArea3.setText("");

        if(isNumeric(n.getText())){

            Numfils = Integer.parseInt(n.getText());

            if(Numfils >= 5){

                Numfils = Integer.parseInt(n.getText());
                pasa3.numFils(jTable3, Numfils, 4);
                
                jTable3.setVisible(true);
            }else{
                jTextArea3.setText("Error: el numero de filas debe ser mayor o igual a cinco");
            }
        }else{
            jTextArea3.setText("Error: el numero de filas debe ser un numero entero");
        }
        if(jRadioButton4.isSelected() == false){
            jTable3.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ValidaExpresion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValidaExpresion3ActionPerformed
        String funcion;
        boolean Valido;
        jTextArea3.setText("");

        funcion = Expresion3.getText();
        Jep Expresion = new Jep();

        Valido = Expresion.ComprobarFuncion(funcion);

        jTextArea3.setText(Boolean.toString(Valido));
    }//GEN-LAST:event_ValidaExpresion3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        jTable3.setEnabled(true);
        a.setEditable(false);
        b.setEditable(false);
        h.setEditable(false);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        jTable3.setEnabled(false);
        a.setEditable(true);
        b.setEditable(true);
        h.setEditable(true);
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void ResultadoTrapecioCompuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoTrapecioCompuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultadoTrapecioCompuestoActionPerformed

  
            
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
            java.util.logging.Logger.getLogger(Framework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Framework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Framework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Framework.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Framework().setVisible(true);
            }
        });
    }

    private static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    private static boolean isNumericDouble(String cadena){
	try {
		Double.parseDouble(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }
    
    private static String parametros(String a, String b, String h, String n){
        String valido = "";
        double A, B, H, sum;
        int N;

        
        if(isNumeric(n)){
            N = Integer.parseInt(n);
            BigDecimal Ndecimal = new BigDecimal(String.valueOf(N));
            if(N > 0){
                if(a == "" || b == "" || h == ""){
                    valido = "ERROR: Parametros invalidos";
                }else if(isNumericDouble(a)){
                    if(isNumericDouble(b)){
                        if(isNumericDouble(h)){

                            BigDecimal Adecimal = new BigDecimal(a);
                            BigDecimal Bdecimal = new BigDecimal(b);
                            BigDecimal Hdecimal = new BigDecimal(h);
                            BigDecimal sumdecimal = new BigDecimal(String.valueOf(0));
                            
                            if(Adecimal.compareTo(Bdecimal) == -1){
                                sumdecimal = (Bdecimal.subtract(Adecimal)).divide(Ndecimal, 30, RoundingMode.HALF_UP);
                                if(Hdecimal.compareTo(sumdecimal) == 0){
                                    valido = "";
                                }else{
                                    valido = "ERROR: h debe ser (b-a)/n\t En este caso h = " + sumdecimal; 
                                }
                            }else{
                                valido = "ERROR: a debe ser menor que b"; 
                            }
                            
                            
                            /*
                            A = Double.parseDouble(a);
                            B = Double.parseDouble(b);
                            H = Double.parseDouble(h);
                                
                                if(A < B){
                                    sum = (B-A)/N;
                                    if(H == sum){
                                        valido = "";
                                    }else{
                                        valido = "ERROR: h debe ser (b-a)/n\t En este caso h = " + sum; 
                                    }
                                }else{
                                    valido = "ERROR: a debe ser menor que b"; 
                                }
 //1000
                            */
                        }else{
                            valido = "ERROR: h debe ser un numero"; 
                        }
                    }else{
                        valido = "ERROR: b debe ser un numero"; 
                    } 
                }else{
                    valido = "ERROR: a debe ser un numero"; 
                }
            }else{
                valido = "ERROR: a debe ser un numero entero positivo"; 
            }
        }else{
            valido = "ERROR: a debe ser un numero entero positivo"; 
        }

        return valido;
    }
    
    private static String filasGrid(int n, javax.swing.JTable tabla){
        int Numfils;
        String valido = "";
        HandlerTables pasa4 = new HandlerTables();

            Numfils = n;

            if(Numfils >= 2){


                pasa4.numFils(tabla, Numfils, 4);
                
                tabla.setVisible(true);
            }else{
                valido = "Error: el numero de columnas debe ser mayor o igual a dos";
            }

        tabla.setEnabled(false);
        
        return valido;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Expresion2;
    private javax.swing.JTextField Expresion3;
    private javax.swing.ButtonGroup GrupoBotones;
    private javax.swing.JButton MinimCuad1;
    private javax.swing.JTextField RESULTADO;
    private javax.swing.JTextField ResultadoTrapecioCompuesto;
    private javax.swing.JButton ValidaExpresion3;
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField n;
    private javax.swing.JButton validaExp1;
    private javax.swing.JButton validaExp2;
    // End of variables declaration//GEN-END:variables
}
//1101