package com.example.pruebacierreparametrizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    Spinner spMotivo;
    ArrayAdapter<String> adapterMotivos;
    TableLayout tlTrafos;

    private String arrayMotivos[] = { "SELECCIONE UN MOTIVO", "FALLA LINEA BT PROVOCADA POR VIENTOS FUERTES.", "FALLA LINEA BT PROVOCADA POR GRANIZO DE GRAN MAGNITUD.", "FALLA LINEA BT PROVOCADA POR DESCARGA ATMOSFERICA." };

    private String arrayElementos[] = { "Alimentador", "Consumidor", "Puestos" };
    private String arrayReles[] = { "Sin Información", "Temporizado fases sobrecorriente",
            "Instantáneo fase sobrecorriente", "Temporizado neutro sobrecorriente",
            "Direccional neutro", "frecuencia" };
    private String arrayCierre[] = { "Remoto", "Local", "Automatico" };
    private String arrayTipoFalla[] = { "Monofásico", "Trifásico" };

    private String arrayOrigen[] = { "Subtransmisión", "Distribución Primaria",
            "Distribución Secundaria", "Generación", "Transmisión",
            "Otros no pertenecientes al distribuidor" };

    private String arrayCausa[] = { "VIENTO", "NEVADA O GRANIZO", "DESCARGA ATMOSFERICA",
            "MANTENIMIENTO PREVENTIVO" };
    private String arrayCausaInterna1[] = { "VIENTO", "NEVADA O GRANIZO", "DESCARGA ATMOSFERICA",
            "CAMBIO DE TRANSFORMADOR", "CAMBIO DE TAP" };
    private String arrayCausaInterna2[] = { "REPARACIONES", "CAMBIO DE POSTE" };
    private String arrayCausaInterna3[] = { "MANTENIMIENTO PREVENTIVO" };

    private String arrayCodigoReclamo[] = { "Interferencia", "Sin energía - Instalación interior",
            "Sin energía - Edificio", "Sin energía - Cuadra", "Sin energía - zona",
            "Sin energía - Ciudad","Sin energía - Alimentador" };

    TextView tvTrafo;
    TextView tvTipoFalla2, tvCodigoReclamo2, tvOrigen2, tvElemento2, tvReles2, tvCierre2, tvCausa2, tvCausaInterna2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        spMotivo = ( Spinner ) findViewById( R.id.spMotivo );
        adapterMotivos = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayMotivos );
        spMotivo.setAdapter( adapterMotivos );

        spMotivo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                switch ( position ) {
                    case 0:
                        tvTrafo = findViewById( R.id.tvTrafos );
                        tvTrafo.setVisibility( View.GONE );

                        tlTrafos = findViewById( R.id.tableTrafos );
                        tlTrafos.setVisibility( View.GONE );
                        break;
                    case 1:

                        tvTrafo = findViewById( R.id.tvTrafos );
                        tvTrafo.setVisibility( View.GONE );

                        tlTrafos = findViewById( R.id.tableTrafos );
                        tlTrafos.setVisibility( View.GONE );

                        tvTipoFalla2 = findViewById( R.id.tvTipoFalla2);
                        tvCodigoReclamo2 = findViewById( R.id.tvCodigoReclamo2);
                        tvOrigen2 = findViewById( R.id.tvOrigen2);
                        tvElemento2 = findViewById( R.id.tvElemento2);
                        tvReles2 = findViewById( R.id.tvReles2);
                        tvCierre2 = findViewById( R.id.tvCierre2);
                        tvCausa2 = findViewById( R.id.tvCausa2);
                        tvCausaInterna2 = findViewById( R.id.tvCausaInterna2);

                        tvTipoFalla2.setText( arrayTipoFalla[0] );
                        tvCodigoReclamo2.setText( arrayCodigoReclamo[0] );
                        tvOrigen2.setText( arrayOrigen[0] );
                        tvElemento2.setText( arrayElementos[0] );
                        tvReles2.setText( arrayReles[0] );
                        tvCierre2.setText( arrayCierre[0] );
                        tvCausa2.setText( arrayCausa[0] );
                        tvCausaInterna2.setText( arrayCausaInterna1[0] );

                        break;

                    case 2:
                        tvTrafo = findViewById( R.id.tvTrafos );
                        tvTrafo.setVisibility( View.GONE );

                        tlTrafos = findViewById( R.id.tableTrafos );
                        tlTrafos.setVisibility( View.GONE );

                        tvTipoFalla2 = findViewById( R.id.tvTipoFalla2);
                        tvCodigoReclamo2 = findViewById( R.id.tvCodigoReclamo2);
                        tvOrigen2 = findViewById( R.id.tvOrigen2);
                        tvElemento2 = findViewById( R.id.tvElemento2);
                        tvReles2 = findViewById( R.id.tvReles2);
                        tvCierre2 = findViewById( R.id.tvCierre2);
                        tvCausa2 = findViewById( R.id.tvCausa2);
                        tvCausaInterna2 = findViewById( R.id.tvCausaInterna2);

                        tvTipoFalla2.setText( arrayTipoFalla[1] );
                        tvCodigoReclamo2.setText( arrayCodigoReclamo[1] );
                        tvOrigen2.setText( arrayOrigen[1] );
                        tvElemento2.setText( arrayElementos[1] );
                        tvReles2.setText( arrayReles[1] );
                        tvCierre2.setText( arrayCierre[1] );
                        tvCausa2.setText( arrayCausa[1] );
                        tvCausaInterna2.setText( arrayCausaInterna1[1] );
                        break;

                    case 3:
                        tvTrafo = findViewById( R.id.tvTrafos );
                        tvTrafo.setVisibility( View.VISIBLE );

                        tlTrafos = findViewById( R.id.tableTrafos );
                        tlTrafos.setVisibility( View.VISIBLE );

                        tvTipoFalla2 = findViewById( R.id.tvTipoFalla2);
                        tvCodigoReclamo2 = findViewById( R.id.tvCodigoReclamo2);
                        tvOrigen2 = findViewById( R.id.tvOrigen2);
                        tvElemento2 = findViewById( R.id.tvElemento2);
                        tvReles2 = findViewById( R.id.tvReles2);
                        tvCierre2 = findViewById( R.id.tvCierre2);
                        tvCausa2 = findViewById( R.id.tvCausa2);
                        tvCausaInterna2 = findViewById( R.id.tvCausaInterna2);

                        tvTipoFalla2.setText( arrayTipoFalla[0] );
                        tvCodigoReclamo2.setText( arrayCodigoReclamo[2] );
                        tvOrigen2.setText( arrayOrigen[2] );
                        tvElemento2.setText( arrayElementos[2] );
                        tvReles2.setText( arrayReles[2] );
                        tvCierre2.setText( arrayCierre[2] );
                        tvCausa2.setText( arrayCausa[2] );
                        tvCausaInterna2.setText( arrayCausaInterna1[2] );


                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}