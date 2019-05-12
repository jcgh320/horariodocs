
package tablas;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tabla extends JFrame
{
    public Tabla() 
    {
    super("Tabla Horas");
    
            DefaultTableModel Datos=new DefaultTableModel();
            Datos.addColumn("Nombre");
            Datos.addColumn("Años en hospital");
            Datos.addColumn("Especialidad");
            Datos.addColumn("Turno");
            Datos.addColumn("Excusas");
            Datos.addColumn("Horas disponibles");
            
            String[]p1={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p2={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p3={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p4={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p5={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p6={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p7={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p8={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]p9={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            String[]pN={"Nombre 1","años","especialidad","num Turno","excusa si/no","cant Horas"};
            
            Datos.addRow(p1);
            Datos.addRow(p2);
            Datos.addRow(p3);
            Datos.addRow(p4);
            Datos.addRow(p5);
            Datos.addRow(p6);
            Datos.addRow(p7);
            Datos.addRow(p8);
            Datos.addRow(p9);
            Datos.addRow(pN);
            
            JTable Tablas=new JTable(Datos);
            Tablas.setBounds(12,22,500,500);
            setSize(750,750);
            add(Tablas);
            setDefaultCloseoperation(JFrame.EXIT_ON_CLOSE);
            setLayout(null);
            setVisible(true);
    }
public static void main (String[] a)
{
    Tablas t1=new Tablas();
}
    private void setDefaultCloseoperation(int EXIT_ON_CLOSE) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
