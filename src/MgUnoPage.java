import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MgUnoPage {
    JFrame frameMm1 = new JFrame();
    JLabel titulomm1= new JLabel("M/(G/D/Ek)/1");
    JRadioButton m1 = new JRadioButton("M/G/1", true);
    JRadioButton m2 = new JRadioButton("M/D/1");
    JRadioButton m3 = new JRadioButton("M/Ek/1");
    JTextField lambdaPoner = new JTextField();
    JTextField miuPoner = new JTextField();
    JTextField varianzaPoner = new JTextField();
    JTextField kPoner = new JTextField();
    JTextField cwPoner = new JTextField();
    JTextField csPoner = new JTextField();
    JButton ejecutar = new JButton("Ejecutar");
    JButton reiniciar = new JButton("Reiniciar");
    JButton regresar = new JButton("Regresar");
    JLabel modelTexto = new JLabel("Selecciona el modelo a utilizar.");
    JLabel lambdaTexto = new JLabel("Tasa media de llegada (lambda)");
    JLabel miuTexto = new JLabel("Tasa media de servicio (miu)");
    JLabel varianzaTexto = new JLabel("Varianza (solo M/G/1)");


    //resultados textos
    JLabel p = new JLabel("Factor de utilizacion");
    JLabel p0 = new JLabel("p0");
    JLabel lq = new JLabel("Número esperado de clientes en la cola");
    JLabel l = new JLabel("Número esperado de clientes en el sistema");
    JLabel wq = new JLabel("Tiempo esperado de los clientes en la cola");
    JLabel w = new JLabel("Tiempo esperado de estancia de los clientes en el sistema ");
    JLabel kTexto = new JLabel("Valor de k (solo M/Ek/1)");
    JLabel cwTexto = new JLabel("Costo espera en la fila por tiempo");
    JLabel csTexto = new JLabel("Costo servidor por tiempo");
    JLabel costo = new JLabel("Costo total del servicio");


    JLabel pRes = new JLabel();
    JLabel p0Res = new JLabel();
    JLabel lqRes = new JLabel();
    JLabel lRes = new JLabel();
    JLabel wqRes = new JLabel();
    JLabel wRes = new JLabel();
    JLabel costoRes = new JLabel();


    public void run(){


        frameMm1.setSize(1000,1000);
        frameMm1.setLayout(null);
        frameMm1.setVisible(false);

        titulomm1.setBounds(400,0,600,100);
        titulomm1.setFont(new Font("Helvetica Neue", Font.PLAIN, 50));

        modelTexto.setBounds(100, 50, 200, 40);

        m1.setBounds(100, 80, 60, 30);
        m2.setBounds(160, 80, 60, 30);
        m3.setBounds(220, 80, 100, 30);

        ButtonGroup bg = new ButtonGroup();
        bg.add(m1); bg.add(m2); bg.add(m3);

        lambdaTexto.setBounds(100,100,200,40);
        lambdaPoner.setBounds(100,140,200,40);

        miuTexto.setBounds(100,180,200,40);
        miuPoner.setBounds(100,220,200,40);

        varianzaTexto.setBounds(100,260,200,40);
        varianzaPoner.setBounds(100,300,200,40);

        kTexto.setBounds(100,340,200,40);
        kPoner.setBounds(100,380,200,40);

        cwTexto.setBounds(100, 420, 200, 40);
        cwPoner.setBounds(100, 460, 200, 40);

        csTexto.setBounds(100, 500, 200, 40);
        csPoner.setBounds(100, 540, 200, 40);

        ejecutar.setBounds(100, 610, 200, 40);
        reiniciar.setBounds(100, 660, 200, 40);

        regresar.setBounds(10, 10, 100, 30);


        p.setBounds(500,100,400,40);
        p.setVisible(false);
        pRes.setBounds(500,125,400,40);
        pRes.setVisible(false);

        p0.setBounds(500,150,400,40);
        p0.setVisible(false);
        p0Res.setBounds(500,175,400,40);
        p0Res.setVisible(false);

        lq.setBounds(500,200,400,40);
        lq.setVisible(false);
        lqRes.setBounds(500,225,400,40);
        lqRes.setVisible(false);

        l.setBounds(500,250,400,40);
        l.setVisible(false);
        lRes.setBounds(500,275,400,40);
        lRes.setVisible(false);

        wq.setBounds(500,300,400,40);
        wq.setVisible(false);
        wqRes.setBounds(500,325,400,40);
        wqRes.setVisible(false);

        w.setBounds(500,350,400,40);
        w.setVisible(false);
        wRes.setBounds(500,375,400,40);
        wRes.setVisible(false);

        costo.setBounds(500, 400, 400, 40);
        costo.setVisible(false);
        costoRes.setBounds(500, 425, 400, 40);
        costoRes.setVisible(false);

        frameMm1.add(titulomm1);
        frameMm1.add(lambdaPoner);
        frameMm1.add(miuPoner);
        frameMm1.add(varianzaPoner);
        frameMm1.add(kPoner);
        frameMm1.add(cwPoner);
        frameMm1.add(csPoner);
        frameMm1.add(ejecutar);
        frameMm1.add(reiniciar);
        frameMm1.add(regresar);
        frameMm1.add(modelTexto);
        frameMm1.add(lambdaTexto);
        frameMm1.add(miuTexto);
        frameMm1.add(varianzaTexto);
        frameMm1.add(kTexto);
        frameMm1.add(cwTexto);
        frameMm1.add(csTexto);
        frameMm1.add(p);
        frameMm1.add(p0);
        frameMm1.add(lq);
        frameMm1.add(l);
        frameMm1.add(wq);
        frameMm1.add(w);
        frameMm1.add(pRes);
        frameMm1.add(p0Res);
        frameMm1.add(lqRes);
        frameMm1.add(lRes);
        frameMm1.add(wqRes);
        frameMm1.add(wRes);
        frameMm1.add(costo);
        frameMm1.add(costoRes);
        frameMm1.add(m1);
        frameMm1.add(m2);
        frameMm1.add(m3);

        lambdaPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = lambdaPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    lambdaPoner.setEditable(true);
                    lambdaTexto.setText("Tasa media de llegada (lambda)");
                } else {
                    lambdaPoner.setEditable(false);
                    lambdaTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });

        miuPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = miuPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    miuPoner.setEditable(true);
                    miuTexto.setText("Tasa media de servicio (miu)");
                } else {
                    miuPoner.setEditable(false);
                    miuTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });

        varianzaPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = varianzaPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    varianzaPoner.setEditable(true);
                    varianzaTexto.setText("Varianza (solo M/G/1)");
                } else {
                    varianzaPoner.setEditable(false);
                    varianzaTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });

        kPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = kPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    kPoner.setEditable(true);
                    kTexto.setText("Valor de k (solo M/Ek/1)");
                } else {
                    kPoner.setEditable(false);
                    kTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });

        cwPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = cwPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    cwPoner.setEditable(true);
                    cwTexto.setText("Costo espera en la fila por tiempo");
                } else {
                    cwPoner.setEditable(false);
                    cwTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });

        csPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = csPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    csPoner.setEditable(true);
                    csTexto.setText("Costo servidor por tiempo");
                } else {
                    csPoner.setEditable(false);
                    csTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });


        ejecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int selection = 1;

                if (m1.isSelected()) {
                    selection = 1;
                } else if (m2.isSelected()) {
                    selection = 2;
                } else if (m3.isSelected()) {
                    selection = 3;
                }

                if (lambdaPoner.getText().isEmpty() || miuPoner.getText().isEmpty() || csPoner.getText().isEmpty() || cwPoner.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No dejes los campos básicos en blanco. (Varianza y K pueden estar vacíos depende del modelo seleccionado.)");
                } else {
                    double lambda = Double.parseDouble(lambdaPoner.getText());
                    double miu = Double.parseDouble(miuPoner.getText());
                    double cwVal = Double.parseDouble(cwPoner.getText());
                    double csVal = Double.parseDouble(csPoner.getText());
                    double varianza = 0;
                    if(selection == 1){
                        varianza = Double.parseDouble(varianzaPoner.getText());
                    }
                    double k = 0;
                    if(selection == 3){
                        k = Double.parseDouble(kPoner.getText());
                    }
                    MgUno mguno = new MgUno(lambda, miu, cwVal, csVal, varianza, k);
                    System.out.println("MG1");
                    pRes.setText(String.valueOf(mguno.ro()));
                    System.out.println("p: " + mguno.ro());
                    if (mguno.ro() < 1) {
                        JOptionPane.showMessageDialog(null, "El sistema es estable.");
                    } else {
                        JOptionPane.showMessageDialog(null, "El sistema no es estable, por favor ingresa un sistema estable.");
                        desactivarTodo();
                        return;
                    }
                    p0Res.setText(String.valueOf(mguno.p0()));
                    System.out.println("po: " + mguno.p0());
                    lqRes.setText(String.valueOf(+mguno.lq(selection)));
                    System.out.println("lq: " + mguno.lq(selection));
                    lRes.setText(String.valueOf(mguno.l(selection)));
                    System.out.println("l: " + mguno.l(selection));
                    wqRes.setText(String.valueOf(mguno.wq(selection)));
                    System.out.println("wq: " + mguno.wq(selection));
                    wRes.setText(String.valueOf(mguno.w(selection)));
                    System.out.println("w: " + mguno.w(selection));
                    costoRes.setText(String.valueOf(mguno.cost()));
                    activarTodo();
                }
            }
        });

        reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                desactivarTodo();
            }
        });

        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameMm1.setVisible(false);
                Page pg = new Page();
                pg.run();
            }
        });
    }


    public void activarTodo(){
        p.setVisible(true);
        pRes.setVisible(true);
        p0.setVisible(true);
        p0Res.setVisible(true);
        lq.setVisible(true);
        lqRes.setVisible(true);
        l.setVisible(true);
        lRes.setVisible(true);
        wq.setVisible(true);
        wqRes.setVisible(true);
        w.setVisible(true);
        wRes.setVisible(true);
        costo.setVisible(true);
        costoRes.setVisible(true);
    }
    public void desactivarTodo(){
        p.setVisible(false);
        pRes.setVisible(false);
        p0.setVisible(false);
        p0Res.setVisible(false);
        lq.setVisible(false);
        lqRes.setVisible(false);
        l.setVisible(false);
        lRes.setVisible(false);
        wq.setVisible(false);
        wqRes.setVisible(false);
        w.setVisible(false);
        wRes.setVisible(false);
        lambdaPoner.setText("");
        miuPoner.setText("");
        varianzaPoner.setText("");
        kPoner.setText("");
        cwPoner.setText("");
        csPoner.setText("");
        costo.setText("");
        costoRes.setText("");
    }

    public void setVisible(){
        frameMm1.setVisible(true);

    }
}