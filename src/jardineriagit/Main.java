package jardineriagit;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    
    Conexion conexion = new Conexion();
    Connection con;
    DefaultTableModel model;
    PreparedStatement ps;
    ResultSet rs;  

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        cargarDatos();
        comboTablas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String item = comboTablas.getSelectedItem().toString();
                
                switch(item){
                    case "Clientes":
                        paneBD.setVisible(true);
                        break;
                    case "Empleados":
                        paneBD.setVisible(false);
                        break;
                    case "Oficinas":
                        paneBD.setVisible(false);
                        break;
                    case "Pagos":
                        paneBD.setVisible(false);
                        break;
                }
            }   
        });
        /*comboId.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    con = conexion.getConection();
                    ps = con.prepareStatement("SELECT * FROM cliente WHERE codigo_cliente = ?");

                    ps.setString(1, comboId.getSelectedItem().toString());
                    rs = ps.executeQuery();

                    if (rs.next()) {
                        id.setText(rs.getString("codigo_cliente"));
                        nombres.setText(rs.getString("nombre_cliente"));
                        nombreContacto.setText(rs.getString("nombre_contacto"));
                        apellidoContacto.setText(rs.getString("apellido_contacto"));
                        telefono.setText(rs.getString("telefono"));
                        fax.setText(rs.getString("fax"));
                        direccion1.setText(rs.getString("linea_direccion1"));
                        direccion2.setText(rs.getString("linea_direccion2"));
                        ciudad.setText(rs.getString("ciudad"));
                        region.setText(rs.getString("region"));
                        pais.setText(rs.getString("pais"));
                        postal.setText(rs.getString("codigo_postal"));
                        credito.setText(String.valueOf(rs.getInt("limite_credito")));
                        lblEmpleado.setText(rs.getString("codigo_empleado_rep_ventas"));
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente no existe", "Verifique ID", JOptionPane.ERROR_MESSAGE);
                    }
                    //con.close();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
            }
        });*/
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneDatos = new javax.swing.JPanel();
        ciudad = new javax.swing.JTextField();
        region = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        postal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pais = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        credito = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        apellidoContacto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombreContacto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fax = new javax.swing.JTextField();
        direccion2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        direccion1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblEmpleado = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTittle = new javax.swing.JLabel();
        paneBD = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBD = new javax.swing.JTable();
        paneOperar = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        comboTablas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        paneDatos.setBackground(new java.awt.Color(241, 235, 235));
        paneDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102))); // NOI18N
        paneDatos.setForeground(new java.awt.Color(0, 0, 102));

        ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudadActionPerformed(evt);
            }
        });

        region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionActionPerformed(evt);
            }
        });

        jLabel9.setText("Regi??n:");

        postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postalActionPerformed(evt);
            }
        });

        jLabel10.setText("C. Postal:");

        pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisActionPerformed(evt);
            }
        });

        jLabel11.setText("Pa??s:");

        credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditoActionPerformed(evt);
            }
        });

        jLabel12.setText("Credito:");

        jLabel5.setText("Contacto:");

        nombreContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreContactoActionPerformed(evt);
            }
        });

        jLabel6.setText("Fax:");

        fax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faxActionPerformed(evt);
            }
        });

        direccion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion2ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Tel??fono:");

        jLabel4.setText("Direcci??n 1:");

        id.setEditable(false);
        id.setEnabled(false);

        nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombresActionPerformed(evt);
            }
        });

        telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoActionPerformed(evt);
            }
        });

        direccion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccion1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Direcci??n 2:");

        jLabel8.setText("Ciudad:");

        lblEmpleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        lblEmpleado.setText("0");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("C??digo empleado");

        javax.swing.GroupLayout paneDatosLayout = new javax.swing.GroupLayout(paneDatos);
        paneDatos.setLayout(paneDatosLayout);
        paneDatosLayout.setHorizontalGroup(
            paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosLayout.createSequentialGroup()
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneDatosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(paneDatosLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11)))
                                .addGap(18, 18, 18)
                                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(region, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addGroup(paneDatosLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(16, 16, 16)
                                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(paneDatosLayout.createSequentialGroup()
                                        .addComponent(nombreContacto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(apellidoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39)))
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(direccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(credito, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneDatosLayout.createSequentialGroup()
                                .addComponent(direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(paneDatosLayout.createSequentialGroup()
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fax))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneDatosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmpleado)
                                .addGap(8, 8, 8))))))
        );
        paneDatosLayout.setVerticalGroup(
            paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneDatosLayout.createSequentialGroup()
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmpleado)
                        .addComponent(jLabel14)))
                .addGap(18, 18, 18)
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(5, 5, 5)
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(apellidoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(paneDatosLayout.createSequentialGroup()
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(paneDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        lblTittle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTittle.setForeground(new java.awt.Color(255, 0, 0));
        lblTittle.setText("Jardiner??a La Flores");

        paneBD.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jScrollPane1.setWheelScrollingEnabled(false);

        tableBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre y Apellido", "Nombre Contacto", "Apellido Contacto", "Tel??fono", "Fax", "Direcci??n 1", "Direcci??n 2", "Ciudad", "Regi??n", "Pa??s", "C. Postal", "Empleado", "Cr??dito"
            }
        ));
        tableBD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableBD);

        javax.swing.GroupLayout paneBDLayout = new javax.swing.GroupLayout(paneBD);
        paneBD.setLayout(paneBDLayout);
        paneBDLayout.setHorizontalGroup(
            paneBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneBDLayout.setVerticalGroup(
            paneBDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        paneOperar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(0, 0, 102))); // NOI18N

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneOperarLayout = new javax.swing.GroupLayout(paneOperar);
        paneOperar.setLayout(paneOperarLayout);
        paneOperarLayout.setHorizontalGroup(
            paneOperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOperarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizar)
                .addGap(18, 18, 18)
                .addComponent(buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(22, 22, 22))
        );
        paneOperarLayout.setVerticalGroup(
            paneOperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneOperarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneOperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(actualizar)
                    .addComponent(agregar)
                    .addComponent(buscar)
                    .addComponent(eliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        comboTablas.setBackground(new java.awt.Color(236, 227, 227));
        comboTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clientes", "Empleados", "Oficinas", "Pagos" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paneBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(lblTittle)
                        .addGap(18, 18, 18)
                        .addComponent(comboTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(paneOperar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paneDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTittle)
                    .addComponent(comboTablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paneDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneOperar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paneBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ciudadActionPerformed

    private void regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regionActionPerformed

    private void postalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postalActionPerformed

    private void paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paisActionPerformed

    private void creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_creditoActionPerformed

    private void nombreContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreContactoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreContactoActionPerformed

    private void faxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faxActionPerformed

    private void direccion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion2ActionPerformed

    private void nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombresActionPerformed

    private void telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoActionPerformed

    private void direccion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccion1ActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        if(!nombres.getText().equals("") || !telefono.getText().equals("") || !fax.getText().equals("") || !direccion1.getText().equals("") || !ciudad.getText().equals("")){
            JOptionPane.showMessageDialog(this, "LLene los campos obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            jLabel2.setBackground(Color.RED);
            nombres.setBackground(Color.RED);
        }else{
            try{
                ps = conexion.con.prepareStatement("INSERT into cliente (nombre_cliente, nombre_contacto, apellido_contacto, telefono, "
                    + "fax, linea_direccion1, linea_direccion2, ciudad, region, pais, codigo_postal, limite_credito) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");

                //ps.setInt(1, Integer.parseInt(id.getText()));
                ps.setString(1, nombres.getText());
                ps.setString(2, nombreContacto.getText());
                ps.setString(3, apellidoContacto.getText());
                ps.setString(4, telefono.getText());
                ps.setString(5, fax.getText());
                ps.setString(6, direccion1.getText());
                ps.setString(7, direccion2.getText());
                ps.setString(8, ciudad.getText());
                ps.setString(9, region.getText());
                ps.setString(10, pais.getText());
                ps.setString(11, postal.getText());
                ps.setInt(12, Integer.parseInt(credito.getText()));

                int verifica = ps.executeUpdate();
                if(verifica > 0){
                    JOptionPane.showMessageDialog(this, "Cliente agregado exitosamente");
                    limpiarCampos();
                    limpiarTabla();
                    cargarDatos();
                }else{
                    JOptionPane.showMessageDialog(this, "Cliente no registrado", "Error", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed

        try{
            con = conexion.getConection();
            ps = con.prepareStatement("SELECT * FROM cliente WHERE codigo_cliente = ?");

            ps.setString(1, id.getText());

            rs = ps.executeQuery();
            if(rs.next()){
                nombres.setText(rs.getString("nombre_cliente"));
                nombreContacto.setText(rs.getString("nombre_contacto"));
                apellidoContacto.setText(rs.getString("apellido_contacto"));
                telefono.setText(rs.getString("telefono"));
                fax.setText(rs.getString("fax"));
                direccion1.setText(rs.getString("linea_direccion1"));
                direccion2.setText(rs.getString("linea_direccion2"));
                ciudad.setText(rs.getString("ciudad"));
                region.setText(rs.getString("region"));
                pais.setText(rs.getString("pais"));
                postal.setText(rs.getString("codigo_postal"));
                credito.setText(rs.getString("limite_credito"));
                lblEmpleado.setText(rs.getString("codigo_empleado_rep_ventas"));
            }else{
                JOptionPane.showMessageDialog(this, "Cliente no existe", "Verifique ID", JOptionPane.ERROR_MESSAGE);
            }

            //con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed

        try{
            con = conexion.getConection();
            ps = con.prepareStatement("UPDATE cliente SET nombre_cliente=?, nombre_contacto=?, apellido_contacto=?, "
                    + "telefono=?, fax=?, linea_direccion1=?, linea_direccion2=?, ciudad=?, region=?, pais=?, "
                    + "codigo_postal=?, limite_credito=? WHERE codigo_cliente=?");

            ps.setString(1, nombres.getText());
            ps.setString(2, nombreContacto.getText());
            ps.setString(3, apellidoContacto.getText());
            ps.setString(4, telefono.getText());
            ps.setString(5, fax.getText());
            ps.setString(6, direccion1.getText());
            ps.setString(7, direccion2.getText());
            ps.setString(8, ciudad.getText());
            ps.setString(9, region.getText());
            ps.setString(10, pais.getText());
            ps.setString(11, postal.getText());
            ps.setInt(12, Integer.parseInt(credito.getText()));
            
            ps.setString(13, id.getText());

            int verifica = ps.executeUpdate();
            if(verifica > 0){
                JOptionPane.showMessageDialog(this, "Cliente actualizado correctamente");
                limpiarCampos();
                limpiarTabla();
                cargarDatos();
            }else{
                JOptionPane.showMessageDialog(this, "Cliente no actualizado", "Verifique ID", JOptionPane.ERROR_MESSAGE);
            }
            //con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        int resp = JOptionPane.showConfirmDialog(this, "??Desea borrar a "+nombres.getText()+"?", "Confimaci??n", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if(resp == 0){
            try{
                con = conexion.getConection();
                ps = con.prepareStatement("DELETE from cliente WHERE codigo_cliente = ?");

                ps.setString(1, id.getText());

                int verifica = ps.executeUpdate();
                if(verifica > 0){
                    JOptionPane.showMessageDialog(this, "Cliente borrado exitosamente");
                    limpiarCampos();
                    limpiarTabla();
                    cargarDatos();
                }else{
                    JOptionPane.showMessageDialog(this, "Cliente no encontrado", "Verifique ID", JOptionPane.ERROR_MESSAGE);
                }
                //con.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }        
    }//GEN-LAST:event_eliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tableBDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBDMouseClicked
        int fila = tableBD.getSelectedRow();
        String idd, nombreCli, nombreCon, apellidoCon, tel, faxx, dir1, dir2, ciudadd, regionn, paiss, postall, empleado, creditoo;
        if(fila == -1){
            JOptionPane.showMessageDialog(this, "Seleccione una fila", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }else{
            idd = (String) tableBD.getValueAt(fila, 0);
            nombreCli = (String) tableBD.getValueAt(fila, 1);
            nombreCon = (String) tableBD.getValueAt(fila, 2);
            apellidoCon = (String) tableBD.getValueAt(fila, 3);
            tel = (String) tableBD.getValueAt(fila, 4);
            faxx = (String) tableBD.getValueAt(fila, 5);
            dir1 = (String) tableBD.getValueAt(fila, 6);
            dir2 = (String) tableBD.getValueAt(fila, 7);           
            ciudadd = (String) tableBD.getValueAt(fila, 8);
            regionn = (String) (String) tableBD.getValueAt(fila, 9);
            paiss = (String) tableBD.getValueAt(fila, 10);
            postall = (String) tableBD.getValueAt(fila, 11);
            empleado = (String) tableBD.getValueAt(fila, 12);
            creditoo = (String) tableBD.getValueAt(fila, 13).toString();
            
            id.setText(idd);
            nombres.setText(nombreCli);
            nombreContacto.setText(nombreCon);
            apellidoContacto.setText(apellidoCon);
            telefono.setText(tel);
            fax.setText(faxx);
            direccion1.setText(dir1);
            direccion2.setText(dir2);
            ciudad.setText(ciudadd);
            region.setText(regionn);
            pais.setText(paiss);
            postal.setText(postall);
            credito.setText(creditoo);
            lblEmpleado.setText(empleado);
        }
    }//GEN-LAST:event_tableBDMouseClicked

    private void cargarDatos() {
        try{
            con = conexion.getConection();
            ps = con.prepareStatement("SELECT * FROM cliente");                       
            rs = ps.executeQuery();
            Object[] cliente = new Object[14];
            model = (DefaultTableModel) tableBD.getModel();
            
            while(rs.next()){
                cliente[0] = rs.getString("codigo_cliente");
                cliente[1] = rs.getString("nombre_cliente");
                cliente[2] = rs.getString("nombre_contacto");
                cliente[3] = rs.getString("apellido_contacto");
                cliente[4] = rs.getString("telefono");
                cliente[5] = rs.getString("fax");
                cliente[6] = rs.getString("linea_direccion1");
                cliente[7] = rs.getString("linea_direccion2");
                cliente[8] = rs.getString("ciudad");
                cliente[9] = rs.getString("region");
                cliente[10] = rs.getString("pais");
                cliente[11] = rs.getString("codigo_postal");
                cliente[12] = rs.getString("codigo_empleado_rep_ventas");
                cliente[13] = rs.getInt("limite_credito");
                
                model.addRow(cliente);
            }            
            tableBD.setModel(model);            
            //con.close();            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public void limpiarCampos(){        // Creamos funcion para limpriar los campos de texto
        id.setText("");
        nombres.setText("");
        nombreContacto.setText("");
        apellidoContacto.setText("");
        telefono.setText("");
        fax.setText("");
        direccion1.setText("");
        direccion2.setText("");
        ciudad.setText("");
        region.setText("");
        pais.setText("");
        postal.setText("");
        credito.setText("");
        lblEmpleado.setText("0");
        //comboId.setSelectedIndex(0);
    }
    
    public void limpiarTabla(){
        for (int i = 0; i < tableBD.getRowCount(); i++) {
            model.removeRow(i);
            i = i-1;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField apellidoContacto;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JComboBox<String> comboTablas;
    private javax.swing.JTextField credito;
    private javax.swing.JTextField direccion1;
    private javax.swing.JTextField direccion2;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField fax;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTextField nombreContacto;
    private javax.swing.JTextField nombres;
    private javax.swing.JTextField pais;
    private javax.swing.JPanel paneBD;
    private javax.swing.JPanel paneDatos;
    private javax.swing.JPanel paneOperar;
    private javax.swing.JTextField postal;
    private javax.swing.JTextField region;
    private javax.swing.JTable tableBD;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
