package com.example.myapplication.views;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtStatus;
    Button btnRestart;
    ImageView img_card_1, img_card_2, img_card_3, img_card_4, img_card_5, img_card_6, img_card_7, img_card_8, img_card_9, img_card_10, img_card_11, img_card_12;
    Integer[] cardArray = {101, 102, 103, 104, 105, 106, 201, 202, 203, 204, 205, 206};
    int card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12;
    int firstCard, secondCard;
    int clickedFirst, clickedSecond;
    int cardNo = 1;
    int status = 0, statusNew = 0;
    int clickCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        img_card_1.setOnClickListener(this);
        img_card_2.setOnClickListener(this);
        img_card_3.setOnClickListener(this);
        img_card_4.setOnClickListener(this);
        img_card_5.setOnClickListener(this);
        img_card_6.setOnClickListener(this);
        img_card_7.setOnClickListener(this);
        img_card_8.setOnClickListener(this);
        img_card_9.setOnClickListener(this);
        img_card_10.setOnClickListener(this);
        img_card_11.setOnClickListener(this);
        img_card_12.setOnClickListener(this);
        btnRestart.setOnClickListener(this);

    }

    private void init() {

        txtStatus = findViewById(R.id.txt_status);
        btnRestart = findViewById(R.id.btn_restart);
        img_card_1 = findViewById(R.id.card_1);
        img_card_2 = findViewById(R.id.card_2);
        img_card_3 = findViewById(R.id.card_3);
        img_card_4 = findViewById(R.id.card_4);
        img_card_5 = findViewById(R.id.card_5);
        img_card_6 = findViewById(R.id.card_6);
        img_card_7 = findViewById(R.id.card_7);
        img_card_8 = findViewById(R.id.card_8);
        img_card_9 = findViewById(R.id.card_9);
        img_card_10 = findViewById(R.id.card_10);
        img_card_11 = findViewById(R.id.card_11);
        img_card_12 = findViewById(R.id.card_12);


        img_card_1.setTag("0");
        img_card_2.setTag("1");
        img_card_3.setTag("2");
        img_card_4.setTag("3");
        img_card_5.setTag("4");
        img_card_6.setTag("5");
        img_card_7.setTag("6");
        img_card_8.setTag("7");
        img_card_9.setTag("8");
        img_card_10.setTag("9");
        img_card_11.setTag("10");
        img_card_12.setTag("11");

        //load the front side of card
        frontCardSide();

        //shuffle the cards
        Collections.shuffle(Arrays.asList(cardArray));


    }

    private void frontCardSide() {
        card1 = R.drawable.img_1;
        card2 = R.drawable.img_2;
        card3 = R.drawable.img_3;
        card4 = R.drawable.img_4;
        card5 = R.drawable.img_5;
        card6 = R.drawable.img_6;
        card7 = R.drawable.img_1;
        card8 = R.drawable.img_2;
        card9 = R.drawable.img_3;
        card10 = R.drawable.img_4;
        card11 = R.drawable.img_5;
        card12 = R.drawable.img_6;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.card_1:
                int theCard = Integer.parseInt((String) view.getTag());
                doSomething(img_card_1, theCard);
                break;
            case R.id.card_2:
                int theCard1 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_2, theCard1);
                break;
            case R.id.card_3:
                int theCard2 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_3, theCard2);
                break;
            case R.id.card_4:
                int theCard3 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_4, theCard3);
                break;
            case R.id.card_5:
                int theCard4 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_5, theCard4);
                break;
            case R.id.card_6:
                int theCard5 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_6, theCard5);
                break;
            case R.id.card_7:
                int theCard6 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_7, theCard6);
                break;
            case R.id.card_8:
                int theCard7 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_8, theCard7);
                break;
            case R.id.card_9:
                int theCard8 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_9, theCard8);
                break;
            case R.id.card_10:
                int theCard9 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_10, theCard9);
                break;
            case R.id.card_11:
                int theCard10 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_11, theCard10);
                break;
            case R.id.card_12:
                int theCard11 = Integer.parseInt((String) view.getTag());
                doSomething(img_card_12, theCard11);
                break;
            case R.id.btn_restart:
                img_card_1.setVisibility(View.VISIBLE);
                img_card_2.setVisibility(View.VISIBLE);
                img_card_3.setVisibility(View.VISIBLE);
                img_card_4.setVisibility(View.VISIBLE);
                img_card_5.setVisibility(View.VISIBLE);
                img_card_6.setVisibility(View.VISIBLE);
                img_card_7.setVisibility(View.VISIBLE);
                img_card_8.setVisibility(View.VISIBLE);
                img_card_9.setVisibility(View.VISIBLE);
                img_card_10.setVisibility(View.VISIBLE);
                img_card_11.setVisibility(View.VISIBLE);
                img_card_12.setVisibility(View.VISIBLE);
                txtStatus.setText("Status: 0");
                break;
        }
    }

    private void doSomething(ImageView img, int card) {
        if (cardArray[card] == 101) {
            img.setImageResource(card1);
        } else if (cardArray[card] == 102) {
            img.setImageResource(card2);
        } else if (cardArray[card] == 103) {
            img.setImageResource(card3);
        } else if (cardArray[card] == 104) {
            img.setImageResource(card4);
        } else if (cardArray[card] == 105) {
            img.setImageResource(card5);
        } else if (cardArray[card] == 106) {
            img.setImageResource(card6);
        } else if (cardArray[card] == 201) {
            img.setImageResource(card7);
        } else if (cardArray[card] == 202) {
            img.setImageResource(card8);
        } else if (cardArray[card] == 203) {
            img.setImageResource(card9);
        } else if (cardArray[card] == 204) {
            img.setImageResource(card10);
        } else if (cardArray[card] == 205) {
            img.setImageResource(card11);
        } else if (cardArray[card] == 206) {
            img.setImageResource(card12);
        }

        if (cardNo == 1) {
            firstCard = cardArray[card];
            if (firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardNo = 2;
            clickedFirst = card;
            img.setEnabled(false);
        } else if (cardNo == 2) {
            secondCard = cardArray[card];
            if (secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardNo = 1;
            clickedSecond = card;

            img_card_1.setEnabled(false);
            img_card_2.setEnabled(false);
            img_card_3.setEnabled(false);
            img_card_4.setEnabled(false);
            img_card_5.setEnabled(false);
            img_card_6.setEnabled(false);
            img_card_7.setEnabled(false);
            img_card_8.setEnabled(false);
            img_card_9.setEnabled(false);
            img_card_10.setEnabled(false);
            img_card_11.setEnabled(false);
            img_card_12.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    validateCards();
                }
            }, 2000);

        }
    }

    private void validateCards() {
        if (firstCard == secondCard) {
            if (clickedFirst == 0) {
                img_card_1.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 1) {
                img_card_2.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 2) {
                img_card_3.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 3) {
                img_card_4.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 4) {
                img_card_5.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 5) {
                img_card_6.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 6) {
                img_card_7.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 7) {
                img_card_8.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 8) {
                img_card_9.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 9) {
                img_card_10.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 10) {
                img_card_11.setVisibility(View.INVISIBLE);
            } else if (clickedFirst == 11) {
                img_card_12.setVisibility(View.INVISIBLE);
            }


            if (clickedSecond == 0) {
                img_card_1.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 1) {
                img_card_2.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 2) {
                img_card_3.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 3) {
                img_card_4.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 4) {
                img_card_5.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 5) {
                img_card_6.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 6) {
                img_card_7.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 7) {
                img_card_8.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 8) {
                img_card_9.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 9) {
                img_card_10.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 10) {
                img_card_11.setVisibility(View.INVISIBLE);
            } else if (clickedSecond == 11) {
                img_card_12.setVisibility(View.INVISIBLE);
            }


            if (clickCount == 1) {
                status++;
                txtStatus.setText("Status: " + status);
            } else if (clickCount == 2) {
                status++;
                // int  sum=status+statusNew;
                txtStatus.setText("Status: " + status);
            }
        } else {

            img_card_1.setImageResource(R.drawable.img_default);
            img_card_2.setImageResource(R.drawable.img_default);
            img_card_3.setImageResource(R.drawable.img_default);
            img_card_4.setImageResource(R.drawable.img_default);
            img_card_5.setImageResource(R.drawable.img_default);
            img_card_6.setImageResource(R.drawable.img_default);
            img_card_7.setImageResource(R.drawable.img_default);
            img_card_8.setImageResource(R.drawable.img_default);
            img_card_9.setImageResource(R.drawable.img_default);
            img_card_10.setImageResource(R.drawable.img_default);
            img_card_11.setImageResource(R.drawable.img_default);
            img_card_12.setImageResource(R.drawable.img_default);


           /* if (clickCount == 1) {
                clickCount = 2;
            } else if (clickCount == 2) {
                clickCount = 1;
            }
*/

            if (clickCount == 1) {
                status++;
                txtStatus.setText("Status: " + status);
            } else if (clickCount == 2) {
                status++;
                // int  sum=status+statusNew;
                txtStatus.setText("Status: " + status);
            }
        }

        img_card_1.setEnabled(true);
        img_card_2.setEnabled(true);
        img_card_3.setEnabled(true);
        img_card_4.setEnabled(true);
        img_card_5.setEnabled(true);
        img_card_6.setEnabled(true);
        img_card_7.setEnabled(true);
        img_card_8.setEnabled(true);
        img_card_9.setEnabled(true);
        img_card_10.setEnabled(true);
        img_card_11.setEnabled(true);
        img_card_12.setEnabled(true);

        checkEnd();

    }

    private void checkEnd() {
        if (img_card_1.getVisibility() == View.INVISIBLE &&
                img_card_2.getVisibility() == View.INVISIBLE &&
                img_card_3.getVisibility() == View.INVISIBLE &&
                img_card_4.getVisibility() == View.INVISIBLE &&
                img_card_5.getVisibility() == View.INVISIBLE &&
                img_card_6.getVisibility() == View.INVISIBLE &&
                img_card_7.getVisibility() == View.INVISIBLE &&
                img_card_8.getVisibility() == View.INVISIBLE &&
                img_card_9.getVisibility() == View.INVISIBLE &&
                img_card_10.getVisibility() == View.INVISIBLE &&
                img_card_11.getVisibility() == View.INVISIBLE &&
                img_card_12.getVisibility() == View.INVISIBLE) {

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("Congratulations!!" + "\n" + "You win this game by " + status + " " + "steps!").
                    setPositiveButton(" Try another round", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }
}

