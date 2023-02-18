package com.example.zadanie1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import android.os.Bundle;
import android.widget.TextView;

    public class MainActivity extends AppCompatActivity {

        float palto = 70;
        byte paltoDiscount = 77;
        float shlyapa = 25;
        byte shlyapaDiscount = 37;
        float delovojKostyum = 53;
        byte delovojKostyumDiscount = 44;
        float sorochka = 19;
        byte sorochkaDiscount = 0;
        float tufli = 41;
        byte tufliDiscount = 32;
        float account = 312;


        private float calculation() {

            float count = (palto * (100 - paltoDiscount) + shlyapa * (100 - shlyapaDiscount)
                    + delovojKostyum * (100 - delovojKostyumDiscount) + sorochka * (100 - sorochkaDiscount)
                    + tufli * (100 - tufliDiscount)) / 100;
            return count;
        }


        private boolean possibility() {
            if (calculation() <= account) {
                return true;
            } else {
                return false;
            }
        }


        private float balance() {
            if(possibility()) {
                return account - calculation();
            } else {
                return -1;
            }
        }


        private TextView possibilityOut;
        private TextView balanceOut;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        possibilityOut = findViewById(R.id.possibilityOut);
        balanceOut = findViewById(R.id.balanceOut);


        if (possibility()) {
            possibilityOut.setText("Имеется достаточно средств для покупки делового гардероба");
            balanceOut.setText("Остаток от покупки " + balance() + " серебрянных монет");
        } else {
            possibilityOut.setText("Недостаточно средств для покупки делового гардероба");
            balanceOut.setText(" - ");
        }
    }
    }