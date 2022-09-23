/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funciones;

import banco.Padre;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author yo
 */
public class Consulta extends Padre {

    UIManager UI;

    @Override
    public void Operaciones() {
        UI = null;
        UI.put("control", new Color(245, 190, 131));
        UI.put("OptionPane.background", new Color(245, 190, 131));
        JOptionPane.showMessageDialog(null, "Su monto actual: " + dinero, "Consulta", JOptionPane.PLAIN_MESSAGE, icono("/iconos/consu.png", 40, 40));
    }

    public Icon icono(String path, int ancho, int altura) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(ancho, altura, java.awt.Image.SCALE_SMOOTH));
        return img;
    }
}
