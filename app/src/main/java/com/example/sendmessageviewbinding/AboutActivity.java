package com.example.sendmessageviewbinding;

import static android.os.Build.VERSION_CODES.R;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.danielstone.materialaboutlibrary.MaterialAboutActivity;
import com.danielstone.materialaboutlibrary.items.MaterialAboutActionItem;
import com.danielstone.materialaboutlibrary.items.MaterialAboutItemOnClickAction;
import com.danielstone.materialaboutlibrary.items.MaterialAboutTitleItem;
import com.danielstone.materialaboutlibrary.model.MaterialAboutCard;
import com.danielstone.materialaboutlibrary.model.MaterialAboutList;

public class AboutActivity extends MaterialAboutActivity {
    @Override
    @NonNull
    protected MaterialAboutList getMaterialAboutList(@NonNull Context context) {
        MaterialAboutCard.Builder carda = new MaterialAboutCard.Builder();
        MaterialAboutCard.Builder cardb = new MaterialAboutCard.Builder();

        carda.addItem(new MaterialAboutActionItem.Builder()
                .text("Sergio Silva Ortega")
                .subText("Desarrollo de Aplicaciones Multiplataforma")
                .build());
        carda.addItem(new MaterialAboutActionItem.Builder()
                .text("https://github.com/tacheto")

                .setOnClickAction(new MaterialAboutItemOnClickAction() {
                    @Override
                    public void onClick() {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/daniel-stoneuk/material-about-library/blob/master/"));
                        startActivity(intent);
                    }
                })
                .build());
        cardb.addItem(new MaterialAboutActionItem.Builder()
                .text("Version")
                .subText("1.0.0")
                .build());
        return new MaterialAboutList.Builder()
                .addCard(carda.title("Autor").build())
                .addCard(cardb.build())
                .build();
    }

    @Override
    protected CharSequence getActivityTitle() {
        return getString();
    }

    private CharSequence getString() {
        return null;
    }
}
