/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bjj;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author gaston
 */
public class Bjj extends JFrame implements Runnable, ActionListener{

    /**
     * @param args the command line arguments
     */
    
    public int onoff = 0;
    
    Integer minutos = 4 , segundos = 59, milesimas = 0, p1 = 0, p2 = 0, a1 = 0, a2 = 0, v1 = 0, v2 = 0, topMin = 5, topSeg = 0;
       
    int fCrono = 250, fNombre = 55, fPuntos = 24, fAdv = 150, fP = 250;
    
    
    JLabel tiempo;
    String tx = "05:00";
    
    JLabel txtCrono;
    JLabel jLabel1;
    JLabel jLabel2;
    JLabel jLabel3;
    JLabel jLabel4;
    JLabel jLabel5;
    JLabel jLabel6;
    JLabel jLabel7;
    JLabel jLabel8;
    JLabel jLabel10;
    JLabel jLabel18;
    JLabel jLabel19;
    JLabel ADVERTENCIAS;
    JLabel background;
    
    JPanel jPanel1;
    JPanel jPanel2;
    JPanel jPanel3;
    JPanel jPanel4;
    JLabel txtPuntos1;
    JPanel jPanel5;
    JPanel jPanel6;
    JLabel txtVentaja1;
    JLabel txtAdv1;
    JPanel jPanel8;
    JPanel jPanel9;
    JLabel txtPuntos2;
    JPanel jPanel10;
    JLabel txtVentaja2;
    JLabel txtAdv2;
    JPanel jPanel7;
    JPanel jPanel11;
    JPanel jPanel12;
    JPanel jPanel13;
    JPanel jPanel14;
    JPanel jPanel15;
    JPanel jPanel16;
    JPanel jPanel17;
    JPanel jPanel18;
    JPanel jPanel19;
    JPanel jPanel20;
    JPanel jPanel21;
    JPanel jPanel22;
    
    static Thread hilo;
    
    static vP va;
    
    
    static boolean cronometroActivo;
    static boolean pausar;
    static boolean ison = false;
    static boolean bosina = true;
    
    /*public void run(){
        
        //fuente(1);
        
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min="", seg="", mil="";
        try {

            while(pausar){
            //Mientras cronometroActivo sea verdadero entonces seguira
            //aumentando el tiempo
                while( cronometroActivo ) {
                    Thread.sleep( 50 );
                    //Incrementamos 4 milesimas de segundo
                    
                    milesimas += 50;
                    
                    if(milesimas == 1000){
                     
                        segundos ++;
                        
                        milesimas = 0;
                        
                    }
                    
                  
                    if( segundos == 60 )
                    {
                        segundos = 0;
                        minutos++;
                    }
                    

                    //Esto solamente es estetica para que siempre este en formato
                    //00:00:000
                    
                    
                    if( minutos < 10 ) min = "0" + minutos;
                    else min = minutos.toString();
                    if( segundos < 10 ) seg = "0" + segundos;
                    else seg = segundos.toString();

                    //Colocamos en la etiqueta la informacion
                   // tx =  min + ":" + seg;
                    txtCrono.setText(min + ":" + seg);
                    va.actualizar(min + ":" + seg);
                    
                    if(topMin <= minutos && topSeg <= segundos){
                        
                        pararCronometro();
                        
                        ReproducirSonido();
                        
                    }
                    
                    /*while(pausar){
                        tiempo.setText( min + ":" + seg + ":" + mil );
                    }*/ /*
                }
                    // tx =  min + ":" + seg;
                    txtCrono.setText(min + ":" + seg);
                    va.actualizar(min + ":" + seg);
            }
        }catch(Exception e){System.out.println("Ya valió :P, error en el run");}
        
        
    }*/
    
    public void run(){
        
        //fuente(1);
        
        //min es minutos, seg es segundos y mil es milesimas de segundo
        String min="", seg="", mil="";
        try {

            while(pausar){
            //Mientras cronometroActivo sea verdadero entonces seguira
            //aumentando el tiempo
                while( cronometroActivo ) {
                    Thread.sleep( 100 );
                    //Incrementamos 4 milesimas de segundo
                    
                 
                    
                    milesimas += 100;
                    
                    if(milesimas == 1000){
                        
                        if(segundos == 0){
                            segundos = 59;
                            minutos --;
                        }else{
                            segundos --;
                        }
                        
                        milesimas = 0;
                        
                    }
                    
                  
                    
                    

                    //Esto solamente es estetica para que siempre este en formato
                    //00:00:000
                    
                    
                    if( minutos < 10 ) min = "0" + minutos;
                    else min = minutos.toString();
                    if( segundos < 10 ) seg = "0" + segundos;
                    else seg = segundos.toString();

                    //Colocamos en la etiqueta la informacion
                   // tx =  min + ":" + seg;
                    txtCrono.setText(min + ":" + seg);
                    va.actualizar(min + ":" + seg);
                    
                    if(minutos == 0 && segundos == 0){
                        
                        pararCronometro();
                        
                        if(bosina){
                            ReproducirSonido();
                        }else{
                            ReproducirSonido();
                            
                            Thread.sleep( 1000 );
                            
                            ReproducirSonido();
                        }
                        
                        
                        
                    }
                    
                    /*while(pausar){
                        tiempo.setText( min + ":" + seg + ":" + mil );
                    }*/
                }
                    // tx =  min + ":" + seg;
                    
            }
        }catch(Exception e){System.out.println("Ya valió :P, error en el run");}
        
        
    }
    
    public boolean changeBocina(){
        if(bosina){
            bosina = false;
        }else{
            bosina = true;
        }
        return bosina;
    }
    
    public void iniciarCronometro() {
        
        if(!cronometroActivo){
        
            ison = true;
            cronometroActivo = true;
            pausar = true;
            hilo = new  Thread( this );
            hilo.start();
            //ReproducirSonido();
        }
        
        
    }

    //Esto es para parar el cronometro
    public static void pararCronometro(){
        cronometroActivo = false;
        pausar = false ;        
    }

    public void reiniciarCronometro(){
        pararCronometro();
        
        if(topMin >= 10){
            if(topSeg >= 10){
                txtCrono.setText(topMin + ":" + topSeg);
                va.actualizar(topMin + ":" + topSeg);
            }else{
                txtCrono.setText(topMin + ":" + "0" + topSeg);
                va.actualizar(topMin + ":" + "0" + topSeg);
            }
            
        }else{
            if(topSeg >= 10){
                txtCrono.setText("0" + topMin + ":" + topSeg);
                va.actualizar("0" + topMin + ":" + "0" + topSeg);
            }else{
                txtCrono.setText("0" + topMin + ":" + "0" + topSeg);
                va.actualizar("0" + topMin + ":" + "0" + topSeg);
            }
        }
        cronometroActivo = false;
        pausar = false;
        ison = false;
        
        minutos = topMin;
        segundos = topSeg;
        milesimas = 0;
        
        txtPuntos1.setText("0");
        txtVentaja1.setText("0");
        txtAdv1.setText("0");
        txtPuntos2.setText("0");
        txtVentaja2.setText("0");
        txtAdv2.setText("0");
       
        p1 = 0;
        p2 = 0;
        a1 = 0;
        a2 = 0;
        v1 = 0;
        v2 = 0;
        
        
    }
    
    public void setCronometro(String a, String b, int c, int d){
        
        pararCronometro();
        reiniciarCronometro();
        
        jLabel1.setText(a);
        jLabel2.setText(b);
        
        topMin = c;
        topSeg = d;
        /*
        if(d != 0){
            segundos = d;
            minutos = c;
        }else{
            segundos = 59;
            minutos = (c-1);
        }*/
        
        segundos = d;
        minutos = c;
        
        if(topMin >= 10){
            if(topSeg >= 10){
                txtCrono.setText(topMin + ":" + topSeg);
                va.actualizar(topMin + ":" + topSeg);
            }else{
                txtCrono.setText(topMin + ":" + "0" + topSeg);
                va.actualizar(topMin + ":" + "0" + topSeg);
            }
            
        }else{
            if(topSeg >= 10){
                txtCrono.setText("0" + topMin + ":" + topSeg);
                va.actualizar("0" + topMin + ":" + "0" + topSeg);
            }else{
                txtCrono.setText("0" + topMin + ":" + "0" + topSeg);
                va.actualizar("0" + topMin + ":" + "0" + topSeg);
            }
        }
        
    }
    
    
     public void ReproducirSonido(){
         /*
         try {
   //archivo de audio
            File f=new File("sonido.wav");
            //lo convertimos a url
            URL u=f.toURL();
            //Bueno de la AudioClip no se puede instancias por eso esto
            AudioClip sonido=JApplet.newAudioClip(u);
            //para que suene
            sonido.play();
            //como el programa se ejecuta muy rapido el audio no se alcanza a escuchar
            Thread.currentThread().sleep(5000);
            //si fuese una ventana no fuese necesario esa linea
           }catch (Exception ex) {
            System.out.println (ex);
           }*/
         
         try
            {
              // get the sound file as a resource out of my jar file;
              // the sound file must be in the same directory as this class file.
              // the input stream portion of this recipe comes from a javaworld.com article.
              InputStream inputStream = getClass().getResourceAsStream("sonido.wav");
              AudioStream audioStream = new AudioStream(inputStream);
              AudioPlayer.player.start(audioStream);
            }
            catch (Exception e)
            {
             
            }

         
         
     }
     
     public void fuente(int a){
         
         JLabel[] to = new JLabel[16]; 
         
         to[0] = txtCrono;
         to[1] = jLabel1;
         to[2] = jLabel2;
         to[3] = jLabel3;
         to[4] = jLabel4;
         to[5] = jLabel5;
         to[6] = jLabel6;
         to[7] = jLabel7;
         to[8] = ADVERTENCIAS;
         to[9] = tiempo;
         to[10] = txtPuntos1;
         to[11] = txtVentaja1;
         to[12] = txtAdv1;
         to[13] = txtPuntos2;
         to[14] = txtVentaja2;
         to[15] = txtAdv2;
         
         if(a == 0){
             
            fP = (int) fP + fP / 10;
            fCrono = (int) fCrono + fCrono / 10;
            fNombre = (int) fNombre + fNombre / 10;
            fPuntos = (int) fPuntos + fPuntos / 10;
            fAdv = (int) fAdv + fAdv / 10;
         
            //fP += 12;
            //fCrono += 20;
            //fNombre += 5;
            //fPuntos += 2;
            //fAdv += 7;
         
         }else if(a == 1){
         
            /*fP -= 12;
            fCrono -= 20;
            fNombre -= 5;
            fPuntos -= 2;
            fAdv -= 7;*/
            
            fP = (int) fP - fP / 10;
            fCrono = (int) fCrono - fCrono / 10;
            fNombre = (int) fNombre - fNombre / 10;
            fPuntos = (int) fPuntos - fPuntos / 10;
            fAdv = (int) fAdv - fAdv / 10;
         
         }
         
         to[0].setFont(new java.awt.Font("Ubuntu", 1, fCrono));
         to[1].setFont(new java.awt.Font("Ubuntu", 1, fNombre));
         to[2].setFont(new java.awt.Font("Ubuntu", 1, fNombre));
         to[3].setFont(new java.awt.Font("Ubuntu", 1, fPuntos));
         to[4].setFont(new java.awt.Font("Ubuntu", 1, fPuntos));
         to[5].setFont(new java.awt.Font("Ubuntu", 1, fPuntos));
         to[8].setFont(new java.awt.Font("Ubuntu", 1, fPuntos));
         to[11].setFont(new java.awt.Font("Ubuntu", 1, fAdv));
         to[12].setFont(new java.awt.Font("Ubuntu", 1, fAdv));
         to[14].setFont(new java.awt.Font("Ubuntu", 1, fAdv));
         to[15].setFont(new java.awt.Font("Ubuntu", 1, fAdv));
         to[10].setFont(new java.awt.Font("Ubuntu", 1, fP));
         to[13].setFont(new java.awt.Font("Ubuntu", 1, fP));
         to[6].setFont(new java.awt.Font("Ubuntu", 1, fPuntos));
         to[7].setFont(new java.awt.Font("Ubuntu", 1, fPuntos));
         
         
         
         
         
         
     }
    
    
    public Bjj(){
        
        setTitle("Cronometro BJJ <BR FIGHTING> Gracie Barra");
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout( new BorderLayout() );
                
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setUndecorated(true);
        
        /*
        
         jPanel3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCrono = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtPuntos1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtVentaja1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        txtAdv1 = new javax.swing.JLabel();
        ADVERTENCIAS = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtPuntos2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtVentaja2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtAdv2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.darkGray);

        jPanel3.setBackground(new java.awt.Color(1, 1, 1));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setBackground(new java.awt.Color(1, 1, 1));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("GB only bn .png"))); // NOI18N
        jPanel17.add(jLabel8, java.awt.BorderLayout.WEST);

        txtCrono.setBackground(new java.awt.Color(254, 254, 254));
        txtCrono.setFont(new java.awt.Font("Capture it", 0, 380)); // NOI18N
        txtCrono.setForeground(new java.awt.Color(2, 255, 0));
        txtCrono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCrono.setText("00:00");
        jPanel17.add(txtCrono, java.awt.BorderLayout.CENTER);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("logo solo BR (ByN).png"))); // NOI18N
        jPanel17.add(jLabel10, java.awt.BorderLayout.EAST);

        jPanel3.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jPanel15.setBackground(new java.awt.Color(254, 254, 254));

        jLabel1.setBackground(new java.awt.Color(49, 47, 159));
        jLabel1.setFont(new java.awt.Font("Droid Sans", 1, 75)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1,1,1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nombre");
        jPanel15.add(jLabel1);

        jPanel6.add(jPanel15);

        jPanel14.setBackground(new java.awt.Color(49,47,159));

        jLabel2.setBackground(new java.awt.Color(254, 254, 254));
        jLabel2.setFont(new java.awt.Font("Droid Sans", 1, 75)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        jPanel14.add(jLabel2);

        jPanel6.add(jPanel14);

        jPanel3.add(jPanel6, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(49, 47, 159));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setForeground(new java.awt.Color(1, 1, 1));
        jPanel2.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setLayout(new java.awt.BorderLayout());

        txtPuntos1.setFont(new java.awt.Font("Droid Sans", 1, 200)); // NOI18N
        txtPuntos1.setForeground(new java.awt.Color(1,1,1));
        txtPuntos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPuntos1.setText("0");
        jPanel4.add(txtPuntos1, java.awt.BorderLayout.CENTER);

        jLabel6.setFont(new java.awt.Font("Droid Sans", 1, 35)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1,1,1));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PUNTOS");
        jPanel4.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(new java.awt.Color(60, 226, 38));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254), 10));
        jPanel7.setLayout(new java.awt.BorderLayout());

        txtVentaja1.setBackground(new java.awt.Color(93, 109, 182));
        txtVentaja1.setFont(new java.awt.Font("Droid Sans", 1, 150)); // NOI18N
        txtVentaja1.setForeground(new java.awt.Color(1, 1, 1));
        txtVentaja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVentaja1.setText("0");
        jPanel7.add(txtVentaja1, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Droid Sans", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VENTAJAS");
        jPanel7.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel7);

        jPanel11.setBackground(new java.awt.Color(230, 17, 17));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254), 10));
        jPanel11.setLayout(new java.awt.BorderLayout());

        txtAdv1.setBackground(new java.awt.Color(230, 17, 17));
        txtAdv1.setFont(new java.awt.Font("Droid Sans", 1, 150)); // NOI18N
        txtAdv1.setForeground(new java.awt.Color(1, 1, 1));
        txtAdv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdv1.setText("0");
        jPanel11.add(txtAdv1, java.awt.BorderLayout.CENTER);

        ADVERTENCIAS.setFont(new java.awt.Font("Droid Sans", 1, 35)); // NOI18N
        ADVERTENCIAS.setForeground(new java.awt.Color(1, 1, 1));
        ADVERTENCIAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADVERTENCIAS.setText("PENALIZACIONES");
        jPanel11.add(ADVERTENCIAS, java.awt.BorderLayout.PAGE_END);

        jPanel5.add(jPanel11);

        jPanel2.add(jPanel5);

        jPanel1.add(jPanel2);

        jPanel8.setBackground(new java.awt.Color(49,47,159));
        jPanel8.setLayout(new java.awt.GridLayout(2, 1));

        jPanel9.setBackground(new java.awt.Color(49,47,159));
        jPanel9.setLayout(new java.awt.BorderLayout());

        txtPuntos2.setFont(new java.awt.Font("Droid Sans", 1, 200)); // NOI18N
        txtPuntos2.setForeground(new java.awt.Color(254, 254, 254));
        txtPuntos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPuntos2.setText("0");
        jPanel9.add(txtPuntos2, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Droid Sans", 1, 35)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PUNTOS");
        jPanel9.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        jPanel8.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(49,47,159));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        jPanel12.setBackground(new java.awt.Color(60, 226, 38));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 47, 159), 10));
        jPanel12.setLayout(new java.awt.BorderLayout());

        txtVentaja2.setFont(new java.awt.Font("Droid Sans", 1, 150)); // NOI18N
        txtVentaja2.setForeground(new java.awt.Color(1, 1, 1));
        txtVentaja2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVentaja2.setText("0");
        jPanel12.add(txtVentaja2, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Droid Sans", 1, 35)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 1, 1));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VENTAJAS");
        jPanel12.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        jPanel10.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(230, 17, 17));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 47, 159), 10));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Droid Sans", 1, 35)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 1, 1));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PENALIZACIONES");
        jPanel13.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        txtAdv2.setFont(new java.awt.Font("Droid Sans", 1, 150)); // NOI18N
        txtAdv2.setForeground(new java.awt.Color(1, 1, 1));
        txtAdv2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdv2.setText("0");
        jPanel13.add(txtAdv2, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel13);

        jPanel8.add(jPanel10);

        jPanel1.add(jPanel8);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);*/
        
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtCrono = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        txtAdv1 = new javax.swing.JLabel();
        ADVERTENCIAS = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtVentaja1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        txtPuntos1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        txtPuntos2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        txtAdv2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtVentaja2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        jPanel3.setBackground(new java.awt.Color(1, 1, 1));
        jPanel3.setLayout(new java.awt.BorderLayout());

        txtCrono.setFont(new java.awt.Font("Ubuntu", 1, 250)); // NOI18N
        txtCrono.setForeground(new java.awt.Color(254, 254, 254));
        txtCrono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCrono.setText("05:00");
        jPanel3.add(txtCrono, java.awt.BorderLayout.CENTER);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("GB only bn .png"))); // NOI18N
        jPanel3.add(jLabel18, java.awt.BorderLayout.LINE_START);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("logo solo BR (ByN).png"))); // NOI18N
        jPanel3.add(jLabel19, java.awt.BorderLayout.LINE_END);

        jPanel1.add(jPanel3);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        jPanel7.setBackground(new java.awt.Color(254, 254, 254));
        jPanel7.setForeground(new java.awt.Color(1, 1, 1));
        jPanel7.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOMBRE");
        jPanel7.add(jLabel1);

        jPanel5.add(jPanel7);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridLayout(1, 0));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 55)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOMBRE");
        jPanel6.add(jLabel2);

        jPanel5.add(jPanel6);

        jPanel2.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel8.setBackground(new java.awt.Color(254, 254, 254));
        jPanel8.setLayout(new java.awt.GridLayout(0, 2));

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridLayout(2, 0));

        jPanel11.setBackground(new java.awt.Color(255, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel11.setOpaque(false);
        jPanel11.setLayout(new java.awt.BorderLayout());

        txtAdv1.setBackground(new java.awt.Color(255, 0, 18));
        txtAdv1.setFont(new java.awt.Font("Ubuntu", 1, 150)); // NOI18N
        txtAdv1.setForeground(new java.awt.Color(255, 0, 0));
        txtAdv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdv1.setText("0");
        jPanel11.add(txtAdv1, java.awt.BorderLayout.CENTER);

        ADVERTENCIAS.setBackground(new java.awt.Color(255, 0, 18));
        ADVERTENCIAS.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        ADVERTENCIAS.setForeground(new java.awt.Color(255, 0, 0));
        ADVERTENCIAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ADVERTENCIAS.setText("PENALIDADES");
        jPanel11.add(ADVERTENCIAS, java.awt.BorderLayout.PAGE_END);

        jPanel9.add(jPanel11);

        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel12.setForeground(new java.awt.Color(1, 1, 1));
        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout());

        txtVentaja1.setFont(new java.awt.Font("Ubuntu", 1, 150)); // NOI18N
        txtVentaja1.setForeground(new java.awt.Color(7, 0, 255));
        txtVentaja1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVentaja1.setText("0");
        jPanel12.add(txtVentaja1, java.awt.BorderLayout.CENTER);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(7, 0, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VENTAJAS");
        jPanel12.add(jLabel3, java.awt.BorderLayout.PAGE_END);

        jPanel9.add(jPanel12);

        jPanel8.add(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createEmptyBorder(35, 35, 35, 35));
        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        txtPuntos1.setFont(new java.awt.Font("Ubuntu", 1, 250)); // NOI18N
        txtPuntos1.setForeground(new java.awt.Color(1, 1, 1));
        txtPuntos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPuntos1.setText("0");
        jPanel10.add(txtPuntos1, java.awt.BorderLayout.CENTER);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PUNTOS");
        jPanel10.add(jLabel6, java.awt.BorderLayout.PAGE_END);

        jPanel8.add(jPanel10);

        jPanel4.add(jPanel8);

        jPanel18.setBackground(new java.awt.Color(254, 254, 254));
        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.GridLayout(0, 2));

        jPanel22.setBorder(javax.swing.BorderFactory.createEmptyBorder(35, 35, 35, 35));
        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.BorderLayout());

        txtPuntos2.setFont(new java.awt.Font("Ubuntu", 1, 250)); // NOI18N
        txtPuntos2.setForeground(new java.awt.Color(1, 1, 1));
        txtPuntos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPuntos2.setText("0");
        jPanel22.add(txtPuntos2, java.awt.BorderLayout.CENTER);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PUNTOS");
        jPanel22.add(jLabel7, java.awt.BorderLayout.PAGE_END);

        jPanel18.add(jPanel22);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.GridLayout(2, 0));

        jPanel20.setBackground(new java.awt.Color(255, 0, 0));
        jPanel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());

        txtAdv2.setBackground(new java.awt.Color(255, 0, 18));
        txtAdv2.setFont(new java.awt.Font("Ubuntu", 1, 150)); // NOI18N
        txtAdv2.setForeground(new java.awt.Color(255, 0, 0));
        txtAdv2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtAdv2.setText("0");
        jPanel20.add(txtAdv2, java.awt.BorderLayout.CENTER);

        jLabel5.setBackground(new java.awt.Color(255, 0, 18));
        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PENALIDADES");
        jPanel20.add(jLabel5, java.awt.BorderLayout.PAGE_END);

        jPanel19.add(jPanel20);

        jPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        jPanel21.setForeground(new java.awt.Color(1, 1, 1));
        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.BorderLayout());

        txtVentaja2.setFont(new java.awt.Font("Ubuntu", 1, 150)); // NOI18N
        txtVentaja2.setForeground(new java.awt.Color(7, 0, 255));
        txtVentaja2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtVentaja2.setText("0");
        jPanel21.add(txtVentaja2, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(7, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VENTAJAS");
        jPanel21.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        jPanel19.add(jPanel21);

        jPanel18.add(jPanel19);

        jPanel4.add(jPanel18);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1);

        background.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("back.png"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(background);

        pack();

        
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);        

        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        va = new vP();
        va.setVisible(true);
        
       
      //Bjj c = new Bjj();
       
       
    }
    
    public void cambiar(int a, int b, int c){
        
    if(c == 0){
        
        if(a == 0){
            switch (b) {
                case 0:
                    p1++;
                    break;
                case 1:
                    a1++;
                    break;
                default:
                    v1++;
                    break;
            }
            
        }else{
            
            switch (b) {
                case 0:
                    p1--;
                    break;
                case 1:
                    a1--;
                    break;
                default:
                    v1--;
                    break;
            }
            
        }
    }else{
        
        if(a == 0){
            switch (b) {
                case 0:
                    p2++;
                    break;
                case 1:
                    a2++;
                    break;
                default:
                    v2++;
                    break;
            }
            
        }else{
            
            switch (b) {
                case 0:
                    p2--;
                    break;
                case 1:
                    a2--;
                    break;
                default:
                    v2--;
                    break;
            }
            
        }
        
    }
    
    if(p1 < 0) p1=0;
    if(a1 < 0) a1=0;
    if(v1 < 0) v1=0;
    if(p2 < 0) p2=0;
    if(a2 < 0) a2=0;
    if(v2 < 0) v2=0;
    
        txtPuntos1.setText(p1.toString());
        txtVentaja1.setText(v1.toString());
        txtAdv1.setText(a1.toString());
        txtPuntos2.setText(p2.toString());
        txtVentaja2.setText(v2.toString());
        txtAdv2.setText(a2.toString());
        
        
    }
    
    public void nombres(String a, String b){
        
        jLabel1.setText(a);
        jLabel2.setText(b);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
