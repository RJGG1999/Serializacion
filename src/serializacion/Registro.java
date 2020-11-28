/*
* Java - Metodo de serialización
* Copyright 2020 Raúl Garibay Gamero
*/
package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    int idU=0,idAux,id,mod;
    String bus,name,apeP,apeM,email,dir,tel;
    ObjectOutputStream out=null;
    ArrayList<usuarios> user;
    public Registro() throws Exception {
        initComponents();
        user=new ArrayList<>();
        btnGuardar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
        txtID.setEnabled(false);
        deshabilitar();
        Read();
        ultimoId();
        
    }

    public void ultimoId(){
        for (int i=0;i<user.size();i++){
            idU=Integer.parseInt(user.get(i).getId());
            idAux=idU;
        }
        txtID.setText(String.valueOf(idU));
    }
    
    public void Read() throws IOException, ClassNotFoundException{
        usuarios u = null; 
        try{   
            ObjectInputStream inputUsers = new ObjectInputStream(new FileInputStream("Object.dat"));
            u=(usuarios)inputUsers.readObject();
            while(u != null){
                user.add(u);
                u = (usuarios) inputUsers.readObject();
            }        
        }catch (Exception ex){} 
    }
    
    public void Save() throws FileNotFoundException, IOException{
        out = new ObjectOutputStream(new FileOutputStream("Object.dat"));   
        for (usuarios u : user){
            out.writeObject(u);         
        }    
    } 
    
    public void deshabilitar(){
        txtName.setEnabled(false);
        txtApeP.setEnabled(false);
        txtApeM.setEnabled(false);
        txtDir.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTel.setEnabled(false);
    }
    
    public void habilitar(){
        txtName.setEnabled(true);
        txtApeP.setEnabled(true);
        txtApeM.setEnabled(true);
        txtDir.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTel.setEnabled(true);
    }
    
    public void limpiar(){
        txtName.setText("");
        txtApeP.setText("");
        txtApeM.setText("");
        txtDir.setText("");
        txtEmail.setText("");
        txtTel.setText("");
        txtBuscar.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtApeP = new javax.swing.JTextField();
        txtApeM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombe o id a buscar:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        jLabel3.setText("Nombre(s):");

        jLabel4.setText("Apellido paterno:");

        jLabel5.setText("Apellido materno:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Email:");

        jLabel8.setText("Teléfono:");

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/basura.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver.png"))); // NOI18N
        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(8, 8, 8)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(69, 69, 69)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApeP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApeM, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel6))))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnNuevo)
                        .addGap(6, 6, 6)
                        .addComponent(btnGuardar)
                        .addGap(6, 6, 6)
                        .addComponent(btnEditar)
                        .addGap(6, 6, 6)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnCancelar)
                        .addGap(9, 9, 9)
                        .addComponent(btnMostrar)
                        .addGap(6, 6, 6)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApeP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApeM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnMostrar.setEnabled(false);
        btnBuscar.setEnabled(false);
        txtBuscar.setEnabled(false);
        btnNuevo.setEnabled(false);
        habilitar();
        idU=Integer.parseInt(txtID.getText());
        idAux=idU;
        idU++;
        txtID.setText(String.valueOf(idU));
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiar();
        deshabilitar();
        btnBuscar.setEnabled(true);
        txtBuscar.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnMostrar.setEnabled(true);
        txtID.setText(String.valueOf(idAux));
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int x,y=1;
        x=valida();
        if(x==0){
            JOptionPane.showMessageDialog(null, "Error de entrada");
            y=0;
        }
        else{
            for (int i=0;i<user.size();i++)
                if(email.equals(user.get(i).getEmail())){
                    JOptionPane.showMessageDialog(null, "Ese correo ya existe");
                    y=0;
                    break;
                }
        }
        if(y==1){
            usuarios us=new usuarios();
            us.setId(txtID.getText());
            us.setName(txtName.getText());
            us.setApeP(txtApeP.getText());
            us.setApeM(txtApeM.getText());
            us.setAddress(txtDir.getText());
            us.setEmail(txtEmail.getText());
            us.setPhone(txtTel.getText());
            user.add(us);
            try {
                Save();
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
            idU=Integer.parseInt(txtID.getText());
            idAux=idU;
            limpiar();
            deshabilitar();
            btnMostrar.setEnabled(true);
            btnBuscar.setEnabled(true);
            txtBuscar.setEnabled(true);
            btnNuevo.setEnabled(true);
            btnGuardar.setEnabled(false);
            btnCancelar.setEnabled(false);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int x=0,k=0,q=1;
        Matcher b;
        boolean flag;
        Pattern ExpresionBus = Pattern.compile("[A-Za-z0-9]+");
        bus=txtBuscar.getText();
        
        b=ExpresionBus.matcher(bus);
        flag=b.find();
        
        if(flag==false){
            JOptionPane.showMessageDialog(null, "Error de entrada");
            txtBuscar.setText("");
        }
        else{
            try{
                k =  Integer.parseInt(bus);
            }catch (Exception ex){
                q=0;
            }

            if(q==1){
                for (int i=0;i<user.size();i++)
                    if(k==Integer.parseInt(user.get(i).getId())){
                        txtID.setText(String.valueOf(user.get(i).getId()));
                        txtName.setText(user.get(i).getName());
                        txtApeP.setText(user.get(i).getApeP());
                        txtApeM.setText(user.get(i).getApeM());
                        txtDir.setText(user.get(i).getAddress());
                        txtEmail.setText(user.get(i).getEmail());
                        txtTel.setText(user.get(i).getPhone());
                        mod=i;
                        x=1;
                        break;
                    }
            }
            else{
                for (int i=0;i<user.size();i++){
                    if(bus.equals(user.get(i).getName()+" "+user.get(i).getApeP()+" "+user.get(i).getApeM())){
                        txtID.setText(String.valueOf(user.get(i).getId()));
                        txtName.setText(user.get(i).getName());
                        txtApeP.setText(user.get(i).getApeP());
                        txtApeM.setText(user.get(i).getApeM());
                        txtDir.setText(user.get(i).getAddress());
                        txtEmail.setText(user.get(i).getEmail());
                        txtTel.setText(user.get(i).getPhone());
                        mod=i;
                        x=1;
                        break;
                    }
                }
            }
            
            if(x==0){
                JOptionPane.showMessageDialog(null, "No encontrado");
                txtBuscar.setText("");
            }
            else{
                btnNuevo.setEnabled(false);
                btnEditar.setEnabled(true);
                btnEliminar.setEnabled(true);
                btnCancelar.setEnabled(true);
                btnMostrar.setEnabled(false);
                habilitar();
            }
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int x;
        x=valida();
        if(x==1){
            user.get(mod).setId(txtID.getText());
            user.get(mod).setName(txtName.getText());
            user.get(mod).setApeP(txtApeP.getText());
            user.get(mod).setApeM(txtApeM.getText());
            user.get(mod).setEmail(txtEmail.getText());
            user.get(mod).setAddress(txtDir.getText());
            user.get(mod).setPhone(txtTel.getText());
            try {
                Save();
            } catch (IOException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this,"Dato modificado");
            limpiar();
            deshabilitar();
            btnNuevo.setEnabled(true);
            btnEditar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnCancelar.setEnabled(false);
            btnMostrar.setEnabled(true);
            txtID.setText(String.valueOf(idAux));
        }
        else
            JOptionPane.showMessageDialog(this,"Error de entrada");
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        user.remove(mod);
        mod=0;
        JOptionPane.showMessageDialog(this,"Dato eliminado");
        try {
            Save();
        } catch (IOException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpiar();
        deshabilitar();
        btnNuevo.setEnabled(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnMostrar.setEnabled(true);
        ultimoId();
        txtID.setText(String.valueOf(idAux));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        Mostrar obj=new Mostrar();
        dispose();
        obj.setVisible(true);
        obj.mostrar(user);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       JOptionPane.showMessageDialog(this,"Presiona aceptar para cerrar");
       dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public int valida(){
        Matcher e,t,n,ap,am,dire;
        boolean flag,flag1,flag2,flag3,flag4,flag5;
        Pattern ExpresionCorreo = Pattern.compile("[a-z0-9+.?-?_?]+@+[a-z+]+[.]+[a-z+]+");
        Pattern ExpresionTel = Pattern.compile("[0-9]+");
        Pattern ExpresionNombreApellido = Pattern.compile("[A-Za-z]+");
        Pattern ExpresionDir = Pattern.compile("[A-Za-z0-9#]+");
        
        name=txtName.getText();
        apeP=txtApeP.getText();
        apeM=txtApeM.getText();
        email=txtEmail.getText();
        dir=txtDir.getText();
        tel=txtTel.getText();
        
        n=ExpresionNombreApellido.matcher(name);
        flag=n.find();
        
        ap=ExpresionNombreApellido.matcher(apeP);
        flag1=ap.find();
        
        am=ExpresionNombreApellido.matcher(apeM);
        flag2=am.find();
        
        e=ExpresionCorreo.matcher(email);
        flag3=e.find();
        
        dire=ExpresionDir.matcher(dir);
        flag4=dire.find();
        
        t=ExpresionTel.matcher(tel);
        flag5 = t.find();
        
        if(flag==false||flag1==false||flag2==false||flag3==false||flag4==false||flag5==false)
            return 0;   
        return 1;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registro().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApeM;
    private javax.swing.JTextField txtApeP;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
