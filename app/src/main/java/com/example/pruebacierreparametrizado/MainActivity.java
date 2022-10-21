package com.example.pruebacierreparametrizado;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spElemento, spReles, spCierre, spTipoFalla, spCausa, spOrigen,
            spCausaInterna, spCodigoReclamo;
    ArrayAdapter<String> adapterElementos, adapterReles, adapterCierre, adapterTipoFalla,
            adapterCausa, adapterOrigen, adapterCausaInterna1, adapterCausaInterna2,
            adapterCausaInterna3, adapterCodigoReclamo;;
    LinearLayout lyElementos;

    private String arrayElementos[] = { "Alimentador", "Consumidor", "Cuchilla", "Puestos" };
    private String arrayReles[] = { "Sin Información", "Temporizado fases sobrecorriente",
            "Instantáneo fase sobrecorriente", "Temporizado neutro sobrecorriente",
            "Direccional neutro", "frecuencia" };
    private String arrayCierre[] = { "Remoto", "Local", "Automatico" };
    private String arrayTipoFalla[] = { "Monofásico", "Trifásico" };

    private String arrayOrigen[] = { "Subtransmisión", "Distribución Primaria",
            "Distribución Secundaria", "Generación", "Transmisión",
            "Otros no pertenecientes al distribuidor" };

    private String arrayCausa[] = { "AMPLIACIONES O MEJORAS", "REPARACIONES",
            "MANTENIMIENTO PREVENTIVO" };
    private String arrayCausaInterna1[] = { "AMPLIACION O MEJORA", "EXTENSION LINEA",
            "CAMBIO DE TRANSFORMADOR", "CAMBIO DE TAP" };
    private String arrayCausaInterna2[] = { "REPARACIONES", "CAMBIO DE POSTE" };
    private String arrayCausaInterna3[] = { "MANTENIMIENTO PREVENTIVO" };

    private String arrayCodigoReclamo[] = { "Interferencia", "Sin energía - Instalación interior",
            "Sin energía - Edificio", "Sin energía - Cuadra", "Sin energía - zona",
            "Sin energía - Ciudad","Sin energía - Alimentador" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spElemento = ( Spinner ) findViewById( R.id.spElemento );
        spReles = ( Spinner ) findViewById( R.id.spReles );
        spCierre = ( Spinner ) findViewById( R.id.spCierre );
        spTipoFalla = ( Spinner ) findViewById( R.id.spTipoFalla );
        spOrigen = ( Spinner ) findViewById( R.id.spOrigen );
        spCausa = ( Spinner ) findViewById( R.id.spCausa );
        spCausaInterna = ( Spinner ) findViewById( R.id.spCausaInterna );
        spCodigoReclamo = ( Spinner ) findViewById( R.id.spCodigoReclamo );

        adapterElementos = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayElementos );
        adapterReles = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayReles );
        adapterCierre = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayCierre );
        adapterTipoFalla = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayTipoFalla );
        adapterOrigen = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayOrigen );
        adapterCausa = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayCausa );
        adapterCausaInterna1 = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayCausaInterna1 );
        adapterCausaInterna2 = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayCausaInterna2 );
        adapterCausaInterna3 = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayCausaInterna3 );
        adapterCodigoReclamo = new ArrayAdapter<>( this, android.R.layout.simple_spinner_dropdown_item, arrayCodigoReclamo );

        spElemento.setAdapter( adapterElementos );
        spReles.setAdapter( adapterReles );
        spCierre.setAdapter( adapterCierre );
        spTipoFalla.setAdapter( adapterTipoFalla );
        spOrigen.setAdapter( adapterOrigen );
        spCausa.setAdapter( adapterCausa );
        spCodigoReclamo.setAdapter( adapterCodigoReclamo );

//        lyElementos = ( LinearLayout ) findViewById( R.id.lyElementos );

        spElemento.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch ( position ) {
                    case 0:
                        //lyElementos.setVisibility( View.VISIBLE );
                        break;

                    case 1:
                        //lyElementos.setVisibility( View.GONE );
                        break;

                    case 2:
                        //lyElementos.setVisibility( View.GONE );
                        break;

                    case 3:
                       // lyElementos.setVisibility( View.GONE );
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spReles.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                switch ( position ) {
                    case 0:
                        Log.d( "TAG1", "Profesor no existe" + adapterView.getItemAtPosition( position ) );
                        break;

                    case 1:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 2:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 3:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spCierre.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch ( position ) {
                    case 0:
                        Log.d( "TAG1", "Profesor no existe" + adapterView.getItemAtPosition( position ) );
                        break;

                    case 1:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 2:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spTipoFalla.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch ( position ) {
                    case 0:
                        Log.d( "TAG1", "Profesor no existe" + adapterView.getItemAtPosition( position ) );
                        break;

                    case 1:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spOrigen.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch ( position ) {
                    case 0:
                        Log.d( "TAG1", "Profesor no existe" + adapterView.getItemAtPosition( position ) );
                        break;

                    case 1:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 2:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 3:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 4:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 5:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spCausa.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch ( position ) {
                    case 0:
                        Log.d( "TAG1", "Profesor no existe" + adapterView.getItemAtPosition( position ) );
                        spCausaInterna.setAdapter( adapterCausaInterna1 );
                        break;

                    case 1:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        spCausaInterna.setAdapter( adapterCausaInterna2 );
                        break;

                    case 2:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        spCausaInterna.setAdapter( adapterCausaInterna3 );
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spCodigoReclamo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                switch ( position ) {
                    case 0:
                        Log.d( "TAG1", "Profesor no existe" + adapterView.getItemAtPosition( position ) );
                        break;

                    case 1:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 2:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 3:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 4:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;

                    case 5:
                        Log.d( "TAG1", "Profesor no existe" + position );
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void confirmarCerrarReclamo( View view ) {
        AlertDialog.Builder builder = new AlertDialog.Builder( MainActivity.this );
        builder.setTitle( "Titulo" );
        builder.setMessage( "Estas seguro de cerrar el reclamo" )
                .setPositiveButton("Si", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( getApplicationContext(), "Eliminamos datos...", Toast.LENGTH_SHORT ).show();
                    }
                })
                .setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( getApplicationContext(), "Cancelamos...", Toast.LENGTH_SHORT ).show();
                        dialogInterface.dismiss();
                    }
                }).show();
    }

    public void siguienteCierre( View view ){
        Intent intent = new Intent( this, SegundaActivity.class );
        intent.putExtra( "key", "key" );
        MainActivity.this.startActivity( intent );
    }
}