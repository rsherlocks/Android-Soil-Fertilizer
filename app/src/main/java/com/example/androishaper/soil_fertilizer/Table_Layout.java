package com.example.androishaper.soil_fertilizer;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Table_Layout extends AppCompatActivity {
    TextView txt04,txt14,txt24,txt34;
    int a,b,c;
    double ansN;
    double ansF;
    double ansP;
    double d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table__layout);
        txt04=findViewById(R.id.txt04);
        txt14=findViewById(R.id.txt14);
        txt24=findViewById(R.id.txt24);
        txt34=findViewById(R.id.txt34);
        String pt=getIntent().getStringExtra("land");
        String kt1=getIntent().getStringExtra("select1");
        String kt2=getIntent().getStringExtra("select2");
        String kt3=getIntent().getStringExtra("select3");
        d=Double.valueOf(pt);
        a=new Integer(kt1).intValue();
        b=new Integer(kt2).intValue();
        c=new Integer(kt3).intValue();
        DecimalFormat real=new DecimalFormat("0.0000");
        Toast.makeText(Table_Layout.this, "value "+a+" "+b+" "+c, Toast.LENGTH_LONG).show();
        //pat
        if(a==1 && b==1 && (c>=1&&c<=2))
        {
            ansN=(d*0.773);
            ansF=(d*0.71);
            ansP=(d*0.332);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");


        }
        else if(a==1 && b==1 && (c>=3&&c<=5))
        {
            ansN=(d*1.81);
            ansF=(d*0.71);
            ansP=(d*0.332);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //gom
        else if(a==2 && b==1 && (c>=1&&c<=2))
        {
            ansN=(d*1.234);
            ansF=(d*0.101);
            ansP=(d*0.368);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==2 && b==1 && (c>=3&&c<=5))
        {
            ansN=(d*1.234);
            ansF=(d*0.719);
            ansP=(d*0.368);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vutta
        else if(a==2 && b==2 && (c>=1&&c<=2))
        {
            ansN=(d*2.003);
            ansF=(d*0.182);
            ansP=(d*0.453);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==2 && b==2 && (c>=3&&c<=5))
        {
            ansN=(d*2.003);
            ansF=(d*1.285);
            ansP=(d*0.453);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //ropa aush
        else if(a==2 && b==3 && (c>=1&&c<=2))
        {
            ansN=(d*0.773);
            ansF=(d*0.40);
            ansP=(d*0.61);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==2 && b==3 && (c>=3&&c<=5))
        {
            ansN=(d*0.773);
            ansF=(d*0.213);
            ansP=(d*0.61);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //ropa amon
        else if(a==2 && b==4 && (c>=1&&c<=2))
        {
            ansN=(d*0.619);
            ansF=(d*0.40);
            ansP=(d*0.45);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==2 && b==4 && (c>=3&&c<=5))
        {
            ansN=(d*0.619);
            ansF=(d*0.213);
            ansP=(d*0.45);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //boro
        else if(a==2 && b==5 && (c>=1&&c<=2))
        {
            ansN=(d*1.081);
            ansF=(d*0.51);
            ansP=(d*0.81);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==2 && b==5 && (c>=3&&c<=5))
        {
            ansN=(d*1.081);
            ansF=(d*0.263);
            ansP=(d*0.81);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vegitable alu
        else if(a==3 && b==1 && (c>=1&&c<=2))
        {
            ansN=(d*1.388);
            ansF=(d*0.101);
            ansP=(d*0.551);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==3 && b==1 && (c>=3&&c<=5))
        {
            ansN=(d*1.388);
            ansF=(d*0.719);
            ansP=(d*0.551);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vegitable begun
        else if(a==3 && b==2 && (c>=1&&c<=2))
        {
            ansN=(d*1.234);
            ansF=(d*0.121);
            ansP=(d*0.368);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==3 && b==2 && (c>=3&&c<=5))
        {
            ansN=(d*1.234);
            ansF=(d*0.860);
            ansP=(d*0.368);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vegitable fulkopi
        else if(a==3 && b==3 && (c>=1&&c<=2))
        {
            ansN=(d*1.234);
            ansF=(d*0.202);
            ansP=(d*0.496);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==3 && b==3 && (c>=3&&c<=5))
        {
            ansN=(d*1.234);
            ansF=(d*1.427);
            ansP=(d*0.496);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vegitable shim
        else if(a==3 && b==4 && (c>=1&&c<=2))
        {
            ansN=(d*0.773);
            ansF=(d*0.101);
            ansP=(d*0.186);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==3 && b==4 && (c>=3&&c<=5))
        {
            ansN=(d*0.773);
            ansF=(d*0.719);
            ansP=(d*0.186);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vegitable lau
        else if(a==3 && b==5 && (c>=1&&c<=2))
        {
            ansN=(d*0.153);
            ansF=(d*0.22);
            ansP=(d*0.76);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==3 && b==5 && (c>=3&&c<=5))
        {
            ansN=(d*0.153);
            ansF=(d*0.160);
            ansP=(d*0.76);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vegitable mistikumra
        else if(a==3 && b==6 && (c>=1&&c<=2))
        {
            ansN=(d*0.153);
            ansF=(d*0.22);
            ansP=(d*0.76);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==3 && b==6 && (c>=3&&c<=5))
        {
            ansN=(d*0.153);
            ansF=(d*0.91);
            ansP=(d*0.76);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //vegitable tomatoo
        else if(a==3 && b==7 && (c>=1&&c<=2))
        {
            ansN=(d*1.234);
            ansF=(d*0.121);
            ansP=(d*0.308);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==3 && b==7 && (c>=3&&c<=5))
        {
            ansN=(d*1.234);
            ansF=(d*0.806);
            ansP=(d*0.308);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        //fruit kola
        else if(a==4 && b==1 && (c>=1&&c<=2))
        {
            ansN=(d*.343);
            ansF=(d*0.25);
            ansP=(d*0.130);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("প্রয়োজন মত");

        }
        else if(a==4 && b==1 && (c>=3&&c<=5))
        {
            ansN=(d*.245);
            ansF=(d*0.25);
            ansP=(d*0.130);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("4 KG");

        }
        //fruit lichi
        else if(a==4 && b==2 && (c>=1&&c<=5))
        {
            ansN=(d*0);
            ansF=(d*0.500);
            ansP=(d*0);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("10 KG");

        }
        //fruit komola
        else if(a==4 && b==3 && (c>=1&&c<=5))
        {
            ansN=(d*0);
            ansF=(d*0.250);
            ansP=(d*0);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("15 KG");

        }
        //fruit malta
        else if(a==4 && b==4 && (c>=1&&c<=5))
        {
            ansN=(d*0);
            ansF=(d*0.250);
            ansP=(d*0);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("15 KG");

        }
        //fruit peyara
        else if(a==4 && b==5 && (c>=1&&c<=5))
        {
            ansN=(d*0);
            ansF=(d*0.250);
            ansP=(d*0);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("30 KG");

        }
        //fruit mango
        else if(a==4 && b==5 && (c>=1&&c<=5))
        {
            ansN=(d*0);
            ansF=(d*0.500);
            ansP=(d*0);

            txt04.setText(real.format(ansN)+" "+"KG");
            txt14.setText(real.format(ansF)+" "+"KG");
            txt24.setText(real.format(ansP)+" "+"KG");
            txt34.setText("25 KG");

        }

    }
}
