package com.example.graphapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar_chart);
        BarChart chart = findViewById(R.id.barchart);

        ArrayList<BarEntry> NoOfEmp = new ArrayList<BarEntry>();

        NoOfEmp.add(new BarEntry(945f, 0));
        NoOfEmp.add(new BarEntry(1040f, 1));
        NoOfEmp.add(new BarEntry(1133f, 2));
        NoOfEmp.add(new BarEntry(1240f, 3));


        ArrayList<String> year = new ArrayList<String>();

        year.add("2008");
        year.add("2009");
        year.add("2010");
        year.add("2011");


        BarDataSet bardataset = new BarDataSet(NoOfEmp, "No Of Employee");
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        chart.animateY(5000);
        BarData data = new BarData( bardataset);
        data.setBarWidth(50f);

        chart.setData(data);
    }
}

