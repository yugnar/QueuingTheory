import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MmskPage {
    JFrame frameMmsk = new JFrame();
    JLabel titulommsk = new JLabel("M/M/s/K");
    JTextField lambdaPoner = new JTextField();
    JTextField miuPoner = new JTextField();
    JTextField sPoner = new JTextField();
    JTextField kPoner = new JTextField();
    JTextField cwPoner = new JTextField();
    JTextField csPoner = new JTextField();
    JButton ejecutar = new JButton("Ejecutar");
    JButton reiniciar = new JButton("Reiniciar");
    JButton regresar = new JButton("Regresar");
    JLabel lambdaTexto = new JLabel("Tasa media de llegada (lambda)");
    JLabel miuTexto = new JLabel("Tasa media de servicio (miu)");
    JLabel sTexto = new JLabel("Numero de servidores (s)");
    JLabel kTexto = new JLabel("Capacidad (k)");
    JLabel cwTexto = new JLabel("Costo espera en la fila por tiempo");
    JLabel csTexto = new JLabel("Costo servidor por tiempo");

    // resultados textos
    JLabel cn = new JLabel("cn");
    JLabel p = new JLabel("Factor de utilizacion");
    JLabel p0 = new JLabel("p0");
    JLabel pK = new JLabel("pk");
    JLabel lambdae = new JLabel("Lambda e");
    JLabel lq = new JLabel("Número esperado de clientes en la cola");
    JLabel l = new JLabel("Número esperado de clientes en el sistema");
    JLabel wq = new JLabel("Tiempo esperado de los clientes en la cola");
    JLabel w = new JLabel("Tiempo esperado de estancia de los clientes en el sistema ");
    JLabel costo = new JLabel("Costo toal del servicio");

    JLabel cnRes = new JLabel();
    JLabel pRes = new JLabel();
    JLabel p0Res = new JLabel();
    JLabel pKRes = new JLabel();
    JLabel lambdaeRes = new JLabel();
    JLabel lqRes = new JLabel();
    JLabel lRes = new JLabel();
    JLabel wqRes = new JLabel();
    JLabel wRes = new JLabel();
    JLabel costoRes = new JLabel();

    public void run() {

        frameMmsk.setSize(1000, 1000);
        frameMmsk.setLayout(null);
        frameMmsk.setVisible(false);

        //frameMmsk.setBounds(400, 0, 200, 100);
        frameMmsk.setFont(new Font("Helvetica Neue", Font.PLAIN, 50));

        lambdaTexto.setBounds(100, 100, 200, 40);
        lambdaPoner.setBounds(100, 150, 200, 40);

        miuTexto.setBounds(100, 200, 200, 40);
        miuPoner.setBounds(100, 250, 200, 40);

        sTexto.setBounds(100, 300, 200, 40);
        sPoner.setBounds(100, 350, 200, 40);

        kTexto.setBounds(100, 400, 300, 40);
        kPoner.setBounds(100, 450, 200, 40);

        cwTexto.setBounds(100, 500, 200, 40);
        cwPoner.setBounds(100, 550, 200, 40);

        csTexto.setBounds(100, 600, 200, 40);
        csPoner.setBounds(100, 650, 200, 40);

        ejecutar.setBounds(100, 700, 200, 40);
        reiniciar.setBounds(100, 750, 200, 40);
        regresar.setBounds(10, 10, 100, 30);

        /*
         * cn.setBounds(500, 100, 400, 40); cn.setVisible(false); cnRes.setBounds(500,
         * 125, 400, 40); cnRes.setVisible(false);
         */
        p.setBounds(500, 100, 400, 40);
        p.setVisible(false);
        pRes.setBounds(500, 125, 400, 40);
        pRes.setVisible(false);

        p0.setBounds(500, 175, 400, 40);
        p0.setVisible(false);
        p0Res.setBounds(500, 200, 400, 40);
        p0Res.setVisible(false);

        pK.setBounds(500, 250, 400, 40);
        pK.setVisible(false);
        pKRes.setBounds(500, 275, 400, 40);
        pKRes.setVisible(false);

        lambdae.setBounds(500, 325, 400, 40);
        lambdae.setVisible(false);
        lambdaeRes.setBounds(500, 350, 400, 40);
        lambdaeRes.setVisible(false);

        lq.setBounds(500, 400, 400, 40);
        lq.setVisible(false);
        lqRes.setBounds(500, 425, 400, 40);
        lqRes.setVisible(false);

        l.setBounds(500, 475, 400, 40);
        l.setVisible(false);
        lRes.setBounds(500, 500, 400, 40);
        lRes.setVisible(false);

        wq.setBounds(500, 550, 400, 40);
        wq.setVisible(false);
        wqRes.setBounds(500, 575, 400, 40);
        wqRes.setVisible(false);

        w.setBounds(500, 625, 400, 40);
        w.setVisible(false);
        wRes.setBounds(500, 650, 400, 40);
        wRes.setVisible(false);

        costo.setBounds(500, 700, 400, 40);
        costo.setVisible(false);
        costoRes.setBounds(500, 725, 400, 40);
        costoRes.setVisible(false);

        frameMmsk.add(titulommsk);
        frameMmsk.add(lambdaPoner);
        frameMmsk.add(miuPoner);
        frameMmsk.add(sPoner);
        frameMmsk.add(kPoner);
        frameMmsk.add(cwPoner);
        frameMmsk.add(csPoner);
        frameMmsk.add(ejecutar);
        frameMmsk.add(reiniciar);
        frameMmsk.add(regresar);
        frameMmsk.add(lambdaTexto);
        frameMmsk.add(miuTexto);
        frameMmsk.add(sTexto);
        frameMmsk.add(kTexto);
        frameMmsk.add(cwTexto);
        frameMmsk.add(csTexto);
        frameMmsk.add(cn);
        frameMmsk.add(p);
        frameMmsk.add(p0);
        frameMmsk.add(pK);
        frameMmsk.add(lambdae);
        frameMmsk.add(lq);
        frameMmsk.add(l);
        frameMmsk.add(wq);
        frameMmsk.add(w);
        frameMmsk.add(costo);
        frameMmsk.add(cnRes);
        frameMmsk.add(pRes);
        frameMmsk.add(p0Res);
        frameMmsk.add(pKRes);
        frameMmsk.add(lambdaeRes);
        frameMmsk.add(lqRes);
        frameMmsk.add(lRes);
        frameMmsk.add(wqRes);
        frameMmsk.add(wRes);
        frameMmsk.add(costoRes);

        lambdaPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = lambdaPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
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
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    miuPoner.setEditable(true);
                    miuTexto.setText("Tasa media de servicio (miu)");
                } else {
                    miuPoner.setEditable(false);
                    miuTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });

        sPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = sPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    sPoner.setEditable(true);
                    sTexto.setText("Numero de servidores (s)");
                } else {
                    sPoner.setEditable(false);
                    sTexto.setText("* Ingresa solo números (0-9)");
                }
            }
        });

        kPoner.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = kPoner.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                    kPoner.setEditable(true);
                    kTexto.setText("Capacidad (k)");
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
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
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
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
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

                if (lambdaPoner.getText().isEmpty() || miuPoner.getText().isEmpty() || sPoner.getText().isEmpty()
                        || kPoner.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No dejes campos en blanco");
                } else {

                    int lambda = Integer.parseInt(lambdaPoner.getText());
                    int miu = Integer.parseInt(miuPoner.getText());
                    int s = Integer.parseInt(sPoner.getText());
                    int k = Integer.parseInt(kPoner.getText());
                    double cwVal = Integer.parseInt(cwPoner.getText());
                    int csVal = Integer.parseInt(csPoner.getText());

                    Mmsk mmsk = new Mmsk(lambda, miu, s, k, cwVal, csVal);

                    if (mmsk.ro() < 1) {
                        JOptionPane.showMessageDialog(null, "El sistema es estable.");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "El sistema no es estable, por favor ingresa un sistema estable.");
                        desactivarTodo();
                        return;
                    }

                    pRes.setText(String.valueOf(mmsk.ro()));
                    p0Res.setText(String.valueOf(mmsk.p0()));
                    pKRes.setText(String.valueOf(mmsk.pn(mmsk.getK())));
                    lambdaeRes.setText(String.valueOf(mmsk.lambdae()));
                    lqRes.setText(String.valueOf(mmsk.lq()));
                    lRes.setText(String.valueOf(mmsk.l()));
                    wqRes.setText(String.valueOf(mmsk.wq()));
                    wRes.setText(String.valueOf(mmsk.w()));
                    costoRes.setText(String.valueOf(mmsk.cost()));
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
                frameMmsk.setVisible(false);
                Page pg = new Page();
                pg.run();
            }
        });
    }

    public void activarTodo() {
        p.setVisible(true);
        pRes.setVisible(true);
        p0.setVisible(true);
        p0Res.setVisible(true);
        pK.setVisible(true);
        pKRes.setVisible(true);
        lambdae.setVisible(true);
        lambdaeRes.setVisible(true);
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

    public void desactivarTodo() {
        p.setVisible(false);
        pRes.setVisible(false);
        p0.setVisible(false);
        p0Res.setVisible(false);
        pK.setVisible(false);
        pKRes.setVisible(false);
        lambdae.setVisible(false);
        lambdaeRes.setVisible(false);
        lq.setVisible(false);
        lqRes.setVisible(false);
        l.setVisible(false);
        lRes.setVisible(false);
        wq.setVisible(false);
        wqRes.setVisible(false);
        w.setVisible(false);
        wRes.setVisible(false);
        costo.setVisible(false);
        costoRes.setVisible(false);
        lambdaPoner.setText("");
        miuPoner.setText("");
        sPoner.setText("");
        kPoner.setText("");
        cwPoner.setText("");
        csPoner.setText("");
    }

    public void setVisible() {
        frameMmsk.setVisible(true);

    }
}
