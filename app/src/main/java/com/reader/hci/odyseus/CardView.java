package com.reader.hci.odyseus;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by nelvson on 16/12/16.
 */

public class CardView extends Activity {
    TextView personName;
    TextView personAge;
    ImageView personPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.cardview_activity);
        personName = (TextView)findViewById(R.id.person_name);
        personAge = (TextView)findViewById(R.id.person_age);
        personPhoto = (ImageView)findViewById(R.id.person_photo);

        personName.setText("Judul dari buku");
        personAge.setText(". Ad eos iudico delenit repudiandae, alii habemus molestie his cu, eam ei essent mollis. Ei usu congue nullam sapientem.");
        personPhoto.setImageResource(R.drawable.emma);
    }
}
