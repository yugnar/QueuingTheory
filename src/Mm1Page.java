import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mm1Page {
    JFrame frameMm1 = new JFrame();
    JLabel titulomm1= new JLabel("M/M/1");
    JTextField lambdaPoner = new JTextField();
    JTextField miuPoner = new JTextField();
    JTextField nPoner = new JTextField();
    JTextField pnPoner = new JTextField();
    JButton ejecutar = new JButton("Ejecutar");
    JButton reiniciar = new JButton("Reiniciar");
    JLabel lambdaTexto = new JLabel("Tasa media de llegada (lambda)");
    JLabel miuTexto = new JLabel("Tasa media de servicio (miu)");
    JLabel numeroTexto = new JLabel("Numero usuarios");
    JLabel pnTexto = new JLabel("Probabilidad de n usuarios en el sistema");
    JLabel otros = new JLabel("Para otros calculos");

    //resultados textos
    JLabel cn = new JLabel("cn");
    JLabel pn = new JLabel("Probabilidad que haya n clientes en el sistema en el tiempo");
    JLabel p = new JLabel("Factor de utilizacion");
    JLabel po = new JLabel("po");
    JLabel lq = new JLabel("Número esperado de clientes en la cola");
    JLabel l = new JLabel("Número esperado de clientes en el sistema");
    JLabel wq = new JLabel("Tiempo esperado de los clientes en la cola");
    JLabel w = new JLabel("Tiempo esperado de estancia de los clientes en el sistema ");

    JLabel cnRes = new JLabel();
    JLabel pnRes = new JLabel();
    JLabel pRes = new JLabel();
    JLabel poRes = new JLabel();
    JLabel lqRes = new JLabel();
    JLabel lRes = new JLabel();
    JLabel wqRes = new JLabel();
    JLabel wRes = new JLabel();

    public void run(){


        frameMm1.setSize(1000,1000);
        frameMm1.setLayout(null);
        frameMm1.setVisible(false);

        titulomm1.setBounds(400,0,200,100);
        titulomm1.setFont(new Font("Helvetica Neue", Font.PLAIN, 50));

        lambdaTexto.setBounds(100,100,200,40);
        lambdaPoner.setBounds(100,150,200,40);

        miuTexto.setBounds(100,200,200,40);
        miuPoner.setBounds(100,250,200,40);

        otros.setBounds(100,300,200,40);

        numeroTexto.setBounds(100,350,200,40);
        nPoner.setBounds(100,400,200,40);

        pnTexto.setBounds(100,450,300,40);
        pnPoner.setBounds(100,500,200,40);

        ejecutar.setBounds(100,600,200,40);
        reiniciar.setBounds(100,700,200,40);

        cn.setBounds(500,100,400,40);
        cn.setVisible(false);
        cnRes.setBounds(500,125,400,40);
        cnRes.setVisible(false);

        pn.setBounds(500,175,400,40);
        pn.setVisible(false);
        pnRes.setBounds(500,200,400,40);
        pnRes.setVisible(false);

        p.setBounds(500,250,400,40);
        p.setVisible(false);
        pRes.setBounds(500,275,400,40);
        pRes.setVisible(false);

        po.setBounds(500,325,400,40);
        po.setVisible(false);
        poRes.setBounds(500,350,400,40);
        poRes.setVisible(false);

        lq.setBounds(500,400,400,40);
        lq.setVisible(false);
        lqRes.setBounds(500,425,400,40);
        lqRes.setVisible(false);

        l.setBounds(500,475,400,40);
        l.setVisible(false);
        lRes.setBounds(500,500,400,40);
        lRes.setVisible(false);

        wq.setBounds(500,550,400,40);
        wq.setVisible(false);
        wqRes.setBounds(500,575,400,40);
        wqRes.setVisible(false);

        w.setBounds(500,625,400,40);
        w.setVisible(false);
        wRes.setBounds(500,650,400,40);
        wRes.setVisible(false);

        frameMm1.add(titulomm1);
        frameMm1.add(lambdaPoner);
        frameMm1.add(miuPoner);
        frameMm1.add(ejecutar);
        frameMm1.add(reiniciar);
        frameMm1.add(nPoner);
        frameMm1.add(pnPoner);
        frameMm1.add(lambdaTexto);
        frameMm1.add(miuTexto);
        frameMm1.add(numeroTexto);
        frameMm1.add(pnTexto);
        frameMm1.add(otros);
        frameMm1.add(cn);
        frameMm1.add(pn);
        frameMm1.add(p);
        frameMm1.add(po);
        frameMm1.add(lq);
        frameMm1.add(l);
        frameMm1.add(wq);
        frameMm1.add(w);
        frameMm1.add(cnRes);
        frameMm1.add(pnRes);
        frameMm1.add(pRes);
        frameMm1.add(poRes);
        frameMm1.add(lqRes);
        frameMm1.add(lRes);
        frameMm1.add(wqRes);
        frameMm1.add(wRes);


        ejecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (lambdaPoner.getText().isEmpty() || miuPoner.getText().isEmpty() || nPoner.getText().isEmpty() || pnPoner.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "No dejes campos en blanco");
                } else{

                    int lambda = Integer.parseInt(lambdaPoner.getText());
                    int miu = Integer.parseInt(miuPoner.getText());

                    MmUno mmuno = new MmUno(lambda,miu);
                    System.out.println("MM1");
                    cnRes.setText(String.valueOf(mmuno.cn(Integer.parseInt(nPoner.getText()))));
                    System.out.println("cn: "+mmuno.cn(Integer.parseInt(nPoner.getText())));

                    pnRes.setText(String.valueOf(mmuno.pn(Integer.parseInt(pnPoner.getText()))));
                    System.out.println("pn: "+mmuno.pn(Integer.parseInt(pnPoner.getText())));

                    pRes.setText(String.valueOf(mmuno.p()));
                    System.out.println("p: "+mmuno.p());
                    if(mmuno.p() < 1){
                        JOptionPane.showMessageDialog(null, "El sistema es estable");
                    }else{
                        JOptionPane.showMessageDialog(null, "El sistema no es estable");
                    }

                    poRes.setText(String.valueOf(mmuno.po()));
                    System.out.println("po: "+mmuno.po());

                    lqRes.setText(String.valueOf(+mmuno.lq()));
                    System.out.println("lq: "+mmuno.lq());

                    lRes.setText(String.valueOf(mmuno.l()));
                    System.out.println("l: "+mmuno.l());

                    wqRes.setText(String.valueOf(mmuno.wq()));
                    System.out.println("wq: "+mmuno.wq());

                    wRes.setText(String.valueOf(mmuno.w()));
                    System.out.println("w: "+mmuno.w());
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
    }



    public void activarTodo(){
        cn.setVisible(true);
        cnRes.setVisible(true);
        p.setVisible(true);
        pRes.setVisible(true);
        po.setVisible(true);
        poRes.setVisible(true);
        lq.setVisible(true);
        lqRes.setVisible(true);
        l.setVisible(true);
        lRes.setVisible(true);
        wq.setVisible(true);
        wqRes.setVisible(true);
        w.setVisible(true);
        wRes.setVisible(true);
        pn.setVisible(true);
        pnRes.setVisible(true);
    }
    public void desactivarTodo(){
        cn.setVisible(false);
        cnRes.setVisible(false);
        p.setVisible(false);
        pRes.setVisible(false);
        po.setVisible(false);
        poRes.setVisible(false);
        lq.setVisible(false);
        lqRes.setVisible(false);
        l.setVisible(false);
        lRes.setVisible(false);
        wq.setVisible(false);
        wqRes.setVisible(false);
        w.setVisible(false);
        wRes.setVisible(false);
        pn.setVisible(false);
        pnRes.setVisible(false);
        lambdaPoner.setText("");
        miuPoner.setText("");
        nPoner.setText("");
        pnPoner.setText("");
    }



    public void setVisible(){
        frameMm1.setVisible(true);

    }
}
