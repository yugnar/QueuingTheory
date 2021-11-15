import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MmsPage {
    JFrame frameMms = new JFrame();
    JLabel titulomms = new JLabel("M/M/s");
    JTextField lambdaPoner = new JTextField();
    JTextField miuPoner = new JTextField();
    JTextField sPoner = new JTextField();
    JTextField cwPoner = new JTextField();
    JTextField csPoner = new JTextField();
    JButton ejecutar = new JButton("Ejecutar");
    JButton reiniciar = new JButton("Reiniciar");
    JButton regresar = new JButton("Regresar");
    JLabel lambdaTexto = new JLabel("Tasa media de llegada (lambda)");
    JLabel miuTexto = new JLabel("Tasa media de servicio (miu)");
    JLabel sTexto = new JLabel("Numero de servidores (s)");
    JLabel cwTexto = new JLabel("Costo espera en la fila por tiempo");
    JLabel csTexto = new JLabel("Costo servidor por tiempo");

    // Resultados
    JLabel cn = new JLabel("cn");
    JLabel p = new JLabel("Factor de utilizacion");
    JLabel p0 = new JLabel("p0");
    JLabel lq = new JLabel("Número esperado de clientes en la cola");
    JLabel l = new JLabel("Número esperado de clientes en el sistema");
    JLabel wq = new JLabel("Tiempo esperado de los clientes en la cola");
    JLabel w = new JLabel("Tiempo esperado de estancia de los clientes en el sistema ");
    JLabel costo = new JLabel("Costo total del servicio");

    JLabel cnRes = new JLabel();
    JLabel pRes = new JLabel();
    JLabel p0Res = new JLabel();
    JLabel lqRes = new JLabel();
    JLabel lRes = new JLabel();
    JLabel wqRes = new JLabel();
    JLabel wRes = new JLabel();
    JLabel costoRes = new JLabel();

    public void run(){

        frameMms.setSize(1000, 1000);
        frameMms.setLayout(null);
        frameMms.setVisible(false);

        titulomms.setBounds(400, 0, 200, 100);
        titulomms.setFont(new Font("Helvetica Neue", Font.PLAIN, 50));

        lambdaTexto.setBounds(100, 100, 200, 40);
        lambdaPoner.setBounds(100, 150, 200, 40);

        miuTexto.setBounds(100, 200, 200, 40);
        miuPoner.setBounds(100, 250, 200, 40);

        sTexto.setBounds(100, 300, 200, 40);
        sPoner.setBounds(100, 350, 200, 40);
        
        cwTexto.setBounds(100, 400, 250, 40);
        cwPoner.setBounds(100, 450, 200, 40);

        csTexto.setBounds(100, 500, 200, 40);
        csPoner.setBounds(100, 550, 200, 40);

        ejecutar.setBounds(100, 650, 200, 40);
        reiniciar.setBounds(100, 700, 200, 40);
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

        lq.setBounds(500, 250, 400, 40);
        lq.setVisible(false);
        lqRes.setBounds(500, 300, 400, 40);
        lqRes.setVisible(false);

        l.setBounds(500, 350, 400, 40);
        l.setVisible(false);
        lRes.setBounds(500, 400, 400, 40);
        lRes.setVisible(false);

        wq.setBounds(500, 450, 400, 40);
        wq.setVisible(false);
        wqRes.setBounds(500, 500, 400, 40);
        wqRes.setVisible(false);

        w.setBounds(500, 550, 400, 40);
        w.setVisible(false);
        wRes.setBounds(500, 600, 400, 40);
        wRes.setVisible(false);

        costo.setBounds(500, 650, 400, 40);
        costo.setVisible(false);
        costoRes.setBounds(500, 700, 400, 40);
        costoRes.setVisible(false);

        frameMms.add(titulomms);
        frameMms.add(lambdaPoner);
        frameMms.add(miuPoner);
        frameMms.add(sPoner);
        frameMms.add(cwPoner);
        frameMms.add(csPoner);
        frameMms.add(ejecutar);
        frameMms.add(reiniciar);
        frameMms.add(regresar);
        frameMms.add(lambdaTexto);
        frameMms.add(miuTexto);
        frameMms.add(sTexto);
        frameMms.add(cwTexto);
        frameMms.add(csTexto);
        frameMms.add(cn);
        frameMms.add(p);
        frameMms.add(p0);
        frameMms.add(lq);
        frameMms.add(l);
        frameMms.add(wq);
        frameMms.add(w);
        frameMms.add(costo);
        frameMms.add(cnRes);
        frameMms.add(pRes);
        frameMms.add(p0Res);
        frameMms.add(lqRes);
        frameMms.add(lRes);
        frameMms.add(wqRes);
        frameMms.add(wRes);
        frameMms.add(costoRes);

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

                if (lambdaPoner.getText().isEmpty() || miuPoner.getText().isEmpty() || sPoner.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No dejes campos en blanco");
                } else {

                    int lambda = Integer.parseInt(lambdaPoner.getText());
                    int miu = Integer.parseInt(miuPoner.getText());
                    int s = Integer.parseInt(sPoner.getText());
                    double cwVal = Integer.parseInt(cwPoner.getText());
                    int csVal = Integer.parseInt(csPoner.getText());

                    Mms mms = new Mms(lambda, miu, s, cwVal, csVal);

                    if (mms.ro() < 1) {
                        JOptionPane.showMessageDialog(null, "El sistema es estable.");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "El sistema no es estable, por favor ingresa un sistema estable.");
                        desactivarTodo();
                        return;
                    }

                    pRes.setText(String.valueOf(mms.ro()));
                    p0Res.setText(String.valueOf(mms.p0()));
                    lqRes.setText(String.valueOf(mms.lq()));
                    lRes.setText(String.valueOf(mms.l()));
                    wqRes.setText(String.valueOf(mms.wq()));
                    wRes.setText(String.valueOf(mms.w()));
                    costoRes.setText(String.valueOf(mms.cost()));
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
                frameMms.setVisible(false);
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
        cwPoner.setText("");
        csPoner.setText("");
    }

    public void setVisible() {
        frameMms.setVisible(true);
    }
}
