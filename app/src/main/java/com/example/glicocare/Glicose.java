package com.example.glicocare;

import static com.androidplot.xy.CatmullRomInterpolator.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.graphics.DashPathEffect;
import android.graphics.*;
import android.os.Bundle;

import com.androidplot.util.PixelUtils;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYSeries;
import com.androidplot.xy.*;
import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.CatmullRomInterpolator;
import com.androidplot.xy.XYGraphWidget;

import com.androidplot.xy.XYPlot;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.*;

public class Glicose extends AppCompatActivity {

    private XYPlot plot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glicose);

        plot = findViewById(R.id.grafico);

        popularDadosGraficos();

    }

    private void popularDadosGraficos() {
        final Number [] serieMonitoramentos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> dados = new ArrayList<>();
        dados.add(99);
        dados.add(100);
        dados.add(99);
        dados.add(110);
        dados.add(99);
        dados.add(100);
        dados.add(115);
        dados.add(120);
        dados.add(110);
        dados.add(99);

        Number[] serie = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i=0; i < dados.size(); i++) {

            int valor = (dados.get(i));
            serie[i] = valor;
        }

        XYSeries series1 = new SimpleXYSeries(
                Arrays.asList(serie), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Series");

        LineAndPointFormatter series1Format =
                new LineAndPointFormatter(Color.YELLOW, Color.YELLOW, null, null);

        series1Format.setInterpolationParams(
                new CatmullRomInterpolator.Params(10, CatmullRomInterpolator.Type.Centripetal));

        plot.addSeries(series1, series1Format);

        plot.getGraph().getLineLabelStyle(XYGraphWidget.Edge.BOTTOM).setFormat(new Format() {
            @Override
            public StringBuffer format(Object obj, @NonNull StringBuffer toAppendTo, @NonNull FieldPosition pos) {
                int i = Math.round(((Number) obj).floatValue());
                return toAppendTo.append(serieMonitoramentos[i]);
            }
            @Override
            public Object parseObject(String source, @NonNull ParsePosition pos) {
                return null;
            }
        });
    }
}