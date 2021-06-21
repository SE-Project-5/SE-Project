package com.example.camplogin;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ListView;

public class reviewList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_list);
        ListView lv = findViewById(R.id.reviewList_view);
        ReviewAdapter ReAdapter = new ReviewAdapter();
        lv.setAdapter(ReAdapter);

        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.review2),
                "처음 캠핑을 시작하는 친구와 같이 이용했고, 여기 매우 좋은곳이다. 라고 입이 마르도록 말했네요. ","5점");

        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.review3),
                "어린자녀들과 같이 가족단위로 오는 캠핑러들도 많더라구요.","4점");

        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.review4),
                "잘 놀다 갑니다~","5점");

        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.review5),
                "둘이가서 셋이되서 왔습니다.","5점");

        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.review6),
                "계곡이 가까워서 좋았습니다!","5점");




        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.camp1),
                "사장님이 친절하고 잘생겨서 너무 만족스러웠어요 가격도 착하고 위치도 좋은 완벽한 캠핑장이였습니다~","5점");

        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.camp2),
                "다 좋았는데 너무 노후 되었습니다","4점");

        ReAdapter.addList(ContextCompat.getDrawable(this, R.drawable.camp3),
                "커플이 많네요.. 저는 솔로인데... 속상합니다","2점");
    }
}