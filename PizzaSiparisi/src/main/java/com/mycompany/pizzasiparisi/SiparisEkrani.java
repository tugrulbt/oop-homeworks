package com.mycompany.pizzasiparisi;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;

public class SiparisEkrani extends javax.swing.JFrame {
    
    Sepet sepet = new Sepet(); 
    DefaultListModel<String> listeModeli = new DefaultListModel<>();
    
    private ArrayList<String> ozelPizzaMalzemeleri = new ArrayList<>();
    private double ozelPizzaTutar = 0.0;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SiparisEkrani.class.getName());

    public SiparisEkrani() {
        initComponents();
        lstSepet.setModel(listeModeli); 

        setTitle("Pizza Sipariş Ekranı");
        setLocationRelativeTo(null); 

        try {
            setIconImage(new javax.swing.ImageIcon("pizza_ikon.png").getImage()); 
        } catch (Exception e) {
            System.out.println("İkon bulunamadı.");
        }

        lstSepet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    int seciliSira = lstSepet.getSelectedIndex();
                    if (seciliSira != -1) {
                        listeModeli.remove(seciliSira);
                        sepet.getSiparisListesi().remove(seciliSira);
                        lblToplam.setText("Toplam Tutar: " + sepet.genelToplamiHesapla() + " TL");
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbPizza = new javax.swing.JComboBox<>();
        cmbBoyut = new javax.swing.JComboBox<>();
        cmbHamur = new javax.swing.JComboBox<>();
        btnSepeteEkle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstSepet = new javax.swing.JList<>();
        lblToplam = new javax.swing.JLabel();
        btnSiparisiTamamla = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        chkSucuk = new javax.swing.JCheckBox();
        chkSosis = new javax.swing.JCheckBox();
        chkMantar = new javax.swing.JCheckBox();
        chkMisir = new javax.swing.JCheckBox();
        chkZeytin = new javax.swing.JCheckBox();
        chkPeynir = new javax.swing.JCheckBox();
        chkAyran = new javax.swing.JCheckBox();
        chkGazoz = new javax.swing.JCheckBox();
        chkKola = new javax.swing.JCheckBox();
        chkFanta = new javax.swing.JCheckBox();
        chkPatates = new javax.swing.JCheckBox();
        chkHalka = new javax.swing.JCheckBox();
        chkSufle = new javax.swing.JCheckBox();
        chkSutlac = new javax.swing.JCheckBox();
        lblPizzaResim = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbPizza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza Seçiniz...", "Extravaganza (+150 TL)", "Karışık (+130 TL)", "Mexicano (+140 TL)", "İtaliano (+140 TL)", "Turkish Pizza (+160 TL)", "Favorite Three (+140 TL)", "Kendi Pizzanı Oluştur" }));
        cmbPizza.setToolTipText("");
        cmbPizza.addActionListener(this::cmbPizzaActionPerformed);

        cmbBoyut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boyut Seçiniz...", "Küçük Boy (1 Kişilik) - 250 TL", "Orta Boy (2 Kişilik) - 350 TL", "Büyük Boy (3-4 Kişilik) - 450 TL" }));
        cmbBoyut.addActionListener(this::cmbBoyutActionPerformed);

        cmbHamur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hamur Seçiniz...", "Klasik Hamur", "İnce Hamur", "İncecik Hamur", "Dublex Çift Kat Peynirli (+60 TL)" }));
        cmbHamur.addActionListener(this::cmbHamurActionPerformed);

        btnSepeteEkle.setText("Sepete Ekle");
        btnSepeteEkle.addActionListener(this::btnSepeteEkleActionPerformed);

        lstSepet.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstSepet);

        lblToplam.setText("Toplam Tutar: 0.0 TL");

        btnSiparisiTamamla.setText("Siparişi Tamamla");
        btnSiparisiTamamla.addActionListener(this::btnSiparisiTamamlaActionPerformed);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Temel Seçimler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ekstra Malzemeler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 189, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "İçecekler ve Yan Ürünler", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 24))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sepet Özeti", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 36))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        chkSucuk.setText("Ekstra Sucuk (+50 TL)");

        chkSosis.setText("Ekstra Sosis (+40 TL)");

        chkMantar.setText("Ekstra Mantar (+25 TL)");
        chkMantar.addActionListener(this::chkMantarActionPerformed);

        chkMisir.setText("Ekstra Mısır (+20 TL)");

        chkZeytin.setText("Ekstra Zeytin (+20 TL)");
        chkZeytin.addActionListener(this::chkZeytinActionPerformed);

        chkPeynir.setText("Ekstra Peynir (+40 TL)");

        chkAyran.setText("Ayran (+35 TL)");

        chkGazoz.setText("Cam Şişe Gazoz (+50 TL)");

        chkKola.setText("Kutu Kola (+60 TL)");
        chkKola.setToolTipText("");

        chkFanta.setText("Kutu Portakallı Gazoz (+60 TL)");

        chkPatates.setText("Büyük Patates (+100 TL)");

        chkHalka.setText("Halka Soğan (+70 TL)");

        chkSufle.setText("Sufle (+130 TL)");

        chkSutlac.setText("Fırın Sütlaç (+120 TL)");

        jLabel1.setText("Siparişleri sepetten çıkarmak isterseniz üzerine çift tıklayabilirsiniz.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSepeteEkle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkSucuk)
                                .addComponent(chkMantar)
                                .addComponent(chkZeytin)
                                .addComponent(chkAyran)
                                .addComponent(chkKola)
                                .addComponent(chkPatates)
                                .addComponent(chkSufle))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(chkSosis)
                                .addComponent(chkMisir)
                                .addComponent(chkPeynir)
                                .addComponent(chkGazoz)
                                .addComponent(chkHalka)
                                .addComponent(chkSutlac)
                                .addComponent(chkFanta, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                        .addComponent(cmbPizza, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbBoyut, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbHamur, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPizzaResim, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addComponent(btnSiparisiTamamla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBoyut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbHamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblToplam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPizzaResim, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkSucuk)
                            .addComponent(chkSosis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkMantar)
                            .addComponent(chkMisir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkZeytin)
                            .addComponent(chkPeynir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkAyran)
                            .addComponent(chkGazoz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkKola)
                            .addComponent(chkFanta)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkPatates)
                    .addComponent(chkHalka)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkSufle)
                    .addComponent(chkSutlac))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSepeteEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(btnSiparisiTamamla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPizzaActionPerformed
        String secilenPizza = cmbPizza.getSelectedItem().toString();
        String icerik = "";
        String resimYolu = ""; 

        if (secilenPizza.contains("Extravaganza")) {
            icerik = "İçindekiler: Sucuk, Sosis, Mantar, Mısır, Zeytin, Ekstra Peynir";
            resimYolu = "extravaganza.png"; 
        }
        else if (secilenPizza.contains("Karışık")) {
            icerik = "İçindekiler: Sucuk, Sosis, Mantar, Mısır";
            resimYolu = "karisik.png";
        }
        else if (secilenPizza.contains("Mexicano")) {
            icerik = "İçindekiler: Acı Biber, Sucuk, Mısır, Mozzarella";
            resimYolu = "mexicano.png";
        }
        else if (secilenPizza.contains("İtaliano")) {
            icerik = "İçindekiler: Özel İtalyan Sosu, Fesleğen, Mantar, Peynir";
            resimYolu = "italiano.png";
        }
        else if (secilenPizza.contains("Turkish")) {
            icerik = "İçindekiler: Pastırma, Sucuk, Biber, Domates";
            resimYolu = "turkish.png";
        }
        else if (secilenPizza.contains("Favorite")) {
            icerik = "İçindekiler: Sosis, Mısır, Bol Peynir";
            resimYolu = "favorite.png";
        }
        else if (secilenPizza.contains("Kendi Pizzanı Oluştur")) {
            resimYolu = "ozel_pizza.png"; 
        }

        if (!resimYolu.isEmpty() && !secilenPizza.contains("Seçiniz")) {
            try {
                javax.swing.ImageIcon ikon = new javax.swing.ImageIcon(resimYolu);
                java.awt.Image boyutlandirilmisResim = ikon.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
                lblPizzaResim.setIcon(new javax.swing.ImageIcon(boyutlandirilmisResim));
            } catch (Exception e) {
                lblPizzaResim.setText("Resim Bulunamadı");
                lblPizzaResim.setIcon(null);
            }
        } else {
            lblPizzaResim.setIcon(null);
            lblPizzaResim.setText("");
        }

        if (secilenPizza.contains("Kendi Pizzanı Oluştur")) {
            ozelPizzaPenceresiAc();
        } else if (!icerik.isEmpty() && !secilenPizza.contains("Seçiniz")) {
            JOptionPane.showMessageDialog(this, icerik, secilenPizza + " Detayları", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_cmbPizzaActionPerformed

    //Kendin Oluştur Pop-Up Penceresi
    private void ozelPizzaPenceresiAc() {
        JPanel anaPanel = new JPanel();
        anaPanel.setLayout(new BoxLayout(anaPanel, BoxLayout.Y_AXIS));

        // 1. Sos Seçimi
        JPanel pnlSos = new JPanel(new GridLayout(0, 1));
        pnlSos.setBorder(BorderFactory.createTitledBorder("1. Temel Sos Seçimi"));
        ButtonGroup bgSos = new ButtonGroup();
        JRadioButton rbSos1 = new JRadioButton("Özel Domates Sosu (Ücretsiz)", true);
        JRadioButton rbSos2 = new JRadioButton("Acılı İtalyan Sosu (+15 TL)");
        JRadioButton rbSos3 = new JRadioButton("Barbekü (BBQ) Sos (+20 TL)");
        JRadioButton rbSos4 = new JRadioButton("Beyaz Sarımsaklı Sos (+20 TL)");
        JRadioButton rbSos5 = new JRadioButton("Sos İstemiyorum");
        bgSos.add(rbSos1); bgSos.add(rbSos2); bgSos.add(rbSos3); bgSos.add(rbSos4); bgSos.add(rbSos5);
        pnlSos.add(rbSos1); pnlSos.add(rbSos2); pnlSos.add(rbSos3); pnlSos.add(rbSos4); pnlSos.add(rbSos5);

        // 2. Peynir Seçimi
        JPanel pnlPeynir = new JPanel(new GridLayout(0, 2));
        pnlPeynir.setBorder(BorderFactory.createTitledBorder("2. Peynir Grubu"));
        JCheckBox cbMozzarella = new JCheckBox("Ekstra Mozzarella (+35 TL)");
        JCheckBox cbCheddar = new JCheckBox("Cheddar (+40 TL)");
        JCheckBox cbBeyaz = new JCheckBox("Beyaz Peynir (+30 TL)");
        JCheckBox cbTulum = new JCheckBox("Tulum Peyniri (+45 TL)");
        pnlPeynir.add(cbMozzarella); pnlPeynir.add(cbCheddar); pnlPeynir.add(cbBeyaz); pnlPeynir.add(cbTulum);

        // 3. Et Ürünleri
        JPanel pnlEt = new JPanel(new GridLayout(0, 2));
        pnlEt.setBorder(BorderFactory.createTitledBorder("3. Et ve Şarküteri"));
        JCheckBox cbSucuk = new JCheckBox("Sucuk (+50 TL)");
        JCheckBox cbSalam = new JCheckBox("Salam (+40 TL)");
        JCheckBox cbSosis = new JCheckBox("Sosis (+40 TL)");
        JCheckBox cbPepperoni = new JCheckBox("Pepperoni (+60 TL)");
        JCheckBox cbKavurma = new JCheckBox("Kavurma (+80 TL)");
        JCheckBox cbPastirma = new JCheckBox("Pastırma (+90 TL)");
        pnlEt.add(cbSucuk); pnlEt.add(cbSalam); pnlEt.add(cbSosis); pnlEt.add(cbPepperoni); pnlEt.add(cbKavurma); pnlEt.add(cbPastirma);

        // 4. Sebzeler
        JPanel pnlSebze = new JPanel(new GridLayout(0, 2));
        pnlSebze.setBorder(BorderFactory.createTitledBorder("4. Sebze Grubu"));
        JCheckBox cbMantar = new JCheckBox("Mantar (+25 TL)");
        JCheckBox cbZeytin = new JCheckBox("Zeytin (+20 TL)");
        JCheckBox cbMisir = new JCheckBox("Mısır (+20 TL)");
        JCheckBox cbBiber = new JCheckBox("Biber (+20 TL)");
        JCheckBox cbSogan = new JCheckBox("Soğan (+15 TL)");
        JCheckBox cbJalapeno = new JCheckBox("Jalapeno (+25 TL)");
        pnlSebze.add(cbMantar); pnlSebze.add(cbZeytin); pnlSebze.add(cbMisir); pnlSebze.add(cbBiber); pnlSebze.add(cbSogan); pnlSebze.add(cbJalapeno);

        // 5. Baharatlar
        JPanel pnlBaharat = new JPanel(new GridLayout(0, 2));
        pnlBaharat.setBorder(BorderFactory.createTitledBorder("5. Baharatlar"));
        JCheckBox cbKekik = new JCheckBox("Kekik (+5 TL)");
        JCheckBox cbPulBiber = new JCheckBox("Pul Biber (+5 TL)");
        JCheckBox cbFeslegen = new JCheckBox("Fesleğen (+5 TL)");
        pnlBaharat.add(cbKekik); pnlBaharat.add(cbPulBiber); pnlBaharat.add(cbFeslegen);

        anaPanel.add(pnlSos);
        anaPanel.add(pnlPeynir);
        anaPanel.add(pnlEt);
        anaPanel.add(pnlSebze);
        anaPanel.add(pnlBaharat);

        JScrollPane scrollPane = new JScrollPane(anaPanel);
        scrollPane.setPreferredSize(new Dimension(450, 500));

        int result = JOptionPane.showConfirmDialog(this, scrollPane, "Malzemelerini Seç - Kendi Pizzanı Oluştur", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            ozelPizzaMalzemeleri.clear();
            ozelPizzaTutar = 0.0;

            if(rbSos1.isSelected()) { ozelPizzaMalzemeleri.add("Özel Domates Sosu"); }
            if(rbSos2.isSelected()) { ozelPizzaMalzemeleri.add("Acılı İtalyan Sosu"); ozelPizzaTutar += 15; }
            if(rbSos3.isSelected()) { ozelPizzaMalzemeleri.add("BBQ Sos"); ozelPizzaTutar += 20; }
            if(rbSos4.isSelected()) { ozelPizzaMalzemeleri.add("Sarımsaklı Sos"); ozelPizzaTutar += 20; }
            if(rbSos5.isSelected()) { ozelPizzaMalzemeleri.add("Sossuz"); }

            if(cbMozzarella.isSelected()) { ozelPizzaMalzemeleri.add("Ekstra Mozzarella"); ozelPizzaTutar += 35; }
            if(cbCheddar.isSelected()) { ozelPizzaMalzemeleri.add("Cheddar"); ozelPizzaTutar += 40; }
            if(cbBeyaz.isSelected()) { ozelPizzaMalzemeleri.add("Beyaz Peynir"); ozelPizzaTutar += 30; }
            if(cbTulum.isSelected()) { ozelPizzaMalzemeleri.add("Tulum Peyniri"); ozelPizzaTutar += 45; }

            if(cbSucuk.isSelected()) { ozelPizzaMalzemeleri.add("Sucuk"); ozelPizzaTutar += 50; }
            if(cbSalam.isSelected()) { ozelPizzaMalzemeleri.add("Salam"); ozelPizzaTutar += 40; }
            if(cbSosis.isSelected()) { ozelPizzaMalzemeleri.add("Sosis"); ozelPizzaTutar += 40; }
            if(cbPepperoni.isSelected()) { ozelPizzaMalzemeleri.add("Pepperoni"); ozelPizzaTutar += 60; }
            if(cbKavurma.isSelected()) { ozelPizzaMalzemeleri.add("Kavurma"); ozelPizzaTutar += 80; }
            if(cbPastirma.isSelected()) { ozelPizzaMalzemeleri.add("Pastırma"); ozelPizzaTutar += 90; }

            if(cbMantar.isSelected()) { ozelPizzaMalzemeleri.add("Mantar"); ozelPizzaTutar += 25; }
            if(cbZeytin.isSelected()) { ozelPizzaMalzemeleri.add("Zeytin"); ozelPizzaTutar += 20; }
            if(cbMisir.isSelected()) { ozelPizzaMalzemeleri.add("Mısır"); ozelPizzaTutar += 20; }
            if(cbBiber.isSelected()) { ozelPizzaMalzemeleri.add("Biber"); ozelPizzaTutar += 20; }
            if(cbSogan.isSelected()) { ozelPizzaMalzemeleri.add("Soğan"); ozelPizzaTutar += 15; }
            if(cbJalapeno.isSelected()) { ozelPizzaMalzemeleri.add("Jalapeno"); ozelPizzaTutar += 25; }

            if(cbKekik.isSelected()) { ozelPizzaMalzemeleri.add("Kekik"); ozelPizzaTutar += 5; }
            if(cbPulBiber.isSelected()) { ozelPizzaMalzemeleri.add("Pul Biber"); ozelPizzaTutar += 5; }
            if(cbFeslegen.isSelected()) { ozelPizzaMalzemeleri.add("Fesleğen"); ozelPizzaTutar += 5; }

            JOptionPane.showMessageDialog(this, "Harika! Özel pizzanızın içeriği kaydedildi.\nLütfen arayüzden 'Hamur' ve 'Boyut' seçerek Sepete Ekleyiniz.", "Başarılı", JOptionPane.INFORMATION_MESSAGE);
        } else {
            cmbPizza.setSelectedIndex(0); 
        }
    }
    private void cmbBoyutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoyutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBoyutActionPerformed

    private void cmbHamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHamurActionPerformed

    private void chkZeytinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkZeytinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkZeytinActionPerformed

    private void btnSepeteEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepeteEkleActionPerformed
        if (cmbPizza.getSelectedIndex() == 0 || cmbBoyut.getSelectedIndex() == 0 || cmbHamur.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Lütfen pizza, boyut ve hamur seçimi yapınız!", "Eksik Seçim", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Pizza yeniPizza = new Pizza(cmbPizza.getSelectedItem().toString(), 
                                    cmbBoyut.getSelectedItem().toString(), 
                                    cmbHamur.getSelectedItem().toString());
        
        if (yeniPizza.getIsim().contains("Kendi Pizzanı Oluştur")) {
            if (ozelPizzaMalzemeleri.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Kendi pizzanızı seçtiniz fakat malzeme seçmediniz.\nLütfen listeden tekrar seçerek malzemelerinizi belirleyin.", "Uyarı", JOptionPane.WARNING_MESSAGE);
                cmbPizza.setSelectedIndex(0);
                return;
            }
            for (String malz : ozelPizzaMalzemeleri) {
                yeniPizza.malzemeEkle(malz);
            }
            yeniPizza.setOzelMalzemelerFiyati(ozelPizzaTutar);
        }

        Siparis yeniSiparis = new Siparis(yeniPizza);

        // Ekstra Malzemeler
        if (chkSucuk.isSelected()) { yeniSiparis.ekstraEkle("İlave Sucuk", 50); }
        if (chkSosis.isSelected()) { yeniSiparis.ekstraEkle("İlave Sosis", 40); }
        if (chkMantar.isSelected()) { yeniSiparis.ekstraEkle("İlave Mantar", 25); }
        if (chkMisir.isSelected()) { yeniSiparis.ekstraEkle("İlave Mısır", 20); }
        if (chkZeytin.isSelected()) { yeniSiparis.ekstraEkle("İlave Zeytin", 20); }
        if (chkPeynir.isSelected()) { yeniSiparis.ekstraEkle("İlave Peynir", 40); }
        
        // İçecekler ve Yan Ürünler
        if (chkAyran.isSelected()) yeniSiparis.ekstraEkle("Ayran", 35);
        if (chkGazoz.isSelected()) yeniSiparis.ekstraEkle("Cam Şişe Gazoz", 50);
        if (chkKola.isSelected()) yeniSiparis.ekstraEkle("Kutu Kola", 60);
        if (chkFanta.isSelected()) yeniSiparis.ekstraEkle("Kutu Portakallı Gazoz", 60);
        if (chkPatates.isSelected()) yeniSiparis.ekstraEkle("Büyük Patates", 100);
        if (chkHalka.isSelected()) yeniSiparis.ekstraEkle("Halka Soğan", 70);
        if (chkSufle.isSelected()) yeniSiparis.ekstraEkle("Sufle", 130);
        if (chkSutlac.isSelected()) yeniSiparis.ekstraEkle("Fırın Sütlaç", 120);

        yeniSiparis.siparisFiyatiniHesapla();
        sepet.siparisEkle(yeniSiparis);

        listeModeli.addElement(yeniSiparis.toString());
        lblToplam.setText("Toplam Tutar: " + sepet.genelToplamiHesapla() + " TL");
        
        ozelPizzaMalzemeleri.clear();
        ozelPizzaTutar = 0.0;
    }//GEN-LAST:event_btnSepeteEkleActionPerformed

    private void btnSiparisiTamamlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisiTamamlaActionPerformed
        if (sepet.getSiparisListesi().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sepetiniz boş! Lütfen önce ürün ekleyin.", "Hata", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String mesaj = "Siparişiniz başarıyla alındı!\nÖdenecek Toplam Tutar: " + sepet.genelToplamiHesapla() + " TL\nBizi tercih ettiğiniz için teşekkürler!";
        JOptionPane.showMessageDialog(this, mesaj, "Sipariş Onayı", JOptionPane.INFORMATION_MESSAGE);
        
        sepet.sepetiTemizle();
        listeModeli.clear();
        lblToplam.setText("Toplam Tutar: 0.0 TL");
        
        cmbPizza.setSelectedIndex(0);
        cmbBoyut.setSelectedIndex(0);
        cmbHamur.setSelectedIndex(0);
        chkSucuk.setSelected(false); chkSosis.setSelected(false); chkMantar.setSelected(false);
        chkMisir.setSelected(false); chkZeytin.setSelected(false); chkPeynir.setSelected(false);
        chkAyran.setSelected(false); chkGazoz.setSelected(false); chkKola.setSelected(false);
        chkFanta.setSelected(false); chkPatates.setSelected(false); chkHalka.setSelected(false);
        chkSufle.setSelected(false); chkSutlac.setSelected(false);
    }//GEN-LAST:event_btnSiparisiTamamlaActionPerformed

    private void chkMantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMantarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMantarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new SiparisEkrani().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSepeteEkle;
    private javax.swing.JButton btnSiparisiTamamla;
    private javax.swing.JCheckBox chkAyran;
    private javax.swing.JCheckBox chkFanta;
    private javax.swing.JCheckBox chkGazoz;
    private javax.swing.JCheckBox chkHalka;
    private javax.swing.JCheckBox chkKola;
    private javax.swing.JCheckBox chkMantar;
    private javax.swing.JCheckBox chkMisir;
    private javax.swing.JCheckBox chkPatates;
    private javax.swing.JCheckBox chkPeynir;
    private javax.swing.JCheckBox chkSosis;
    private javax.swing.JCheckBox chkSucuk;
    private javax.swing.JCheckBox chkSufle;
    private javax.swing.JCheckBox chkSutlac;
    private javax.swing.JCheckBox chkZeytin;
    private javax.swing.JComboBox<String> cmbBoyut;
    private javax.swing.JComboBox<String> cmbHamur;
    private javax.swing.JComboBox<String> cmbPizza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPizzaResim;
    private javax.swing.JLabel lblToplam;
    private javax.swing.JList<String> lstSepet;
    // End of variables declaration//GEN-END:variables
}
