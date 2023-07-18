
package InicioDeSesion;

import com.mysql.jdbc.Connection;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerModel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Usuario extends javax.swing.JFrame {
    
    
    private DefaultTableModel modelo;
    ArrayList<Producto> listaProductos=new ArrayList<>();
    
    private Producto Produ;
   
    private int Codigo=0;
    private String  Nombre="";
    private double PUnitario=0.0;
    private double PTotal=0.0;
    private int CantidadBD=0;
    private String Talla="";
    private int Cantidadtxt=0;
    private int auxDetalle=1;
 
    public Usuario() throws SQLException {
        initComponents(); 
        
        //Llamado de todos los metodos necesarios al iniciar el frame
        setLocationRelativeTo(null);
        CargarProductos();
        ModeloTabla();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnComprar = new javax.swing.JButton();
        txtProducto = new javax.swing.JLabel();
        cmbProductos = new javax.swing.JComboBox<>();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JLabel();
        txtIVA = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Bienvenido");

        btnComprar.setText("Comprar");

        txtProducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 0, 0));
        txtProducto.setText("Producto");

        cmbProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Producto" }));
        cmbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProductosItemStateChanged(evt);
            }
        });
        cmbProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductosActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 0, 0));
        lblCantidad.setText("Cantidad");

        tblProductos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblProductos.setForeground(new java.awt.Color(0, 0, 0));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto", "Cantidad", "Talla", "Precio Unitario", "Precio Total", "Estado"
            }
        ));
        tblProductos.setName("Productos "); // NOI18N
        jScrollPane1.setViewportView(tblProductos);

        btnLimpiar.setText("Limpiar");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("SUBTOTAL");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("IVA");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TOTAL");

        txtSubtotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtSubtotal.setForeground(new java.awt.Color(0, 0, 0));
        txtSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtSubtotal.setText("$0.00");

        txtIVA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIVA.setForeground(new java.awt.Color(0, 0, 0));
        txtIVA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtIVA.setText("$0.00");

        txtTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 0, 0));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("$0.00");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel3)
                        .addGap(102, 102, 102)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel4)
                        .addGap(155, 155, 155)
                        .addComponent(txtIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(jLabel5)
                        .addGap(132, 132, 132)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnComprar)
                        .addGap(64, 64, 64)
                        .addComponent(btnLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(148, 148, 148))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto)
                    .addComponent(cmbProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSubtotal))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtIVA))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar)
                    .addComponent(btnLimpiar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductosActionPerformed
      

    }//GEN-LAST:event_cmbProductosActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String combo=cmbProductos.getSelectedItem().toString();
        
        //validar que se seleccione un producto
        
        if (combo.equalsIgnoreCase("Seleccione Producto"))
        {
           JOptionPane.showMessageDialog(null, "Seleccione un producto"); 
        }else
        {
            //Validar que el campo de cantidad no este vacio 
            
            if (!txtCantidad.getText().isEmpty())
            {
                //Validar que la cantidad sea numerica
                
                boolean validar = Validacion(txtCantidad.getText());
                if (validar==true)
                {
                    //Validar que la cantidad sea mayor a 0
                    
                    if (Integer.parseInt(txtCantidad.getText())>0)
                    {
                       Cantidadtxt=Integer.parseInt(txtCantidad.getText());
                        this.CargaProductosTabla();
                       
                       //Validar cantidad de stock
                       
                        if (Cantidadtxt<=CantidadBD)
                        {
                          //Crear un producto nuevo para añadir a la tabla
                            
                          Produ=new Producto(Codigo, 
                                  Nombre,
                                  Integer.parseInt(txtCantidad.getText()),
                                  Talla,
                                  PUnitario,
                                  PTotal,
                                  1);
                          
                          //Añadir a la lista
                          
                          listaProductos.add(Produ);
                          JOptionPane.showMessageDialog(null, "EL producto a sido agregado");
                          //Se limpian los campos
                          txtBusqueda.setText("");
                          txtCantidad.setText("");
                          this.CargarProductos();
                          
                        } else
                        {
                            JOptionPane.showMessageDialog(null, "La cantidad en stock es "+CantidadBD);
                        }
                    } else
                    {
                        JOptionPane.showMessageDialog(null, "La cantidad es invalida");
                    }
                } else
                {
                    JOptionPane.showMessageDialog(null, "Ingrese la cantidad en formato numerico");
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Ingrese Una Cantidad");
            }
            
            //this.listaTabla();
            this.CargaTabla();
        
        }

// TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProductosItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProductosItemStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
       Busqueda();
    }//GEN-LAST:event_btnBuscarActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try
                {
                    new Usuario().setVisible(true);
                } catch (SQLException ex)
                {
                    JOptionPane.showMessageDialog(null, "ERROR3"+ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbProductos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JLabel txtIVA;
    private javax.swing.JLabel txtProducto;
    private javax.swing.JLabel txtSubtotal;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables

    //Metodo para inicializar tabla
    private void ModeloTabla(){
    
        modelo=new DefaultTableModel();
           
           modelo.addColumn("Codigo");
           modelo.addColumn("Producto");
           modelo.addColumn("Cantidad");
           modelo.addColumn("Talla");
           modelo.addColumn("Precio Unitario");
           modelo.addColumn("Precio total");
           modelo.addColumn("Accion");
           
           this.tblProductos.setModel(modelo);
           
           
    }

    //Metodo para presentar datos en la tabla
    private void listaTabla(){
        this.modelo.setRowCount(listaProductos.size());
          for (int i = 0; i < listaProductos.size(); i++)
          {
              this.modelo.setValueAt(i+1, i, 0);
              this.modelo.setValueAt(listaProductos.get(i).getNombre(), i, 1);
              this.modelo.setValueAt(listaProductos.get(i).getCantidad(), i, 2);
              this.modelo.setValueAt(listaProductos.get(i).getTalla(), i, 3);
              this.modelo.setValueAt(listaProductos.get(i).getPRecioUnitario(), i, 4);
              this.modelo.setValueAt(listaProductos.get(i).getPrecioTotal(), i, 5);
              this.modelo.setValueAt("Eliminar", i, 6);
          }
          //añadeir a la tabla
          tblProductos.setModel(modelo);
    }

    //Metodo para mostrar productos en la tabla
    private void CargaTabla(){
    this.modelo.setRowCount(listaProductos.size());
        for (int i=0; i < listaProductos.size(); i++)
        {
            this.modelo.setValueAt(Codigo, i, 0);
            this.modelo.setValueAt(listaProductos.get(i).getNombre(), i, 1);
            this.modelo.setValueAt(listaProductos.get(i).getCantidad(), i, 2);
            this.modelo.setValueAt(listaProductos.get(i).getTalla(), i,3);
            this.modelo.setValueAt(listaProductos.get(i).getPRecioUnitario(), i, 4);
            this.modelo.setValueAt(listaProductos.get(i).getPrecioTotal(), i, 5);
            this.modelo.setValueAt("Eliminar", i, 6);
        }
        //Añadir a la tabla
        tblProductos.setModel(modelo);
    }
    
    //Metodo para hacer uuna busqueda en el combo box y BD
    private void Busqueda (){
   String Busqueda = txtBusqueda.getText().trim();
        String sql="select * from productos where ID = '"+Busqueda+"'";
        Conexion cn =new Conexion();
        Connection con=(Connection) cn.conectar();
        Statement st;
        
        try
        {
          st=con.createStatement();
          ResultSet rs=st.executeQuery(sql);
          
            if (rs.next())
            {
                cmbProductos.setSelectedItem(rs.getInt("ID")+" "+rs.getString("nombre")+" - "+rs.getString("talla"));
            } else
            {
                JOptionPane.showMessageDialog(null, "El producto seleccionado no esta registrado");
            }
            con.close();
            
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error3 "+ex.getMessage());
        }   
  }
  
    //Metodo para cargar los productos al combo box
    private void CargarProductos() { 
        
        ResultSet rs=null;
        Conexion cn= new Conexion();
        
        
        try{
            String sql="select * from productos";
            Connection con=(Connection) cn.conectar();
        
           PreparedStatement  ps=con.prepareStatement(sql);
           rs=ps.executeQuery();
          
            while (rs.next())
            {
                
               cmbProductos.addItem(rs.getInt("ID")+" "+rs.getString("nombre")+" - "+rs.getString("talla"));
               
            }
            con.close();
            
        } catch (SQLException ex)
        {
                JOptionPane.showMessageDialog(null, "error2"+ex.getMessage());
        } 
}
    
    //Moetodo para validar que un valor sea numerico
    private boolean Validacion(String valor){
        try
        {
            int num=Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e)
        {
            
        return false;
        }
    } 
    
    //MEtodo para Cargar los productos que se van a cargar a la tabla
    public void CargaProductosTabla(){
        try
        {
          
           Statement st;
           ResultSet rs;
           Conexion cn=new Conexion();
           Connection con=(Connection) cn.conectar();
           
           String sql="select * from productos where ID = '" + this.cmbProductos.getSelectedItem() + "'";
           st=con.createStatement();
           rs=st.executeQuery(sql);
           
            while (rs.next())
            {
                
                Codigo=rs.getInt("ID");
                Nombre=rs.getString("nombre");
                PUnitario=rs.getDouble("precio");
                Talla=rs.getString("talla");
                CantidadBD=rs.getInt("cantidad");
                PTotal=PUnitario*Cantidadtxt;  
            }
       
        } catch (SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "error4 "+ex.getMessage());  
        }
    }    
   
    
}
