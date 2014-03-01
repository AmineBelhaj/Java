import java.sql.SQLException;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
public class PieChart extends JFrame{
    DefaultPieDataset dataset;//Dataset qui va contenir les Données
    JFreeChart graphe;        //Graphe
    ChartPanel cp;            //Panel
    public PieChart() {
        dataset = new DefaultPieDataset();
//Statique
        dataset.setValue("Java",new Double(60.0) );
        dataset.setValue("BD",new Double(20.0) );
        dataset.setValue("Maths",new Double(80.0) );
        dataset.setValue("Info", new Double(60.0));
        dataset.setValue("Mecanique", new Double(50.0));
graphe = ChartFactory.createPieChart3D("Exemple Camemberg", dataset,true ,true ,false);
        cp = new ChartPanel(graphe);
        this.add(cp);
    }
	 public static void main (String args[]){
        PieChart pchart = new PieChart();
        pchart.setVisible(true);

    }
}

