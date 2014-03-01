package GoldenCage.Presentation.Administrateur.Jfreechart;

import java.io.IOException;
import org.jfree.chart.*;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.*;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.*;

public class BarChart extends ApplicationFrame {
    public BarChart(final String title) throws IOException {
        super(title);
        final CategoryDataset dataset = createDataset();
        final JFreeChart graphe = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(graphe);
        chartPanel.setPreferredSize(new java.awt.Dimension(400, 400));
        setContentPane(chartPanel);
    }
public CategoryDataset createDataset() throws IOException {
        // 0. Création d'un diagramme.
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       //Valeurs statiques
        dataset.addValue(10, "Taux de défaut de couverture", " ");
        dataset.addValue(12, " Taux de couverture Outdoor", " ");
        dataset.addValue(25, "Taux de couverture Indoor", " ");
        dataset.addValue(19, "Taux de couverture Incar", " ");
       return dataset;
    }
	public JFreeChart createChart(CategoryDataset dataset) {
        final JFreeChart chart = ChartFactory.createBarChart3D(
                " le taux des produits ", // chart title
                " ", // domain axis label
                "  Le nombre de produit ", // range axis label
                dataset, // data
                PlotOrientation.VERTICAL, // orientation
                true, // include legend
                true, // tooltips
                true // urls
                );

 final CategoryPlot plot = chart.getCategoryPlot();
        final CategoryAxis axis = plot.getDomainAxis();
        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
        final CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setItemLabelsVisible(true); 
        return chart;
    }
    public static void main(final String[] args) throws IOException {
        final BarChart demo = new BarChart("Test de la couverture ");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }
}
