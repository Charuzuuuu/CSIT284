<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity"
    android:gravity="center"
    android:background="@color/white"
    android:orientation="vertical"
    android:padding="10dp">

    <TextView
        android:id="@+id/label"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Player O\'s turn"
        android:textStyle="bold"
        android:gravity="center"
        android:textSize="35dp"
        android:textColor="@color/black"
        android:layout_marginBottom="50dp" />

    <LinearLayout
        android:id="@+id/bgcolor"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:background="@color/black">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_weight="1"
            android:layout_marginRight="5dp">

           <TextView
               android:id="@+id/lb1"
               style="@style/label"
               android:layout_marginBottom="5dp"/>

            <TextView
                android:id="@+id/lb4"
                style="@style/label"
                android:layout_marginBottom="5dp"/>

            <TextView
                android:id="@+id/lb7"
                style="@style/label"/>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_weight="1"
            android:layout_marginRight="5dp">

            <TextView
                android:id="@+id/lb2"
                style="@style/label"
                android:layout_marginBottom="5dp"/>

            <TextView
                android:id="@+id/lb5"
                style="@style/label"
                android:layout_marginBottom="5dp"/>

            <TextView
                android:id="@+id/lb8"
                style="@style/label"/>

        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_weight="1">

            <TextView
                android:id="@+id/lb3"
                style="@style/label"
                android:layout_marginBottom="5dp"/>

            <TextView
                android:id="@+id/lb6"
                style="@style/label"
                android:layout_marginBottom="5dp"/>

            <TextView
                android:id="@+id/lb9"
                style="@style/label"/>

        </LinearLayout>


    </LinearLayout>
    
    <Button
        android:layout_width="200dp"
        android:layout_height="wrap_content"
        android:text="Restart"
        android:textAllCaps="false"
        android:background="@color/black"
        android:textColor="@color/white"
        android:textSize="22dp"
        android:padding="10dp"
        android:textStyle="bold"
        android:layout_marginTop="50dp"
        android:onClick="newGame"/>


</LinearLayout>
