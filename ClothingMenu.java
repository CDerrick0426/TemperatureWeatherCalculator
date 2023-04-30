package SP23Final;
import java.util.*;

public class ClothingMenu extends javax.swing.JFrame {
    public ClothingMenu() {
        initComponents();
        String helpIdentifier = "clothing"; 
    }
    
    public String SuggestClothing() { // Define all arrays below with clothing and weather
        String[] weatherConditions = {"sunny", "cloudy", "rainy", "windy", "snowy"};
        String[] sunnyClothing = {"t-shirt", "shorts", "sunglasses", "flip flops"};
        String[] cloudyClothing = {"light jacket", "jeans", "sneakers"};
        String[] rainyClothing = {"raincoat", "umbrella", "boots"};
        String[] windyClothing = {"windbreaker", "long pants", "sneakers"};
        String[] snowyClothing = {"heavy jacket", "snow boots", "hat", "gloves"};
        String weatherOutput;
        Random rand = new Random(); // New Random
        int weatherIndex = rand.nextInt(weatherConditions.length); // Generate array ID for weather
        String currentWeather = weatherConditions[weatherIndex]; // Get the string from the array
        int currentTemp = rand.nextInt(100);  // Generate temperature capped at 100 degrees Fahrenheit
        ArrayList<String> suggestedClothing = new ArrayList<String>();

        if (currentTemp <= 32) {
            suggestedClothing.addAll(Arrays.asList(snowyClothing));
        } else if (currentTemp <= 50) {
            suggestedClothing.addAll(Arrays.asList(snowyClothing));
            suggestedClothing.add("scarf");
        } else if (currentTemp <= 75) {
            switch (currentWeather) {
                case "rainy":
                    suggestedClothing.addAll(Arrays.asList(rainyClothing));
                    break;
                case "sunny":
                    suggestedClothing.addAll(Arrays.asList(sunnyClothing));
                    break;
                case "cloudy":
                    suggestedClothing.addAll(Arrays.asList(cloudyClothing));
                    break;                
                case "windy":
                    suggestedClothing.addAll(Arrays.asList(windyClothing));
                    break;
                case "snowy": // Temperature is above 75 degrees so snow wouldn't make sense
                    currentWeather = "rainy";
                    suggestedClothing.addAll(Arrays.asList(rainyClothing));
                    break;
            }
        } else if (currentTemp <= 100) { // At max temperature add a ballcap
            suggestedClothing.addAll(Arrays.asList(sunnyClothing));
            suggestedClothing.add("ballcap");
        } else {
            suggestedClothing.addAll(Arrays.asList(sunnyClothing));
            suggestedClothing.add("shorts");
        }
        weatherOutput = "The current weather is " + currentWeather + " and the temperature is " + currentTemp + "°F.";
        jTextArea1.setText(weatherOutput + "\n" +
                "You should wear: " + suggestedClothing);
        return("Done!");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Generate Clothing Options");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Clothing Suggestor (Standalone)");

        jButton3.setText("Help");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SuggestClothing();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new HelpMenu().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ClothingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClothingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClothingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClothingMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClothingMenu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
