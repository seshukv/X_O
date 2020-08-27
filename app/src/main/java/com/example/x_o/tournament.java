package com.example.x_o;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class tournament extends AppCompatActivity {

    public final static int LOOPS = 1;

    public static int count;
    public static int FIRST_PAGE = 0;
    ViewPager pager;
    int number;
    TournamentAdapter adapter;
    int currentPosition = 0;
    TextView[] a = new TextView[9];
    TextView[] b = new TextView[9];
    int e = 0;
    int w = 0;
    TextView win;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_homepage);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_tournament);
        pager = findViewById(R.id.vp);


        count = getIntent().getIntExtra("number", 5);
        win = findViewById(R.id.win);
        a[0] = findViewById(R.id.tr1v1);
        a[1] = findViewById(R.id.tr1v2);
        a[2] = findViewById(R.id.tr1v3);
        a[3] = findViewById(R.id.tr1v4);
        a[4] = findViewById(R.id.tr1v5);
        a[5] = findViewById(R.id.tr1v6);
        a[6] = findViewById(R.id.tr1v7);
        a[7] = findViewById(R.id.tr1v8);
        a[8] = findViewById(R.id.tr1v9);

        b[0] = findViewById(R.id.tr2v1);
        b[1] = findViewById(R.id.tr2v2);
        b[2] = findViewById(R.id.tr2v3);
        b[3] = findViewById(R.id.tr2v4);
        b[4] = findViewById(R.id.tr2v5);
        b[5] = findViewById(R.id.tr2v6);
        b[6] = findViewById(R.id.tr2v7);
        b[7] = findViewById(R.id.tr2v8);
        b[8] = findViewById(R.id.tr2v9);


        if (count == 5) {
            a[0].setVisibility(View.VISIBLE);
            a[1].setVisibility(View.VISIBLE);
            a[2].setVisibility(View.VISIBLE);
            a[3].setVisibility(View.VISIBLE);
            a[4].setVisibility(View.VISIBLE);

            b[0].setVisibility(View.VISIBLE);
            b[1].setVisibility(View.VISIBLE);
            b[2].setVisibility(View.VISIBLE);
            b[3].setVisibility(View.VISIBLE);
            b[4].setVisibility(View.VISIBLE);
        } else if (count == 7) {
            a[0].setVisibility(View.VISIBLE);
            a[1].setVisibility(View.VISIBLE);
            a[2].setVisibility(View.VISIBLE);
            a[3].setVisibility(View.VISIBLE);
            a[4].setVisibility(View.VISIBLE);
            a[5].setVisibility(View.VISIBLE);
            a[6].setVisibility(View.VISIBLE);

            b[0].setVisibility(View.VISIBLE);
            b[1].setVisibility(View.VISIBLE);
            b[2].setVisibility(View.VISIBLE);
            b[3].setVisibility(View.VISIBLE);
            b[4].setVisibility(View.VISIBLE);
            b[5].setVisibility(View.VISIBLE);
            b[6].setVisibility(View.VISIBLE);
        } else if (count == 9) {
            a[0].setVisibility(View.VISIBLE);
            a[1].setVisibility(View.VISIBLE);
            a[2].setVisibility(View.VISIBLE);
            a[3].setVisibility(View.VISIBLE);
            a[4].setVisibility(View.VISIBLE);
            a[5].setVisibility(View.VISIBLE);
            a[6].setVisibility(View.VISIBLE);
            a[7].setVisibility(View.VISIBLE);
            a[8].setVisibility(View.VISIBLE);

            b[0].setVisibility(View.VISIBLE);
            b[1].setVisibility(View.VISIBLE);
            b[2].setVisibility(View.VISIBLE);
            b[3].setVisibility(View.VISIBLE);
            b[4].setVisibility(View.VISIBLE);
            b[5].setVisibility(View.VISIBLE);
            b[6].setVisibility(View.VISIBLE);
            b[7].setVisibility(View.VISIBLE);
            b[8].setVisibility(View.VISIBLE);
        }


        if (currentPosition == 0) {
            findViewById(R.id.lb1).setVisibility(View.GONE);
        }
        findViewById(R.id.lb2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPosition = pager.getCurrentItem();
                currentPosition++;
                if (currentPosition == count - 1) {
                    findViewById(R.id.lb2).setVisibility(View.GONE);
                    findViewById(R.id.lb1).setVisibility(View.VISIBLE);
                } else if (currentPosition == 0) {
                    findViewById(R.id.lb1).setVisibility(View.GONE);
                    findViewById(R.id.lb2).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.lb1).setVisibility(View.VISIBLE);
                    findViewById(R.id.lb2).setVisibility(View.VISIBLE);
                }

                pager.setCurrentItem(currentPosition, true);

            }
        });

        findViewById(R.id.lb1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentPosition = pager.getCurrentItem();
                currentPosition--;
                if (currentPosition == count - 1) {
                    findViewById(R.id.lb2).setVisibility(View.GONE);
                    findViewById(R.id.lb1).setVisibility(View.VISIBLE);
                } else if (currentPosition == 0) {
                    findViewById(R.id.lb1).setVisibility(View.GONE);
                    findViewById(R.id.lb2).setVisibility(View.VISIBLE);
                } else {
                    findViewById(R.id.lb1).setVisibility(View.VISIBLE);
                    findViewById(R.id.lb2).setVisibility(View.VISIBLE);
                }

                pager.setCurrentItem(currentPosition, true);

            }

        });

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    void sampleFunctio(int i) {
        Log.d("seshu", "id  =" + i);
        if (i == 1) {
            b[0].setText("O");
            e++;
        } else if (i == -1) {
            b[0].setText("X");
            w++;
        } else if (i == 10)
            b[0].setText("D");


        if (i == 2) {
            b[1].setText("O");
            e++;
        } else if (i == -2) {
            b[1].setText("X");
            w++;
        } else if (i == 20)
            b[1].setText("D");


        if (i == 3) {
            b[2].setText("O");
            e++;
        } else if (i == -3) {
            b[2].setText("X");
            w++;
        } else if (i == 30)
            b[2].setText("D");

        if (i == 4) {
            b[3].setText("O");
            e++;
        } else if (i == -4) {
            b[3].setText("X");
            w++;
        } else if (i == 40)
            b[3].setText("D");

        if (i == 5) {
            b[4].setText("O");
            e++;
            if (count == 5) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");

                win.setVisibility(View.VISIBLE);
            }
        } else if (i == -5) {
            b[4].setText("X");
            w++;
            if (count == 5) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");

                win.setVisibility(View.VISIBLE);
            }
        } else if (i == 50) {
            b[4].setText("D");
            if (count == 5) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");

                win.setVisibility(View.VISIBLE);
            }
        }

        if (i == 6) {
            b[5].setText("O");
            e++;
        } else if (i == -6) {
            b[5].setText("X");
            w++;
        } else if (i == 60)
            b[5].setText("D");

        if (i == 7) {
            b[6].setText("O");
            e++;
            if (count == 7) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");
                win.setVisibility(View.VISIBLE);
            }
        } else if (i == -7) {
            b[6].setText("X");
            w++;
            if (count == 7) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");
                win.setVisibility(View.VISIBLE);
            }
        } else if (i == 70) {
            b[6].setText("D");
            if (count == 7) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");
                win.setVisibility(View.VISIBLE);
            }
        }

        if (i == 8) {
            b[7].setText("O");
            e++;
        } else if (i == -8) {
            b[7].setText("X");
            w++;
        } else if (i == 80)
            b[7].setText("D");

        if (i == 9) {
            b[8].setText("O");
            e++;
            if (count == 9) {
                if (e > w)
                    win.setText("Player O is the WINNER");

                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");

                win.setVisibility(View.VISIBLE);
            }
        } else if (i == -9) {
            b[8].setText("X");
            w++;
            if (count == 9) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");

                win.setVisibility(View.VISIBLE);
            }
        } else if (i == 90) {
            b[8].setText("D");
            if (count == 9) {
                if (e > w)
                    win.setText("Player O is the WINNER");
                else if (w > e)
                    win.setText("Player X is the WINNER");
                else
                    win.setText("You Both are too GOOD");

                win.setVisibility(View.VISIBLE);
            }
        }
    }


    @Override
    protected void onStart() {
        super.onStart();

        pager.post(new Runnable() {
            @Override
            public void run() {
                adapter = new TournamentAdapter(tournament.this, getSupportFragmentManager());
                pager.setAdapter(adapter);
                adapter.notifyDataSetChanged();
                pager.addOnPageChangeListener(adapter);
                pager.setCurrentItem(FIRST_PAGE);
                pager.setOffscreenPageLimit(count);
                pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                        currentPosition = pager.getCurrentItem();
                        if (currentPosition == count - 1) {
                            findViewById(R.id.lb2).setVisibility(View.GONE);
                            findViewById(R.id.lb1).setVisibility(View.VISIBLE);
                        } else if (currentPosition == 0) {
                            findViewById(R.id.lb1).setVisibility(View.GONE);
                            findViewById(R.id.lb2).setVisibility(View.VISIBLE);
                        } else {
                            findViewById(R.id.lb1).setVisibility(View.VISIBLE);
                            findViewById(R.id.lb2).setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onPageSelected(int position) {

                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
            }
        });


    }
}