/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Logica.disparo;
import Logica.posicion;
import javax.swing.JOptionPane;

/**
 * Metodo principal JFrame que contiene la parte grafica y parte logica de KeyPressed para el movimiento del cubo y ejecucion de hilos
 * @author Juan David Reyes. 
 * @author Juan Ricardo Rodriguez Campos.
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        
        int y=bala.getY();
        int x=bala.getX();
        System.out.println(x+" "+y);
        
        /*
        posicion p = new posicion(bala,bala.getX(),bala.getY(),cubo);
        p.datos();
        p.start();
        */
        
        
        // TODO add your handling code here:
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cañon = new javax.swing.JLabel();
        cubo = new javax.swing.JLabel();
        bala = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        cañon1 = new javax.swing.JLabel();
        bala1 = new javax.swing.JLabel();
        cañon2 = new javax.swing.JLabel();
        bala2 = new javax.swing.JLabel();
        cañon3 = new javax.swing.JLabel();
        bala3 = new javax.swing.JLabel();
        cañon4 = new javax.swing.JLabel();
        bala4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        cañon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/cañon.jpg"))); // NOI18N

        cubo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/i6.gif"))); // NOI18N
        cubo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cuboFocusGained(evt);
            }
        });
        cubo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cuboKeyPressed(evt);
            }
        });

        bala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/bala.png"))); // NOI18N

        dis.setText("O");

        cañon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/cañon.jpg"))); // NOI18N

        bala1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/bala.png"))); // NOI18N

        cañon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/cañon.jpg"))); // NOI18N

        bala2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/bala.png"))); // NOI18N

        cañon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/cañon.jpg"))); // NOI18N

        bala3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/bala.png"))); // NOI18N

        cañon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/cañon.jpg"))); // NOI18N

        bala4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego/img/bala.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cubo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(dis)))
                .addContainerGap(279, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cañon1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bala1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cañon)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bala)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cañon2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bala2)))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cañon3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bala3)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cañon4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(bala4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bala))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bala1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bala2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bala3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cañon4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bala4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(dis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cubo)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuboKeyPressed
        // TODO add your handling code here:
       
      
        
    }//GEN-LAST:event_cuboKeyPressed

    private void cuboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cuboFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cuboFocusGained
/**
 * KeyPressed para la ejeccion de codigo con los botones.
 * @param evt 
 */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        // TODO add your handling code here:
         /*int tecla2 = evt.getKeyCode();
         char tecla = evt.getKeyChar();
         System.out.println(tecla2);
        */
         
        int x = cubo.getX();
         int y = cubo.getY();
        
        //System.out.println(x+y);
        //System.out.println(evt.getKeyChar());
        if(evt.getKeyCode()==39){
            
            x=x+3;
            
            
            if(x >=700){
                x=700;
                //cubo.setLocation(x, y);
            }
            cubo.setLocation(x, y);
        }
        if(evt.getKeyCode()==37){
            x=x-4;
            //cubo.setLocation(x, y);
            if(x<=5){
                x=5;
                //cubo.setLocation(x, y);
            }
            cubo.setLocation(x, y);
        }
        
        if(evt.getKeyCode()==38){
        disparo d = new disparo(cubo,dis);
        d.start();
        }
        
        if(evt.getKeyChar()=='x'){
        posicion p1 = new posicion(bala1,bala1.getX(),bala1.getY(),cubo,dis);
        p1.datos();
        p1.start();
        }
        
        if(evt.getKeyChar()=='c'){
        posicion p2 = new posicion(bala2,bala2.getX(),bala2.getY(),cubo,dis);
        p2.datos();
        p2.start();
        }
        
        if(evt.getKeyChar()=='v'){
        posicion p3 = new posicion(bala3,bala3.getX(),bala3.getY(),cubo,dis);
        p3.datos();
        p3.start();
        }
        
        if(evt.getKeyChar()=='b'){
        posicion p4 = new posicion(bala4,bala4.getX(),bala4.getY(),cubo,dis);
        p4.datos();
        p4.start();
        }
        
        if(evt.getKeyChar()=='z'){
        posicion p5 = new posicion(bala,bala.getX(),bala.getY(),cubo,dis);
        p5.datos();
        p5.start();
        }
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bala;
    private javax.swing.JLabel bala1;
    private javax.swing.JLabel bala2;
    private javax.swing.JLabel bala3;
    private javax.swing.JLabel bala4;
    private javax.swing.JLabel cañon;
    private javax.swing.JLabel cañon1;
    private javax.swing.JLabel cañon2;
    private javax.swing.JLabel cañon3;
    private javax.swing.JLabel cañon4;
    private javax.swing.JLabel cubo;
    private javax.swing.JLabel dis;
    // End of variables declaration//GEN-END:variables
}
