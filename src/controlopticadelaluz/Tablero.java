/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 *Enlace teoria de acceder a otras cosas
 *https://www.javamexico.org/foros/java_standard_edition/utilizar_eventos_de_otra_clase
 */
package controlopticadelaluz;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author lara
 */
public class Tablero extends javax.swing.JPanel {

    /**
     * Creates new form Tablero
     */
    public Tablero() {
        initComponents();
    }


    Principal b;
    
    Tablero(Principal aThis) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
          b = aThis;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(176, 165, 153));

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jPanel2.setLayout(new java.awt.GridLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlopticadelaluz/Inventario.png"))); // NOI18N
        jButton1.setText("Almacen");
        jButton1.setPreferredSize(new Dimension(100,100));
        jPanel2.add(jButton1);

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btnProductos);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlopticadelaluz/Reporte.png"))); // NOI18N
        jButton4.setText("Garantias");
        jPanel2.add(jButton4);

        jPanel1.add(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/controlopticadelaluz/Ventas.png"))); // NOI18N
        jButton2.setText("Ventas");
        jPanel3.add(jButton2);

        jButton5.setText("Cerrar Cesion");
        jPanel3.add(jButton5);

        jPanel1.add(jPanel3);

        jLabel1.setText("<html>\n<h1>Titulo Tienda</h1>\n</html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        
       b.mostrarPanelProductos();
        
    }//GEN-LAST:event_btnProductosActionPerformed

    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
