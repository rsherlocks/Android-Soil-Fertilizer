package com.example.androishaper.soil_fertilizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner spin1,spin2,spin3,spin4;
    int a,b,c;
    int land;
    int answer;
    EditText edt;
    Button btn;
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin1=(Spinner)findViewById(R.id.spin1);
        spin2=(Spinner)findViewById(R.id.spin2);
        spin3=(Spinner)findViewById(R.id.spin3);
        spin4=(Spinner)findViewById(R.id.spin4);
        edt=(EditText) findViewById(R.id.edt);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);

        Typeface banglafont= Typeface.createFromAsset(getAssets(),"font/SutonnyMJ-Bold.ttf");
        edt.setTypeface(banglafont);





        final String jute[]={"বাছাই করুন","পাট(তোষা পাত-২ ও বিনা পাত-২)"};
        final String paddy[]={"বাছাই করুন","গম(প্রতিভা,শতাব্দি,গৌরব)","ভুট্টা(হাইব্রিড)","রোপা আউশ(ব্রিধান-২৭ ও ইরাটম-২৪)","রোপা আমন(বি আর-২৫, ও ব্রিধান-৩৩,৩৯ এবং বিনাশাইল)","বোরো(বি আর-১,২৭,১৫ ও ব্রিধান-২৮,৩৫,৩৬)"};
        final String vegitable[]={"বাছাই করুন","আলু(হীরা,ডায়মন্ড, বারি আলু-১৮,১৯,২০)","বেগুন(উত্তরা,তারাপুরি,নয়নতারা)","ফুলকপি(সকল জাত)","সিম(সকল জাত)","লাউ(বারি লাউ-১ ও অনন্যা জাত)","মিষ্টি কুমড়া(সকল জাত)","টমেটো(মানিক,বারি তমেত-৭,৮,৯,১০,বিন টমেটো-৩)"};
        final String fruit[]={"বাছাই করুন","কলা(বারি কলা-১,২ ও অনন্যা জাত) ","লিছু(বারি-১,২,৩,৪,বাউ-২,৩,৪ এবং অনন্যা জাত)","কমলা(বারি-১ এবং অনন্যা জাত","মাল্টা(বারি-১,বাউ-১)",
                "পেয়ারা(কাজি,বারি-২,৩,৫,বাউ-৭,৮,৯ ও অনন্যা)","আম(বারি-১,২,৩ ও অনন্যা জাত)"};
        final String check[]={"প্রথমে ফসলের ক্যাটাগরি বাছাই করুন"};
        final ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(myAdapter);
        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long p) {


                a=i;
                if(i==0)
                {
                    final ArrayAdapter<String> zeroAddapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,check);
                    spin2.setAdapter(zeroAddapter);
                    Toast.makeText(MainActivity.this,"প্রথমে ফসলের ক্যাটাগরি বাছাই করুন",Toast.LENGTH_LONG).show();
                    spin2.setSelection(0);



                }
                if(i==1)
                {
                    final ArrayAdapter<String> myAddapter1=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,jute);
                    spin2.setAdapter(myAddapter1);

                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int j, long q) {
                            spin2.setSelection(0);
                            b=j;



                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });



                }
                if(i==2)
                {
                    final ArrayAdapter<String> myAddapter2=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,paddy);
                    spin2.setAdapter(myAddapter2);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int j, long q) {
                            b=j;
                            Toast.makeText(MainActivity.this,"vslue"+b,Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });



                }
                if(i==3)
                {
                    final ArrayAdapter<String> myAddapter3=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,vegitable);
                    spin2.setAdapter(myAddapter3);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int j, long q) {
                            b=j;
                            Toast.makeText(MainActivity.this,"vslue"+b,Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                }
                if(i==4)
                {
                    final ArrayAdapter<String> myAddapter3=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,fruit);
                    spin2.setAdapter(myAddapter3);
                    spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int j, long q) {
                            b=j;
                            Toast.makeText(MainActivity.this,"vslue"+b,Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                }


                //a=i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //
        final ArrayAdapter<String> Adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names2));
        Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(Adapter);
        //
        spin3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int k, long r) {
                c=k;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //
        //
        final ArrayAdapter<String> Adapter2 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.names1));
        Adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin4.setAdapter(Adapter2);




    }

    @Override
    public void onClick(View v) {
        value= edt.getText().toString();

        String spin1=Integer.toString(a);
        String spin2=Integer.toString(b);
        String spin3=Integer.toString(c);
        answer=a+b+c;

        if(v.getId()==R.id.btn) {
            if (edt.getText().length() > 0 && answer>0) {
                edt.setText("");
                Intent it=new Intent(MainActivity.this,Table_Layout.class);
                it.putExtra("land",value);
                it.putExtra("select1",spin1);
                it.putExtra("select2",spin2);
                it.putExtra("select3",spin3);
                Toast.makeText(MainActivity.this, "value"+a+b+c+answer, Toast.LENGTH_LONG).show();
                startActivity(it);

            }
            else
            {
                Toast.makeText(MainActivity.this, "At First Fillup All Citeria", Toast.LENGTH_LONG).show();
            }
        }


    }
}
