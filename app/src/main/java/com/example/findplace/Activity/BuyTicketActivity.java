package com.example.findplace.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.findplace.R;

import java.util.ArrayList;
import java.util.List;

public class BuyTicketActivity extends AppCompatActivity {

    public static final String
            KEY_FOR_PLACE_NAME = "place name"
            , KEY_FOR_LOCATION = "location"
            , KEY_FOR_IMAGE_URL = "image url"
            , KEY_FOR_DISCOUNT = "discount";

    private TextView placeName, price, location, score, description;
    private ImageView imageViewPlaceImage;
    private Button peopleOne, peopleTwo, peopleThree, peopleFour, peopleFive, bookTripNow;
    private ImageButton like, imageButtonPopupMenuBuyTicket;
    private String discount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_ticket);

        init();
        setUpViewsAction();
    }

    private void init(){
        placeName = findViewById(R.id.activityBuyTicketTextViewName);
        price = findViewById(R.id.activityBuyTicketTextViewPrice);
        location = findViewById(R.id.activityBuyTicketTextViewLocation);
        score = findViewById(R.id.activityBuyTicketTextViewScore);
        description = findViewById(R.id.activityBuyTicketTextViewDescription);
        imageViewPlaceImage = findViewById(R.id.activityBuyTicketImageViewPlaceImage);
        peopleOne = findViewById(R.id.activityBuyTicketButtonPeopleOne);
        peopleTwo = findViewById(R.id.activityBuyTicketButtonPeopleTwo);
        peopleThree = findViewById(R.id.activityBuyTicketButtonPeopleThree);
        peopleFour = findViewById(R.id.activityBuyTicketButtonPeopleFour);
        peopleFive = findViewById(R.id.activityBuyTicketButtonPeopleFive);
        bookTripNow = findViewById(R.id.activityBuyTicketButtonBookTripNow);
        like = findViewById(R.id.activityBuyTicketImageButtonLike);
        imageButtonPopupMenuBuyTicket = findViewById(R.id.activityBuyTicketImageButtonMore);

    }

    private void setUpViewsAction(){
        Bundle bundle = getIntent().getExtras();
        placeName.setText(bundle.getString(KEY_FOR_PLACE_NAME));
        location.setText(bundle.getString(KEY_FOR_LOCATION));
        discount = bundle.getString(KEY_FOR_DISCOUNT);
        imageViewPlaceImage.setImageResource(bundle.getInt(KEY_FOR_IMAGE_URL));     // Todo: change this to real url...

        fillWithFakeItems();
        bookTrip();
        likeButton();
        setupPopupMenu();

    }

    // Todo: change this later...
    private void fillWithFakeItems(){
        price.setText("225");
        score.setText("4.5");
        description.setText("Yosemite National Park is located in central Sierra Nevada in the US state of California. It is located near the wild protected areas.");

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void PeopleOnClick(View v){

        List<Button> buttons = new ArrayList<>();
        buttons.add(peopleOne);
        buttons.add(peopleTwo);
        buttons.add(peopleThree);
        buttons.add(peopleFour);
        buttons.add(peopleFive);
        for (int i = 0; i < buttons.size(); i++){
            setColorToPeopleButtons(buttons.get(i));
        }

        Button button = findViewById(v.getId());
        button.setBackground(getDrawable(R.drawable.buy_ticket_people_button_shape_black));
        button.setTextColor(getResources().getColor(R.color.white));

    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void setColorToPeopleButtons(Button button){
        button.setBackground(getDrawable(R.drawable.buy_ticket_people_button_shape));
        button.setTextColor(getResources().getColor(R.color.black));
    }


    // Todo: complete this...
    private void bookTrip(){
        bookTripNow.setOnClickListener(v -> {
            Toast.makeText(this, "Book Trip Now", Toast.LENGTH_SHORT).show();
        });
    }


    // Todo: complete this...
    private void likeButton(){
        like.setOnClickListener(v -> {
            Toast.makeText(this, "Like", Toast.LENGTH_SHORT).show();
        });
    }

    private void setupPopupMenu(){
        imageButtonPopupMenuBuyTicket.setOnClickListener(v -> {
            Context wrapper = new ContextThemeWrapper(BuyTicketActivity.this, R.style.buyTicketMenuTheme);
            PopupMenu popupMenuBuyTicket = new PopupMenu(wrapper, imageButtonPopupMenuBuyTicket);
            popupMenuBuyTicket.getMenuInflater().inflate(R.menu.buy_ticket_menu, popupMenuBuyTicket.getMenu());

            popupMenuBuyTicket.setOnMenuItemClickListener(item -> {
                int id = item.getItemId();

                switch (id){
                    case R.id.buyTicketItemOne:
                        Toast.makeText(BuyTicketActivity.this, "Item One", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buyTicketItemTwo:
                        Toast.makeText(BuyTicketActivity.this, "Item Two", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.buyTicketItemThree:
                        Toast.makeText(BuyTicketActivity.this, "Item Three", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(BuyTicketActivity.this, "Not found", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            });

            popupMenuBuyTicket.show();
        });

    }
}