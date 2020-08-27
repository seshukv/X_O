package com.example.x_o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends Activity {

    int p = 1;
    int temp = -1;
    int[][] arr = new int[3][3];
    TextView j;
    Button k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.activity_main);


        for (int w = 0; w < 3; w++) {
            for (int q = 0; q < 3; q++) {
                arr[w][q] = -1;
            }

        }

        final TextView a = findViewById(R.id.a);
        final TextView b = findViewById(R.id.b);
        final TextView c = findViewById(R.id.c);
        final TextView d = findViewById(R.id.d);
        final TextView e = findViewById(R.id.e);
        final TextView f = findViewById(R.id.f);
        final TextView g = findViewById(R.id.g);
        final TextView h = findViewById(R.id.h);
        final TextView i = findViewById(R.id.i);
        j = findViewById(R.id.j);
        k = findViewById(R.id.k);
        final View v1 = findViewById(R.id.v1);
        final View v2 = findViewById(R.id.v2);
        final View v3 = findViewById(R.id.v3);
        final View v4 = findViewById(R.id.v4);
        final View v5 = findViewById(R.id.v5);
        final View v6 = findViewById(R.id.v6);
        final CardView v = findViewById(R.id.v);
        final ConstraintLayout l1 = findViewById(R.id.l1);
        final ConstraintLayout l2 = findViewById(R.id.l2);
        turn();


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (a.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        a.setText("O");
                        arr[0][0] = 0;
                    } else {
                        a.setText("X");
                        arr[0][0] = 1;
                    }
                    p++;
                    turn();
                    a.setAlpha(1);
                }

                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (b.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        b.setText("O");
                        arr[0][1] = 0;
                    } else {
                        b.setText("X");
                        arr[0][1] = 1;
                    }
                    p++;
                    turn();
                    b.setAlpha(1);
                }

                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }
        });


        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (c.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        c.setText("O");
                        arr[0][2] = 0;
                    } else {
                        c.setText("X");
                        arr[0][2] = 1;
                    }
                    p++;
                    turn();
                    c.setAlpha(1);

                }

                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }
        });


        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (d.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        d.setText("O");
                        arr[1][0] = 0;
                    } else {
                        d.setText("X");
                        arr[1][0] = 1;
                    }
                    p++;
                    turn();
                    d.setAlpha(1);

                }

                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (e.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        e.setText("O");
                        arr[1][1] = 0;
                    } else {
                        e.setText("X");
                        arr[1][1] = 1;
                    }
                    p++;
                    turn();
                    e.setAlpha(1);

                }

                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (f.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        f.setText("O");
                        arr[1][2] = 0;
                    } else {
                        f.setText("X");
                        arr[1][2] = 1;
                    }
                    p++;
                    turn();
                    f.setAlpha(1);
                }

                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (g.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        g.setText("O");
                        arr[2][0] = 0;
                    } else {
                        g.setText("X");
                        arr[2][0] = 1;
                    }
                    p++;
                    turn();
                    g.setAlpha(1);
                }
                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (h.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        h.setText("O");
                        arr[2][1] = 0;
                    } else {
                        h.setText("X");
                        arr[2][1] = 1;
                    }
                    p++;
                    turn();
                    h.setAlpha(1);
                }
                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }
            }

        });


        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (i.getAlpha() == 0 && p != -1 && temp != 0 && temp != 1) {
                    if (p % 2 == 0) {
                        i.setText("O");
                        arr[2][2] = 0;
                    } else {
                        i.setText("X");
                        arr[2][2] = 1;
                    }
                    p++;
                    turn();
                    i.setAlpha(1);
                }
                result();
                if (temp == 0) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("O Wins");
                    p = -1;
                } else if (temp == 1) {
                    k.setVisibility(View.VISIBLE);
                    j.setText("X wins");
                    p = -1;
                }

            }
        });

        k.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                p = 1;
                turn();
                for (int n = 0; n < 3; n++) {
                    for (int x = 0; x < 3; x++) {
                        arr[n][x] = -1;

                    }
                }
                a.setAlpha(0);
                b.setAlpha(0);
                c.setAlpha(0);
                d.setAlpha(0);
                e.setAlpha(0);
                f.setAlpha(0);
                g.setAlpha(0);
                h.setAlpha(0);
                i.setAlpha(0);
                k.setVisibility(View.GONE);
                p = 1;
                temp = -1;
            }
        });
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


    }

    void turn() {
        if (p == 1)
            j.setText("X Turn");
        if (p == 2)
            j.setText("O Turn");
        else if (p == 3)
            j.setText("X Turn");
        else if (p == 4)
            j.setText("O Turn");
        else if (p == 5)
            j.setText("X Turn");
        else if (p == 6)
            j.setText("O Turn");
        else if (p == 7)
            j.setText("X Turn");
        else if (p == 8)
            j.setText("O Turn");
        else if (p == 9)
            j.setText("X Turn");
        else if (p == 10) {
            k.setVisibility(View.VISIBLE);
            j.setText("Its a Draw");
        }

    }

    void result() {


        if (arr[0][0] == arr[0][1] && arr[0][2] == arr[0][1] && arr[0][2] != -1) {
            temp = arr[0][0];
        } else if (arr[1][0] == arr[1][1] && arr[1][2] == arr[1][1] && arr[1][2] != -1) {
            temp = arr[1][0];
        } else if (arr[2][0] == arr[2][1] && arr[2][2] == arr[2][1] && arr[2][2] != -1) {
            temp = arr[2][2];
        } else if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && arr[1][0] != -1) {
            temp = arr[0][0];
        } else if (arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1] && arr[1][1] != -1) {
            temp = arr[0][1];
        } else if (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2] && arr[0][2] != -1) {
            temp = arr[0][2];
        } else if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[2][2] != -1) {
            temp = arr[1][1];
        } else if (arr[0][2] == arr[1][1] && arr[0][2] == arr[2][0] && arr[0][2] != -1) {
            temp = arr[0][2];
        }

    }

}
