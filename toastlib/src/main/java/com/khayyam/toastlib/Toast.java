package com.khayyam.toastlib;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Toast {
    public static void colorfulToast(Activity activity, String message, int textColor, int toastBackground, int icon) {
        LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.toast, (ViewGroup) activity.findViewById(R.id.custom_toast_container));
        TextView text =  layout.findViewById(R.id.text);
        ImageView imageView = layout.findViewById(R.id.imageView);
        imageView.setImageResource(icon);
        text.setText(message);
        text.setTextColor(activity.getResources().getColor(textColor));
        LinearLayout linearLayout=layout.findViewById(R.id.custom_toast_container);
        Drawable mDrawable = activity.getResources().getDrawable(R.drawable.oval);
        mDrawable.setColorFilter(new PorterDuffColorFilter(activity.getResources().getColor(toastBackground), PorterDuff.Mode.MULTIPLY));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            linearLayout.setBackground(mDrawable);
        }
        android.widget.Toast toast = new android.widget.Toast(activity);
        toast.setGravity(Gravity.BOTTOM, 0, 140);
        toast.setDuration(android.widget.Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
