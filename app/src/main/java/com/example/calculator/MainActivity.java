package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.exp;
import static java.lang.Math.log;
import static java.lang.Math.log10;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sinh;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class MainActivity extends AppCompatActivity {

    EditText _input;
    TextView _text;
    Button _zero, _one, _two, _three, _four, _five, _six, _seven, _eight, _nine;
    Button _minus, _mul, _div, _del, _plus, _dot, _equal;
    Button _root, _squre, _factorial, _power, _pai, _log, _ln, _tan, _cos, _sin,_exp,_mod;
    boolean sum, mul, sub, div, power,mod;
    double _value1, _value2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linkWithXml();
        inputValue();
        calculation();
    }



    public void linkWithXml() {

        _input = (EditText) findViewById(R.id.input_);

        _text = (TextView) findViewById(R.id.text_);

        _zero = (Button) findViewById(R.id.zero_);
        _one = (Button) findViewById(R.id.one_);
        _two = (Button) findViewById(R.id.two_);
        _three = (Button) findViewById(R.id.three_);
        _four = (Button) findViewById(R.id.four_);
        _five = (Button) findViewById(R.id.five_);
        _six = (Button) findViewById(R.id.six_);
        _seven = (Button) findViewById(R.id.seven_);
        _eight = (Button) findViewById(R.id.eight_);
        _nine = (Button) findViewById(R.id.nine_);


        _dot = (Button) findViewById(R.id.dot_);
        _plus = (Button) findViewById(R.id.plus_);
        _minus = (Button) findViewById(R.id.sub_);
        _mul = (Button) findViewById(R.id.mul_);
        _div = (Button) findViewById(R.id.div_);
        _del = (Button) findViewById(R.id.del_);
        _equal = (Button) findViewById(R.id.equl_);

        _root = (Button) findViewById(R.id.root_);
        _squre = (Button) findViewById(R.id.squre_);
        _factorial = (Button) findViewById(R.id.fact_);
        _power = (Button) findViewById(R.id.pow_);
        _pai = (Button) findViewById(R.id.pi_);
        _log = (Button) findViewById(R.id.log_);
        _sin = (Button) findViewById(R.id.sin_);
        _cos = (Button) findViewById(R.id.cos_);
        _tan = (Button) findViewById(R.id.tan_);
        _ln = (Button) findViewById(R.id.ln_);
        _exp = (Button)findViewById(R.id.backet1_);
        _mod = (Button)findViewById(R.id.backet2_);


    }


    private void inputValue() {

        try {

            _one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "1");

                }
            });

            _two.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "2");

                }
            });

            _three.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "3");

                }
            });

            _four.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "4");

                }
            });

            _five.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "5");

                }
            });

            _six.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "6");

                }
            });

            _seven.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "7");

                }
            });

            _eight.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "8");

                }
            });

            _nine.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "9");

                }
            });

            _zero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + "0");

                }
            });

            _dot.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText(_input.getText() + ".");

                }
            });

            _del.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    _input.setText("");
                    _text.setText("");

                }
            });


            _plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{

                        _value1 = Double.parseDouble(_input.getText() + "");
                        sum = true;
                        _input.setText(null);
                        _text.setText(_value1+" +");
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });

            _minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try{
                        _value1 = Double.parseDouble(_input.getText() + "");
                        sub = true;
                        _input.setText(null);
                        _text.setText(_value1+" -");

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });

            _mul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{
                        _value1 = Double.parseDouble(_input.getText() + "");
                        mul = true;
                        _input.setText(null);
                        _text.setText(_value1+" *");

                    }catch (NumberFormatException e){
                        e.printStackTrace();
                    }
                }
            });

            _div.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        _value1 = Double.parseDouble(_input.getText() + "");
                        div = true;
                        _input.setText(null);
                        _text.setText(_value1+" /");
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            });

            _squre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        _value1 = Double.parseDouble(_input.getText() + "");

                        _input.setText(_value1 * _value1 + "");
                        _text.setText("("+_value1+")^2");

                    }catch (Exception e){
                        e.printStackTrace();
                    }


                }
            });

            _root.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try{
                        _value1 = Double.parseDouble(_input.getText() + "");
                        _input.setText(sqrt(_value1) + "");
                        _text.setText("√("+_value1+")");

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });

            _power.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        _value1 = Double.parseDouble(_input.getText() + "");
                        power = true;
                        _input.setText(null);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                }
            });

            _pai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    double pai = PI;

                    _input.setText(String.valueOf(pai));

                }
            });

            _mod.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        _value1 = Double.parseDouble(_input.getText()+"");
                        mod = true;
                        _input.setText(null);
                        _text.setText(_value1+" %");
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }

                }
            });


            _factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        _value1 = Double.parseDouble(_input.getText() + "");

                        double factorial = 1;
                        int i = 1;
                        while (i <= _value1) {
                            factorial = factorial * i;
                            i++;
                        }
                        _text.setText(_value1+"!");
                        _input.setText(String.valueOf(factorial));
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
            });

            _sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   try {
                       _value1 = Double.parseDouble(_input.getText()+"");
                       double result = sin(_value1);
                       _text.setText("sin("+_value1+")");
                       _input.setText(String.valueOf(result));

                   }catch (Exception e){
                       e.printStackTrace();
                   }
                }
            });

            _cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try{

                        _value1 = Double.parseDouble(_input.getText()+"");
                        double result = cos(_value1);
                        _text.setText("cos("+_value1+")");
                        _input.setText(String.valueOf(result));


                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });

            _tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try{
                        _value1 = Double.parseDouble(_input.getText()+"");
                        double result = tan(_value1);
                        _input.setText(String.valueOf(result));
                        _text.setText("tan("+_value1+")");

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });

            _ln.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try{
                        _value1 = Double.parseDouble(_input.getText()+"");
                        double result = log(_value1);
                        _input.setText(String.valueOf(result));
                        _text.setText("ln("+_value1+")");

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });

            _log.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try{
                        _value1 = Double.parseDouble(_input.getText()+"");
                        double result = log10(_value1);
                        _input.setText(String.valueOf(result));
                        _text.setText("log("+_value1+")");

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });

            _exp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try{
                        _value1 = Double.parseDouble(_input.getText()+"");
                        double result = exp(_value1);
                        _input.setText(String.valueOf(result));
                        _text.setText("e("+_value1+")");

                    }catch (Exception e){
                        e.printStackTrace();
                    }

                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    private void calculation() {

        try {

            _equal.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    try {
                        _value2 = Double.parseDouble(_input.getText() + "");

                        if (sum == true) {

                            _input.setText(_value1 + _value2 + "");
                            _text.setText("");
                            sum = false;
                        } else if (sub == true) {

                            _input.setText(_value1 - _value2 + "");
                            _text.setText("");
                            sub = false;
                        } else if (mul == true) {

                            _input.setText(_value1 * _value2 + "");
                            _text.setText("");
                            mul = false;
                        } else if (div == true) {

                            _input.setText(_value1 / _value2 + "");
                            _text.setText("");
                            div = false;
                        } else if (power == true) {

                            _input.setText(pow(_value1,_value2) + "");
                            _text.setText("");
                            power = false;
                        }else if (mod == true) {

                            _input.setText((_value1 % _value2) + "");
                            _text.setText("");
                            mod = false;
                        }

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.about){
            Intent aboutIntent=new Intent(getApplicationContext(), About.class);
            startActivity(aboutIntent);
        }
        return super.onOptionsItemSelected(item);
    }
}

