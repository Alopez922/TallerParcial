    package com.alopez922hotmail.tallermovil;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

    public class Taller extends AppCompatActivity {

    private Spinner Zapato;
    private String ArrayTipozapato[];
    private Resources recursos;
    private Spinner Marca;
    private String ArrayMarca[];
    private Spinner HombreMujer;
    private String ArrayHombreMujer[];
    private EditText Canti;
    private TextView resultado;
    private Spinner Moneda;
    private String ArrayMoneda[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taller);

        Canti = findViewById(R.id.txtCantidad);
        resultado = findViewById(R.id.txtresultado);

        Zapato = findViewById(R.id.spinnerZapato);
        recursos = this.getResources();

        ArrayTipozapato = recursos.getStringArray(R.array.items);

        ArrayAdapter<String> AdapterZapato = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ArrayTipozapato);
        Zapato.setAdapter(AdapterZapato);

        Marca = findViewById(R.id.spinnerMarca);
        recursos = this.getResources();

        ArrayMarca = recursos.getStringArray(R.array.itemsMarca);

        ArrayAdapter<String> AdapterMarca = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ArrayMarca);
        Marca.setAdapter(AdapterMarca);


        HombreMujer = findViewById(R.id.spinnerHombreMujer);
        recursos = this.getResources();

        ArrayHombreMujer = recursos.getStringArray(R.array.itemsHombreMujer);

        ArrayAdapter<String> AdapterHombreMujer = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ArrayHombreMujer);
        HombreMujer.setAdapter(AdapterHombreMujer);

        Moneda = findViewById(R.id.spinnerMoneda);
        recursos = this.getResources();

        ArrayAdapter<String> AdapterMoneda = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ArrayMoneda);

    }
     public void calcular(View v){
        int  TipoHM ,MarcaHM ,TipoZa,valor=0,Cantidad,Total;

        TipoHM = HombreMujer.getSelectedItemPosition();
        TipoZa = Zapato.getSelectedItemPosition();
        MarcaHM = Marca.getSelectedItemPosition();
        Cantidad = Integer.parseInt(Canti.getText().toString());

        if (TipoHM ==0 && TipoZa == 0 && MarcaHM ==0){ //Hombre posicion 0  Zapatilla Posicion 0  MARCA nike Posicion0
            valor = 120;
         } else if (TipoHM ==0 && TipoZa ==0 && MarcaHM ==1){ //Hombre Posicion 0 Zapatilla Posicion 0 Marca Adidas Posicion1
             valor = 140;
         } else if (TipoHM ==0 && TipoZa ==0 && MarcaHM ==2){
             valor = 130;
         } else if (TipoHM ==0 && TipoZa ==1 &&  MarcaHM ==0){
             valor = 50;
         } else if (TipoHM ==0 && TipoZa ==1 && MarcaHM ==1){
             valor = 80;
         } else if (TipoHM ==0 && TipoZa ==1 && MarcaHM ==2){
             valor = 100;
         } else if (TipoHM ==1 && TipoZa == 0 && MarcaHM ==0){
             valor = 100;
         } else if (TipoHM ==1 && TipoZa == 0 && MarcaHM ==1){
             valor = 130;
         } else if (TipoHM ==1 && TipoZa == 0 && MarcaHM ==2){
             valor = 110;
         } else if (TipoHM ==1 && TipoZa == 1 && MarcaHM ==0){
             valor = 60;
         } else if (TipoHM ==1 && TipoZa == 1 && MarcaHM ==1){ //Mujer Posicion 1 Clasico posicion 1 Marca Adidas Posicion 1
             valor = 70;
         } else if (TipoHM ==1 && TipoZa == 1 && MarcaHM ==3) {
            valor = 120;
        }

        Total=Calcucantidad(valor,Cantidad,Moneda.getSelectedItemPosition();
         resultado.setText("$"+Total);


     }

     public int Calcucantidad(int valor, int C, int moneda ){

         if (moneda == 1){
             return valor * C *3300;

     } else{
         return valor * C;
        }

}
    }


