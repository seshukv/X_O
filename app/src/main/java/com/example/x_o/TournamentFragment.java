package com.example.x_o;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class TournamentFragment extends Fragment {

    private static final String POSITON = "position";
    private static final String SCALE = "scale";
    private static final String DRAWABLE_RESOURE = "resource";

    int p = 1;
    int temp = -1;
    int[][] arr = new int[3][3];
    TextView j;
    tournament context;
    int postion;
    private int screenWidth;
    private int screenHeight;

    public TournamentFragment() {
    }

    public TournamentFragment(tournament context, int pos, float scale) {
        Bundle b = new Bundle();
        b.putInt(POSITON, pos);
        this.postion = pos;
        b.putFloat(SCALE, scale);
        this.context = context;
        //return Fragment.instantiate(context, TournamentFragment.class.getName(), b);
    }

    private void getWidthAndHeight() {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        screenHeight = displaymetrics.heightPixels;
        screenWidth = displaymetrics.widthPixels;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWidthAndHeight();
    }

    @Override
    public void onViewCreated(@NonNull View linearLayout, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(linearLayout, savedInstanceState);
        //postion = this.getArguments().getInt(POSITON);
        float scale = 1;// this.getArguments().getFloat(SCALE);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(screenWidth, screenHeight);
        TextView textView = (TextView) linearLayout.findViewById(R.id.text);
        CustomLinearLayout root = (CustomLinearLayout) linearLayout.findViewById(R.id.root_container);
        ConstraintLayout cl = (ConstraintLayout) linearLayout.findViewById(R.id.cl);

        // textView.setText("Carousel item: " + postion);
        cl.setLayoutParams(layoutParams);
        //imageView.setImageResource(imageArray[postion]);
        root.setScaleBoth(scale);


        for (int w = 0; w < 3; w++) {
            for (int q = 0; q < 3; q++) {
                arr[w][q] = -1;
            }

        }

        final TextView a = linearLayout.findViewById(R.id.a);
        final TextView b = linearLayout.findViewById(R.id.b);
        final TextView c = linearLayout.findViewById(R.id.c);
        final TextView d = linearLayout.findViewById(R.id.d);
        final TextView e = linearLayout.findViewById(R.id.e);
        final TextView f = linearLayout.findViewById(R.id.f);
        final TextView g = linearLayout.findViewById(R.id.g);
        final TextView h = linearLayout.findViewById(R.id.h);
        final TextView i = linearLayout.findViewById(R.id.i);
        j = linearLayout.findViewById(R.id.j);
        final View v1 = linearLayout.findViewById(R.id.v1);
        final View v2 = linearLayout.findViewById(R.id.v2);
        final View v3 = linearLayout.findViewById(R.id.v3);
        final View v4 = linearLayout.findViewById(R.id.v4);
        final View v5 = linearLayout.findViewById(R.id.v5);
        final View v6 = linearLayout.findViewById(R.id.v6);
        final CardView v = linearLayout.findViewById(R.id.v);
        final ConstraintLayout l1 = linearLayout.findViewById(R.id.l1);
        final ConstraintLayout l2 = linearLayout.findViewById(R.id.l2);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
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
                    j.setText("O Wins");
                    p = -1;
                    context.sampleFunctio(postion);
                } else if (temp == 1) {
                    j.setText("X wins");
                    p = -1;
                    context.sampleFunctio(-postion);
                }

            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }


        //   final int postion = this.getArguments().getInt(POSITON);
        // float scale = this.getArguments().getFloat(SCALE);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(screenWidth, screenHeight);
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_tournament, container, false);


        return linearLayout;
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
            j.setText("Its a Draw");
            context.sampleFunctio(postion * 10);
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