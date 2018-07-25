# TimerTextView
Self Updated Timer TextView

## How to install

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
  
dependencies {
    implementation 'com.github.dhimant1990:TimerTextView:v1.0'
}

```

## How to use

your_layout.xml
```
<com.dhims.timerview.TimerTextView
        android:id="@+id/timerText"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:drawableLeft="@drawable/ic_timer"
        android:drawablePadding="4dp"
        android:gravity="center"
        android:textSize="24sp"/>
```

YourActivity.java
```java
long futureTimestamp = System.currentTimeMillis() + (10 * 60 * 60 * 1000);
TimerTextView timerText = (TimerTextView) findViewById(R.id.timerText);
timerText.setEndTime(futureTimestamp);
```

## Example

<img src="https://raw.githubusercontent.com/dhimant1990/TimerTextView/master/example.gif" width="256">
