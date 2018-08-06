/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocomoJava;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author shriraksharao
 */
public class EAFDefault_Maintenance extends javax.swing.JFrame {
    
        public static double[] rely  = {1.00, 1.23, 1.10, 0.99, 1.07};
        public static double[] data  = {1.00, 0.90, 1.14, 1.28};
        public static double[] docu  = {1.00, 0.81, 0.91, 1.11, 1.23};
        public static double[] cplx  = {1.00, 0.73, 0.87, 1.17, 1.34, 1.74};
        public static double[] ruse  = {1.00, 1.00, 1.00, 1.00, 1.00};
        public static double[] time  = {1.00, 1.11, 1.29, 1.63};
        public static double[] stor  = {1.00, 1.05, 1.17, 1.46};
        public static double[] pvol  = {1.00, 0.87, 1.15, 1.30};
        public static double[] acap  = {1.00, 1.42, 1.19, 0.85, 0.71};
        public static double[] pcap  = {1.00, 1.34, 1.15, 0.88, 0.76};
        public static double[] pcon  = {1.00, 1.29, 1.12, 0.90, 0.81};
        public static double[] apex  = {1.00, 1.22, 1.10, 0.88, 0.81};
        public static double[] ltex  = {1.00, 1.20, 1.09, 0.91, 0.84};
        public static double[] plex  = {1.00, 1.19, 1.09, 0.91, 0.85};
        public static double[] tool  = {1.00, 1.17, 1.09, 0.90, 0.78};
        public static double[] site  = {1.00, 1.22, 1.09, 0.93, 0.86, 0.80};
        
    
        private final double[] defRely  = {1.00, 1.23, 1.10, 0.99, 1.07};
        private final double[] defData  = {1.00, 0.90, 1.14, 1.28};
        private final double[] defDocu  = {1.00, 0.81, 0.91, 1.11, 1.23};
        private final double[] defCplx  = {1.00, 0.73, 0.87, 1.17, 1.34, 1.74};
        private final double[] defRuse  = {1.00, 0.95, 1.07, 1.15, 1.24};
        private final double[] defTime  = {1.00, 1.11, 1.29, 1.63};
        private final double[] defStor  = {1.00, 1.05, 1.17, 1.46};
        private final double[] defPvol  = {1.00, 0.87, 1.15, 1.30};
        private final double[] defAcap  = {1.00, 1.42, 1.19, 0.85, 0.71};
        private final double[] defPcap  = {1.00, 1.34, 1.15, 0.88, 0.76};
        private final double[] defPcon  = {1.00, 1.29, 1.12, 0.90, 0.81};
        private final double[] defApex  = {1.00, 1.22, 1.10, 0.88, 0.81};
        private final double[] defLtex  = {1.00, 1.20, 1.09, 0.91, 0.84};
        private final double[] defPlex  = {1.00, 1.19, 1.09, 0.91, 0.85};
        private final double[] defTool  = {1.00, 1.17, 1.09, 0.90, 0.78};
        private final double[] defSite  = {1.00, 1.22, 1.09, 0.93, 0.86, 0.80};

    /**
     * Creates new form EAFDefault
     */
    public EAFDefault_Maintenance() {
        initComponents();
        this.setTitle("EAF Maintenance Default Values");
        this.getContentPane().setBackground(Color.white);
        
        relyN.setText(String.valueOf(rely[0]));
        relyVL.setText(String.valueOf(rely[1]));
        relyL.setText(String.valueOf(rely[2]));
        relyH.setText(String.valueOf(rely[3]));
        relyVH.setText(String.valueOf(rely[4]));
        
        dataN.setText(String.valueOf(data[0]));
        dataL.setText(String.valueOf(data[1]));
        dataH.setText(String.valueOf(data[2]));
        dataVH.setText(String.valueOf(data[3]));
        
        docuN.setText(String.valueOf(docu[0]));
        docuVL.setText(String.valueOf(docu[1]));
        docuL.setText(String.valueOf(docu[2]));
        docuH.setText(String.valueOf(docu[3]));
        docuVH.setText(String.valueOf(docu[4]));
        
        cplxN.setText(String.valueOf(cplx[0]));
        cplxVL.setText(String.valueOf(cplx[1]));
        cplxL.setText(String.valueOf(cplx[2]));
        cplxH.setText(String.valueOf(cplx[3]));
        cplxVH.setText(String.valueOf(cplx[4]));
        cplxEXH.setText(String.valueOf(cplx[5]));
        
        ruseN.setText(String.valueOf(ruse[0]));
        
        timeN.setText(String.valueOf(time[0]));
        timeH.setText(String.valueOf(time[1]));
        timeVH.setText(String.valueOf(time[2]));
        timeEXH.setText(String.valueOf(time[3]));
        
        storN.setText(String.valueOf(stor[0]));
        storH.setText(String.valueOf(stor[1]));
        storVH.setText(String.valueOf(stor[2]));
        storEXH.setText(String.valueOf(stor[3]));
        
        pvolN.setText(String.valueOf(pvol[0]));
        pvolL.setText(String.valueOf(pvol[1]));
        pvolH.setText(String.valueOf(pvol[2]));
        pvolVH.setText(String.valueOf(pvol[3]));
        
        acapN.setText(String.valueOf(acap[0]));
        acapVL.setText(String.valueOf(acap[1]));
        acapL.setText(String.valueOf(acap[2]));
        acapH.setText(String.valueOf(acap[3]));
        acapVH.setText(String.valueOf(acap[4]));
        
        pcapN.setText(String.valueOf(pcap[0]));
        pcapVL.setText(String.valueOf(pcap[1]));
        pcapL.setText(String.valueOf(pcap[2]));
        pcapH.setText(String.valueOf(pcap[3]));
        pcapVH.setText(String.valueOf(pcap[4]));
        
        pconN.setText(String.valueOf(pcon[0]));
        pconVL.setText(String.valueOf(pcon[1]));
        pconL.setText(String.valueOf(pcon[2]));
        pconH.setText(String.valueOf(pcon[3]));
        pconVH.setText(String.valueOf(pcon[4]));
        
        apexN.setText(String.valueOf(apex[0]));
        apexVL.setText(String.valueOf(apex[1]));
        apexL.setText(String.valueOf(apex[2]));        
        apexH.setText(String.valueOf(apex[3]));
        apexVH.setText(String.valueOf(apex[4]));
        
        ltexN.setText(String.valueOf(ltex[0]));
        ltexVL.setText(String.valueOf(ltex[1]));
        ltexL.setText(String.valueOf(ltex[2]));
        ltexH.setText(String.valueOf(ltex[3]));
        ltexVH.setText(String.valueOf(ltex[4]));
        
        plexN.setText(String.valueOf(plex[0]));
        plexVL.setText(String.valueOf(plex[1]));
        plexL.setText(String.valueOf(plex[2]));
        plexH.setText(String.valueOf(plex[3]));
        plexVH.setText(String.valueOf(plex[4]));
        
        toolN.setText(String.valueOf(tool[0]));
        toolVL.setText(String.valueOf(tool[1]));
        toolL.setText(String.valueOf(tool[2]));        
        toolH.setText(String.valueOf(tool[3]));
        toolVH.setText(String.valueOf(tool[4]));
        
        siteN.setText(String.valueOf(site[0]));
        siteVL.setText(String.valueOf(site[1]));
        siteL.setText(String.valueOf(site[2]));        
        siteH.setText(String.valueOf(site[3]));
        siteVH.setText(String.valueOf(site[4]));
        siteEXH.setText(String.valueOf(site[5]));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jok = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        relyH = new javax.swing.JTextField();
        relyVH = new javax.swing.JTextField();
        relyVL = new javax.swing.JTextField();
        relyL = new javax.swing.JTextField();
        relyN = new javax.swing.JTextField();
        dataH = new javax.swing.JTextField();
        dataVH = new javax.swing.JTextField();
        dataL = new javax.swing.JTextField();
        dataN = new javax.swing.JTextField();
        docuH = new javax.swing.JTextField();
        docuVH = new javax.swing.JTextField();
        docuVL = new javax.swing.JTextField();
        docuL = new javax.swing.JTextField();
        docuN = new javax.swing.JTextField();
        cplxH = new javax.swing.JTextField();
        cplxVH = new javax.swing.JTextField();
        cplxVL = new javax.swing.JTextField();
        cplxL = new javax.swing.JTextField();
        cplxN = new javax.swing.JTextField();
        ruseN = new javax.swing.JTextField();
        timeH = new javax.swing.JTextField();
        timeVH = new javax.swing.JTextField();
        timeEXH = new javax.swing.JTextField();
        timeN = new javax.swing.JTextField();
        storN = new javax.swing.JTextField();
        storH = new javax.swing.JTextField();
        storVH = new javax.swing.JTextField();
        pvolL = new javax.swing.JTextField();
        pvolN = new javax.swing.JTextField();
        pvolH = new javax.swing.JTextField();
        pvolVH = new javax.swing.JTextField();
        acapVL = new javax.swing.JTextField();
        acapL = new javax.swing.JTextField();
        acapN = new javax.swing.JTextField();
        acapH = new javax.swing.JTextField();
        acapVH = new javax.swing.JTextField();
        pcapVL = new javax.swing.JTextField();
        pcapL = new javax.swing.JTextField();
        pcapVH = new javax.swing.JTextField();
        pcapN = new javax.swing.JTextField();
        pcapH = new javax.swing.JTextField();
        pconVL = new javax.swing.JTextField();
        pconL = new javax.swing.JTextField();
        pconVH = new javax.swing.JTextField();
        pconN = new javax.swing.JTextField();
        pconH = new javax.swing.JTextField();
        apexVL = new javax.swing.JTextField();
        apexL = new javax.swing.JTextField();
        apexVH = new javax.swing.JTextField();
        apexN = new javax.swing.JTextField();
        apexH = new javax.swing.JTextField();
        ltexVL = new javax.swing.JTextField();
        ltexL = new javax.swing.JTextField();
        ltexVH = new javax.swing.JTextField();
        ltexN = new javax.swing.JTextField();
        ltexH = new javax.swing.JTextField();
        plexVL = new javax.swing.JTextField();
        plexL = new javax.swing.JTextField();
        plexVH = new javax.swing.JTextField();
        plexN = new javax.swing.JTextField();
        plexH = new javax.swing.JTextField();
        toolVL = new javax.swing.JTextField();
        toolL = new javax.swing.JTextField();
        toolVH = new javax.swing.JTextField();
        toolN = new javax.swing.JTextField();
        toolH = new javax.swing.JTextField();
        siteVL = new javax.swing.JTextField();
        siteL = new javax.swing.JTextField();
        siteVH = new javax.swing.JTextField();
        siteN = new javax.swing.JTextField();
        siteH = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cplxEXH = new javax.swing.JTextField();
        storEXH = new javax.swing.JTextField();
        siteEXH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EAF Default Maintenance Value");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("NOM");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("VLOW");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("LOW");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("VHIGH");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("HIGH");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setText("RELY");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setText("DATA");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setText("DOCU");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setText("CPLX");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("RUSE");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setText("TIME");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setText("STOR");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel13.setText("PVOL");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel14.setText("PCAP");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel15.setText("PCON");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel16.setText("APEX");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel17.setText("LTEX");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel18.setText("ACAP");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel19.setText("PLEX");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel20.setText("TOOL");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel21.setText("SITE");

        jok.setBackground(new java.awt.Color(102, 204, 255));
        jok.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jok.setText("OK");
        jok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jokActionPerformed(evt);
            }
        });

        jreset.setBackground(new java.awt.Color(102, 204, 255));
        jreset.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jreset.setText("RESET");
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });

        relyH.setBackground(new java.awt.Color(204, 204, 204));
        relyH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relyH.setText("0.99");
        relyH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relyHActionPerformed(evt);
            }
        });

        relyVH.setBackground(new java.awt.Color(204, 204, 204));
        relyVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relyVH.setText("1.07");
        relyVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relyVHActionPerformed(evt);
            }
        });

        relyVL.setBackground(new java.awt.Color(204, 204, 204));
        relyVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relyVL.setText("1.23");
        relyVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relyVLActionPerformed(evt);
            }
        });

        relyL.setBackground(new java.awt.Color(204, 204, 204));
        relyL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relyL.setText("1.10");
        relyL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relyLActionPerformed(evt);
            }
        });

        relyN.setBackground(new java.awt.Color(204, 204, 204));
        relyN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        relyN.setText("1.00");
        relyN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relyNActionPerformed(evt);
            }
        });

        dataH.setBackground(new java.awt.Color(204, 204, 204));
        dataH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        dataH.setText("1.00");
        dataH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataHActionPerformed(evt);
            }
        });

        dataVH.setBackground(new java.awt.Color(204, 204, 204));
        dataVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        dataVH.setText("1.00");
        dataVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVHActionPerformed(evt);
            }
        });

        dataL.setBackground(new java.awt.Color(204, 204, 204));
        dataL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        dataL.setText("1.14");
        dataL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataLActionPerformed(evt);
            }
        });

        dataN.setBackground(new java.awt.Color(204, 204, 204));
        dataN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        dataN.setText("1.00");
        dataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataNActionPerformed(evt);
            }
        });

        docuH.setBackground(new java.awt.Color(204, 204, 204));
        docuH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        docuH.setText("1.00");
        docuH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docuHActionPerformed(evt);
            }
        });

        docuVH.setBackground(new java.awt.Color(204, 204, 204));
        docuVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        docuVH.setText("1.00");
        docuVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docuVHActionPerformed(evt);
            }
        });

        docuVL.setBackground(new java.awt.Color(204, 204, 204));
        docuVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        docuVL.setText("1.43");
        docuVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docuVLActionPerformed(evt);
            }
        });

        docuL.setBackground(new java.awt.Color(204, 204, 204));
        docuL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        docuL.setText("1.14");
        docuL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docuLActionPerformed(evt);
            }
        });

        docuN.setBackground(new java.awt.Color(204, 204, 204));
        docuN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        docuN.setText("1.00");
        docuN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docuNActionPerformed(evt);
            }
        });

        cplxH.setBackground(new java.awt.Color(204, 204, 204));
        cplxH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cplxH.setText("1.00");
        cplxH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cplxHActionPerformed(evt);
            }
        });

        cplxVH.setBackground(new java.awt.Color(204, 204, 204));
        cplxVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cplxVH.setText("1.00");
        cplxVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cplxVHActionPerformed(evt);
            }
        });

        cplxVL.setBackground(new java.awt.Color(204, 204, 204));
        cplxVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cplxVL.setText("1.43");
        cplxVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cplxVLActionPerformed(evt);
            }
        });

        cplxL.setBackground(new java.awt.Color(204, 204, 204));
        cplxL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cplxL.setText("1.14");
        cplxL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cplxLActionPerformed(evt);
            }
        });

        cplxN.setBackground(new java.awt.Color(204, 204, 204));
        cplxN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cplxN.setText("1.00");
        cplxN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cplxNActionPerformed(evt);
            }
        });

        ruseN.setBackground(new java.awt.Color(204, 204, 204));
        ruseN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ruseN.setText("1.00");
        ruseN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruseNActionPerformed(evt);
            }
        });

        timeH.setBackground(new java.awt.Color(204, 204, 204));
        timeH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        timeH.setText("1.00");
        timeH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeHActionPerformed(evt);
            }
        });

        timeVH.setBackground(new java.awt.Color(204, 204, 204));
        timeVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        timeVH.setText("1.00");
        timeVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeVHActionPerformed(evt);
            }
        });

        timeEXH.setBackground(new java.awt.Color(204, 204, 204));
        timeEXH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        timeEXH.setText("1.14");
        timeEXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeEXHActionPerformed(evt);
            }
        });

        timeN.setBackground(new java.awt.Color(204, 204, 204));
        timeN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        timeN.setText("1.00");
        timeN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeNActionPerformed(evt);
            }
        });

        storN.setBackground(new java.awt.Color(204, 204, 204));
        storN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        storN.setText("1.00");
        storN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storNActionPerformed(evt);
            }
        });

        storH.setBackground(new java.awt.Color(204, 204, 204));
        storH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        storH.setText("1.00");
        storH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storHActionPerformed(evt);
            }
        });

        storVH.setBackground(new java.awt.Color(204, 204, 204));
        storVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        storVH.setText("1.00");
        storVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storVHActionPerformed(evt);
            }
        });

        pvolL.setBackground(new java.awt.Color(204, 204, 204));
        pvolL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pvolL.setText("1.14");
        pvolL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvolLActionPerformed(evt);
            }
        });

        pvolN.setBackground(new java.awt.Color(204, 204, 204));
        pvolN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pvolN.setText("1.00");
        pvolN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvolNActionPerformed(evt);
            }
        });

        pvolH.setBackground(new java.awt.Color(204, 204, 204));
        pvolH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pvolH.setText("1.00");
        pvolH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvolHActionPerformed(evt);
            }
        });

        pvolVH.setBackground(new java.awt.Color(204, 204, 204));
        pvolVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pvolVH.setText("1.00");
        pvolVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pvolVHActionPerformed(evt);
            }
        });

        acapVL.setBackground(new java.awt.Color(204, 204, 204));
        acapVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        acapVL.setText("1.43");
        acapVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acapVLActionPerformed(evt);
            }
        });

        acapL.setBackground(new java.awt.Color(204, 204, 204));
        acapL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        acapL.setText("1.14");
        acapL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acapLActionPerformed(evt);
            }
        });

        acapN.setBackground(new java.awt.Color(204, 204, 204));
        acapN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        acapN.setText("1.00");
        acapN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acapNActionPerformed(evt);
            }
        });

        acapH.setBackground(new java.awt.Color(204, 204, 204));
        acapH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        acapH.setText("1.00");
        acapH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acapHActionPerformed(evt);
            }
        });

        acapVH.setBackground(new java.awt.Color(204, 204, 204));
        acapVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        acapVH.setText("1.00");
        acapVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acapVHActionPerformed(evt);
            }
        });

        pcapVL.setBackground(new java.awt.Color(204, 204, 204));
        pcapVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pcapVL.setText("1.43");
        pcapVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcapVLActionPerformed(evt);
            }
        });

        pcapL.setBackground(new java.awt.Color(204, 204, 204));
        pcapL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pcapL.setText("1.14");
        pcapL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcapLActionPerformed(evt);
            }
        });

        pcapVH.setBackground(new java.awt.Color(204, 204, 204));
        pcapVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pcapVH.setText("1.00");
        pcapVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcapVHActionPerformed(evt);
            }
        });

        pcapN.setBackground(new java.awt.Color(204, 204, 204));
        pcapN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pcapN.setText("1.00");
        pcapN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcapNActionPerformed(evt);
            }
        });

        pcapH.setBackground(new java.awt.Color(204, 204, 204));
        pcapH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pcapH.setText("1.00");
        pcapH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcapHActionPerformed(evt);
            }
        });

        pconVL.setBackground(new java.awt.Color(204, 204, 204));
        pconVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pconVL.setText("1.43");
        pconVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconVLActionPerformed(evt);
            }
        });

        pconL.setBackground(new java.awt.Color(204, 204, 204));
        pconL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pconL.setText("1.14");
        pconL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconLActionPerformed(evt);
            }
        });

        pconVH.setBackground(new java.awt.Color(204, 204, 204));
        pconVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pconVH.setText("1.00");
        pconVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconVHActionPerformed(evt);
            }
        });

        pconN.setBackground(new java.awt.Color(204, 204, 204));
        pconN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pconN.setText("1.00");
        pconN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconNActionPerformed(evt);
            }
        });

        pconH.setBackground(new java.awt.Color(204, 204, 204));
        pconH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pconH.setText("1.00");
        pconH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pconHActionPerformed(evt);
            }
        });

        apexVL.setBackground(new java.awt.Color(204, 204, 204));
        apexVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        apexVL.setText("1.43");
        apexVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apexVLActionPerformed(evt);
            }
        });

        apexL.setBackground(new java.awt.Color(204, 204, 204));
        apexL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        apexL.setText("1.14");
        apexL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apexLActionPerformed(evt);
            }
        });

        apexVH.setBackground(new java.awt.Color(204, 204, 204));
        apexVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        apexVH.setText("1.00");
        apexVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apexVHActionPerformed(evt);
            }
        });

        apexN.setBackground(new java.awt.Color(204, 204, 204));
        apexN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        apexN.setText("1.00");
        apexN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apexNActionPerformed(evt);
            }
        });

        apexH.setBackground(new java.awt.Color(204, 204, 204));
        apexH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        apexH.setText("1.00");
        apexH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apexHActionPerformed(evt);
            }
        });

        ltexVL.setBackground(new java.awt.Color(204, 204, 204));
        ltexVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ltexVL.setText("1.43");
        ltexVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltexVLActionPerformed(evt);
            }
        });

        ltexL.setBackground(new java.awt.Color(204, 204, 204));
        ltexL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ltexL.setText("1.14");
        ltexL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltexLActionPerformed(evt);
            }
        });

        ltexVH.setBackground(new java.awt.Color(204, 204, 204));
        ltexVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ltexVH.setText("1.00");
        ltexVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltexVHActionPerformed(evt);
            }
        });

        ltexN.setBackground(new java.awt.Color(204, 204, 204));
        ltexN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ltexN.setText("1.00");
        ltexN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltexNActionPerformed(evt);
            }
        });

        ltexH.setBackground(new java.awt.Color(204, 204, 204));
        ltexH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ltexH.setText("1.00");
        ltexH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ltexHActionPerformed(evt);
            }
        });

        plexVL.setBackground(new java.awt.Color(204, 204, 204));
        plexVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        plexVL.setText("1.43");
        plexVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plexVLActionPerformed(evt);
            }
        });

        plexL.setBackground(new java.awt.Color(204, 204, 204));
        plexL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        plexL.setText("1.14");
        plexL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plexLActionPerformed(evt);
            }
        });

        plexVH.setBackground(new java.awt.Color(204, 204, 204));
        plexVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        plexVH.setText("1.00");
        plexVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plexVHActionPerformed(evt);
            }
        });

        plexN.setBackground(new java.awt.Color(204, 204, 204));
        plexN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        plexN.setText("1.00");
        plexN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plexNActionPerformed(evt);
            }
        });

        plexH.setBackground(new java.awt.Color(204, 204, 204));
        plexH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        plexH.setText("1.00");
        plexH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plexHActionPerformed(evt);
            }
        });

        toolVL.setBackground(new java.awt.Color(204, 204, 204));
        toolVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        toolVL.setText("1.43");
        toolVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolVLActionPerformed(evt);
            }
        });

        toolL.setBackground(new java.awt.Color(204, 204, 204));
        toolL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        toolL.setText("1.14");
        toolL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolLActionPerformed(evt);
            }
        });

        toolVH.setBackground(new java.awt.Color(204, 204, 204));
        toolVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        toolVH.setText("1.00");
        toolVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolVHActionPerformed(evt);
            }
        });

        toolN.setBackground(new java.awt.Color(204, 204, 204));
        toolN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        toolN.setText("1.00");
        toolN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolNActionPerformed(evt);
            }
        });

        toolH.setBackground(new java.awt.Color(204, 204, 204));
        toolH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        toolH.setText("1.00");
        toolH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolHActionPerformed(evt);
            }
        });

        siteVL.setBackground(new java.awt.Color(204, 204, 204));
        siteVL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        siteVL.setText("1.43");
        siteVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteVLActionPerformed(evt);
            }
        });

        siteL.setBackground(new java.awt.Color(204, 204, 204));
        siteL.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        siteL.setText("1.14");
        siteL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteLActionPerformed(evt);
            }
        });

        siteVH.setBackground(new java.awt.Color(204, 204, 204));
        siteVH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        siteVH.setText("1.00");
        siteVH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteVHActionPerformed(evt);
            }
        });

        siteN.setBackground(new java.awt.Color(204, 204, 204));
        siteN.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        siteN.setText("1.00");
        siteN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteNActionPerformed(evt);
            }
        });

        siteH.setBackground(new java.awt.Color(204, 204, 204));
        siteH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        siteH.setText("1.00");
        siteH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteHActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel22.setText("EXHIGH");

        cplxEXH.setBackground(new java.awt.Color(204, 204, 204));
        cplxEXH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        cplxEXH.setText("1.00");
        cplxEXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cplxEXHActionPerformed(evt);
            }
        });

        storEXH.setBackground(new java.awt.Color(204, 204, 204));
        storEXH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        storEXH.setText("1.14");
        storEXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storEXHActionPerformed(evt);
            }
        });

        siteEXH.setBackground(new java.awt.Color(204, 204, 204));
        siteEXH.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        siteEXH.setText("1.00");
        siteEXH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteEXHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jreset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jok)
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(timeN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(timeH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timeVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cplxEXH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(timeEXH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storEXH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addComponent(pvolL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(pvolN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(pvolH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pvolVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(storN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(storH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(storVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(acapVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(acapL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(acapN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(acapH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(acapVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(pcapVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pcapL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(pcapN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(pcapH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pcapVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(pconVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(pconL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(pconN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(pconH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pconVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(apexVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(apexL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(apexN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(apexH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(apexVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(ltexVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ltexL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(ltexN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(ltexH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(ltexVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(plexVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(plexL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(plexN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(plexH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(plexVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(toolVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(toolL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(toolN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(toolH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(toolVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(siteVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(siteL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(siteN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(siteH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(siteVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(relyVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(relyL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(relyN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(relyH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(relyVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(127, 127, 127)
                                    .addComponent(ruseN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(dataL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dataN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(docuVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(docuL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(docuN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(docuH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(docuVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cplxVL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cplxL, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cplxN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cplxH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cplxVH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(siteEXH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(relyVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relyL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relyN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relyH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(relyVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dataVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docuVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docuL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docuN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docuH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docuVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cplxVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cplxL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cplxN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cplxH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cplxVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cplxEXH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ruseN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(timeEXH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timeVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(storN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(storVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(storEXH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pvolL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pvolN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pvolH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pvolVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(6, 6, 6)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acapVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acapL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acapN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acapH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acapVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcapVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcapL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcapN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcapH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcapVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pconVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pconL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pconN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pconH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pconVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apexVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apexL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apexN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apexH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apexVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ltexVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltexL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltexN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltexH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ltexVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plexVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plexL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plexN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plexH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plexVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toolVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siteVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(siteVH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(siteEXH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jreset)
                    .addComponent(jok))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jokActionPerformed
        // TODO add your handling code here:
        boolean legal = true;
        
        legal &= validateDouble(relyVL.getText());
        legal &= validateDouble(relyL.getText());
        legal &= validateDouble(relyN.getText());
        legal &= validateDouble(relyH.getText());
        legal &= validateDouble(relyVH.getText());
        
        legal &= validateDouble(dataL.getText());
        legal &= validateDouble(dataN.getText());
        legal &= validateDouble(dataH.getText());
        legal &= validateDouble(dataVH.getText());
        
        legal &= validateDouble(docuVL.getText());
        legal &= validateDouble(docuL.getText());
        legal &= validateDouble(docuN.getText());
        legal &= validateDouble(docuH.getText());
        legal &= validateDouble(docuVH.getText());
        
        legal &= validateDouble(cplxVL.getText());
        legal &= validateDouble(cplxL.getText());
        legal &= validateDouble(cplxN.getText());
        legal &= validateDouble(cplxH.getText());
        legal &= validateDouble(cplxVH.getText());
        legal &= validateDouble(cplxEXH.getText());
        
        legal &= validateDouble(ruseN.getText());

        
        legal &= validateDouble(timeN.getText());
        legal &= validateDouble(timeH.getText());
        legal &= validateDouble(timeVH.getText());
        legal &= validateDouble(timeEXH.getText());
        
        legal &= validateDouble(storN.getText());
        legal &= validateDouble(storH.getText());
        legal &= validateDouble(storVH.getText());
        legal &= validateDouble(storEXH.getText());
        
        legal &= validateDouble(pvolL.getText());
        legal &= validateDouble(pvolN.getText());
        legal &= validateDouble(pvolH.getText());
        legal &= validateDouble(pvolVH.getText());
        
        legal &= validateDouble(acapVL.getText());
        legal &= validateDouble(acapL.getText());
        legal &= validateDouble(acapN.getText());
        legal &= validateDouble(acapH.getText());
        legal &= validateDouble(acapVH.getText());
        
        legal &= validateDouble(pcapVL.getText());
        legal &= validateDouble(pcapL.getText());
        legal &= validateDouble(pcapN.getText());
        legal &= validateDouble(pcapH.getText());
        legal &= validateDouble(pcapVH.getText());
        
        legal &= validateDouble(pconVL.getText());
        legal &= validateDouble(pconL.getText());
        legal &= validateDouble(pconN.getText());
        legal &= validateDouble(pconH.getText());
        legal &= validateDouble(pconVH.getText());
        
        legal &= validateDouble(apexVL.getText());
        legal &= validateDouble(apexL.getText());
        legal &= validateDouble(apexN.getText());
        legal &= validateDouble(apexH.getText());
        legal &= validateDouble(apexVH.getText());
        
        legal &= validateDouble(ltexVL.getText());
        legal &= validateDouble(ltexL.getText());
        legal &= validateDouble(ltexN.getText());
        legal &= validateDouble(ltexH.getText());
        legal &= validateDouble(ltexVH.getText());
        
        legal &= validateDouble(plexVL.getText());
        legal &= validateDouble(plexL.getText());
        legal &= validateDouble(plexN.getText());
        legal &= validateDouble(plexH.getText());
        legal &= validateDouble(plexVH.getText());
        
        legal &= validateDouble(toolVL.getText());
        legal &= validateDouble(toolL.getText());
        legal &= validateDouble(toolN.getText());
        legal &= validateDouble(toolH.getText());
        legal &= validateDouble(toolVH.getText());
        
        legal &= validateDouble(siteVL.getText());
        legal &= validateDouble(siteL.getText());
        legal &= validateDouble(siteN.getText());
        legal &= validateDouble(siteH.getText());
        legal &= validateDouble(siteVH.getText());
        legal &= validateDouble(siteEXH.getText());
        
        if(legal){
            changeEAFValues();
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(null, "Invalid Input", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jokActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
        // TODO add your handling code here:
        resetEAFValues();
    }//GEN-LAST:event_jresetActionPerformed

    private void relyHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relyHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relyHActionPerformed

    private void relyVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relyVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relyVHActionPerformed

    private void relyVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relyVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relyVLActionPerformed

    private void relyLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relyLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relyLActionPerformed

    private void relyNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relyNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relyNActionPerformed

    private void dataHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataHActionPerformed

    private void dataVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVHActionPerformed

    private void dataLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataLActionPerformed

    private void dataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNActionPerformed

    private void docuHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docuHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docuHActionPerformed

    private void docuVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docuVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docuVHActionPerformed

    private void docuVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docuVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docuVLActionPerformed

    private void docuLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docuLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docuLActionPerformed

    private void docuNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docuNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docuNActionPerformed

    private void cplxHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cplxHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cplxHActionPerformed

    private void cplxVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cplxVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cplxVHActionPerformed

    private void cplxVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cplxVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cplxVLActionPerformed

    private void cplxLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cplxLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cplxLActionPerformed

    private void cplxNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cplxNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cplxNActionPerformed

    private void ruseNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruseNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruseNActionPerformed

    private void timeHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeHActionPerformed

    private void timeVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeVHActionPerformed

    private void timeEXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeEXHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeEXHActionPerformed

    private void timeNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeNActionPerformed

    private void storNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storNActionPerformed

    private void storHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storHActionPerformed

    private void storVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storVHActionPerformed

    private void pvolLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvolLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvolLActionPerformed

    private void pvolNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvolNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvolNActionPerformed

    private void pvolHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvolHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvolHActionPerformed

    private void pvolVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pvolVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pvolVHActionPerformed

    private void acapVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acapVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acapVLActionPerformed

    private void acapLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acapLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acapLActionPerformed

    private void acapNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acapNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acapNActionPerformed

    private void acapHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acapHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acapHActionPerformed

    private void acapVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acapVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acapVHActionPerformed

    private void pcapVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcapVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcapVLActionPerformed

    private void pcapLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcapLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcapLActionPerformed

    private void pcapVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcapVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcapVHActionPerformed

    private void pcapNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcapNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcapNActionPerformed

    private void pcapHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcapHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcapHActionPerformed

    private void pconVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconVLActionPerformed

    private void pconLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconLActionPerformed

    private void pconVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconVHActionPerformed

    private void pconNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconNActionPerformed

    private void pconHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pconHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pconHActionPerformed

    private void apexVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apexVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apexVLActionPerformed

    private void apexLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apexLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apexLActionPerformed

    private void apexVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apexVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apexVHActionPerformed

    private void apexNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apexNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apexNActionPerformed

    private void apexHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apexHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apexHActionPerformed

    private void ltexVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltexVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltexVLActionPerformed

    private void ltexLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltexLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltexLActionPerformed

    private void ltexVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltexVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltexVHActionPerformed

    private void ltexNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltexNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltexNActionPerformed

    private void ltexHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ltexHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ltexHActionPerformed

    private void plexVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plexVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plexVLActionPerformed

    private void plexLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plexLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plexLActionPerformed

    private void plexVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plexVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plexVHActionPerformed

    private void plexNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plexNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plexNActionPerformed

    private void plexHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plexHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plexHActionPerformed

    private void toolVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolVLActionPerformed

    private void toolLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolLActionPerformed

    private void toolVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolVHActionPerformed

    private void toolNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolNActionPerformed

    private void toolHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toolHActionPerformed

    private void siteVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteVLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteVLActionPerformed

    private void siteLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteLActionPerformed

    private void siteVHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteVHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteVHActionPerformed

    private void siteNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteNActionPerformed

    private void siteHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteHActionPerformed

    private void cplxEXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cplxEXHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cplxEXHActionPerformed

    private void storEXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storEXHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storEXHActionPerformed

    private void siteEXHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteEXHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteEXHActionPerformed

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
            java.util.logging.Logger.getLogger(EAFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EAFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EAFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EAFDefault.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EAFDefault().setVisible(true);
            }
        });
    }
    
    private boolean validateDouble(String s){
            String ss = s.replace(" ","");
            if(ss.length()==0) return false;
            else return Pattern.matches("^(0\\.\\d*[1-9]\\d*)|([1-9]\\d*(\\.\\d+)?)$",
				ss);
        }
    
    private void changeEAFValues(){
        
        rely[0] = Double.valueOf(relyN.getText());
        rely[1] = Double.valueOf(relyVL.getText());
        rely[2] = Double.valueOf(relyL.getText());
        rely[3] = Double.valueOf(relyH.getText());
        rely[4] = Double.valueOf(relyVH.getText());
        
        data[0] = Double.valueOf(dataN.getText());
        data[1] = Double.valueOf(dataL.getText());
        data[2] = Double.valueOf(dataH.getText());
        data[3] = Double.valueOf(dataVH.getText());
        
        docu[0] = Double.valueOf(docuN.getText());
        docu[1] = Double.valueOf(docuVL.getText());
        docu[2] = Double.valueOf(docuL.getText());
        docu[3] = Double.valueOf(docuH.getText());
        docu[4] = Double.valueOf(docuVH.getText());
        
        cplx[0] = Double.valueOf(cplxN.getText());
        cplx[1] = Double.valueOf(cplxVL.getText());
        cplx[2] = Double.valueOf(cplxL.getText());
        cplx[3] = Double.valueOf(cplxH.getText());
        cplx[4] = Double.valueOf(cplxVH.getText());
        cplx[5] = Double.valueOf(cplxEXH.getText());
        
        ruse[0] = Double.valueOf(ruseN.getText());

        
        time[0] = Double.valueOf(timeN.getText());
        time[1] = Double.valueOf(timeH.getText());
        time[2] = Double.valueOf(timeVH.getText());
        time[3] = Double.valueOf(timeEXH.getText());
        
        stor[0] = Double.valueOf(storN.getText());
        stor[1] = Double.valueOf(storH.getText());
        stor[2] = Double.valueOf(storVH.getText());
        stor[3] = Double.valueOf(storEXH.getText());
        
        pvol[0] = Double.valueOf(pvolN.getText());
        pvol[1] = Double.valueOf(pvolL.getText());
        pvol[2] = Double.valueOf(pvolH.getText());
        pvol[3] = Double.valueOf(pvolVH.getText());
        
        acap[0] = Double.valueOf(acapN.getText());
        acap[1] = Double.valueOf(acapVL.getText());
        acap[2] = Double.valueOf(acapL.getText());        
        acap[3] = Double.valueOf(acapH.getText());
        acap[4] = Double.valueOf(acapVH.getText());
        
        pcap[0] = Double.valueOf(pcapN.getText());
        pcap[1] = Double.valueOf(pcapVL.getText());
        pcap[2] = Double.valueOf(pcapL.getText());        
        pcap[3] = Double.valueOf(pcapH.getText());
        pcap[4] = Double.valueOf(pcapVH.getText());
        
        pcon[0] = Double.valueOf(pconN.getText());
        pcon[1] = Double.valueOf(pconVL.getText());
        pcon[2] = Double.valueOf(pconL.getText());        
        pcon[3] = Double.valueOf(pconH.getText());
        pcon[4] = Double.valueOf(pconVH.getText());
        
        apex[0] = Double.valueOf(apexN.getText());
        apex[1] = Double.valueOf(apexVL.getText());
        apex[2] = Double.valueOf(apexL.getText());        
        apex[3] = Double.valueOf(apexH.getText());
        apex[4] = Double.valueOf(apexVH.getText());
        
        ltex[0] = Double.valueOf(ltexN.getText());
        ltex[1] = Double.valueOf(ltexVL.getText());
        ltex[2] = Double.valueOf(ltexL.getText());       
        ltex[3] = Double.valueOf(ltexH.getText());
        ltex[4] = Double.valueOf(ltexVH.getText());
        
        plex[0] = Double.valueOf(plexN.getText());
        plex[1] = Double.valueOf(plexVL.getText());
        plex[2] = Double.valueOf(plexL.getText());       
        plex[3] = Double.valueOf(plexH.getText());
        plex[4] = Double.valueOf(plexVH.getText());
        
        tool[0] = Double.valueOf(toolN.getText());
        tool[1] = Double.valueOf(toolVL.getText());
        tool[2] = Double.valueOf(toolL.getText());        
        tool[3] = Double.valueOf(toolH.getText());
        tool[4] = Double.valueOf(toolVH.getText());
        
        site[0] = Double.valueOf(siteN.getText());
        site[1] = Double.valueOf(siteVL.getText());
        site[2] = Double.valueOf(siteL.getText());        
        site[3] = Double.valueOf(siteH.getText());
        site[4] = Double.valueOf(siteVH.getText());
        site[5] = Double.valueOf(siteEXH.getText());
        
    }
    
    private void resetEAFValues(){
        for(int i = 0; i < 5; ++i) rely[i] = defRely[i];
        for(int i = 0; i < 4; ++i) data[i] = defData[i];
        for(int i = 0; i < 5; ++i) docu[i] = defDocu[i];
        for(int i = 0; i < 6; ++i) cplx[i] = defCplx[i];
        for(int i = 0; i < 5; ++i) ruse[i] = defRuse[i];
        for(int i = 0; i < 4; ++i) time[i] = defTime[i];
        for(int i = 0; i < 4; ++i) stor[i] = defStor[i];
        for(int i = 0; i < 4; ++i) pvol[i] = defPvol[i];
        for(int i = 0; i < 5; ++i) acap[i] = defAcap[i];
        for(int i = 0; i < 5; ++i) pcap[i] = defPcap[i];
        for(int i = 0; i < 5; ++i) pcon[i] = defPcon[i];
        for(int i = 0; i < 5; ++i) apex[i] = defApex[i];
        for(int i = 0; i < 5; ++i) ltex[i] = defLtex[i];
        for(int i = 0; i < 5; ++i) plex[i] = defPlex[i];
        for(int i = 0; i < 5; ++i) tool[i] = defTool[i];
        for(int i = 0; i < 6; ++i) site[i] = defSite[i];
        
        relyN.setText(String.valueOf(rely[0]));
        relyVL.setText(String.valueOf(rely[1]));
        relyL.setText(String.valueOf(rely[2]));
        relyH.setText(String.valueOf(rely[3]));
        relyVH.setText(String.valueOf(rely[4]));
        
        dataN.setText(String.valueOf(data[0]));
        dataL.setText(String.valueOf(data[1]));
        dataH.setText(String.valueOf(data[2]));
        dataVH.setText(String.valueOf(data[3]));
        
        docuN.setText(String.valueOf(docu[0]));
        docuVL.setText(String.valueOf(docu[1]));
        docuL.setText(String.valueOf(docu[2]));
        docuH.setText(String.valueOf(docu[3]));
        docuVH.setText(String.valueOf(docu[4]));
        
        cplxN.setText(String.valueOf(cplx[0]));
        cplxVL.setText(String.valueOf(cplx[1]));
        cplxL.setText(String.valueOf(cplx[2]));
        cplxH.setText(String.valueOf(cplx[3]));
        cplxVH.setText(String.valueOf(cplx[4]));
        cplxEXH.setText(String.valueOf(cplx[5]));
        
        ruseN.setText(String.valueOf(ruse[0]));
        
        timeN.setText(String.valueOf(time[0]));
        timeH.setText(String.valueOf(time[1]));
        timeVH.setText(String.valueOf(time[2]));
        timeEXH.setText(String.valueOf(time[3]));
        
        storN.setText(String.valueOf(stor[0]));
        storH.setText(String.valueOf(stor[1]));
        storVH.setText(String.valueOf(stor[2]));
        storEXH.setText(String.valueOf(stor[3]));
        
        pvolN.setText(String.valueOf(pvol[0]));
        pvolL.setText(String.valueOf(pvol[1]));
        pvolH.setText(String.valueOf(pvol[2]));
        pvolVH.setText(String.valueOf(pvol[3]));
        
        acapN.setText(String.valueOf(acap[0]));
        acapVL.setText(String.valueOf(acap[1]));
        acapL.setText(String.valueOf(acap[2]));
        acapH.setText(String.valueOf(acap[3]));
        acapVH.setText(String.valueOf(acap[4]));
        
        pcapN.setText(String.valueOf(pcap[0]));
        pcapVL.setText(String.valueOf(pcap[1]));
        pcapL.setText(String.valueOf(pcap[2]));
        pcapH.setText(String.valueOf(pcap[3]));
        pcapVH.setText(String.valueOf(pcap[4]));
        
        pconN.setText(String.valueOf(pcon[0]));
        pconVL.setText(String.valueOf(pcon[1]));
        pconL.setText(String.valueOf(pcon[2]));
        pconH.setText(String.valueOf(pcon[3]));
        pconVH.setText(String.valueOf(pcon[4]));
        
        apexN.setText(String.valueOf(apex[0]));
        apexVL.setText(String.valueOf(apex[1]));
        apexL.setText(String.valueOf(apex[2]));        
        apexH.setText(String.valueOf(apex[3]));
        apexVH.setText(String.valueOf(apex[4]));
        
        ltexN.setText(String.valueOf(ltex[0]));
        ltexVL.setText(String.valueOf(ltex[1]));
        ltexL.setText(String.valueOf(ltex[2]));
        ltexH.setText(String.valueOf(ltex[3]));
        ltexVH.setText(String.valueOf(ltex[4]));
        
        plexN.setText(String.valueOf(plex[0]));
        plexVL.setText(String.valueOf(plex[1]));
        plexL.setText(String.valueOf(plex[2]));
        plexH.setText(String.valueOf(plex[3]));
        plexVH.setText(String.valueOf(plex[4]));
        
        toolN.setText(String.valueOf(tool[0]));
        toolVL.setText(String.valueOf(tool[1]));
        toolL.setText(String.valueOf(tool[2]));        
        toolH.setText(String.valueOf(tool[3]));
        toolVH.setText(String.valueOf(tool[4]));
        
        siteN.setText(String.valueOf(site[0]));
        siteVL.setText(String.valueOf(site[1]));
        siteL.setText(String.valueOf(site[2]));        
        siteH.setText(String.valueOf(site[3]));
        siteVH.setText(String.valueOf(site[4]));
        siteEXH.setText(String.valueOf(site[5]));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acapH;
    private javax.swing.JTextField acapL;
    private javax.swing.JTextField acapN;
    private javax.swing.JTextField acapVH;
    private javax.swing.JTextField acapVL;
    private javax.swing.JTextField apexH;
    private javax.swing.JTextField apexL;
    private javax.swing.JTextField apexN;
    private javax.swing.JTextField apexVH;
    private javax.swing.JTextField apexVL;
    private javax.swing.JTextField cplxEXH;
    private javax.swing.JTextField cplxH;
    private javax.swing.JTextField cplxL;
    private javax.swing.JTextField cplxN;
    private javax.swing.JTextField cplxVH;
    private javax.swing.JTextField cplxVL;
    private javax.swing.JTextField dataH;
    private javax.swing.JTextField dataL;
    private javax.swing.JTextField dataN;
    private javax.swing.JTextField dataVH;
    private javax.swing.JTextField docuH;
    private javax.swing.JTextField docuL;
    private javax.swing.JTextField docuN;
    private javax.swing.JTextField docuVH;
    private javax.swing.JTextField docuVL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jok;
    private javax.swing.JButton jreset;
    private javax.swing.JTextField ltexH;
    private javax.swing.JTextField ltexL;
    private javax.swing.JTextField ltexN;
    private javax.swing.JTextField ltexVH;
    private javax.swing.JTextField ltexVL;
    private javax.swing.JTextField pcapH;
    private javax.swing.JTextField pcapL;
    private javax.swing.JTextField pcapN;
    private javax.swing.JTextField pcapVH;
    private javax.swing.JTextField pcapVL;
    private javax.swing.JTextField pconH;
    private javax.swing.JTextField pconL;
    private javax.swing.JTextField pconN;
    private javax.swing.JTextField pconVH;
    private javax.swing.JTextField pconVL;
    private javax.swing.JTextField plexH;
    private javax.swing.JTextField plexL;
    private javax.swing.JTextField plexN;
    private javax.swing.JTextField plexVH;
    private javax.swing.JTextField plexVL;
    private javax.swing.JTextField pvolH;
    private javax.swing.JTextField pvolL;
    private javax.swing.JTextField pvolN;
    private javax.swing.JTextField pvolVH;
    private javax.swing.JTextField relyH;
    private javax.swing.JTextField relyL;
    private javax.swing.JTextField relyN;
    private javax.swing.JTextField relyVH;
    private javax.swing.JTextField relyVL;
    private javax.swing.JTextField ruseN;
    private javax.swing.JTextField siteEXH;
    private javax.swing.JTextField siteH;
    private javax.swing.JTextField siteL;
    private javax.swing.JTextField siteN;
    private javax.swing.JTextField siteVH;
    private javax.swing.JTextField siteVL;
    private javax.swing.JTextField storEXH;
    private javax.swing.JTextField storH;
    private javax.swing.JTextField storN;
    private javax.swing.JTextField storVH;
    private javax.swing.JTextField timeEXH;
    private javax.swing.JTextField timeH;
    private javax.swing.JTextField timeN;
    private javax.swing.JTextField timeVH;
    private javax.swing.JTextField toolH;
    private javax.swing.JTextField toolL;
    private javax.swing.JTextField toolN;
    private javax.swing.JTextField toolVH;
    private javax.swing.JTextField toolVL;
    // End of variables declaration//GEN-END:variables
}
