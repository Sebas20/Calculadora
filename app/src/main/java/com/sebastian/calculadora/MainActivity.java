package com.sebastian.calculadora;

import android.support.annotation.FloatRange;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bUno, bDos, bTres, bCuatro, bCinco, bSeis, bSiete, bOcho, bNueve, bCero, bMas, bMenos, bPor, bDividido, bPunto, bIgual;
    private TextView tResultado;
    private String numeros = "", Resul = "";
    private float numero_1, numero_2, resultado, flag = 0, flag_1 = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bCero = (Button) findViewById(R.id.bCero);
        bUno = (Button) findViewById(R.id.bUno);
        bDos = (Button) findViewById(R.id.bDos);
        bTres = (Button) findViewById(R.id.bTres);
        bCuatro = (Button) findViewById(R.id.bCuatro);
        bCinco = (Button) findViewById(R.id.bCinco);
        bSeis = (Button) findViewById(R.id.bSeis);
        bSiete = (Button) findViewById(R.id.bSiete);
        bOcho = (Button) findViewById(R.id.bOcho);
        bNueve = (Button) findViewById(R.id.bNueve);
        bPunto = (Button) findViewById(R.id.bPunto);
        bIgual = (Button) findViewById(R.id.bIgual);
        bMas = (Button) findViewById(R.id.bMas);
        bMenos = (Button) findViewById(R.id.bMenos);
        bPor = (Button) findViewById(R.id.bPor);
        bDividido = (Button) findViewById(R.id.bDividido);
        tResultado = (TextView) findViewById(R.id.tResultado);


        bCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "0";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });

        bUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "1";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });

        bDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "2";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });
        bTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "3";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });
        bCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "4";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });
        bCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "5";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });
        bSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "6";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });
        bSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "7";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });
        bOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "8";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });
        bNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + "9";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });

        bPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeros = numeros + ".";
                tResultado.setText(numeros);
                flag_1 = 0;
            }
        });

        bIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag > 0) {

                    if (flag == 1) {
                        if (flag_1 == 0 || flag_1 == 1) {
                            if (numeros.isEmpty()) {
                                numero_2 = 0;
                            } else {
                                numero_2 = Float.parseFloat(numeros);
                                numeros = "";
                            }
                        }
                        resultado = numero_1 + numero_2;
                    }
                    if (flag == 2) {
                        if (flag_1 == 0 || flag_1 == 1) {
                            if (numeros.isEmpty()) {
                                numero_2 = 0;
                            } else {
                                numero_2 = Float.parseFloat(numeros);
                                numeros = "";
                            }
                        }
                        resultado = numero_1 - numero_2;
                    }
                    if (flag == 3) {
                        if (flag_1 == 0 || flag_1 == 1) {
                            if (numeros.isEmpty()) {
                                numero_2 = 1;
                            } else {
                                numero_2 = Float.parseFloat(numeros);
                                numeros = "";
                            }
                        }
                        resultado = numero_1 * numero_2;
                    }
                    if (flag == 4) {
                        if (flag_1 == 0 || flag_1 == 1) {
                            if (numeros.isEmpty()) {
                                numero_2 = 1;
                            } else {
                                numero_2 = Float.parseFloat(numeros);
                                numeros = "";
                            }
                        }
                        resultado = numero_1 / numero_2;
                    }
                    numero_1 = resultado;
                    Resul = Float.toString(resultado);
                    flag_1 = 1;
                    flag = 0;
                    tResultado.setText(Resul);
                }
            }

        });

        bMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_1 == 0 && flag == 0) {
                    numero_1 = Float.parseFloat(numeros);
                    numeros = "";
                }
                flag = 2;

            }

        });

        bPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_1 == 0 && flag == 0) {
                    numero_1 = Float.parseFloat(numeros);
                    numeros = "";
                }
                flag = 3;


            }

        });

        bDividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_1 == 0 && flag == 0) {
                    numero_1 = Float.parseFloat(numeros);
                    numeros = "";
                }
                flag = 4;


            }

        });

        bMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flag_1 == 0 && flag == 0) {
                    numero_1 = Float.parseFloat(numeros);
                    numeros = "";
                }
                flag = 1;
            }

        });


    }


}
