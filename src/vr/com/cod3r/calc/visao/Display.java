package vr.com.cod3r.calc.visao;

import vr.com.cod3r.calc.modelo.Memoria;
import vr.com.cod3r.calc.modelo.MemoriaObservador;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObservador {

    private final JLabel label;

    public Display(){
        Memoria.getInstacia().adicionarObservador(this);

        setBackground(new Color(46,49,50));
        label = new JLabel(Memoria.getInstacia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN,30));

        setLayout(new FlowLayout(FlowLayout.RIGHT,10,25 ));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
