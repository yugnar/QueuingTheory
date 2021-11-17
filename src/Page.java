import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;


public class Page {
    JFrame frameInicial=new JFrame("Teoria de colas");


    //labels
    JLabel tituloInicial= new JLabel("Tecnológico de Monterrey", SwingConstants.CENTER);
    JLabel tituloProyecto= new JLabel("Proyecto 2 - Métodos Cuantitativos y Simulación", SwingConstants.CENTER);
    JLabel tituloNumeros = new JLabel("Teoria de colas", SwingConstants.CENTER);
    JLabel labelEquipo = new JLabel("Miembros del equipo: Oscar Contreras, Jorge Akio Olvera, Miguel Hernández, Mónica Lara & Rafael Rojas.", SwingConstants.CENTER);
    JLabel labelExplicacion = new JLabel("<html><p>Este programa muestra el uso de teoría de colas para calcular diferentes parámetros bajo diferentes mdoelos. " +
            "Se encuentran disponibles los métodos de 1) M/M/1 \n 2) M/M/s \n 3) M/M/s/K \n y 4) M/(G/D/Ek)/1. " +
            "Adicionalmente, todos los modelos son capaces de calcular los costos de espera en la fila por tiempo y los costos de servidor por tiempo.");

    //Botones
    JButton mm1Buttton=new JButton("M/M/1");
    JButton mmskButton=new JButton("M/M/s/K");
    JButton mmsButton=new JButton("M/M/s");
    JButton mg1Button=new JButton("M/G/1");

    //Ventanas
    Mm1Page mm1 = new Mm1Page();
    MmskPage mmsk = new MmskPage();
    MmsPage mms = new MmsPage();
    MgUnoPage mg1 = new MgUnoPage();

    public void run(){



        //Inicial
        tituloInicial.setBounds(375,0,250,100);
        tituloInicial.setFont(new Font("Helvetica Neue", Font.BOLD, 18));
        tituloInicial.setForeground(new Color(4,88,166));
        tituloProyecto.setBounds(310,30,400,100);
        tituloProyecto.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        tituloNumeros.setBounds(100,150,250,100);
        tituloNumeros.setFont(new Font("Helvetica Neue", Font.BOLD, 16));
        labelEquipo.setBounds(80,710,800,100);
        labelEquipo.setFont(new Font("Helvetica Neue", Font.ITALIC, 14));
        labelExplicacion.setBounds(70,180,400,300);
        labelExplicacion.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));

        mm1Buttton.setBounds(700,250,260, 50);//x axis, y axis, width, height
        mm1Buttton.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        mmskButton.setBounds(700,370,260, 50);//x axis, y axis, width, height
        mmskButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        mmsButton.setBounds(700,310,260, 50);//x axis, y axis, width, height
        mmsButton.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        mg1Button.setBounds(700,430,260, 50);//x axis, y axis, width, height
        mg1Button.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));

        frameInicial.add(tituloInicial);
        frameInicial.add(tituloProyecto);
        frameInicial.add(tituloNumeros);
        frameInicial.add(labelEquipo);
        frameInicial.add(labelExplicacion);
        frameInicial.add(mm1Buttton);
        frameInicial.add(mmskButton);
        frameInicial.add(mmsButton);
        frameInicial.add(mg1Button);

        //Full page
        frameInicial.setSize(1000,1000);//400 width and 500 height
        frameInicial.setLayout(null);//using no layout managers
        frameInicial.setVisible(true);//making the frame visible

        //Metodos de cambio

        //Iniciar todos
        mm1.run();
        mmsk.run();
        mms.run();
        mg1.run();

        //Botones

        mm1Buttton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicial.setVisible(false);
                mm1.setVisible();

            }
        });

        mmskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicial.setVisible(false);
                mmsk.setVisible();

            }
        });

        mmsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicial.setVisible(false);
                mms.setVisible();
            }
        });

        mg1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameInicial.setVisible(false);
                mg1.setVisible();
            }
        });

    }

    public void setVisible(){
        frameInicial.setVisible(true);
    }

}
